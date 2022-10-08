

public class SumN {	//피보나치로 구한 1부터 n까지 합

	
		
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

