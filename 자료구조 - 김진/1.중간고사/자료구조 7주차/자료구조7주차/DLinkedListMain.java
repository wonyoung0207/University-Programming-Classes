
public class DLinkedListMain {
	public static void main(String args[]){
		DoubleLinkedList list1=new DoubleLinkedList();
		list1.insertFirst("Kim");
		list1.insertFirst("Choi");
		list1.insertFirst("Lee");
		list1.insertFirst("Park");
		list1.printList();//4������ �߰�
		
		list1.deleteNode("Lee");	//�����ϳ� ����
		list1.printList();//�ϳ������� ��� ���
		
		list1.insertFirst("Yoo");
		list1.insertFirst("Hong");
		list1.insertLast("Sun");
		list1.printList();//ó������ 2�� ���������� 1�� ���� �߰�
		
		list1.deleteLast();	//������ ���� ����
		list1.printList();
		
		list1.findData("Choi");//4��° �����Ͱ� choi 
		System.out.println(list1.findData("Choi"));
		list1.deleteLast();
		list1.deleteFirst();
		list1.printList();
	}
}
    