package 자바2_10week;
import java.util.Scanner;


public class p13_reverse이용 {//문자열 뒤집는 방법 2가지 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String s = input.next();
		
		StringBuffer stb = new StringBuffer(s);
		System.out.println(stb.reverse());
		
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(s.length() - 1 - i));
		}
		
	}

}
