package 자바1프로젝트;
import java.util.*;//Scanner을 불러오기 위해 사용했다.
public class 자바1_3주차_HW2 {
//두 수를 입력받아 크기 비교 하기

	public static void main(String[] args) {
		
		int num1;//첫번째 정수형 변수 생성
		int num2;//두번째 정수형 변수 생성
		
		Scanner input = new Scanner(System.in);//Scanner 을 사용하기 위해 변수 input을 선언해 주었다.
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1 = input.nextInt();//num1에 입력받은 input의 값을 넣어준다.
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = input.nextInt();//num2에 입력받은 input의 값을 넣어준다.
		
		if(num1 < num2) {//num1이 num2 보다 작다면 실행
			System.out.println(num1 + "이" + num2 + "보다 작습니다.");
		}
		else if(num1 > num2) {//num1이 num2 보다 크다면 실행
			System.out.println(num1 + "이" + num2 + "보다 큽니다.");
			
		}
		else {//num1이 num2 와 같다면 실행
			System.out.println(num1 +"과" + num2 +"은 같은 숫자 입니다.");
		}

	}

}
