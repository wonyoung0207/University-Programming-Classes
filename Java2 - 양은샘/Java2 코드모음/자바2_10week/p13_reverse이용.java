package �ڹ�2_10week;
import java.util.Scanner;


public class p13_reverse�̿� {//���ڿ� ������ ��� 2���� 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s = input.next();
		
		StringBuffer stb = new StringBuffer(s);
		System.out.println(stb.reverse());
		
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(s.length() - 1 - i));
		}
		
	}

}
