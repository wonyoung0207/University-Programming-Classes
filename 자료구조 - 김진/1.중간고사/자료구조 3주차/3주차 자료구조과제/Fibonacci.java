public class Fibonacci {
	
	public int fibRecursion(int n) {	// 재귀함수
		if (n == 0) {
			return n;
		} else if (n == 1) {
			return 1;
		} else {
			return fibRecursion(n - 2) + fibRecursion(n - 1);
		}
	}

	public int fibIteration(int n) {		// 반복함수
		int fn = 0;
		int f1;
		int f2;
		if (n < 0) {
			return -1;
		} else if (n <= 1) {
			return n;
		} else {
			f2 = 0;
			f1 = 1;
			for (int i = 2; i <= n; i++) {
				fn = f1 + f2;
				f2 = f1;
				f1 = fn;
			}
			return fn;
		}
	}
}
