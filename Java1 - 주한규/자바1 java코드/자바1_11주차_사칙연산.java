package �ڹ�1������Ʈ;
import java.util.*;


public class �ڹ�1_11����_��Ģ���� {
	public static void main(String args[]) {
		int x,y;
		
		Scanner input = new Scanner(System.in);
		System.out.print("x=");
		x = input.nextInt();
		System.out.print("y=");
		y = input.nextInt();
		
		System.out.println("x=" + x + "  y=" + y);
		
		add(x,y);
		sub(x,y);
		Mul(x,y);
		Div(x,y);
		
		
	}

	public static int add(int x, int y) {
		System.out.println("x+y=" + (x+y));
		return x+y;
		
	}
	
	public static int sub(int x, int y) {
		System.out.println("x-y=" + (x-y));
		return x-y;
		
	}
	
	public static int Mul(int x, int y) {
		System.out.println("x*y=" + (x*y));
		return x*y;
		
	}
	
	public static int Div(int x, int y) {
		System.out.println("x/y=" + (x/y));
		return x/y;
		
	}

}
