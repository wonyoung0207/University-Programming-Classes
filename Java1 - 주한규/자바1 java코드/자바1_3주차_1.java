package 자바1프로젝트;
import java.util.*;
//국,영,수 점수를 입력받아 평균 구하기
//input.nextLine() -> 엔터 단위로, 여러 문장을 입력받음
//input.next() -> 공백 단위로,문자 하나를 인식함


public class 자바1_3주차_1 {

	public static void main(String[] args) {
		int k, e, m;
		int total;
		double avg;
		String a;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요");
		a = input.nextLine();
		System.out.println(a);
		
		System.out.println("국어점수를 입력");
		k = input.nextInt();
		System.out.println("영어점수를 입력");
		e = input.nextInt();
		System.out.println("수학점수를 입력");
		m = input.nextInt();
		
		total = k + e + m;
		avg = total/3.0;
		
		System.out.println("평균 점수는 = " + avg + "점 입니다.");
		
		

	}

}
