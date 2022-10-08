package 알고리즘_1week;

import java.util.Scanner;

public class A4_Gugu2 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("**** " + i + "단 ****");
			for(int j=1; j<=9; j++) {
				int result = i*j;
				System.out.println(i + " * " + j + " = " + result);
				
			}
		}
		
		
	}
}
