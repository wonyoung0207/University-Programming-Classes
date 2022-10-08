package ahn1;

import java.util.Date;
import java.util.Scanner;

public class SumTotal {
	public static void main(String[] args) {

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		try {
			long start = System.currentTimeMillis();
			
			/*
			for (int i = 1; i < n; i++) {
				sum = sum + i;
			}
			
			*/
			
			/*
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++)
					sum = sum + 1;
			}
			
			*/
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					sum = sum + 1;
					for(int k = 1; k <= i; k++) {
						sum = sum + 0;
						
					}
				}
			}
			
			
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference : " + diff);

		} catch (Exception e) {
			System.out.println("An exception occurs");
		}
	}
}
