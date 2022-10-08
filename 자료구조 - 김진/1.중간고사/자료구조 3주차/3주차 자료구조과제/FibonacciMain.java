
public class FibonacciMain {

	public static void main(String[] args) {
		
		System.out.println("Data Structure Recursion Project");

		/**
		 * Fibonacci number calculation by recursion Àç±Í
		 */
		
		int i = 30;
		Fibonacci fib = new Fibonacci();
		long startTime = System.currentTimeMillis(); // start time
		System.out.println("fibonacci number ( " + i + " ) -> " + fib.fibRecursion(i));
		long endTime = System.currentTimeMillis(); // start time
		System.out.println("Recursion Time : " + (endTime - startTime));
		System.out.println();
		/**
		 * Fibonacci number calculation by itertion ¹Ýº¹
		 */
		startTime = System.currentTimeMillis(); // start time
		System.out.println("fibonacci number ( " + i + " ) -> " + fib.fibIteration(i));
		endTime = System.currentTimeMillis(); // start time
		System.out.println("Iteration Time : " + (endTime - startTime));
		System.out.println();

	}

}

