package �ڹ�1������Ʈ;
import java.util.*;
//�л����� ���� �Է¹޾� ��� ���ϱ�

public class �ڹ�1_4����_HW3_�Է¹޾���ձ��ϱ� {

	public static void main(String[] args) {
		
		int score, sum, i,student_num;
		double avg;
		
		System.out.print("�л����� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		student_num = sc.nextInt();
		
		sum = 0;
		i=1;
		
		while(i <= student_num) {
			System.out.print(i + "��° �л��� ������ �Է��ϼ��� : ");
			score = sc.nextInt();
			sum = sum + score;
			i++;
		}
		avg = (double)sum / (double)student_num;
		System.out.print("��� : " + avg);
	}

}
