
// �迭 intArr���� intKey���� ����Ǿ� �ִ� ���� ��ȣ�� ����Ž������ã�ƶ�
//	Java program to demonstrate
// Array.binarySearch() method
import java.util.Arrays;

public class BinSrch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr); // ����
		int intKey = 22;
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
	}

}
