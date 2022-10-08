package ahn;

import java.util.Scanner;

public class assignment6 {

	public static void main(String[] args) {

		int sum = 0;
		int total = 0;

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.println("1부터" + n + "까지 합 구하기");

		for (int i = 1; i <= n; i++) {

			sum += 1;

			System.out.println(i + "번째합 " + sum);

		}

	}

}
