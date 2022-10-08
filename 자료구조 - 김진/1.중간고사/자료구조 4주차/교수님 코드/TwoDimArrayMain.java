/**
 * 
 * @author Kim, Jin
 *
 */
class TwoDimArray {
	
	static void init1(int arr[][], int sNo) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = sNo;
				sNo++;
			}
		}
	}
	
	static void init2(int arr[][], int sNo) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = sNo;
				sNo++;
			}
		}
	}
	static void init3(int arr[][], int sNo) {
		int totalCell = arr.length * arr[0].length;
		int i = 0;
		while (i < totalCell) {
			i++;
		}
		
	}
	static void init4(int arr[][], int sNo) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = sNo;
				sNo++;
			}
		}
	}

	static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

public class TwoDimArrayMain {
	public static void main(String[] args) {
		int arr[][] = new int[4][10]; // 첨자들을 바꾸어 테스트해보라
		int startNumber = 10;
		TwoDimArray.init1(arr, startNumber);
		TwoDimArray.printArray(arr);
		TwoDimArray.init2(arr, startNumber);
		TwoDimArray.printArray(arr);
		TwoDimArray.init3(arr, startNumber);
		TwoDimArray.printArray(arr);
		TwoDimArray.init4(arr, startNumber);
		TwoDimArray.printArray(arr);
	}
}
