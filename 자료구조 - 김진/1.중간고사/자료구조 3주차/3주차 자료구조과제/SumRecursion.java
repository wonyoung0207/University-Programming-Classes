
//1부터 n까지합 구하는 프로그램

public class SumRecursion {
	
	public static int sumrec(int n) {// 재귀사용으로 1부터 n 까지 합 구하기
		if(n == 1) {
			return 1;
			
		}
		int result = n + sumrec(n - 1);
		return result;
		
	}
	
	public static int sumiter(int n) {		//반복문을 이용한 1부터 n까지 합
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			
			sum = sum + i;
			
						
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(sumrec(n));
		System.out.println(sumiter(n));

	}

}
