
public class QueueMain {

	public static void main(String[] ar) {

		System.out.println(" Array Queue : ");
		ArrayQueue aq1 = new ArrayQueue();
		aq1.add("banana");
		aq1.add("tomato");
		aq1.add("pineapple");
		System.out.println("peek �ϴ� �κ� : "+aq1.peek());		//peek�� ���� �����°�.
		
		System.out.println("����1"+aq1.remove());
		System.out.println("����2"+aq1.remove());
		System.out.println("����3"+aq1.remove());
		System.out.println("����4"+aq1.remove());

		aq1.printQueue();
		
		System.out.println("LinkedList Queue : ");
		// ���׸��� ���� ����غ��� ������?
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
		// ���׸��� ���� �ȵȴٸ� ���׸��� ������� ����
		
		ListQueue2 lq2 = new ListQueue2();
		lq2.add("banana");
		lq2.add("tomato");
		lq2.add("pineapple");
		System.out.println(lq2.peek());
		System.out.println(lq2.remove());
		lq2.printQueue();
		while(lq2.peek()!=null) {	//peek�� null�� �ɶ����� ����ִ°��� �����Ѵ�.
			System.out.println("�ݺ��ؼ� �����ϴ°� "+lq2.remove());
		}
		System.out.println("final : " + lq2.remove());	//�� ��m�� ������ null�� ���ϵȴ�.
		System.out.println(lq2.remove());				//�� ���⶧���� null ����.
		lq2.printQueue();
	}
}
