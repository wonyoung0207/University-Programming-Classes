
public class StudentScore {

	public static void main(String[] args) {
		int a[][] = new int[11][4];
		int name[] = new int[10];
		int num;
		
		
		for(int i = 0; i < 10; i++) {				//�迭�� �� �������ִ� for��
			name[i] = i+1;
			for(int j = 0; j<=2;j++) {
				num = (int)(Math.random()*100);		//0���� 100���� �� ���� �߻�
				a[i][j] = num;
			} 
		}
		
		for(int k = 0; k < 10; k++) {				//2����� ���.�Ѹ�� 1��2��3�� �����߻����� ����Ʈ
			System.out.print(name[k] + "��°�л����� =");	//�ٸ� 1����� �̿��� ����л����� ��� ����Ʈ��
			for(int n = 0; n <=2 ;n++) {
			System.out.print(a[k][n] + " ");
			a[k][3] += a[k][n] ;					// k ��° ���� ������ 3��° ���� ���ؼ� ����־��ش�.
			a[10][n] += a[k][n];					// 11��° �࿡ ������ ������ ���Ѱ��� ����
			
			}
			System.out.println();
			
			System.out.println((k+1) + "�� �л��� ��� ������ " + a[k][3]/3 + "�Դϴ�");
			
			if((a[k][3]/3) < 60 ) {					//����� 60 ������ �л� ���� ������ �ϱ�
				System.out.println(name[k] +"�� �л��� �����Դϴ�.");
			}else
				System.out.println("�հ��Դϴ�.");
			
			System.out.println();
			
		}
		for(int x = 0;x <= 2;x++) {
			System.out.println((x+1) + "�� ������ ��� = " + a[10][x]/10 + "�Դϴ�.");
		}
		
		
	}
}