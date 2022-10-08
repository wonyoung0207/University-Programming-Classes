package 자바2_10week;

import java.util.regex.Pattern;

public class p10_문자열에서숫자갯수카운트 {

	public static void main(String[] args) {
		int count = 0;
		String s = args[0];
		
		System.out.println(s);
		
		for(int i=0; i<args[0].length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
				count++;
			}
		}
		System.out.println("숫자는 총 " + count + " 개 입니다.");
		
		
		System.out.println("======= 다른 풀이 ======");
		count = 0;
		s = args[0];
		
//여기서부터는 안됨 
//		for(int i=0; i<args[0].length(); i++) {
//			if(Pattern.matches("^[0-9]*$", s.charAt(i))) {
//				count++;
//			}
//		}
//		System.out.println("숫자는 총 " + count + " 개 입니다.");
//		

	}

}
