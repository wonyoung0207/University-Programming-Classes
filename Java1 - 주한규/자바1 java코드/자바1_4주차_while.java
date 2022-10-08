package 자바1프로젝트;
import java.util.*;
//반복문 while 이용해서 합 구하기

public class 자바1_4주차_while {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum = i + sum;
			i++;
		}
		System.out.println(1 + "에서" + (i-1) + "까지 합계 = " + sum);

	}

}