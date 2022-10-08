
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//*******deque라는 인터페이스 가져와서 메소드 사용*********

public class SimulUsingDeque {
	
	static Deque<String> deque = new ArrayDeque<>();
	
	public static void enqueue(String a) {
		deque.addLast(a);
	}
	public static String dequeue() {
		if (deque.isEmpty()) {
			return null;
		}
		return deque.removeFirst();
	}
	
	public static void push(String a) {
		deque.addFirst(a);
	}
	public static String pop() {
		String a=deque.removeFirst();
		return a;
	}
	public static String peek() {
		if (deque.isEmpty()) {
			return null;
		}
		return deque.peekFirst();
	}
	public static String top() {
		if (deque.isEmpty()) {
			return null;
		}
		return deque.peekFirst();
	}
	public static boolean isEmpty() {
		return deque.isEmpty();
	}
	
	public static void main(String[] args) {
		//스택의 기능처럼 들어감
		System.out.println("스택기능 구현 : push()");
		push("A");
		push("B");
		push("C");
		push("D");
		System.out.println("stack: " + deque);
		
		// peek
		System.out.println("Peek : " + deque.peek());
		//마지막들어간 원소가 제일먼저 나옴. stack이랑 기능이 같음

		// peek와 pop은 같은값이나옴,그대신 peek는 그냥 빼는거고 pop은 빼서 보여주고 삭제
		System.out.println("Stack operations: Pop");
		String a=pop();
		System.out.println(a);
		System.out.println("pop 한후 stack: " + deque);
		//여기에서 pop해서D값은 지워짐

		// remove operations
		System.out.print("top:");
		System.out.println("stack: " + peek());
		
		System.out.println("Stack에서의 isEmpty"+ isEmpty());


		
		System.out.println("\n\n\n큐기능 구현 : push()");
		//위에와달리 enqueue를 써서 값을 넣으면 addLast와 같이 들어감. stack은 addFirst와 같이 값이 들어감
		System.out.println("큐에서의 enqueue:");
		enqueue("F");
		enqueue("G");
		enqueue("H");
		enqueue("I");
		
		System.out.println("큐:"+deque);
		
		System.out.println("큐에서의  dequeue:");
		String C=dequeue();
		System.out.println("dequeue써서 제일 선두원소를 제거 -> C를제거");
		System.out.println("큐:"+deque);
		
		System.out.println("큐에서의  peek:");
		System.out.println(peek());
		
		
		System.out.println("큐에서의  isEmpty:");
		System.out.println(isEmpty());

		
		
	}
}
