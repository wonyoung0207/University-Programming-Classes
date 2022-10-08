package 자바2_10week;

import java.util.regex.Pattern;

public class p15_Pattern사용 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0; i < args.length; i++) {
			if(Pattern.matches("^[0-9]*$", args[i]) == true) {//숫자만 더하게 해줌 
				System.out.println(args[i]);
				sum += Integer.parseInt(args[i]);
			}
		}
		
		System.out.println("합은 " + sum + "입니다.");

	}
		
}
