
public class DoubleLinkedList {	//��ũ�� �ΰ��� ���� ��� �������� ��ũ �ٿ� ���
	private DListNode head, tail;
	public DoubleLinkedList(){
	}
	public void insertFirst(String x){ //ù ������ �ּҿ� ����
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
	

	public int findData(String x){ //Z�� �� ��° ������������ ��ȯ�ϴ� �޼ҵ�
		DListNode p = head;
		int cnt = 0;
		if(head == null) {
			System.out.println("����Ʈ�� ������ϴ�.");
			
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
	
	
	public void deleteNode(String y){ // ���� y �� ����
		DListNode p = head;
		if(head == null) {
			System.out.println("������ ���Ұ� �����ϴ�");
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
			else {	// ã������ �����Ϳ� ��ġ���� ������ ���� ��ũ�� �Ѿ.
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
