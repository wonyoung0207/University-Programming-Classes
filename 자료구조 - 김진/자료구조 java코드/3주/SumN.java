

public class SumN {	//�Ǻ���ġ�� ���� 1���� n���� ��

	
		
		static int sumTot(int n){
			if (n == 1){
				return 1;
			} else {
				return n + sumTot(n-1);
			}
		}
		
		public static void main(String[] args) {
			
			int i = 3;
			
			System.out.println("fibonacci sum ( " + i + " ) -> " + sumTot(i));

			
		}
}

