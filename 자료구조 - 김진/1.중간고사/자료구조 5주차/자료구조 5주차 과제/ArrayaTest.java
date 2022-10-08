
import java.util.Arrays;

public class ArrayaTest {

	public static void binSrch() {	//이진탐색
		int intArr[] = { 10, 20, 15, 22, 35, 38, 11 };

		Arrays.sort(intArr); // 이진탐색을 위해서 원소를 먼저 정렬해야 한다.	//{10,11,15,20,22,35,38}
		int intKey = 22;	//정렬된 상태의 배열에서 원하는 값의 인덱스를 찾는다.->이진탐색binsearch
		
		System.out.println(intKey + "의 정렬된 인덱스 주소 =" + Arrays.binarySearch(intArr, intKey) + "\n");

	}

	public static void Deepequals() {	//Arrays.deepEquals(배열1,배열2) ->결과값은 true or false 로 나옴
		Integer intArr[] = {10, 20, 15, 22, 35, 41};
		Integer intArr1[] = { 10, 15, 22 };

		System.out.println("두 배열이 같습니까?deepequals " + Arrays.deepEquals(intArr,intArr1) + "\n");
	}
	
	public static void equalsArray() {	//데이터값을 비교.-> 배열.equals(비교배열)
		int intArr[] = { 10, 15, 22 };
		int intArr1[] = { 10, 15, 22 };

		System.out.println("두 배열이 같습니까? " + intArr.equals(intArr1) + "\n");
		//Arrays.equals(intArr,intArr1) 이것도 가능

	}

	public static void sortArray() {		//배열을 정렬
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr);
		System.out.println("배열을 정렬 " + Arrays.toString(intArr) + "\n");// 배열의 내용을 출력할때 사용

	}
	
	public static void arrayToString() {	//배열의 내용을 문자열로 리턴
		
		int intArr[] = { 10, 20, 15, 22, 35 };
		
		System.out.println("배열을 문자열로 출력 " + Arrays.toString(intArr) + "\n");	

	}

	static int SIZE = 10;
	
	static void sortMatrix() {
		int mat[][] = { { 5, 4, 7, 5 }, { 1, 3, 8 , 6}, { 2, 9, 6, 3} };
		System.out.println("정렬전 다차원배열 출력 : ");
		printMat(mat);	//배열을 출력하는 매소드 printMat 호출
		
		sortMat(mat);	// 배열정렬하는 메소드 호출 -> Arrays.sort(mat) 은 1차원 배열이 아니라 에러난다
		System.out.println("정렬 후 다차원 배열 출력 :");
		printMat(mat);
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
	
	static void printMat(int mat[][]) {		//3차원 배열을 출력하는 매소드
		for (int i = 0; i < mat.length; i++) {		//행의 길이만큼 반복 ->3번
			for (int j = 0; j < mat[i].length; j++)	//1행의 열 만큼 반복 -> 4
				System.out.print(mat[i][j] + " ");	//값을 출력
			System.out.println();	//다음행으로 가기전 줄바꿈
		}
	}

	

	public static void moveZero() {		//0을 뒤로 옮기는 프로그램
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		//  arr[] = { 1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0 };
		int temp[] = new int[arr.length];		//배열길이 똑같은 새로운배열 생성
		int n = 0;
		
		for (int i = 0; i < arr.length; i++) {		//초기 배열값 찍기
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 1;
			
			if(arr[i] != 0) {
				temp[n] = arr[i];
				n++;	
				//0이 나오면 값사라지고 그자리에 다음숫자들어옴. 안채워진 뒤에자리는 자동으로 0으로 채움
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];		
			
		}
		
		for (int i = 0; i < arr.length; i++) {		//바뀐 배열값 찍기
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static void main(String args[]) {

		/**
		 * Arrays내의 binary search (이진탐색)을 사용하여 키를 찾아라.
		 */
		binSrch();

		/**
		 * 두 개의 배열이 같은지 비교한다.
		 */
		Deepequals();
		/**
		 * 두 배열이 같은지 비교한다. Arrays.equals을 사용한다.
		 */
		equalsArray();
		/**
		 * 배열의 원소를 정렬한다.
		 */
		sortArray();
		/**
		 * 배열의 내용을 문자열로 리턴해보라
		 */
		arrayToString();
		/**
		 * matrix 내의 값들을 정렬한다.
		 */
		sortMatrix();
		/**
		 * 배열의 0인 원소를 오른쪽으로 이동시켜라
		 */
		System.out.println("moveZero");
		moveZero();
	}
}