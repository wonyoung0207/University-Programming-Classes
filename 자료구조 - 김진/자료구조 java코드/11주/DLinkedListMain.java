//deque 방식으로 구현한 DLinkedList임
public class DLinkedListMain {
	public static void main(String args[]){
		DLinkedList list1=new DLinkedList();//DLinkedList형 객체 만들어서 사용
		//DLinkedList클래스 이용해서 메소드들 실행 -> 더블연결리스트임
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
		list1.findData("Choi");//4번째 데이터가 choi 
		System.out.println("여기가 findData하는부분 : "+list1.findData("Choi"));
		list1.deleteLast();//마지막원소 'sun' 제거 
		list1.deleteFirst();//첫원소 'Hong' 제거
		list1.printList();//리스트 한번찍기
		list1.peekFirst();//첫원소 yoo를 peek
		list1.peekLast();//마지막원소 kim을 peek
	}
}
    