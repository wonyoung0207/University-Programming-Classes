package ahn1;

import java.util.Date;
import java.util.Scanner;

public class ProdTotal {

	public static void main(String[] args) {

		/*
		try {
			System.out.println(new Date());
			int prod = 1;
			int x = 1;
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			
			long start = System.currentTimeMillis();
			// Thread.sleep(1000);
			for (int i = 1; i <= n; i++) {
				prod = prod * x;
			}
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println(new Date());
			System.out.println("prod ?? : " + prod);
			System.out.println("Difference : " + diff);
		} catch (Exception e) {
			System.out.println("An exception occurs");
		} */ //prod1

		
		try {
			System.out.println(new Date());
			int prod = 2;
			int x = 1;
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			long start = System.currentTimeMillis();
			 //Thread.sleep(1000);
			for (int i = 1; i <= n; i++) {
				prod = prod * prod;
			}
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println(new Date());
			System.out.println("prod ?? : " + prod);
			System.out.println("Difference : " + diff);
		} catch (Exception e) {
			System.out.println("An exception occurs");
		}
		
  }
}