
public class FibonacciMain {//피보나치 계산하는 메인 프로그램

	public static void main(String[] args) {
		
		System.out.println("Data Structure Recursion Project");

		/**
		 * Fibonacci number calculation by recursion 재귀
		 */
		
		int i = 6;
		Fibonacci fib = new Fibonacci();
		long startTime = System.currentTimeMillis(); // start time
		System.out.println("fibonacci number ( " + i + " ) -> " + fib.fibRecursion(i));
		long endTime = System.currentTimeMillis(); // start time
		System.out.println("Recursion Time : " + (endTime - startTime));
		System.out.println();
		/**
		 * Fibonacci number calculation by itertion 반복
		 */
		startTime = System.currentTimeMillis(); // start time
		System.out.println("fibonacci number ( " + i + " ) -> " + fib.fibIteration(i));
		endTime = System.currentTimeMillis(); // start time
		System.out.println("Iteration Time : " + (endTime - startTime));
		System.out.println();

	}

}

