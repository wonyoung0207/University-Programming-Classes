package �˰���_1week;

import java.util.Scanner;

public class A2_Gugu1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("����ϰ��� �ϴ� �������� �Է��� �ּ��� (1~9 ����) : ");
		int t = input.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			int result = i*t;
			System.out.println(i + " * " + t + " = " + result);
		}
		
		
	}
}
