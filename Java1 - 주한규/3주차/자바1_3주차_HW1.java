package 자바1프로젝트;
import java.util.*;//Scanner을 불러오기 위해 사용했다.

public class 자바1_3주차_HW1 {

	public static void main(String[] args) {

		int num;//정수형 변수 num을 생성
		
		Scanner input = new Scanner(System.in);//Scanner 을 사용하기 위해 변수 input을 선언해 주었다.
		System.out.println("숫자를 입력하세요 : ");
		
		num = input.nextInt();//num에 입력받은 input의 값을 넣어준다.
		
		if(num % 5 == 0) {//입력받은 숫자를 5로 나눠 나머지가 0이라면, 입력받은 숫자는 5의 배수이다.
			System.out.println(num + "은 5의 배수입니다.");
		}
		else {//5의 배수가 아니라면 실행된다.
			System.out.println(num + "은 5의 배수가 아닙니다.");
		}

	}

}
