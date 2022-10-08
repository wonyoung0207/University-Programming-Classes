
public class StackMain {

	public static void main(String[] ar){
		ArrayStack<String> stack = new ArrayStack();
		stack.push("apple");
		stack.push("banana");
		//stack.push("pineapple");
		stack.peek();
		stack.printStack();
		
		ListStack<String> ls = new ListStack();
		ls.push("apple");
		ls.push("orange");
		ls.push("banana");
		ls.printStack();
		ls.pop();
		ls.printStack();
	}
	 
}
