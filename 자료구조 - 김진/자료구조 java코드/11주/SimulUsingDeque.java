
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//*******deque��� �������̽� �����ͼ� �޼ҵ� ���*********

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
		//������ ���ó�� ��
		System.out.println("���ñ�� ���� : push()");
		push("A");
		push("B");
		push("C");
		push("D");
		System.out.println("stack: " + deque);
		
		// peek
		System.out.println("Peek : " + deque.peek());
		//�������� ���Ұ� ���ϸ��� ����. stack�̶� ����� ����

		// peek�� pop�� �������̳���,�״�� peek�� �׳� ���°Ű� pop�� ���� �����ְ� ����
		System.out.println("Stack operations: Pop");
		String a=pop();
		System.out.println(a);
		System.out.println("pop ���� stack: " + deque);
		//���⿡�� pop�ؼ�D���� ������

		// remove operations
		System.out.print("top:");
		System.out.println("stack: " + peek());
		
		System.out.println("Stack������ isEmpty"+ isEmpty());


		
		System.out.println("\n\n\nť��� ���� : push()");
		//�����ʹ޸� enqueue�� �Ἥ ���� ������ addLast�� ���� ��. stack�� addFirst�� ���� ���� ��
		System.out.println("ť������ enqueue:");
		enqueue("F");
		enqueue("G");
		enqueue("H");
		enqueue("I");
		
		System.out.println("ť:"+deque);
		
		System.out.println("ť������  dequeue:");
		String C=dequeue();
		System.out.println("dequeue�Ἥ ���� ���ο��Ҹ� ���� -> C������");
		System.out.println("ť:"+deque);
		
		System.out.println("ť������  peek:");
		System.out.println(peek());
		
		
		System.out.println("ť������  isEmpty:");
		System.out.println(isEmpty());

		
		
	}
}
