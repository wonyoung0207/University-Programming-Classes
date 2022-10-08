
public class StudentScore {

	public static void main(String[] args) {

		int score[][] = new int[11][4]; // 11x4 짜리 배열 생성

		score[0][0] = 30;
		score[0][1] = 60;
		score[0][2] = 90; // 모든 학생의 각 학기 성적들 입력
		score[1][0] = 10;
		score[1][1] = 40;
		score[1][2] = 40;
		score[2][0] = 20;
		score[2][1] = 10;
		score[2][2] = 10;
		score[3][0] = 50;
		score[3][1] = 30;
		score[3][2] = 20;
		score[4][0] = 40;
		score[4][1] = 20;
		score[4][2] = 80;
		score[5][0] = 60;
		score[5][1] = 80;
		score[5][2] = 70;
		score[6][0] = 80;
		score[6][1] = 70;
		score[6][2] = 30;
		score[7][0] = 70;
		score[7][1] = 50;
		score[7][2] = 100;
		score[8][0] = 90;
		score[8][1] = 100;
		score[8][2] = 60;
		score[9][0] = 100;
		score[9][1] = 90;
		score[9][2] = 50;
//		score[10][0] = 0;
//		score[10][1] = 0;
//		score[10][2] = 0;

		for (int i = 0; i < 10; i++) { // 각 회차, 즉 각 열들의 총합을 구하기 위해 3번 반복
			for (int j = 0; j < 3; j++) { // 각 학생별 최종성적합계산
				score[i][3] += score[i][j]; // 각 학생별 최종성적합계산
				score[10][j] += score[i][j]; // 각 차별 시험성적합
			}			
			score[i][3]=score[i][3] / 3;  // 각 학생별 최종평균
			System.out.println((i+1) + "번 학생의 평균 점수는 " + score[i][3] + "입니다"); 
		}

		System.out.println();

		for ( int j = 0; j<3;j++) {
			score[10][j]=score[10][j]/10; 
			System.out.println((1+ j) + "차  시험의 평균 점수는 " + score[10][j] + "입니다");  
		}

		System.out.println();

		//낙제학생을 출력하라
	}
}