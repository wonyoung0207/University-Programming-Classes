package 자바1프로젝트;
//분수 연산 하기


public class 자바1_11주차_분수연산 {
	int bunja;//분자
	int bunmo;//분모
	

	public 자바1_11주차_분수연산 add(자바1_11주차_분수연산 f) {//분수 덧셈해주는 메소드
		자바1_11주차_분수연산 r = new 자바1_11주차_분수연산();
		r.bunja = (bunja * f.bunmo) + (bunmo*f.bunja);
		r.bunmo = bunmo * f.bunmo;
		
		return r;
	}
	
	public 자바1_11주차_분수연산 reduce() {//분수 계산이 완료된후, 약분해주는 곳
		int div = gcd(bunja,bunmo);
		자바1_11주차_분수연산 r = new 자바1_11주차_분수연산();
		r.bunja = bunja/div;
		r.bunmo = bunmo/div;
		
		return r;
	}
	
	자바1_11주차_분수연산 simplify(자바1_11주차_분수연산 f) {//reduce의 다른방법 
		자바1_11주차_분수연산 result = new 자바1_11주차_분수연산();
		
		int g = gcd(f.bunja,f.bunmo);
		result.bunja = f.bunja/g;
		result.bunmo = f.bunmo/g;
		
		return result;
	}
	
	
	public int gcd(int x, int y) {//약분하기 위해 두 수의 최대공약수 구하는 메소드
		int bigger=0, smaller=0,r=0;
		System.out.println(x+"  " +y);
		if (x >= y) {
			bigger = x;
			smaller =y;
		}
		else {
			bigger = y;
			smaller = x;
		}
		
		while(smaller != 0) {//최대공약수 구하는 방법
			r = bigger % smaller;
			bigger = smaller;
			smaller = r;
			
		}
		//최소공배수 = (x*y) / 최대공약수;
		
		return bigger;//최대공약수를 리턴
	}
	
	public boolean equals(자바1_11주차_분수연산 f_b) {
		
//		자바1_11주차_분수연산 f_a = new 자바1_11주차_분수연산();//새로 객체 만들면 0으로 초기화되서 하면 안됨
		int g_a = gcd(bunja, bunmo);//현재 객체의 분자와 분모 넘겨줌
		int g_b = gcd(f_b.bunja, f_b.bunmo);//비교할 객체의 분자와 분모를 넘겨줌
		System.out.println(bunja + "  " + bunmo + "최대공약수"+g_a);
		System.out.println(f_b.bunja +"  " + f_b.bunmo + "최대공약수"+g_b);
		
		bunja = bunja / g_a;//약분
		bunmo = bunmo / g_a;
		f_b.bunja = f_b.bunja / g_b;//약분
		f_b.bunmo = f_b.bunmo / g_b;
		
		if(bunja == f_b.bunja) {
			if(bunmo == f_b.bunmo) {
				return true;//같을경우 true 리턴 
			}
		}
		return false;// 다를경우 false 리턴
		
	}
	
	int test() {
		return 1;
	}
	
	

}
