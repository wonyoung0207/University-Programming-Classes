import java.util.Stack;

public class MyQueueSim {

	public static void main(String[] ar) {

		Stack<String> stack1 = new Stack<>();
		stack1.push("apple");
		stack1.push("banana");
		stack1.push("orange");
		stack1.peek();
		Stack<String> stack2 = new Stack<>();
		/// dequeue();
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());

		}
		System.out.println("ù��° ������ ���� ������ : "+stack2.pop()); //�ٸ����ؿ� �����ؼ� �� ���� ���� pop�ؼ� ����.
		
		while (!stack2.isEmpty()) {//�ٽ� ����1�� ���� 2 ������ �־����. �׷��ԵǸ� ó���� ����� ���
			stack1.push(stack2.pop());
		}
		Stack<Integer> stack3 = new Stack<>();
		//���� ���� 3,4 ���� �հ� ���� �����̿�
		stack3.push(10);
		stack3.push(20);
		stack3.push(30);
		stack3.peek();
		Stack<Integer> stack4 = new Stack<>();
		/// dequeue();
		while (!stack3.isEmpty()) {
			stack4.push(stack3.pop());
		}
		System.out.println("ù��° ������ ���� ������ : "+stack4.pop());
		while (!stack4.isEmpty()) {
			stack3.push(stack4.pop());
		}
	}

}