//que�� 2�߿��Ḯ��Ʈ�� ����
public class DLinkedList {
	private DListNode head, tail;
	public DLinkedList(){
	}
	
	//ù ���ҿ� ����Ÿ �ֱ�
	public void insertFirst(String x){
		DListNode newNode = new DListNode(x);//DListNode�� newnode�� ����
		if(head==null){ //���� ����Ʈ�� ���Ҿ���
			head =newNode;
			tail = newNode;
			return ; //�ƹ��͵� �������� �ʰ� DLinedList()�� ����
		}
		newNode.rlink=head;	//newNode�� �����ʿ� ��忡 ����ִ� ������ �ּҸ� ����Ű����
		head.llink=newNode;	//head�� ������ newNode�� ����Ű����
		head=newNode;		//head���ٰ� newNode�� �־���
	}
	
	//���������ҿ� ���� �־��ֱ�
	public void insertLast(String x) {
		DListNode newNode = new DListNode(x);
		DListNode p = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		while(p.rlink != null) {	//p�� ��尪�̴ϱ� ������Ű�鼭 rlink�� null�϶����� �ݺ�
			p = p.rlink;
		}
		p.rlink = newNode;			//���� ���� �ͼ� while�� ���ߴϱ� p.rlink�� newNode �����ּҸ� ����
		newNode.llink = p;			//newNode�� �����ּҿ� p(���ϸ���������)�� �������ּҸ� ����
		tail = newNode;				//tail���� ���ο� newNode����
		
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
	//������ ���Ҹ� ����
	public String deleteLast(){
		//ä����
		String x;
		DListNode p;
		DListNode q;
		
		if (head == null) { 
			return "No element found"; 
		}
		p = head; q = null;
		while (p.rlink != null) {//p�� ���� ��������,q�� �������� ��
			q = p;
			p = p.rlink;
			
		}
		x = p.data;				//x���ٰ� ������ ������ �־��ְ�
		tail = q;				//tail�� q�� �ٲٰ�
		q.rlink = null;			//q.rlink  = null �ؼ� �������̿��� ���ҿ��� ������ �����ش�
		return x;				//x������ ������ �̿��� ������ �����Ͱ� ����ִ�.
	}
	
	//ã����� �����Ͱ�  �� ��° ������������ ��ȯ�ϴ� �޼ҵ�
	public int findData(String x){ 
		int cnt=0;
		DListNode p=head;
		if(isEmpty()) return 0;
		while(p.rlink!=null){
			if(p.data.compareTo(x)==0) { //��ġ�ϸ� ���° cnt���� ����
				return cnt;
			}
			p=p.rlink;					//ã�������� ����
			cnt++;
		}
		return -99;						//ã�����ϴ� ���� ���ٸ� -99�� ��ȯ
	}
	
	//��带 �����ϴ� �޼ҵ�
	public void deleteNode(String y){
		DListNode p;
		p=head;
		while(p.rlink!=null){//��� �����ϸ鼭 ã��
			if((p.data==y)&&(p==head)){		//�ص忡 ����ִ� �����Ͱ� ã���� �ϴ� ���̶�� 
				head=head.rlink;			//head�� �ٲ���� �ϹǷ� head�� �����ַμ� �ٲ���
				head.llink=null;
			}
			else if(p.data==y){
				p.llink.rlink=p.rlink;		//p�� ã�°��̶�� p�����ּҿ� ����� ���� rlink �� p�� �������Ҹ� ����Ű���� 
				p.rlink.llink=p.llink;		//p�� ���� ���� ���� �ּҸ� q�� �����ּҿ� ������ִ� ���̶�� �ٲ���
			}
			p=p.rlink;
		}
	}
	//���� ����Ʈ�ϴ� �޼ҵ�
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
	//ù���� ������
	public void peekFirst() {
		if(!isEmpty()) {
			System.out.println(head.data);	//ó��head���ִ� ���Ҹ� ����Ʈ�Ѵ�
		}
	}
	//���������� ������
	public void peekLast() {
		if(!isEmpty()) {
			System.out.println(tail.data);//������ tail�� �ִ� �����͸� ����Ʈ�Ѵ�.
		}
	}
	
	public boolean isEmpty() {
		DListNode p;
		p=head;
		if(p.equals(null)) {//p.rlink == null �� �����ǹ���
			return true;
		}
		else return false;	//������� true�� �ƴϸ� false�� ����
		
	}
}
