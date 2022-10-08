
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

	private ListNode head;  // ù��° ����� �ּҸ� ������ ��������
	private ListNode tail;  //������ ����� �ּҸ� ������ ��������
	public LinkedList() { // ������
	}
	
	// ����Ʈ�� �������� ���Ҹ� �߰�
	public void addLastNode(String x) {
		ListNode newNode = new ListNode();	//listNode��� ��Ʋ���� newNode �� ����.
		newNode.data = x;	//kim,lee,pack,choi newNode�� ����Ÿ�� ���ʷ� �� ����.
		newNode.link = null;	//newNode��� ��ü�� ��� ���� ���� ����Ÿ���ְ� �ּҿ� null ����.
		//ListNode newNode = new ListNode(x);
		if(head == null) {		//�ص忡 �� ������,ù��° LinkedList ����. ����Ÿ�� ��,��ũ�� ��-> head �� ListNode�� �ּҸ� ������ ��������
			head = newNode;		//ù������ �ּҿ� newNode ����Ÿ ����
			tail = newNode;		//������������ �ּҿ� newNode ����Ÿ ����
			
		}
		else {	//���Ұ� �̹� �����ϸ�
			tail.link = newNode;	//tail.link�� ���������� �ּҸ� ��Ÿ���� ��.���� ù���ҿ��� tail������ũ�� newNode�� ��ũ�� null����
			tail = newNode;			//tail �ּҿ� newNode �� �ּ��� null ����.
									//�׷��� ������������ tail��ũ�� null�̶� ������ �ּ� ������ �� �߰��Ҽ�����
		}
	}
	
	
	// ��� ������ �ѹ��� �湮�Ͽ� ���� ���
	public void printList() {
		ListNode p;
		p = head;
		System.out.print("(");
		// ���Ҹ� �湮�ϴ� ��� 1
		while (p != null) {
			System.out.print(p.data + " ");	//p�� ����Ÿ �� ���
			p = p.link;	//p���ٰ� ������ ����Ű�� p.link �� �����ؼ� �ݺ��ϸ� �������� ��� ���� ����.
		}
		System.out.println(")");
	}
	
	
	
	public void addFirst(String x) {	//ù���ҿ� ���� �߰�
		ListNode newNode = new ListNode();	//�� ��带 ����
		newNode.data = x;	//����忡 �������� �ּҿ� null ����
		newNode.link = null;
		if(head == null) {	//���Ұ� �ƹ��͵� ����������
			head = newNode;
			tail = newNode;
		}
		else {			//���Ұ� �̹� �����ϸ�
			newNode.link = head;		//newNode�� ������ũ�� �ص� ��ũ�� �־��ش�.
			head = newNode;				//�ص� ��ũ���� ���� �������� ��帵ũ�� �־��ش�.		
			//���� ���Ұ� �տ��߰��Ǵ°� �տ� ��ũ�� �ڿ���ũ�� ��������ִ°���
		}
	}
	
	
	//ù��° ���Ҹ� ��������.
	public String deleteFirst(){//�����ϳ��� �������� ������ �����ϰ� head��ũ�� ������ũ�� ����
		String x = "";
		if(head == null) {	//���Ұ� �ϳ��� ������쿡 ��µɼ� �ֵ���
			return "No element";
		}
		
		x = head.data;		//x���ٰ� ó������ ����. -> ���������� ������� ����
		head = head.link;	//ù������ �ּҿ� �����ּҸ� ����
		
		if(head == null) {	//���� ������ ��µɼ� �ֵ���
			tail = null;
		}
		return x;	//�����Ǵ� ���� ������ ����,
	}
	
	
	//������ ���Ҹ� ��������.
	public String deleteLast() {
		String x;
		ListNode p;
		ListNode q;
		
		if(head == null) {	//���Ұ� ������� ���
			return "No element found";
			
		}
		//������� ����
		p = head;
		q = null;
		while(p.link != null) {	//��� ������ũ�ΰ��� null�� ��������ũ���� ������
			q = p;
			p = p.link;		//���������� p���� ������������ �ּҰ� ������
			
		}	//q�� ������ -1 ��° ����, p�� ������ ���Ҹ� ����Ŵ
		x = p.data;	//������ ���Ұ� x�� ����->������ ����
		tail = q;	//������ �ּҸ� ��Ʈ�� 2��° �ּҷ� �ٲ�
		q.link = null;	//������ ������ �ּҸ� null���ؼ� ��ũ�� ���������
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
	
	

	// ��͹������ ������ ������ ����� �� �ִ�.
	public int getCountRec(ListNode p) {
		if (p == null) { return 0; }
		return 1 + getCountRec(p.link);
	}
	public int getCount() {
		return getCountRec(head);
	}
	
	
	
	// String x�� String y �� ��ü
	public void replaceNode(String x, String y) {
		ListNode p;
		p = head;
		
		// ���Ҹ� �湮�ϴ� ��� 
		while (p != null) {
			if(p.data.equals(x)) { //���������� �����ϸ鼭 p�� �����Ͱ� ����ڰ� �� ��x�� ������ 
				p.data = y;			//ã�� �����Ϳ� y���� �־��ش�.
				System.out.println("�������� �θ������� �ٲٱ�");
				break;
			}
			p = p.link;				//���� ã�������� �׳� ������ �帣�� �д�.
		}
	}
	
	
	
	public void reverseList() {	//������ �ٲٴ� �޼ҵ�
		ListNode p, q, r;
		p = head; 
		q = null;
		r = null;
		tail = p;

		while (p != null) {	//��ĭ�� �ٸ鼭 ���� ������ ����
			r = q;	//����° �ּҸ� r�� ����
			q = p;	//�ι�° �ּҿ� p�� ����
			p = p.link;	//ù��° �ּҿ� �ι�° �ּ� ����
			q.link = r;
		}
		head = q;
	}
	
	
	
	// n��° ��带 ����
	public void deleteNode(int n) {
		ListNode p;
		ListNode q;
		int count = 0;
		if (head == null) { //��尡 ��������
			System.out.println(" List is empty");
			return;
		}
		if (n == 0) { 
			deleteFirst();
			return;
		}
		p = head; q = null;
		// n-1�� ��带 ã�´�. q�� n-1��° ����� ��������
		for (count = 0; p.link != null && count < n - 1; count++){
			q=p;
			p = p.link;
		}
		
		if (count == (n - 1)) {
			q.link = p.link; // n-1��° ����� ��ũ�� n+1��° ����� �ּҸ� �ִ´�.
			 if (q.link == null) { //���� n+1��°��尡 ���ٸ�, �ٽ� ���� n�� ��尡 ������ ����� 
				tail = q;
			 }
		} else {
			System.out.println(" Node has less than " + n + " elements");
		}
	}
	
	
	
	public ListNode findNode(String x) {
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
	
	
	
	
	public void deleteList() {
		head = null;
	}
}
