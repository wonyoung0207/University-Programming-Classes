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
		System.out.println("첫번째 저장한 원소 꺼내기 : "+stack2.pop()); //다른스텍에 저장해서 젤 위에 값을 pop해서 꺼냄.
		
		while (!stack2.isEmpty()) {//다시 스텍1에 스텍 2 꺼내서 넣어줘라. 그렇게되면 처음에 들어간대로 출력
			stack1.push(stack2.pop());
		}
		Stack<Integer> stack3 = new Stack<>();
		//새로 스택 3,4 만들어서 앞과 같이 스택이용
		stack3.push(10);
		stack3.push(20);
		stack3.push(30);
		stack3.peek();
		Stack<Integer> stack4 = new Stack<>();
		/// dequeue();
		while (!stack3.isEmpty()) {
			stack4.push(stack3.pop());
		}
		System.out.println("첫번째 저장한 원소 꺼내기 : "+stack4.pop());
		while (!stack4.isEmpty()) {
			stack3.push(stack4.pop());
		}
	}

}