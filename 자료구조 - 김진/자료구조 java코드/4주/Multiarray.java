
public class Multiarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][5];
		int cnt = 1;
		int sum = 0;

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a[i].length - 1; j++) {
				

				a[i][j] = cnt;

				cnt++;

				sum = sum + a[i][j];
				a[i][4] = sum;
				a[3][j] = 0;	// 합 구하고 싶은 행의 열에 0으로 초기화 하기
				//System.out.print(a[i][j] + " ");

			}

			//System.out.print(a[i][4] + " ");
			//System.out.println();
			sum = 0;
		}
		for(int i =0;i<5;i++) {		//행의 합 구하기
			for(int j = 0;j<3;j++) {	// j 한번 돌때마다  첫번째 행부터 원하는 행에 저장
				a[3][i]+=a[j][i];
			}
		}
		for(int i =0;i<4;i++) {		//행렬 프린트
			for(int j = 0;j<5;j++) {
				System.out.print(a[i][j] + " ");
			}System.out.println();
		}
	}


}
