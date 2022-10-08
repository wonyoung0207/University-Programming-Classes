
public class DLinkedListMain {
	public static void main(String args[]){
		DoubleLinkedList list1=new DoubleLinkedList();
		list1.insertFirst("Kim");
		list1.insertFirst("Choi");
		list1.insertFirst("Lee");
		list1.insertFirst("Park");
		list1.printList();//4개원소 추가
		
		list1.deleteNode("Lee");	//원소하나 삭제
		list1.printList();//하나삭제한 결과 출력
		
		list1.insertFirst("Yoo");
		list1.insertFirst("Hong");
		list1.insertLast("Sun");
		list1.printList();//처음에다 2개 마지막에다 1개 원소 추가
		
		list1.deleteLast();	//마지막 원소 제거
		list1.printList();
		
		list1.findData("Choi");//4번째 데이터가 choi 
		System.out.println(list1.findData("Choi"));
		list1.deleteLast();
		list1.deleteFirst();
		list1.printList();
	}
}
    