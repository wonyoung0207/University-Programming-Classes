package 자바1프로젝트;
import java.util.*;
//string 과 char의 차이점
//String 은 문자열로 "" 로써주고 , < string a = "" > 의 형태로 씀
//char 는 문자로 '' 로 써주고, < char[] a = new char[5] > 의 형태로 쓴다.

public class 자바1_3주차_switch문_등급구하기 {

	public static void main(String[] args) {
		int score, number;
		char grade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력하시오 : ");
		score = input.nextInt();
		
		number = score / 10;
		
		switch(number) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'B';
			break;
		case 8:
			grade = 'C';
			break;
		default :
			grade = 'F';
			break;
			
		}
		System.out.print("입력한 성작의 등급은 : " + grade);
		
		

	}

}
