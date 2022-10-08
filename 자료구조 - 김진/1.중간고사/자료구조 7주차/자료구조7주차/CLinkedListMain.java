
public class CLinkedListMain {
	public static void main(String args[]){
		System.out.println("CL1=(20,4, 3, 7) 만들기");
		System.out.println("20->4->3->7->20->무한반복");

		CLinkedList CL1=new CLinkedList();
		//CL1.print();
		CL1.addFirst(5);	//계속 밀려서 이게 마지막원소됨
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
//		CL1.getNoofNode(); //갯수 출력해보라
		CL1.addLast(33); //마지막에 노드추가
		CL1.print();
	}

}
