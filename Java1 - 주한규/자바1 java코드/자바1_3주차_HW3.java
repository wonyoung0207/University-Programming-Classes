package �ڹ�1������Ʈ;
import java.util.*;
//�ݾ��� �Է¹޾� ����,õ��,��� ���� ��ִ��� �Ǻ�

public class �ڹ�1_3����_HW3 {

	public static void main(String[] args) {
		int money;//�Է¹��� ���� �����ϴ� ���� ����
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		
		money = input.nextInt();//�Է¹��� �ݾ��� money ������ �־��ش�.
		
		System.out.println(money+"����");
		System.out.println("10000�� ¥�� " + money / 10000 + "��");//�Է¹��� ������ 10000���� ���� ���� ���
		
		//���� 10000���� ���� �������� 3000�� ����ϰ�, �״������� 1000�� �����ֺ� 1000���� ������ ��µȴ�.
		System.out.println("1000�� ¥�� " + (money % 10000) / 1000 + "���� �ʿ��մϴ�.");

	}

}
