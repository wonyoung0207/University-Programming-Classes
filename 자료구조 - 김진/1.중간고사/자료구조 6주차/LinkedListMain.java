
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
		System.out.println("처음값을 삭제 :" + list2.deleteFirst());
		list2.printList();
		
		list2.addLastNode("Orange");
		list2.addLastNode("Grape");
		list2.addFirst("Pineapple");	//처음 원소에 데이타 삽입.
		list2.printList();
		
		list2.deleteLast();
		list2.printList();
		
		System.out.print("값을 찾아 원하는값으로 바꿔주는 매소드=> ");
		list2.replaceNode("Orange", "Durian"); //오랜지를 찾아서 두리안으로 바꿔준다.
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
