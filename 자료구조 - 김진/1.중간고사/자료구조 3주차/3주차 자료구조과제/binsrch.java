
public class binsrch {	//�ݺ��� ���
	
	public static void main(String[] arge) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("ã����� ��");
		binarySearch(1,arr);
	}
	
	public static void binarySearch(int key,int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length-1;
		
		while(right >= left) {
			mid = (right + left) / 2;
			
			if(key == arr[mid]) {
				System.out.println("ã���� �ε��� �ѹ�" + mid);
				break;
				
			}
			else if (key < arr[mid]) {	//�񱳰��� mid ���� ������  right ��  mid-1�� �ٲ��
				right = mid -1;
			}else if(key > arr[mid]){
				left = mid + 1;		//�񱳰��� mid ���� ũ�� left �� mid +1 �� �ٲ��
			}else
				System.out.println("���� ���Ǵ� ���� �Դϴ�.");
			
			}
		}
	}


	
	/*	������ �ڵ�
	 * public static int Bin(int a[],int key,int min,int max){
		if (min <= max) {
			
			int mid = (min + max) / 2;
			if (key == a[mid])
				return mid;
			else if (key < a[mid]) // �߰������� �������
				return (Bin(a, key, min, mid - 1));
			else if (key > a[mid]) // �߰������� Ŭ���
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
		System.out.println("ã�� ���� = " + in);
		int index = Bin(A, in, 0, 10);
		
		if(index < 0) {
			System.out.println("�ش�Ǵ� ���� ã�� �� ����" + in);
		}else
			System.out.println("�迭�� index ����" + index + "" + "����" + A[index]);
		

		*/

