
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeStack<E> {

	Deque<E> dq = new LinkedList<E>();
	
	void push(E val) {
		dq.addLast(val);
	}
	public E pop() {
		if (dq.isEmpty() ) {
			System.out.println("No elements");
			E x = null;
			return x;
		}
		E x = dq.removeLast();
		return x;
	}
	boolean isEmpty() {
		return dq.isEmpty();
	}
	E peek() {
		if (dq.isEmpty()) {
			E x = null;
			return x;
		}
		E x = dq.peekLast();
		return x;
	}
	public static void main(String[] args) {
		DequeStack<String> s = new DequeStack<String>();
		s.push("Kim");
		s.push("Lee");
		s.push("Park");
		System.out.println(s.pop());
		System.out.println(s.peek());
		// add methods
		
	}
}