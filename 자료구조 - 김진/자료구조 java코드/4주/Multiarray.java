
public class Multiarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][5];
		int cnt = 1;
		int sum = 0;

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a[i].length - 1; j++) {
				

				a[i][j] = cnt;

				cnt++;

				sum = sum + a[i][j];
				a[i][4] = sum;
				a[3][j] = 0;	// �� ���ϰ� ���� ���� ���� 0���� �ʱ�ȭ �ϱ�
				//System.out.print(a[i][j] + " ");

			}

			//System.out.print(a[i][4] + " ");
			//System.out.println();
			sum = 0;
		}
		for(int i =0;i<5;i++) {		//���� �� ���ϱ�
			for(int j = 0;j<3;j++) {	// j �ѹ� ��������  ù��° ����� ���ϴ� �࿡ ����
				a[3][i]+=a[j][i];
			}
		}
		for(int i =0;i<4;i++) {		//��� ����Ʈ
			for(int j = 0;j<5;j++) {
				System.out.print(a[i][j] + " ");
			}System.out.println();
		}
	}


}
