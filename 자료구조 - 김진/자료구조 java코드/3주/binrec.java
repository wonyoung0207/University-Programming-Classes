
public class binrec {	
	public static void main(String[] args) {
		int A[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int in = 18;
		System.out.println("ã�� ����" + in);
		int index = Bin(A, in, 0, 10);
		if (index < 0) {
			System.out.println("�ش�Ǵ� ���� ã���� ����" + in);
		} else
			System.out.println("�迭�� index����" + index + " " + "����" + A[index]);
	}

	public static int Bin(int a[], int key, int min, int max) {
		if (min <= max) {
			int mid = (min + max) / 2;
			if (key == a[mid])
				return mid;
			else if (key < a[mid])
				return (Bin(a, key, min, mid - 1));
			else if (key > a[mid])
				return (Bin(a, key, mid + 1, max));
			else {
				return -1;
			}
		}
		return -1;
	}

}
