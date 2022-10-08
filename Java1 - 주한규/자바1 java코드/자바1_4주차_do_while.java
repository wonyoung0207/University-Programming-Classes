package 자바1프로젝트;
import java.util.*;
//반복문 do-while 사용하여 올바른 월 입력할때까지 반복


public class 자바1_4주차_do_while {

	public static void main(String[] args) {
		
		int i = 10;
		int month;
		
		Scanner input = new Scanner(System.in);
		
		
		do {//일단 한번은 무조건 수행되고 조건이 수행된다. 
			System.out.println("올바른 월을 입력하세요(1월~12월) : ");
			month = input.nextInt();
		}while(month < 1 || month > 13);//조건이 참이면 안에 문장이 실행
		System.out.println("사용자가 입력한 올바른 월 : " + month);
	}
}
