package 자바2_10week;

import java.util.Arrays;
import java.util.Random;

public class p18_랜덤_정렬이용 {

	public static void main(String[] args) {
		int num=0;
		int[] intarr = new int[5];
		int[] tmp = new int[5];
		Random  r = new Random();
		
		
		System.out.println("+++ First arr +++");
		for(int s:tmp){
			s = r.nextInt(100)+1;
			tmp[num] = s;
			System.out.println("tmp[" + num + "] = " + s);
			num++;
		}
		
		
		System.out.println("\n+++ Before Sort +++");
		intarr = Arrays.copyOf(tmp,tmp.length);
		num=0;
		for(int s:intarr){
			System.out.println("intarr[" + num + "] = " + s);
			num++;
		}
		
		
		System.out.println("\n+++ After Sort +++");
		Arrays.sort(intarr);
		num=0;
		for(int s : intarr) {
			System.out.println("intarr[" + num + "] = " + s);
			num++;
		}

	}

}
