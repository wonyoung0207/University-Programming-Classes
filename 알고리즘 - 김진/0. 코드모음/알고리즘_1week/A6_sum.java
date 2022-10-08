package 알고리즘_1week;

import java.util.Random;
import java.util.Scanner;

public class A6_sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		System.out.print("해당수까지 합을 구하고 싶은 수를 입력해 주세요 : ");
		int n = input.nextInt();
		
		sum1 = n*(n+1)/2;
		System.out.println("sum1 : " + sum1);
		
		for(int i=1; i<=n; i++) {
			sum2 += i;
			
		}
		System.out.println("sum2 : " + sum2);
		
		
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sum3 = sum3 + 1;
				
			}
		}
		System.out.println("sum3 : " + sum3);
		
		
		
		
	}
}
