package �ڹ�1������Ʈ;
import java.util.*;
//string �� char�� ������
//String �� ���ڿ��� "" �ν��ְ� , < string a = "" > �� ���·� ��
//char �� ���ڷ� '' �� ���ְ�, < char[] a = new char[5] > �� ���·� ����.

public class �ڹ�1_3����_switch��_��ޱ��ϱ� {

	public static void main(String[] args) {
		int score, number;
		char grade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� : ");
		score = input.nextInt();
		
		number = score / 10;
		
		switch(number) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'B';
			break;
		case 8:
			grade = 'C';
			break;
		default :
			grade = 'F';
			break;
			
		}
		System.out.print("�Է��� ������ ����� : " + grade);
		
		

	}

}
