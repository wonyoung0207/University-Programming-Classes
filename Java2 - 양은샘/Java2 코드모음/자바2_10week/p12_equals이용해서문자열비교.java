package �ڹ�2_10week;
import java.util.Scanner;


public class p12_equals�̿��ؼ����ڿ��� {

	public static void main(String[] args) {
		String id = "abcdef";
		
		Scanner input = new Scanner(System.in);
		System.out.print("���Ͻ� ���ڿ��� �Է��ϼ��� : ");
		String s = input.next();
		
		if(id.equals(s)) {
			System.out.println("�� ���ڿ� " + id + ", " + s + " �� ���� ���ڿ� �Դϴ�.");
		}
		else {
			System.out.println("�� ���ڿ� " + id + ", " + s + " �� �ٸ� ���ڿ� �Դϴ�.");
		}
		

	}

}
