package �ڹ�1������Ʈ;
import java.util.*;

public class �ڹ�1_4����_HW1_�ִ��������ϱ� {

	public static void main(String[] args) {
		
		int x, y;
		int num, cnt;
		
		num = 0;
		cnt = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������)");
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("ū��: "+ x + "  ������: " + y);
		
		while(y != 0) {
			num = x % y;
			System.out.println(cnt + "��° ������: " + num);
			cnt++;
			x = y;
			y = num;
		}
		System.out.println("�� ���� �ִ����� : "  + x);

	}

}
