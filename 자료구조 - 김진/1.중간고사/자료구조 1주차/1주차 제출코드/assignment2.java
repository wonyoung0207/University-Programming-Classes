package ahn;

import java.util.Scanner; //�Է��Ҽ��ִ� ���

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
