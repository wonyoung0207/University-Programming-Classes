
class ListNode {
	String data;
	ListNode link;
}

class LinkedList {

	private ListNode head;  
	private ListNode tail;
	public LinkedList() { // ������
	}
	public void addLastNode(String x) {
		//���� ���
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;
		if (head == null) { // ù��° ���� ������
			head = newNode;
			tail = newNode;
		} else { // ���Ұ� �̹� �����ϸ�
			tail.link = newNode; // ������ ������ ������ ��ũ�� ������ ���� ���� ����
			tail = newNode;  // ���ο� ���Ұ� ������ ���ҷ� �߰���
		}
	
	}
	public void printList() {
		ListNode p;
		p = head;
		System.out.print("(");
		// ���Ҹ� �湮�ϴ� ��� 1
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
		}
		
		// ���Ҹ� �湮�ϴ� ���2
//		for (p = head; p != tail; p = p.link) {
//			System.out.print(p.data + " ");
//		}
//		System.out.print(p.data + " ");
		System.out.println(")");
	}
	
	public void addFirst(String x) {
		// ä�� ����
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;
		if (head == null) { // ù��° ���� ������
			head = newNode;
			tail = newNode;
		} else { // ���Ұ� �̹� �����ϸ�
			newNode.link = head; // ������ ������ ������ ��ũ�� ������ ���� ���� ����
			head = newNode;  // ���ο� ���Ұ� ������ ���ҷ� �߰���
		}
	}
	
	public String deleteFirst(){
		String x = " ";
		if (head == null) {
			return "No element";
		}
		x = head.data;
		head = head.link;
		if (head == null) { tail = null; }
		return x;
	}
	public String deleteLast() {
		String x;
		ListNode p;
		ListNode q;
		
		if (head == null) { 
			return "No element found"; 
		}
		p = head; q = null;
		while (p.link != null) {
			q = p;
			p = p.link;
			
		}
		x = p.data;
		tail = q;
		q.link = null;
		return x;
	}
	public int getNumberOfNode() {
		int count = 0;
		ListNode p;
		p = head;
		// ���Ҹ� �湮�ϴ� ��� 1
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
			count++;
		}
		return count;
	}
	// String x�� String y �� ��ü
	public void replaceNode(String x, String y) {
		ListNode p;
		p = head;
		// ���Ҹ� �湮�ϴ� ��� 1
		while (p != null) {
			if(p.data.compareTo(x)==0) { 
				System.out.println("data :" + p.data);
			}
			p = p.link;
		}
		p = head;
		// ���Ҹ� �湮�ϴ� ��� 1
		while (p != null) {
			if(p.data.equals(x)) { 
				p.data = y;
			}
			p = p.link;
		}
	}
	public void reverseList() {
		ListNode p, q, r;
		p = head; 
		q = null;
		r = null;
		tail = p;
		// ���Ҹ� �湮�ϴ� ��� 1
		while (p != null) {
			r = q;
			q = p;
			p = p.link;
			q.link = r;
		}
		head = q;
	}
	public void deleteNode(int n) {
		ListNode p;
		ListNode q;
		int count = 0;
		if (head == null) { 
			System.out.println(" List is empty");
			return;
		}
		if (n == 0) { 
			deleteFirst();
			return;
		}
		p = head; q = null;
		for (count = 0; p.link != null && count < n - 1; count++){
			q=p;
			p = p.link;
		}
		
		if (count == (n - 1)) {
			q.link = p.link;
			 if (q.link == null) { 
				tail = q;
			 }
		} else {
			System.out.println(" Node has less than " + n + " elements");
		}
	}
	ListNode findNode(String x) {
		ListNode p;
		p = head;
		// ���Ҹ� �湮�ϴ� ��� 1
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
}
