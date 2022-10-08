package ahn;

import java.util.Scanner; //입력할수있는 기능

public class assignment2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 1; i < 10; i++) {

			int result = t * i;
			System.out.println(i + "*" + t + "=" + result);

		}
	}

}
