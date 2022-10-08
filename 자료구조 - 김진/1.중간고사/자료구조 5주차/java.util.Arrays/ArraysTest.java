
/**
 * 
 */
import java.util.Arrays;

public class ArraysTest {

	public static void binSrch() {
		int intArr[] = { 10, 20, 15, 22, 35, 38, 11 };

		Arrays.sort(intArr); // ����Ž���� ���ؼ� ���Ҹ� ���� �����ؾ� �Ѵ�.
		int intKey = 22;
		System.out.println(intKey + " found at index =" + Arrays.binarySearch(intArr, intKey));

	}

	public static void compTwoarray() {
		int intArr[] = { 10, 20, 15, 22, 35, 41 };
		int intArr1[] = { 10, 15, 22 };

		System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr, intArr1));
	}

	public static void sortArray() {
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr);
		System.out.println("Integer Array: " + Arrays.toString(intArr));

	}

	public static void equalsArray() {

	}

	static int SIZE = 10;

	static void sortMat(int mat[][]) {
		int temp[] = new int[mat.length * mat[0].length]; // temp�� 1�����迭�̾� ���İ���
		int k = 0;

		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				temp[k++] = mat[i][j];

		Arrays.sort(temp);

		k = 0;
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				mat[i][j] = temp[k++];

	}

	static void sortMatrix() {
		int mat[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };
		int n = 3;
		System.out.println("Original Maxtrix: ");
		printMat(mat);
		sortMat(mat);
		// Arrays.sort(mat); 1����ȭ ���������Ƿ� ����
		System.out.println("Maxtrix After Sorting: ");
		printMat(mat);
	}

	static void printMat(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	public static void arrayToString() {
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: " + Arrays.toString(intArr));

	}

	public static void moveZero() {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		//  arr[] = { 1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		// �̺κ��� ä���� 
		//
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static void main(String args[]) {

		/**
		 * Arrays���� binary search (����Ž��)�� ����Ͽ� Ű�� ã�ƶ�.
		 */
		binSrch();

		/**
		 * �� ���� �迭�� ������ ���Ѵ�.
		 */
		compTwoarray();
		/**
		 * �� �迭�� ������ ���Ѵ�. Arrays.equals�� ����Ѵ�.
		 */
		equalsArray();
		/**
		 * �迭�� ���Ҹ� �����Ѵ�.
		 */
		sortArray();

		/**
		 * matrix ���� ������ �����Ѵ�.
		 */
		sortMatrix();
		/**
		 * �迭�� ������ ���ڿ��� �����غ���
		 */
		arrayToString();
		/**
		 * �迭�� 0�� ���Ҹ� ���������� �̵����Ѷ�
		 */
		System.out.println("moveZero");
		moveZero();
	}
}