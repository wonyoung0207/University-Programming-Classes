
public class Fiborec1 { //재귀
	public static int fibo(int n) {
		int result = 0;
		
		if (n == 1) { return 1;}
		if (n == 0) { return 1;}
		return n * fibo(n - 1);
			
	}
	
	public static int fiboiteration(int n) {
		int a = 1;
		
		for(int i=n; i >= 1;i--) {
				a = i * a;		//1 * 2 * 3 * 4 = 24
				
		}
		return a;
	}

	public static void main(String[] args) {
		
		int n = 4 ;
		
		long time1 = System.currentTimeMillis();
		System.out.println(fibo(n));
		long time2 = System.currentTimeMillis();
		System.out.println((time2 - time1) / 1000.0); //피보나치수열 계산 전후 시간 차이 계산
		System.out.println();
		
		long time3 = System.currentTimeMillis();
		System.out.println(fiboiteration(n));
		long time4 = System.currentTimeMillis();
		System.out.println((time4 - time3) / 1000.0);
		System.out.println();
		
		

	}

}
