package 자바1프로젝트;
import java.util.*;

public class 자바1_4주차_HW1_최대공약수구하기 {

	public static void main(String[] args) {
		
		int x, y;
		int num, cnt;
		
		num = 0;
		cnt = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수)");
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("큰수: "+ x + "  작은수: " + y);
		
		while(y != 0) {
			num = x % y;
			System.out.println(cnt + "번째 나머지: " + num);
			cnt++;
			x = y;
			y = num;
		}
		System.out.println("두 수의 최대공약수 : "  + x);

	}

}
