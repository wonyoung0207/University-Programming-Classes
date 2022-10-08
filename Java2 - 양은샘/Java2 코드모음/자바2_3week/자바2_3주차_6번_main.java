package 자바2_3week;

public class 자바2_3주차_6번_main {
	public static void main (String args[]) {
	
//***************6번*************
//		자바2_3주차_6번_A a = new 자바2_3주차_6번_B();
//		System.out.println("실행 완료");
//	}
//***************6번*************	
	
	자바2_3주차_6번_A a = new 자바2_3주차_6번_A();
	자바2_3주차_6번_B b = new 자바2_3주차_6번_B();
	자바2_3주차_6번_A ab = (자바2_3주차_6번_A) b;//임시 형변환 
//	자바2_3주차_6번_A ab = new 자바2_3주차_6번_B();//임시 형변환 
	
	System.out.println("a.val = " + a.val);
	System.out.println("b.val = " + b.val);
	System.out.println("ab.val = " + ab.val);

	System.out.print("\na.f(a) = ");
	a.f(a);
	System.out.print("\na.f(b) = ");
	a.f(b);
	
	System.out.print("\nb.f(a) = ");
	b.f(a);
	System.out.print("\nb.f(b) = ");
	b.f(b);
	
	System.out.print("\na.f(ab) = ");
	a.f(ab);
	System.out.print("\nb.f(ab) = ");
	b.f(ab);
	
	System.out.print("\nab.f(a) = ");
	ab.f(a);
	System.out.print("\nab.f(b) = ");
	ab.f(b);
	System.out.print("\nab.f(ab) = ");
	ab.f(ab);

	}
}
