package �ڹ�2_10week;

import java.util.Random;

public class p17_�ֻ��� {

	public static void main(String[] args) {
		int rn;
		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.print("�ֻ����� �����ϴ� --> ");
			rn = r.nextInt(6) + 1;
			System.out.println(rn);
		}
		
		System.out.println("==============================");
		
		for(int i=0; i<5; i++) {
			System.out.print("�ֻ����� �����ϴ� --> ");
			rn = (int)(Math.random() * 6 + 1);
			System.out.println(rn);
		}

	}

}
