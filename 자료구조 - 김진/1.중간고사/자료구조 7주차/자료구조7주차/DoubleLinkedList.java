
public class DoubleLinkedList {	//링크를 두개를 만들어서 노드 양쪽으로 링크 붙여 사용
	private DListNode head, tail;
	public DoubleLinkedList(){
	}
	public void insertFirst(String x){ //첫 원소의 주소에 대입
		DListNode DnewNode = new DListNode(x);
		DListNode p = head;
		if(head == null) {
			head = DnewNode;
			tail = DnewNode;
			return;
		}
		
		DnewNode.rlink = p;
		p.llink = DnewNode;
		head = DnewNode;
		
		
	}
	public void insertLast(String x) {
		DListNode newNode = new DListNode(x);
		DListNode p = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		while(p.rlink != null) {
			p = p.rlink;
		}
		p.rlink = newNode;
		newNode.llink = p;
		tail = newNode;
		
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
	
	public String deleteLast(){
		String x = "";
		if(head == null) {
			return "No element";
			
		}
		x = tail.data;
		tail.rlink = null;
		if(head == null) {
			tail = null;
		}
		
		return x;
		
	}
	

	public int findData(String x){ //Z가 몇 번째 데이터인지를 반환하는 메소드
		DListNode p = head;
		int cnt = 0;
		if(head == null) {
			System.out.println("리스트가 비었습니다.");
			
		}
		while(p != null) {
			if(p.data.compareTo(x) == 0) {
				break;
			}
			cnt++;
			p = p.rlink;
							
		}
		return cnt;
		
	}
	
	
	public void deleteNode(String y){ // 원소 y 를 삭제
		DListNode p = head;
		if(head == null) {
			System.out.println("삭제할 원소가 없습니다");
		}
		while(p != null) {
			if(p.data.compareTo(y) == 0) {
				if(p == tail) {
					deleteLast();
					break;				
				}else if(p == head) {
					deleteFirst();
					break;
				}else {
					p.rlink.llink = p.llink;
					p.llink.rlink = p.rlink;
					break;
				}
			}
			else {	// 찾으려는 데이터와 일치하지 않으면 다음 링크로 넘어감.
				p = p.rlink;
			}
		}
	}
	
	
	
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
}
