public class CLinkedList {

	private CListNode head, tail;
	private CListNode temp;

	public void addFirst(int x){	//ó�����ҿ� �� ����

		CListNode cnewNode=new CListNode();	//����Ÿ x������ ������
		cnewNode.data=x;
		
		if(head==null){// ���鸮��Ʈ���
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head;
		}
		else{ //���Ұ� ������ ����
			temp=head;
			cnewNode.clink=temp;//���ο� ��ü�� �ּҿ� ù���� �ּ� ����.
			CListNode p = head;	//temp�� ù�����ּ� �ְ� �װ� ����������ü �� ��ũ�ּҿ� ����
			do {
				p = p.clink;	//p���ٰ� �����ּ� ����.
			} while (p.clink != head);	//���������Ұ� head�� �ּҸ� ����ų������ �ݺ�.
			//������ ������ ��ũ�� ������ ���� ���� ����Ű���� ��.
			p.clink = cnewNode;	//�ݺ��� ���������� ������������ �ּҿ� ������ ���� ���� �ּ� ����
			// tail.clink = cnewNode; tail�� ������� �ʴ´ٰ� �� ��
			head=cnewNode; // ������ �ּҸ� head�� ����
			//���� tail�� ������� �ʴ´ٸ� 
		}
	}

	public void deleteLast(){

		if(head==null){
			System.out.println("Nothing to delete");
		}
//		else if(head==tail){//���Ұ� 1���̸�
//			head=null; tail=null;
//		}
		else if (head.clink == head) { //���Ұ� 1���̸�
			head = null;
			//tail = null;
		}
		else{ //���Ұ� 2�� Ȥ�� �� �̻� 
			CListNode p, q;
			p=null; q=head;
			//tail�� ����Ѵٸ� �Ʒ� �ڵ�
//			while(q!=tail){
//				p=q; q=q.clink;
//			}
//			tail=p;
			// tail�� ������� �ʴ´ٸ� �Ʒ��ڵ�
			while(q.clink != head) {
				p = q; q = q.clink;
			}
			p.clink=head;		//������ �ּҿ��ٰ� ù��° �ּҸ� ����.	
		}
	}

	public void print(){
		CListNode p=head;
		if(p!=null){
//			System.out.print(p.data + "->");// ù��° ����
//			p= p.clink;
//			while(p!=head){
//				System.out.print(p.data+"->");
//				p=p.clink;
//			}
//			System.out.print(p.data+"->"); //��������� ��
//			p=p.clink;  //������->���ο����̵�
//			System.out.println("�ٽ� ù��° ����" + p.data);
			//Ȥ�� �Ʒ�ó��  ����ص� �ȴ�.
			do {
				System.out.print(p.data+ "->");
				p = p.clink;	//������ũ ����
			} while ( p != head);
			// ���� ���� ����Ʈ���� Ȯ��
			System.out.println(" �ٽ� ù��° ����"+ p.data);
			//�ݺ��� ������������ ����. -> p�� �ּҰ� ù���� ������ �ּҶ� ��������������
			
		}
		else { System.out.println("empty list");}
	}
	
	// ���� �ݺ����� ���� ��带 100ȸ ����� ����
	public void printManyTimes(int count){
		
		int cnt =0;
		CListNode p=head;
		System.out.println("printManyTimes");
		
		if(p!=null){
			System.out.print(p.data + "->");// ù��° ����
			p= p.clink;
			while(cnt < count){	//count�� ���� ���ϴ� �ݺ�Ƚ��.
//				if (p == head){
//					System.out.println();
//				}
				System.out.print(p.data+"->");
				cnt++;
				p=p.clink;
			}
			System.out.println();//20���ݺ��ϰ� �ٹٲ�
		}
		else { System.out.println("empty list");}
	}
	
	
	// ���� x �� ����
	public void deleteNode(int x) {
		
		CListNode current = head;//current��� ��ü������� ù���� �ּҳ���
		CListNode prev = current;	//ù������ �ּҸ� prev���ٰ� ����.
		current = current.clink;	//������ũ�� �Ѿ���� ����.
		//���� current���� ���� 2��° �����ּ��ִ°���

		while (current != head) {
			//System.out.println(current.data);
			if (current.data == x) {	//���� ã�� �����Ͷ� ���ٸ�
				if (current==tail) { tail = prev;} 
				//���࿡ ���� ã���������ּҰ� ������������ �ּҶ�� tail�� ù��° �ּ� ����
				prev.clink = current.clink;
				return;
		    }
			prev = current; // �ڵ������  ������ ����
			current = current.clink; // ù��° ������ ����
		}
		// ���� �ڵ�� ù��° ���Ұ� x�϶� ������ �� ����. ���� ������ ���� �ڵ� �߰�
		if (current.data == x) {
			head = head.clink;
			if (current==tail) { head = null; tail = null;} // ���Ұ� �ϳ��϶� ���Ҹ� �����ϹǷ� ���鸮��Ʈ�� ��
			prev.clink = current.clink;
			return;
	    }
	}

	
	// ����� ������ ���
	public int getNoofNode(){
		int cnt=1;
		CListNode current = head;
		while(current != null) {
			if(current == tail) {
				cnt+=1;
				break;
			}else {
				cnt+=1;
				current=current.clink;
			}
		}
		return cnt;
	}

	public void addLast(int x){ //�������Ḯ��Ʈ �������� �����߰�

		CListNode cnewNode=new CListNode();
		cnewNode.data=x;
		
		if(head==null){// empty list
			head=cnewNode; 
			//tail=cnewNode;
			cnewNode.clink=head;
		}
		else{ //���Ұ� ������ ����
			cnewNode.clink=head;//������ ���� ���� ��ũ�� ������ ù��°���� �����ϵ��� ��
			CListNode p = head;
			do {
				p = p.clink;
			} while (p.clink != head);
			p.clink = cnewNode;
			// tail.clink = cnewNode; tail�� ������� �ʴ´ٰ� �� ��					
		}
	}

	//  ���� ���� ����Ʈ�� ���Ұ� �����ϴ� �� ���

	public int isEmpty() {
		
		CListNode current=head;
		if (head != null) {
			return 1; // ���Ұ� �����ϸ�
		}
		return 0; // ���Ұ� �������� ������
	}
	
	
	// ���� x �� �� ��° ���������� �����϶�
	public int searchNode(int x) {
		
		int b=1;
		CListNode cu=head;
		while(cu != null) {
			if(cu.data==x) {
				return b;
			}else {
				b=b+1;
				cu=cu.clink;
			}if(cu==tail) {
				break;
			}
		}
		return 0; //���Ұ� ���ٸ� 0 ����
	}

	public CLinkedList(){	//������
	}

}