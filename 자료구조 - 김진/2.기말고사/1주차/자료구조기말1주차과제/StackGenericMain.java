
public class StackGenericMain {

	public static void main(String[] ar){
		ArrayStackGeneric<String> stack = new ArrayStackGeneric();
		stack.push("apple");	//size 0,s.length ���� 1
		//stack.push(stack.pop());
		stack.push("banana");	//size 1,s.length ���� 1 -> ���̿� ����� �������� �ø��� �żҵ��� resize�� ȣ���ؼ� ���̸� 2��� �ø�
		stack.push("orange");	//size 2 2
		
		stack.peek();
		stack.printStack();		//�迭�� ����ִ� ������ ������ �����.
		
		ArrayStackGeneric<Integer> stack3 = new ArrayStackGeneric();
		stack3.push(10);
		stack3.push(20);
		stack3.push(30);
		stack3.printStack();
		
		ArrayStackGeneric<String> stack1 = new ArrayStackGeneric();
		/// dequeue();
		while(!stack.isEmpty()) {
			stack1.push(stack.pop());
		}
		System.out.println("stack1 print");
		stack1.printStack();
		System.out.println(stack1.pop());
		while(!stack1.isEmpty()) {
			stack.push(stack1.pop());
		}
		stack.printStack();

	}
	 
}
