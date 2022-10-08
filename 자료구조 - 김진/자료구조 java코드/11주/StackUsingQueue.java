
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q = new LinkedList<Integer>();
	
	// Push operation
	void push(int val) {
		q.add(val);
		
		for(int i = 0; i <q.size();i++) {
			q.add(q.poll());
			
		}
	}
	
	
	// Removes the top element
	int pop() {
		if (q.isEmpty()) {
			System.out.println("No elements");
			return -1;
		}
		int x = q.remove();
		return x;
	}
	
	
	// Returns top of stack
	int top() {
		if (q.isEmpty())
			return -1;
		return q.peek();
	}
	

	// Returns true if Stack is empty else false
	boolean isEmpty() {

		return q.isEmpty();

	}
	
	
	// Driver program to test above methods
	public static void main(String[] args) {
		
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(20);
		System.out.println("Top element :" + s.top());
		s.pop();
		s.push(30);
		s.pop();
		System.out.println("Top element :" + s.top());

	}

}
