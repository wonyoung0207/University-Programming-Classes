package �ڹ�1������Ʈ;
import java.util.*;
//�ݺ��� do-while ����Ͽ� �ùٸ� �� �Է��Ҷ����� �ݺ�


public class �ڹ�1_4����_do_while {

	public static void main(String[] args) {
		
		int i = 10;
		int month;
		
		Scanner input = new Scanner(System.in);
		
		
		do {//�ϴ� �ѹ��� ������ ����ǰ� ������ ����ȴ�. 
			System.out.println("�ùٸ� ���� �Է��ϼ���(1��~12��) : ");
			month = input.nextInt();
		}while(month < 1 || month > 13);//������ ���̸� �ȿ� ������ ����
		System.out.println("����ڰ� �Է��� �ùٸ� �� : " + month);
	}
}
