
import java.util.Arrays;

public class ArrayaTest {

	public static void binSrch() {	//����Ž��
		int intArr[] = { 10, 20, 15, 22, 35, 38, 11 };

		Arrays.sort(intArr); // ����Ž���� ���ؼ� ���Ҹ� ���� �����ؾ� �Ѵ�.	//{10,11,15,20,22,35,38}
		int intKey = 22;	//���ĵ� ������ �迭���� ���ϴ� ���� �ε����� ã�´�.->����Ž��binsearch
		
		System.out.println(intKey + "�� ���ĵ� �ε��� �ּ� =" + Arrays.binarySearch(intArr, intKey) + "\n");

	}

	public static void Deepequals() {	//Arrays.deepEquals(�迭1,�迭2) ->������� true or false �� ����
		Integer intArr[] = {10, 20, 15, 22, 35, 41};
		Integer intArr1[] = { 10, 15, 22 };

		System.out.println("�� �迭�� �����ϱ�?deepequals " + Arrays.deepEquals(intArr,intArr1) + "\n");
	}
	
	public static void equalsArray() {	//�����Ͱ��� ��.-> �迭.equals(�񱳹迭)
		int intArr[] = { 10, 15, 22 };
		int intArr1[] = { 10, 15, 22 };

		System.out.println("�� �迭�� �����ϱ�? " + intArr.equals(intArr1) + "\n");
		//Arrays.equals(intArr,intArr1) �̰͵� ����

	}

	public static void sortArray() {		//�迭�� ����
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr);
		System.out.println("�迭�� ���� " + Arrays.toString(intArr) + "\n");// �迭�� ������ ����Ҷ� ���

	}
	
	public static void arrayToString() {	//�迭�� ������ ���ڿ��� ����
		
		int intArr[] = { 10, 20, 15, 22, 35 };
		
		System.out.println("�迭�� ���ڿ��� ��� " + Arrays.toString(intArr) + "\n");	

	}

	static int SIZE = 10;
	
	static void sortMatrix() {
		int mat[][] = { { 5, 4, 7, 5 }, { 1, 3, 8 , 6}, { 2, 9, 6, 3} };
		System.out.println("������ �������迭 ��� : ");
		printMat(mat);	//�迭�� ����ϴ� �żҵ� printMat ȣ��
		
		sortMat(mat);	// �迭�����ϴ� �޼ҵ� ȣ�� -> Arrays.sort(mat) �� 1���� �迭�� �ƴ϶� ��������
		System.out.println("���� �� ������ �迭 ��� :");
		printMat(mat);
	}
	
	static void sortMat(int mat[][]) {//1�����迭�̾�� ���İ���
		int temp[] = new int[mat.length * mat[0].length]; //��(3) * ��(4) ��ŭ�� �氹�� ���� 
		// temp�� �� ������ ��� ������ ����� �� ������ŭ ���;� �Ǳ� ������
		int k = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				temp[k++] = mat[i][j];
				//k++;
				//temp[0] ���ٰ� 0�� 0��,temp[1]���ٰ� 0��1��,temp[2]���ٰ� 0��2��.....
				//1�������� �׳� ���� ������� �� ����
			}

		Arrays.sort(temp);	//1���� �迭 �ٽ� ����
		}

		k = 0;	//�ٽ� ���������� �ֱ� ���ؼ�
		
		for (int i = 0; i < mat.length; i++) {	//�ٽ� ������ �迭�� �ٲ��ִ� for��
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = temp[k++];			//���ĵ� ������ ���������� �迭�� ����
				//k++;
			}
		}
	}
	
	static void printMat(int mat[][]) {		//3���� �迭�� ����ϴ� �żҵ�
		for (int i = 0; i < mat.length; i++) {		//���� ���̸�ŭ �ݺ� ->3��
			for (int j = 0; j < mat[i].length; j++)	//1���� �� ��ŭ �ݺ� -> 4
				System.out.print(mat[i][j] + " ");	//���� ���
			System.out.println();	//���������� ������ �ٹٲ�
		}
	}

	

	public static void moveZero() {		//0�� �ڷ� �ű�� ���α׷�
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		//  arr[] = { 1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0 };
		int temp[] = new int[arr.length];		//�迭���� �Ȱ��� ���ο�迭 ����
		int n = 0;
		
		for (int i = 0; i < arr.length; i++) {		//�ʱ� �迭�� ���
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 1;
			
			if(arr[i] != 0) {
				temp[n] = arr[i];
				n++;	
				//0�� ������ ��������� ���ڸ��� �������ڵ���. ��ä���� �ڿ��ڸ��� �ڵ����� 0���� ä��
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];		
			
		}
		
		for (int i = 0; i < arr.length; i++) {		//�ٲ� �迭�� ���
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
		Deepequals();
		/**
		 * �� �迭�� ������ ���Ѵ�. Arrays.equals�� ����Ѵ�.
		 */
		equalsArray();
		/**
		 * �迭�� ���Ҹ� �����Ѵ�.
		 */
		sortArray();
		/**
		 * �迭�� ������ ���ڿ��� �����غ���
		 */
		arrayToString();
		/**
		 * matrix ���� ������ �����Ѵ�.
		 */
		sortMatrix();
		/**
		 * �迭�� 0�� ���Ҹ� ���������� �̵����Ѷ�
		 */
		System.out.println("moveZero");
		moveZero();
	}
}