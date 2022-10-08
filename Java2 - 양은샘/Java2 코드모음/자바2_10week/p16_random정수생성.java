package 자바2_10week;

import java.util.Random;

public class p16_random정수생성 {

	public static void main(String[] args) {
		int[] intarr = new int[5];
		Random r = new Random();
		
		for(int i=0; i< intarr.length; i++) {
			intarr[i] = r.nextInt(100) + 1;
			System.out.println("intarr[" + i + "] = " + intarr[i]);
		}
	}

}
