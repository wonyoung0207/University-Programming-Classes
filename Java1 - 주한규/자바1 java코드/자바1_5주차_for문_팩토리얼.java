package �ڹ�1������Ʈ;
import java.util.*;
//���丮�� ���ϴ� ���α׷�


public class �ڹ�1_5����_for��_���丮�� {
	public static void main(String[] args) {
		int fact = 1;
		int n;
		int cnt = 1;
		int num = 1;
		
		System.out.print("������ �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {//i���� ������ �����
			System.out.print(cnt + "��° fact -> "+ fact + "*" + i + "=");

			fact = fact * i;
			System.out.println(fact);
			cnt++;
			
		}
		System.out.printf("%d! �� ���� %d",n,fact);//printf �������.
	}

}
