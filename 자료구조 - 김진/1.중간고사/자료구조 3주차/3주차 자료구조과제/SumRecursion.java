
//1���� n������ ���ϴ� ���α׷�

public class SumRecursion {
	
	public static int sumrec(int n) {// ��ͻ������ 1���� n ���� �� ���ϱ�
		if(n == 1) {
			return 1;
			
		}
		int result = n + sumrec(n - 1);
		return result;
		
	}
	
	public static int sumiter(int n) {		//�ݺ����� �̿��� 1���� n���� ��
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			
			sum = sum + i;
			
						
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(sumrec(n));
		System.out.println(sumiter(n));

	}

}
