package �ڹ�1������Ʈ;
import java.util.*;//Scanner�� �ҷ����� ���� ����ߴ�.
public class �ڹ�1_3����_HW2 {
//�� ���� �Է¹޾� ũ�� �� �ϱ�

	public static void main(String[] args) {
		
		int num1;//ù��° ������ ���� ����
		int num2;//�ι�° ������ ���� ����
		
		Scanner input = new Scanner(System.in);//Scanner �� ����ϱ� ���� ���� input�� ������ �־���.
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		num1 = input.nextInt();//num1�� �Է¹��� input�� ���� �־��ش�.
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
		num2 = input.nextInt();//num2�� �Է¹��� input�� ���� �־��ش�.
		
		if(num1 < num2) {//num1�� num2 ���� �۴ٸ� ����
			System.out.println(num1 + "��" + num2 + "���� �۽��ϴ�.");
		}
		else if(num1 > num2) {//num1�� num2 ���� ũ�ٸ� ����
			System.out.println(num1 + "��" + num2 + "���� Ů�ϴ�.");
			
		}
		else {//num1�� num2 �� ���ٸ� ����
			System.out.println(num1 +"��" + num2 +"�� ���� ���� �Դϴ�.");
		}

	}

}
