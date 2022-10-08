
public class QueueMain {

	public static void main(String[] ar) {

		System.out.println(" Array Queue : ");
		ArrayQueue aq1 = new ArrayQueue();
		aq1.add("banana");
		aq1.add("tomato");
		aq1.add("pineapple");
		System.out.println("peek 하는 부분 : "+aq1.peek());		//peek는 값을 꺼내는것.
		
		System.out.println("삭제1"+aq1.remove());
		System.out.println("삭제2"+aq1.remove());
		System.out.println("삭제3"+aq1.remove());
		System.out.println("삭제4"+aq1.remove());

		aq1.printQueue();
		
		System.out.println("LinkedList Queue : ");
		// 제네릭을 만들어서 사용해볼수 있을까?
//		ListQueue<String> lq1 = new ListQueue<String>();
//		lq1.add("banana");
//		lq1.add("tomato");
//		lq1.add("pineapple");
//		lq1.remove();
//		lq1.printQueue();
//
//		ListQueue<Integer> lq3 = new ListQueue<Integer>();
//		lq3.add(95);
//		lq3.add(88);
//		lq3.add(77);
//		lq3.add(37);
//		lq3.remove();
//		lq3.printQueue();
		// 제네릭이 이해 안된다면 제네릭을 사용하지 말자
		
		ListQueue2 lq2 = new ListQueue2();
		lq2.add("banana");
		lq2.add("tomato");
		lq2.add("pineapple");
		System.out.println(lq2.peek());
		System.out.println(lq2.remove());
		lq2.printQueue();
		while(lq2.peek()!=null) {	//peek가 null이 될때까지 들어있는값을 삭제한다.
			System.out.println("반복해서 삭제하는곳 "+lq2.remove());
		}
		System.out.println("final : " + lq2.remove());	//다 비웟기 때문에 null이 리턴된다.
		System.out.println(lq2.remove());				//값 없기때문에 null 리턴.
		lq2.printQueue();
	}
}
