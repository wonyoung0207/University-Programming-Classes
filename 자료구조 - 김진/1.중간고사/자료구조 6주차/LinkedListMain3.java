
public class LinkedListMain3 {

	public static void main(String[] ar) {
		
		// list1 = ("Kim", "Lee", "Park")
		LinkedList list1;
		list1 = new LinkedList();
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
		System.out.println("deleted first :" + list2.deleteFirst());
		list2.addLastNode("Orange");
		list2.addLastNode("Grape");
		list2.addFirst("Pineapple");
		list2.deleteLast();
		list2.printList();
		list2.replaceNode("Orange", "Durian");
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
