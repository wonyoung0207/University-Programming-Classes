
public class LinkedListMain {

	public static void main(String[] args) {		
		LinkedList list1 = new LinkedList();
		//list1 = ("Kim", "Lee", "Park");

		list1.addLastNode("Kim");
		list1.addLastNode("Lee");
		list1.addLastNode("Park");
		list1.addLastNode("Choi");
		list1.printList();
	
		// list2 = ("Apple", "Banana", "Orange", "Grape")
		LinkedList list2;
		list2 = new LinkedList();
		list2.addLastNode("Apple");
		list2.addLastNode("Banana");
		System.out.println("ó������ ���� :" + list2.deleteFirst());
		list2.printList();
		
		list2.addLastNode("Orange");
		list2.addLastNode("Grape");
		list2.addFirst("Pineapple");	//ó�� ���ҿ� ����Ÿ ����.
		list2.printList();
		
		list2.deleteLast();
		list2.printList();
		
		System.out.print("���� ã�� ���ϴ°����� �ٲ��ִ� �żҵ�=> ");
		list2.replaceNode("Orange", "Durian"); //�������� ã�Ƽ� �θ������� �ٲ��ش�.
		list2.printList();
		
		System.out.println("count : " + list2.getNumberOfNode());
		list2.reverseList();
		list2.printList();
		list2.deleteNode(3);
		list2.printList();
		
		ListNode pNode;
		pNode = list2.findNode("Banana");
		list2.insertAfter(pNode, "Strawberry");
		list2.printList();
		
			}
		
}
