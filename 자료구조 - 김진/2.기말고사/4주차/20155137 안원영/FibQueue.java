import java.util.LinkedList;
import java.util.Queue;

public class FibQueue {
	public static void main(String[] args) {
		int fib = 0;
		int n = 100;
		Queue<Integer> q = new LinkedList<>();
		
		q.add(0);
		q.add(1);
		
		for(int i = 2; i<=n;i++) {
			fib = q.poll() + q.peek();
			q.add(fib);
			
		}
		System.out.println("fib("+ n + ")=" + fib);
		
	}

}