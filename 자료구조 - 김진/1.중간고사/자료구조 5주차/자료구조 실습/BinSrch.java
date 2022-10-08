
// 배열 intArr에서 intKey값이 저장되어 있는 방의 번호를 이진탐색으로찾아라
//	Java program to demonstrate
// Array.binarySearch() method
import java.util.Arrays;

public class BinSrch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr); // 정렬
		int intKey = 22;
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
	}

}
