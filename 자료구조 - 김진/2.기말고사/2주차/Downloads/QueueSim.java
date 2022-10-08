import java.util.Stack;

public class QueueSim {
	public static void main(String[] ar){
		Stack<String> stack1 = new Stack<>();
		
		stack1.push("apple");
		stack1.push(stack1.pop());
		stack1.push("banana");
		stack1.push("orange");
		
		stack1.peek();
		
		Stack<String> stack2 = new Stack<>();
		/// dequeue();
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		System.out.println(stack2.pop());
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		
		
		
		
//		ListStack<String> ls = new ListStack();
//		ls.push("apple");
//		ls.push("orange");
//		ls.push("banana");
//		ls.printStack();
//		ls.pop();
//		ls.printStack();
	}
	 
}
