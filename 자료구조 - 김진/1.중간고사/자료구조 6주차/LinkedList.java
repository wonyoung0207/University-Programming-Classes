
class ListNode {
	String data;
	ListNode link;
	public ListNode()
	{
		data = null;
		link = null;
	}
	public ListNode(String val)
	{
		data = val;
		link = null;
	}
}

class LinkedList {

	private ListNode head;  // 첫번째 노드의 주소를 가지는 참조변수
	private ListNode tail;  //마지막 노드의 주소를 가지는 참조변수
	public LinkedList() { // 생성자
	}
	
	// 리스트의 마지막에 원소를 추가
	public void addLastNode(String x) {
		ListNode newNode = new ListNode();	//listNode라는 빵틀에서 newNode 를 찍어낸다.
		newNode.data = x;	//kim,lee,pack,choi newNode의 데이타에 차례로 값 대입.
		newNode.link = null;	//newNode라는 객체를 계속 새로 만들어서 데이타값넣고 주소에 null 대입.
		//ListNode newNode = new ListNode(x);
		if(head == null) {		//해드에 값 없을때,첫번째 LinkedList 생성. 데이타에 값,링크에 널-> head 는 ListNode의 주소를 가지는 참조변수
			head = newNode;		//첫원소의 주소에 newNode 데이타 대입
			tail = newNode;		//마지막원소의 주소에 newNode 데이타 대입
			
		}
		else {	//원소가 이미 존재하면
			tail.link = newNode;	//tail.link는 다음원소의 주소를 나타내는 것.따라서 첫원소엿던 tail다음링크에 newNode의 링크인 null대입
			tail = newNode;			//tail 주소에 newNode 의 주소인 null 대입.
									//그래야 다음값왔을때 tail링크가 null이라 마지막 주소 다음에 값 추가할수잇음
		}
	}
	
	
	// 모든 노드들을 한번씩 방문하여 내용 출력
	public void printList() {
		ListNode p;
		p = head;
		System.out.print("(");
		// 원소를 방문하는 방식 1
		while (p != null) {
			System.out.print(p.data + " ");	//p의 데이타 값 출력
			p = p.link;	//p에다가 다음을 가리키는 p.link 를 대입해서 반복하면 다음으로 계속 갈수 있음.
		}
		System.out.println(")");
	}
	
	
	
	public void addFirst(String x) {	//첫원소에 원소 추가
		ListNode newNode = new ListNode();	//새 노드를 생성
		newNode.data = x;	//새노드에 받은값과 주소에 null 대입
		newNode.link = null;
		if(head == null) {	//원소가 아무것도 없을경우실행
			head = newNode;
			tail = newNode;
		}
		else {			//원소가 이미 존재하면
			newNode.link = head;		//newNode의 다음링크에 해드 링크를 넣어준다.
			head = newNode;				//해드 링크에는 새로 생성해준 노드링크를 넣어준다.		
			//따라서 원소가 앞에추가되는건 앞에 링크를 뒤에링크에 연결시켜주는거임
		}
	}
	
	
	//첫번째 원소를 제거하자.
	public String deleteFirst(){//변수하나에 날려버릴 데이터 저장하고 head링크를 다음링크로 설정
		String x = "";
		if(head == null) {	//원소가 하나도 없을경우에 출력될수 있도록
			return "No element";
		}
		
		x = head.data;		//x에다가 처음원소 대입. -> 실질적으로 여기부터 시작
		head = head.link;	//첫원소의 주소에 다음주소를 대입
		
		if(head == null) {	//원소 없을때 출력될수 있도록
			tail = null;
		}
		return x;	//삭제되는 값이 뭔지를 리턴,
	}
	
	
	//마지막 원소를 제거하자.
	public String deleteLast() {
		String x;
		ListNode p;
		ListNode q;
		
		if(head == null) {	//원소가 없을경우 출력
			return "No element found";
			
		}
		//여기부터 시작
		p = head;
		q = null;
		while(p.link != null) {	//계속 다음링크로가서 null인 마지막링크까지 가도록
			q = p;
			p = p.link;		//마지막에는 p에는 마지막원소의 주소가 들어갈것임
			
		}	//q는 마지막 -1 번째 원소, p는 마지막 원소를 가르킴
		x = p.data;	//마지막 원소가 x에 대입->삭제될 원소
		tail = q;	//마지막 주소를 라트스 2번째 주소로 바꿈
		q.link = null;	//마지막 원소의 주소를 null로해서 링크를 끊어줘야함
		return x;
	}

	
	public int getNumberOfNode() {
	
		int count = 0;
		ListNode p;
		p = head;
		// 원소를 방문하는 방식 1
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
			count++;
		}
		return count;
	}
	
	

	// 재귀방식으로 원소의 갯수를 계산할 수 있다.
	public int getCountRec(ListNode p) {
		if (p == null) { return 0; }
		return 1 + getCountRec(p.link);
	}
	public int getCount() {
		return getCountRec(head);
	}
	
	
	
	// String x를 String y 로 교체
	public void replaceNode(String x, String y) {
		ListNode p;
		p = head;
		
		// 원소를 방문하는 방식 
		while (p != null) {
			if(p.data.equals(x)) { //순차적으로 진행하면서 p의 데이터가 사용자가 준 값x랑 같으면 
				p.data = y;			//찾은 데이터에 y값을 넣어준다.
				System.out.println("오랜지를 두리안으로 바꾸기");
				break;
			}
			p = p.link;				//값을 찾을때까지 그냥 끝까지 흐르게 둔다.
		}
	}
	
	
	
	public void reverseList() {	//순서를 바꾸는 메소드
		ListNode p, q, r;
		p = head; 
		q = null;
		r = null;
		tail = p;

		while (p != null) {	//세칸씩 뛰면서 값을 밑으로 내림
			r = q;	//세번째 주소를 r에 대입
			q = p;	//두번째 주소에 p를 대입
			p = p.link;	//첫번째 주소에 두번째 주소 대입
			q.link = r;
		}
		head = q;
	}
	
	
	
	// n번째 노드를 삭제
	public void deleteNode(int n) {
		ListNode p;
		ListNode q;
		int count = 0;
		if (head == null) { //노드가 비엇을경우
			System.out.println(" List is empty");
			return;
		}
		if (n == 0) { 
			deleteFirst();
			return;
		}
		p = head; q = null;
		// n-1번 노드를 찾는다. q는 n-1번째 노드의 참조변수
		for (count = 0; p.link != null && count < n - 1; count++){
			q=p;
			p = p.link;
		}
		
		if (count == (n - 1)) {
			q.link = p.link; // n-1번째 노드의 링크에 n+1번째 노드의 주소를 넣는다.
			 if (q.link == null) { //만일 n+1번째노드가 없다면, 다시 말해 n번 노드가 마지막 노드라면 
				tail = q;
			 }
		} else {
			System.out.println(" Node has less than " + n + " elements");
		}
	}
	
	
	
	public ListNode findNode(String x) {
	ListNode p;
		p = head;
		// 원소를 방문하는 방식 1
		while (p != null) {
			if(p.data.compareTo(x)==0) { 
				return p;
			}
			p = p.link;
		}
		return null;
	}
	
	
	
	
	public void insertAfter(ListNode prevNode, String x) {
		if ( prevNode == null) {
			System.out.println("The given previous node can not be null");
			return;
		} else {
			ListNode newNode = new ListNode();
			newNode.data = x;
			newNode.link = prevNode.link;
			prevNode.link = newNode;
		}
	}
	
	
	
	
	public void deleteList() {
		head = null;
	}
}
