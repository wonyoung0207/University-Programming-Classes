
public class StackMain {
	
	public static void main(String arg[]){
		ArrayStack stack1 = new ArrayStack();
		
		stack1.push(10);//push �� ���� �ִ°�
		stack1.push(30);
		stack1.push(80);
		stack1.push(200);
		stack1.push(70);
		
		System.out.println(stack1.stackFull());
		System.out.println("peeked value " + stack1.peek());
		
		while(!stack1.empty()){
			System.out.print(stack1.pop()+", ");//pop�� �����°�, ���� ���� �� 70���� ������ �ݺ�
		}
		if(stack1.empty()) { 
			System.out.println("Stack Empty");
		} else  { 
			System.out.println("Stack not empty");
		}
		
		// linkedList�� ����� ����
		LinkStack stack2=new LinkStack();		//LinkStack�� ���� ���� ����.
		stack2.push(10);						//�ʱⰪ�� ���� ������ ���� pop���� ������ ���� �ʰ� ����
		stack2.push(20);
		stack2.push(30);
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
	}
}
