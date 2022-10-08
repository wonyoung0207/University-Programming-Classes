import logo from './logo.svg';
import './App.css';
import {useState} from 'react';


function Header(props){
  return <header>
    <h1><a href="/" onClick={(event) => {
      event.preventDefault();
      props.onChangeMode();
    }}> {props.title}</a></h1>
  </header>
}

function Nav(props) {
  const lis = []

  for (let i = 0; i < props.topic.length; i++) {
    let t = props.topic[i];
    lis.push(
      <li key={t.id}>
        <a id={t.id} href={'/read/' + t.id} onClick={event => {
          event.preventDefault();
          props.onChangeMode(Number(event.target.id));
        }}> {t.title} </a>
      </li>
    )
  }

  return <nav>
    <ol>
      {lis}
    </ol>
  </nav>
}

function Article(props){
  return <article>
    <h2> {props.title}</h2>
    Hello { props.body}
  </article>
}

function Create(props){//props는 해당 호출 태그의 속성을 가져온다. 
  return <article>
    <h2>Create</h2>
    <form onSubmit={event=>{
      event.preventDefault();
      const title = event.target.title.value;
      const body = event.target.body.value;
      props.onCreate(title, body);//Create태그의 onCreate() 속성 호출 

    }}>
      <p><input type="text" name="title" placeholder="input title"></input></p>
      <p><textarea name="body" placeholder="input body" cols={30} rows={15}></textarea></p>
      <input type="submit" value="Create"></input>

    </form>
  </article>
}

function Update(props){
  const [title,setTitle] = useState(props.title);
  const [body,setBody] = useState(props.body);
  
  return <article>
  <h2>Update</h2>
  <form onSubmit={event=>{
    event.preventDefault();
    const title = event.target.title.value;
    const body = event.target.body.value;
    props.onUpdate(title, body);

  }}>
    <p><input type="text" name="title" value={title} onChange={(e)=>{
      setTitle(e.target.value);

    }}></input></p>
    <p><textarea name="body" value={body} cols={30} rows={15} onChange={(e)=>{
      setBody(e.target.value);
    }}></textarea></p>
    <input type="submit" value="Update"></input>

  </form>
</article>
}

function App() {
  const [mode, setMode] = useState('Welcome');
  const [id, setId] = useState(null);
  const [nextId, setNextId] = useState(4);
  const [topics,setTopics] = useState([
    {id:1, title: 'html', body: 'html is...'},
    {id:2, title: 'css', body: 'css is...'},
    {id:3, title: 'js', body: 'js is...'},
  ])

  let content = null;
  let contentController = null;
  
  if(mode == 'Welcome'){
    content = <Article title="Welcome" body="Hello, Welcome"></Article>
  }else if(mode == 'Read'){
    let title, body = null;
    for(let i=0; i<topics.length; i++){
      if(topics[i].id == id){
        title = topics[i].title;
        body = topics[i].body;        
      }
    }
    content = <Article title={title} body={body}></Article>
    contentController = <li><a href={"/Update/" + id} onClick={event=>{
      event.preventDefault();
      setMode("Update");


    }}> Update </a></li>

  }else if(mode == 'CREATE'){
    content = <Create onCreate={(_title,_body)=>{
      const newTopic = {id:nextId, title:_title, body:_body};
      const newTopics = [...topics];
      newTopics.push(newTopic);
      setTopics(newTopics);
      setMode('Read');// Read 모드로 바꿔줘야 상세페이지가 보이게 된다.  
      setId(nextId);
      setNextId(nextId + 1);
      
    }}></Create>
  }else if( mode == 'Update'){
    let title, body = null;
    for(let i=0; i<topics.length; i++){
      if(topics[i].id == id){
        title = topics[i].title;
        body = topics[i].body;        
      }
    }
    content = <Update title={title} body={body} onUpdate={(title,body)=>{
      const updateTopic = {id:id, title:title, body:body};
      const newTopics = [...topics];
      //console.log(typeof(newTopics));

      for(let i=0; i<newTopics.length; i++){
        if(newTopics[i].id == id){
          newTopics[i] = updateTopic;
          break;
        }

      }
      setTopics(newTopics);
      setMode('Read');
      
    }}>

    </Update>

  }

  return (
    <div> 
      <Header title="Header Title" onChangeMode={() => {
        setMode('Welcome');
      }}>
      </Header>

      <Nav topic={topics} onChangeMode={(_id)=> {
        setMode('Read');
        setId(_id);
      }}></Nav>
      {content}
      <ul>
        <li>
          <a href="/CREAT" onClick={event => {
            event.preventDefault();
            setMode("CREATE");
          }}>CREATE</a>
        </li>
        {contentController}
        
      </ul>
      
    </div>
  );
}

export default App;
