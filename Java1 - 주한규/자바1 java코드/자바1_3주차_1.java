package �ڹ�1������Ʈ;
import java.util.*;
//��,��,�� ������ �Է¹޾� ��� ���ϱ�
//input.nextLine() -> ���� ������, ���� ������ �Է¹���
//input.next() -> ���� ������,���� �ϳ��� �ν���


public class �ڹ�1_3����_1 {

	public static void main(String[] args) {
		int k, e, m;
		int total;
		double avg;
		String a;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		a = input.nextLine();
		System.out.println(a);
		
		System.out.println("���������� �Է�");
		k = input.nextInt();
		System.out.println("���������� �Է�");
		e = input.nextInt();
		System.out.println("���������� �Է�");
		m = input.nextInt();
		
		total = k + e + m;
		avg = total/3.0;
		
		System.out.println("��� ������ = " + avg + "�� �Դϴ�.");
		
		

	}

}
