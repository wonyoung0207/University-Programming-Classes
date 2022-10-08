package 자바1프로젝트;
import java.util.*;

public class 자바1_11주차_Rectangletest {

	public static void main(String[] args) {
		int num = 0;
		double width,height,r;
		
		자바1_11주차_Rectangle rec = new 자바1_11주차_Rectangle();
		Scanner input = new Scanner(System.in);

		System.out.print("너비 : ");
		rec.width = input.nextInt();
		System.out.print("높이 : ");
		rec.height = input.nextInt();
		System.out.println(rec);//toStirng 메소드 실행 
		
		System.out.print("수행할 동작 입력: (사각형 변경: 1, 비율에 의한 사각형 변경: 2, 종료: -1) : ");
		num = input.nextInt();
		
		while(true) {//-1이 들어오면 종료
			if(num == 1) {
				System.out.print("너비 : ");
				rec.width = input.nextInt();
				System.out.print("높이 : ");
				rec.height = input.nextInt();
				System.out.println(rec);
			}
			else if(num == 2) {
				System.out.print("비율 : ");
				r = input.nextDouble();
				rec.modifyRatio(r);
				System.out.println(rec);
			}
			else if(num == -1) {
				break;
			}
			System.out.print("수행할 동작 입력: (사각형 변경: 1, 비율에 의한 사각형 변경: 2, 종료: -1) : ");
			num = input.nextInt();
		}
		

	}

}
