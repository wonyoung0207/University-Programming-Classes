package �˰���_1week;

import java.util.Scanner;

public class A3_DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("����ϰ��� �ϴ� �������� �Է��� �ּ��� (1~9 ����) : ");
		int t = input.nextInt();
		int i = 1;
		int result = 0;
		
		
		do {
			result = i * t;
			System.out.println(i + " * " + t + " = " + result);
			i++;
			
		}while(i<=9);
		
		
	}
}
