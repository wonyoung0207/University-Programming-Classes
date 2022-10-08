package 자바1프로젝트;
import java.util.*;
//switch문 이용


public class 자바1_3주차_2 {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1또는 2중 선택해서 입력");
		num = input.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("하나");
				break;
				
			case 2:
				System.out.println("둘");
				break;
			default:
				System.out.println("다른 수를 입력하였습니다. ");
				break;
				
		}

	}

}
