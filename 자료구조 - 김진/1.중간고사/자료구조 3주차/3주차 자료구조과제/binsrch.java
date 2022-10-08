
public class binsrch {	//반복문 사용
	
	public static void main(String[] arge) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("찾고싶은 값");
		binarySearch(1,arr);
	}
	
	public static void binarySearch(int key,int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length-1;
		
		while(right >= left) {
			mid = (right + left) / 2;
			
			if(key == arr[mid]) {
				System.out.println("찾은값 인덱스 넘버" + mid);
				break;
				
			}
			else if (key < arr[mid]) {	//비교값이 mid 보다 작으면  right 를  mid-1로 바꿔라
				right = mid -1;
			}else if(key > arr[mid]){
				left = mid + 1;		//비교값이 mid 보다 크면 left 를 mid +1 로 바꿔라
			}else
				System.out.println("없는 수또는 음수 입니다.");
			
			}
		}
	}


	
	/*	교수님 코딩
	 * public static int Bin(int a[],int key,int min,int max){
		if (min <= max) {
			
			int mid = (min + max) / 2;
			if (key == a[mid])
				return mid;
			else if (key < a[mid]) // 중간값보다 작을경우
				return (Bin(a, key, min, mid - 1));
			else if (key > a[mid]) // 중간값보다 클경우
				return (Bin(a, key, mid + 1, max));
			else {
				return -1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {

		int A[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int in = 2;
		System.out.println("찾을 값은 = " + in);
		int index = Bin(A, in, 0, 10);
		
		if(index < 0) {
			System.out.println("해당되는 값을 찾을 수 없음" + in);
		}else
			System.out.println("배열의 index 값은" + index + "" + "값은" + A[index]);
		

		*/

