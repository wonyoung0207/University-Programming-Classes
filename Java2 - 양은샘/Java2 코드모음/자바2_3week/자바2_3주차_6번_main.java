package �ڹ�2_3week;

public class �ڹ�2_3����_6��_main {
	public static void main (String args[]) {
	
//***************6��*************
//		�ڹ�2_3����_6��_A a = new �ڹ�2_3����_6��_B();
//		System.out.println("���� �Ϸ�");
//	}
//***************6��*************	
	
	�ڹ�2_3����_6��_A a = new �ڹ�2_3����_6��_A();
	�ڹ�2_3����_6��_B b = new �ڹ�2_3����_6��_B();
	�ڹ�2_3����_6��_A ab = (�ڹ�2_3����_6��_A) b;//�ӽ� ����ȯ 
//	�ڹ�2_3����_6��_A ab = new �ڹ�2_3����_6��_B();//�ӽ� ����ȯ 
	
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
