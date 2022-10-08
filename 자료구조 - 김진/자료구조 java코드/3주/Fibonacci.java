public class Fibonacci {//�Ǻ���ġ���� ����ϴ� �������α׷�
	
	public int fibRecursion(int n) {	// ����Լ�
		if (n == 0) {
			return n;
		} else if (n == 1) {
			return 1;
		} else {
			return fibRecursion(n - 2) + fibRecursion(n - 1);
			//n=4��� ġ�� -> f 2 + f 3 -> f0 + f1 + f1 + f2 -> 0 + 1 + 1 + f0 +f1 -> 0+1+1+0+1 = 3
			
			//->n���� �� ���Ϸ��� -> n + f(n-1)
		}
	}

	public int fibIteration(int n) {		// �ݺ��Լ�
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
