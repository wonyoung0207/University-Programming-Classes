package 자바1프로젝트;
import java.util.*;
//while을 이용해서 내림차순으로 별 반복하기


public class 자바1_4주차_HW2_star반복 {

	public static void main(String[] args) {
		
		int i,j,num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("별을 몇개까지 반복시키겠습니까? :");
		num = input.nextInt();
		
		
		for(int k = 0; k<num; k++) {
			for(int q=num; q > k; q--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		i = num;
		while(i > 0) {
			j=1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
