
import java.util.Date;
import java.util.Scanner;

public class SumTotal {
	public static void main(String[] args) {

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		try {
			long start = System.currentTimeMillis();	//���۽ð�
			
			
			/*
			for (int i = 1; i < n; i++) {
				sum = sum + i;
			}
			
			*/
			
			/*
			for(int i = 1; i <= n; i++) { //n�� ���� ���ϱ�
				for(int j = 1; j <= i; j++)
					sum = sum + 1;
			}
			
			*/
			
			for(int i = 1; i <= n; i++) {	//n�� ������ ���ϱ�.
				for(int j = 1; j <= i; j++) {
					sum = sum + 1;
					System.out.println("�ι�°"+sum);
					for(int k = 1; k <= j; k++) {
						sum = sum + 0;
						System.out.println("����°"+sum);
						
					}
				}
			}
			
			
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference : " + diff);
			System.out.println(sum);

		} catch (Exception e) {
			System.out.println("An exception occurs");
		}
	}
}
