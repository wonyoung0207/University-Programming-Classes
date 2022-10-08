
public class StackMain {
	
	public static void main(String arg[]){
		ArrayStack stack1 = new ArrayStack();
		
		stack1.push(10);//push 는 값을 넣는것
		stack1.push(30);
		stack1.push(80);
		stack1.push(200);
		stack1.push(70);
		
		System.out.println(stack1.stackFull());
		System.out.println("peeked value " + stack1.peek());
		
		while(!stack1.empty()){
			System.out.print(stack1.pop()+", ");//pop이 꺼내는거, 제일 위에 값 70부터 꺼내서 반복
		}
		if(stack1.empty()) { 
			System.out.println("Stack Empty");
		} else  { 
			System.out.println("Stack not empty");
		}
		
		// linkedList를 사용한 스택
		LinkStack stack2=new LinkStack();		//LinkStack형 으로 빵을 찍음.
		stack2.push(10);						//초기값이 제일 밑으로 들어가서 pop으로 꺼낼때 제일 늦게 나옴
		stack2.push(20);
		stack2.push(30);
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
	}
}
