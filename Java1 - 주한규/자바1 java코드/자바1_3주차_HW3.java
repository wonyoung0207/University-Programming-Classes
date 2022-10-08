package 자바1프로젝트;
import java.util.*;
//금액을 입력받아 만원,천원,백원 단위 몇개있는지 판별

public class 자바1_3주차_HW3 {

	public static void main(String[] args) {
		int money;//입력받을 돈을 저장하는 변수 선언
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		
		money = input.nextInt();//입력받은 금액을 money 변수에 넣어준다.
		
		System.out.println(money+"원은");
		System.out.println("10000원 짜리 " + money / 10000 + "장");//입력받은 변수를 10000으로 나눈 몫이 출력
		
		//먼저 10000으로 나눈 나머지인 3000을 출력하고, 그다음으로 1000을 나눠주변 1000원의 갯수가 출력된다.
		System.out.println("1000원 짜리 " + (money % 10000) / 1000 + "장이 필요합니다.");

	}

}
