package 자바1프로젝트;
import java.util.*;
//두 정수 입력받아 최대공약수 구하기 


public class 자바1_4주차_HW1_최대공약수구하기 {

	public static void main(String[] args) {
		
		int x, y;
		int num, cnt;
		int min=0, max=0;
		
		num = 0;
		cnt = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수)");
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("큰수: "+ x + "  작은수: " + y);
		
//		for(int i=2; i <=x && i<=y; i++) {
//			if(x%i == 0 && y%i == 0) {
//				min = i;
//				
//			}
//		}
//		max = x*y/min;
//		System.out.println("최소공배수 : "+ max);
//		System.out.println("최대공약수 : "+ min);
//		
		int j = 2;
		while(j<=x && j<=y) {
			if(x%j ==0 && y%j == 0) {
				min = j;
				
			}
			j++;
			
		}
		
		max = x*y/min;
		System.out.println("최소공배수 : "+ max);
		System.out.println("최대공약수 : "+ min);
//		
//		
//		while(y != 0) {
//			num = x % y;//48%36 = 
//			System.out.println(cnt + "번째 나머지: " + num);
//			cnt++;
//			x = y;
//			y = num;
//		}
//		System.out.println("두 수의 최대공약수 : "  + x);

	}

}
