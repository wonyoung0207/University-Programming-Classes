//deque ������� ������ DLinkedList��
public class DLinkedListMain {
	public static void main(String args[]){
		DLinkedList list1=new DLinkedList();//DLinkedList�� ��ü ���� ���
		//DLinkedListŬ���� �̿��ؼ� �޼ҵ�� ���� -> �����Ḯ��Ʈ��
		list1.insertFirst("Kim");
		list1.insertFirst("Choi");
		list1.insertFirst("Lee");
		list1.insertFirst("Park");
		list1.deleteNode("Lee");
		list1.insertFirst("Yoo");
		list1.insertFirst("Hong");
		list1.insertLast("Sun");

		//L.deleteLast();
		list1.printList();
		list1.findData("Choi");//4��° �����Ͱ� choi 
		System.out.println("���Ⱑ findData�ϴºκ� : "+list1.findData("Choi"));
		list1.deleteLast();//���������� 'sun' ���� 
		list1.deleteFirst();//ù���� 'Hong' ����
		list1.printList();//����Ʈ �ѹ����
		list1.peekFirst();//ù���� yoo�� peek
		list1.peekLast();//���������� kim�� peek
	}
}
    