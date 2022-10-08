package 자바1프로젝트;
import java.util.*;


public class 자바1_3주차_HW4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력해 주세요 : ");
		num = input.nextInt();
		
		
		if(num % 2 == 0) {//먼저 짝수인지 판별해준다.
			if(num % 3 ==0) {//짝수일 경우, 3으로 나눈 나머지가 0이라면 3의 배수이다.
				System.out.println("짝수이며 3의 배수입니다.");
			}
			else {//짝수이지만 3으로 나눈 나머지가 0이 아니면 3의 배수가 아니다.
				System.out.println("짝수이며 3의 배수가 아닙니다.");
			}
		}
		else {//짝수가 아닌 홀수일 경우 실행
			if(num % 5==0) {//홀수일 경우 5로 나눈 나머지가 0이라면 5의 배수이다.
				System.out.println("홀수이며 5의 배수입니다.");
			}
			else {//홀수일 경우 5로 나눈 나머지가 0이 아니라면 5의 배수가 아니다.
				System.out.println("홀수이며 5의 배수가 아닙니다.");
			}
		}
	}

}
