package �ڹ�1������Ʈ;
import java.util.*;

public class �ڹ�1_11����_Rectangletest {

	public static void main(String[] args) {
		int num = 0;
		double width,height,r;
		
		�ڹ�1_11����_Rectangle rec = new �ڹ�1_11����_Rectangle();
		Scanner input = new Scanner(System.in);

		System.out.print("�ʺ� : ");
		rec.width = input.nextInt();
		System.out.print("���� : ");
		rec.height = input.nextInt();
		System.out.println(rec);//toStirng �޼ҵ� ���� 
		
		System.out.print("������ ���� �Է�: (�簢�� ����: 1, ������ ���� �簢�� ����: 2, ����: -1) : ");
		num = input.nextInt();
		
		while(true) {//-1�� ������ ����
			if(num == 1) {
				System.out.print("�ʺ� : ");
				rec.width = input.nextInt();
				System.out.print("���� : ");
				rec.height = input.nextInt();
				System.out.println(rec);
			}
			else if(num == 2) {
				System.out.print("���� : ");
				r = input.nextDouble();
				rec.modifyRatio(r);
				System.out.println(rec);
			}
			else if(num == -1) {
				break;
			}
			System.out.print("������ ���� �Է�: (�簢�� ����: 1, ������ ���� �簢�� ����: 2, ����: -1) : ");
			num = input.nextInt();
		}
		

	}

}
