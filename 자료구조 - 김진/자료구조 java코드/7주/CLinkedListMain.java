
public class CLinkedListMain {
	public static void main(String args[]){
		System.out.println("CL1=(20,4, 3, 7) �����");
		System.out.println("20->4->3->7->20->���ѹݺ�");

		CLinkedList CL1=new CLinkedList();
		//CL1.print();
		CL1.addFirst(5);	//��� �з��� �̰� ���������ҵ�
		CL1.addFirst(7);
		CL1.addFirst(3);
		CL1.addFirst(4);
		CL1.addFirst(20);
		CL1.print();
		CL1.printManyTimes(20);
		CL1.deleteNode(20);
		CL1.print();
		//CL1.deleteLast();
		//CL1.deleteLast();
//		CL1.deleteLast();
//		CL1.deleteLast();
//		CL1.print();
//		CL1.getNoofNode(); //���� ����غ���
		CL1.addLast(33); //�������� ����߰�
		CL1.print();
	}

}
