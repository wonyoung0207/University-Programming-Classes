//que를 2중연결리스트로 구현
public class DLinkedList {
	private DListNode head, tail;
	public DLinkedList(){
	}
	
	//첫 원소에 데이타 넣기
	public void insertFirst(String x){
		DListNode newNode = new DListNode(x);//DListNode형 newnode를 생성
		if(head==null){ //현재 리스트에 원소없음
			head =newNode;
			tail = newNode;
			return ; //아무것도 돌려주지 않고 DLinedList()를 끝냄
		}
		newNode.rlink=head;	//newNode의 오른쪽에 헤드에 들어있던 데이터 주소를 가리키게함
		head.llink=newNode;	//head의 왼쪽이 newNode를 가리키게함
		head=newNode;		//head에다가 newNode를 넣어줌
	}
	
	//마지막원소에 값을 넣어주기
	public void insertLast(String x) {
		DListNode newNode = new DListNode(x);
		DListNode p = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		while(p.rlink != null) {	//p가 헤드값이니까 증가시키면서 rlink가 null일때까지 반복
			p = p.rlink;
		}
		p.rlink = newNode;			//제일 끝에 와서 while문 멈추니까 p.rlink에 newNode 왼족주소를 연결
		newNode.llink = p;			//newNode의 왼쪽주소와 p(제일마지막원소)의 오른쪽주소를 연결
		tail = newNode;				//tail값에 새로운 newNode대입
		
	}
	
	public String deleteFirst() {
		String x = " ";
		if (head == null) {
			return "No element";
		}
		x = head.data;
		head = head.rlink;
		head.llink = null;
		if (head == null) { tail = null; }
		return x;
	}
	//마지막 원소를 제거
	public String deleteLast(){
		//채워라
		String x;
		DListNode p;
		DListNode q;
		
		if (head == null) { 
			return "No element found"; 
		}
		p = head; q = null;
		while (p.rlink != null) {//p는 제일 마지막값,q는 그전값이 들어감
			q = p;
			p = p.rlink;
			
		}
		x = p.data;				//x에다가 마지막 데이터 넣어주고
		tail = q;				//tail을 q로 바꾸고
		q.rlink = null;			//q.rlink  = null 해서 마지막이였던 원소와의 연결을 끊어준다
		return x;				//x값에는 마지막 이였던 원소의 데이터가 들어있다.
	}
	
	//찾고싶은 데이터가  몇 번째 데이터인지를 반환하는 메소드
	public int findData(String x){ 
		int cnt=0;
		DListNode p=head;
		if(isEmpty()) return 0;
		while(p.rlink!=null){
			if(p.data.compareTo(x)==0) { //일치하면 몇번째 cnt센걸 리턴
				return cnt;
			}
			p=p.rlink;					//찾을때까지 전진
			cnt++;
		}
		return -99;						//찾고자하는 값이 없다면 -99를 반환
	}
	
	//노드를 삭제하는 메소드
	public void deleteNode(String y){
		DListNode p;
		p=head;
		while(p.rlink!=null){//계속 전진하면서 찾기
			if((p.data==y)&&(p==head)){		//해드에 들어있는 데이터가 찾고자 하는 값이라면 
				head=head.rlink;			//head를 바꿔줘야 하므로 head를 다음주로소 바꿔줌
				head.llink=null;
			}
			else if(p.data==y){
				p.llink.rlink=p.rlink;		//p가 찾는값이라면 p왼쪽주소와 연결된 그전 rlink 를 p의 다음원소를 가르키게함 
				p.rlink.llink=p.llink;		//p의 다음 값의 왼쪽 주소를 q의 왼쪽주소와 연결되있는 값이라고 바꿔줌
			}
			p=p.rlink;
		}
	}
	//값을 프린트하는 메소드
	public void printList(){
		DListNode p;
		p=head;
		System.out.print("(");
		while(p!=null){
			System.out.print(p.data);
			p=p.rlink;
			if(p!=null){
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
	//첫원소 꺼내기
	public void peekFirst() {
		if(!isEmpty()) {
			System.out.println(head.data);	//처음head에있는 원소를 프린트한다
		}
	}
	//마지막원소 꺼내기
	public void peekLast() {
		if(!isEmpty()) {
			System.out.println(tail.data);//마지막 tail에 있는 데이터를 프린트한다.
		}
	}
	
	public boolean isEmpty() {
		DListNode p;
		p=head;
		if(p.equals(null)) {//p.rlink == null 과 같은의미임
			return true;
		}
		else return false;	//비었으면 true를 아니면 false를 리턴
		
	}
}
