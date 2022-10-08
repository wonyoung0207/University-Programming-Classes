
public class ArrayTestMain {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		//ArrayTest.reverseArray(arr, 0, arr.length - 1);
		//ArrayTest.printArray(arr);
		//ArrayTest.rotate(arr); //shiftArray라는 이름을 rotate로 변경.
		//ArrayTest.printArray(arr);
		//ArrayTest.shiftnArray(arr, 3);
		//ArrayTest.printArray(arr);
		//ArrayTest.insertArray(arr, 3, 5); // 3번방에 5를 삽입하라.
		//ArrayTest.printArray(arr);
		ArrayTest.deleteArray(arr, 3); // 3번방의 값을 삭제하라.
		ArrayTest.printArray(arr);
	}
}

 
class ArrayTest {
	
	/*
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	*/
	

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/*

	static void rotate(int arr[]) {
		int x = arr[arr.length-1], i; 
	       for (i = arr.length-1; i > 0; i--) {
	          arr[i] = arr[i-1]; 
	       }
	       arr[0] = x; 
	}
	*/
	/*

	static void shiftnArray(int arr[], int k) {	//arr[], 3
		k = arr[arr.length-1];
		for(int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = k;
				
	}
	*/
	/*
	static void insertArray(int arr[], int x, int y) { //x번째 방에 y값을 삽입하라.arr, 3, 5
		
		for(int i = arr.length-1;i >= 1; i--) {
			if(i == x) {
				arr[x] = y;
			}
			arr[i] = arr[i-1];
			
			}
	}
		
	*/	
	
	static void deleteArray(int arr[], int x) { // x번째 방의 값을 삭제하라.arr,3
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (i >= x && i < arr.length - 1) {
				arr[i] = arr[i + 1];

			}
			arr[arr.length - 1] = 0;
		}
	}
	
	
	
	
}
