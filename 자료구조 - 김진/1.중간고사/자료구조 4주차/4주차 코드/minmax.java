import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int sum = 0,avg;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("(i+1)��° �� �Է�");
			int n = sc.nextInt();
			if(n < 0 ||n>100) {
				System.out.println("���� �Դϴ�. 1���� 100���� ���� �Է����ּ���");
				i--;
				continue;
			}
			a[i] = n;
			sum += n;
							
		}
		avg = sum/10;
		System.out.println("������ ���� : "+ sum + "\n������ ����� : " + avg);
	}

}
