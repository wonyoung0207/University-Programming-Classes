import java.util.Arrays;

public class ArrChange {	//��ġ��� ����� Ŭ����
	

	public static void main(String[] args) {// ��ġ��� �����. ��� ���� �ٲ۴�.
		int mat[][] = { { 5, 4, 7, 5 }, { 1, 3, 8 , 6}, { 2, 9, 6, 3} };
		System.out.println("������ �������迭 ��� : ");
		printmat(mat);	//�迭�� ����ϴ� �żҵ� printMat ȣ��
		
		sortMat(mat);	// �迭�����ϴ� �޼ҵ� ȣ�� -> Arrays.sort(mat) �� 1���� �迭�� �ƴ϶� ��������
		System.out.println("���� �� ������ �迭 ��� :");
		printmat(mat);
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
	static void printmat(int mat[][]) {		//3���� �迭�� ����ϴ� �żҵ�
		for (int i = 0; i < mat.length; i++) {		//���� ���̸�ŭ �ݺ� ->3��
			for (int j = 0; j < mat[i].length; j++)	//1���� �� ��ŭ �ݺ� -> 4
				System.out.print(mat[i][j] + " ");	//���� ���
			System.out.println();	//���������� ������ �ٹٲ�
		}

	}
	
}