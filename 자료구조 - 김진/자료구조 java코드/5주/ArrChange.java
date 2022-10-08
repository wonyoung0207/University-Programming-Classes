import java.util.Arrays;

public class ArrChange {	//전치행렬 만드는 클래스
	

	public static void main(String[] args) {// 전치행렬 만들기. 행과 열을 바꾼다.
		int mat[][] = { { 5, 4, 7, 5 }, { 1, 3, 8 , 6}, { 2, 9, 6, 3} };
		System.out.println("정렬전 다차원배열 출력 : ");
		printmat(mat);	//배열을 출력하는 매소드 printMat 호출
		
		sortMat(mat);	// 배열정렬하는 메소드 호출 -> Arrays.sort(mat) 은 1차원 배열이 아니라 에러난다
		System.out.println("정렬 후 다차원 배열 출력 :");
		printmat(mat);
	}


	static void sortMat(int mat[][]) {//1차원배열이어야 정렬가능
		int temp[] = new int[mat.length * mat[0].length]; //행(3) * 열(4) 만큼의 방갯수 생성 
		// temp의 방 개수는 적어도 다차원 행렬의 방 갯수만큼 나와야 되기 때문에
		int k = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				temp[k++] = mat[i][j];
				//k++;
				//temp[0] 에다가 0행 0열,temp[1]에다가 0행1열,temp[2]에다가 0행2열.....
				//1차원으로 그냥 값들 순서대로 다 저장
			}

		Arrays.sort(temp);	//1차원 배열 다시 정렬
		}

		k = 0;	//다시 순차적으로 넣기 위해서
		
		for (int i = 0; i < mat.length; i++) {	//다시 다차원 배열로 바꿔주는 for문
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = temp[k++];			//정렬된 값들을 순차적으로 배열에 저장
				//k++;
			}
		}
		
		}
	static void printmat(int mat[][]) {		//3차원 배열을 출력하는 매소드
		for (int i = 0; i < mat.length; i++) {		//행의 길이만큼 반복 ->3번
			for (int j = 0; j < mat[i].length; j++)	//1행의 열 만큼 반복 -> 4
				System.out.print(mat[i][j] + " ");	//값을 출력
			System.out.println();	//다음행으로 가기전 줄바꿈
		}

	}
	
}