package 자바2_10week;
import java.util.Scanner;


public class p12_equals이용해서문자열비교 {

	public static void main(String[] args) {
		String id = "abcdef";
		
		Scanner input = new Scanner(System.in);
		System.out.print("비교하실 문자열을 입력하세요 : ");
		String s = input.next();
		
		if(id.equals(s)) {
			System.out.println("두 문자열 " + id + ", " + s + " 는 같은 문자열 입니다.");
		}
		else {
			System.out.println("두 문자열 " + id + ", " + s + " 는 다른 문자열 입니다.");
		}
		

	}

}
