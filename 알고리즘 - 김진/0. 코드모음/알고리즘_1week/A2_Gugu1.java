package 알고리즘_1week;

import java.util.Scanner;

public class A2_Gugu1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("출력하고자 하는 구구단을 입력해 주세요 (1~9 사이) : ");
		int t = input.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			int result = i*t;
			System.out.println(i + " * " + t + " = " + result);
		}
		
		
	}
}
