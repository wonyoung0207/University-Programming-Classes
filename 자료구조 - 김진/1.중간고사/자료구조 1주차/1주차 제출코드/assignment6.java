package ahn;

import java.util.Scanner;

public class assignment6 {

	public static void main(String[] args) {

		int sum = 0;
		int total = 0;

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.println("1����" + n + "���� �� ���ϱ�");

		for (int i = 1; i <= n; i++) {

			sum += 1;

			System.out.println(i + "��°�� " + sum);

		}

	}

}
