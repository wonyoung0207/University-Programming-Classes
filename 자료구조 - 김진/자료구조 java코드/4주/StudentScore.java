
public class StudentScore {

	public static void main(String[] args) {
		int a[][] = new int[11][4];
		int name[] = new int[10];
		int num;
		
		
		for(int i = 0; i < 10; i++) {				//배열에 값 세팅해주는 for문
			name[i] = i+1;
			for(int j = 0; j<=2;j++) {
				num = (int)(Math.random()*100);		//0부터 100까지 중 난수 발생
				a[i][j] = num;
			} 
		}
		
		for(int k = 0; k < 10; k++) {				//2차행렬 출력.한명당 1차2차3차 난수발생점수 프린트
			System.out.print(name[k] + "번째학생점수 =");	//다른 1차행렬 이용한 몇번학생인지 찍는 프린트문
			for(int n = 0; n <=2 ;n++) {
			System.out.print(a[k][n] + " ");
			a[k][3] += a[k][n] ;					// k 번째 행의 값들을 3번째 열어 더해서 집어넣어준다.
			a[10][n] += a[k][n];					// 11번째 행에 각행의 값들을 더한값을 저장
			
			}
			System.out.println();
			
			System.out.println((k+1) + "번 학생의 평균 점수는 " + a[k][3]/3 + "입니다");
			
			if((a[k][3]/3) < 60 ) {					//평균이 60 이하인 학생 낙재 찍히게 하기
				System.out.println(name[k] +"번 학생은 낙재입니다.");
			}else
				System.out.println("합격입니다.");
			
			System.out.println();
			
		}
		for(int x = 0;x <= 2;x++) {
			System.out.println((x+1) + "차 시험의 평균 = " + a[10][x]/10 + "입니다.");
		}
		
		
	}
}