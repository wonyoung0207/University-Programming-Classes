package 자바1프로젝트;
import java.util.*;

public class 자바1_11주차_Cartest {

	public static void main(String[] args) {
		int num;//동작입력값 받는 필드
		int change;//기어변속 입력값 받는 필드
		
		
		자바1_11주차_Car mycar = new 자바1_11주차_Car();
		System.out.println(mycar);
		
		Scanner input = new Scanner(System.in);
		System.out.print("수행할 동작입력(기어변속:1, 가속:2, 감속:3, 종료:-1) :");
		num = input.nextInt();
		
		while(true) {
			if (num == 1) {
				System.out.print("몇 단으로 변속할지 입력: ");
				change = input.nextInt();
				mycar.changeGear(change);
			}
			else if(num == 2) {
				mycar.speedup();
			}
			else if(num ==3) {
				mycar.speeddown();
			}
			else if(num == -1) {
				break;
			}
			System.out.println(mycar);
			System.out.print("수행할 동작입력(기어변속:1, 가속:2, 감속:3, 종료:-1) :");
			num = input.nextInt();
		
		}
		

	}

}
