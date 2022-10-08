import logo from './logo.svg';
import './App.css';

function Header(props){
  return <header>
    <h1><a href="/"> {props.title}</a></h1>
  </header>
}

function Nav(props) {
  const lis = []
  for(let i=0; i<props.topic.length; i++){
    let t = props.topic[i];
    lis.push(<li key={t.id}> <a href={'/read/'+t.id}> {t.title} </a></li>
    )
  }
  return <nav>
    <ol>
      {lis}
    </ol>
  </nav>
}

function Article(){
  return <article>
    <h2> Wellcom</h2>
    Hello, WEB
  </article>
}

function App() {
  const topics = [
    {id:1, title: 'html', body: 'html is...'},
    {id:2, title: 'css', body: 'css is...'},
    {id:3, title: 'js', body: 'js is...'},
  ]

  return (
    <div> 
      <Header title="Header Title"></Header>
      <Nav topic={topics}></Nav>
      <Article></Article>
    </div>
  );
}

export default App;
