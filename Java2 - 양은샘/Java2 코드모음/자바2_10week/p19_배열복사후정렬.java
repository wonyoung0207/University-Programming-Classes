package 자바2_10week;

import java.util.Arrays;

public class p19_배열복사후정렬 {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
		
		System.out.println("============Before Sort==============");
		
		String[] tmp = new String[args.length];
		tmp = Arrays.copyOf(args, args.length);//배열과 배열 길이를 줘야함
		
		for(String s:tmp) {
			System.out.println(s);
		}
		
		System.out.println("============After Sort==============");
		
		Arrays.sort(tmp);
		for(String s: tmp) {
			System.out.println(s);
		}
	}

}
