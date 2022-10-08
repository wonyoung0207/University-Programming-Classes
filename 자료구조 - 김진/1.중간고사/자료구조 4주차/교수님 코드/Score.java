
import java.util.*; //키보드 입력을 받기위한 유틸 라이브러리 사용

public class Score {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //sc에 스캐너 기능 담음
		
		int a[] = new int [10]; // 10칸짜리 int형 배열 a 생성
		int sum=0,ave; // 총합 및 평균 변수 생성
		
		for(int i=0;i<10;i++){  // 학생 성적 입력을 위한 for문
			System.out.print((i+1)+"번째 성적을 입력하시오 : ");
			int n =sc.nextInt(); //학생 성적 키보드 입력
			if(n<0||n>100){ //입력 값이 0보다 작고 100보다 클때
 				System.out.println("[오류] 1부터 100사이 숫자를 입력해주세요");
				i--; //반복 값 i 를  1빼줘서 다시 입력하게 하고
				continue; // for문으로 돌아가게 한다
			}
			a[i] = n; // 배열 a의 i번째 칸에 입력한 수 n을 넣어준다
			sum +=n;  // 입력한 수들의 총합을 sum 에 저장
		}
		ave = sum/10; // 총합을 10으로 나누어 평균을 구함
		System.out.println("성적의 총합 : " + sum + "\n성적의 평균은 : " + ave); // 총합 및 평균 출력
	}
}