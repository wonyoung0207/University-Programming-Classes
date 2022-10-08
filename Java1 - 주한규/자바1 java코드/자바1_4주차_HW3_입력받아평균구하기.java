package 자바1프로젝트;
import java.util.*;
//학생수와 점수 입력받아 평균 구하기

public class 자바1_4주차_HW3_입력받아평균구하기 {

	public static void main(String[] args) {
		
		int score, sum, i,student_num;
		double avg;
		
		System.out.print("학생수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		student_num = sc.nextInt();
		
		sum = 0;
		i=1;
		
		while(i <= student_num) {
			System.out.print(i + "번째 학생의 점수를 입력하세요 : ");
			score = sc.nextInt();
			sum = sum + score;
			i++;
		}
		avg = (double)sum / (double)student_num;
		System.out.print("평균 : " + avg);
	}

}
