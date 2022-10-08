package 자바1프로젝트;
import java.util.*;
//펙토리얼 구하는 프로그램


public class 자바1_5주차_for문_팩토리얼 {
	public static void main(String[] args) {
		int fact = 1;
		int n;
		int cnt = 1;
		int num = 1;
		
		System.out.print("정수를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {//i값을 설정해 줘야함
			System.out.print(cnt + "번째 fact -> "+ fact + "*" + i + "=");

			fact = fact * i;
			System.out.println(fact);
			cnt++;
			
		}
		System.out.printf("%d! 의 값은 %d",n,fact);//printf 해줘야함.
	}

}
