package 알고리즘_1week;

import java.util.Random;

public class A1_average {
	public static void main(String[] args) {
		int[] score = new int[10];
		int avg = 0;
		int sum = 0;
		Random r = new Random();
		
		
		for(int i = 0; i < 10; i++) {
			score[i] = r.nextInt(100) + 1;
			sum += score[i];
			System.out.print(score[i] + " ");
		}
		System.out.println("");
		
		avg = sum / 10;
		
		System.out.println("평균 : " + avg);
		
	}
}
