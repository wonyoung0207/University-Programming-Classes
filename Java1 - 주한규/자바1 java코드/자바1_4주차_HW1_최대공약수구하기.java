package �ڹ�1������Ʈ;
import java.util.*;
//�� ���� �Է¹޾� �ִ����� ���ϱ� 


public class �ڹ�1_4����_HW1_�ִ��������ϱ� {

	public static void main(String[] args) {
		
		int x, y;
		int num, cnt;
		int min=0, max=0;
		
		num = 0;
		cnt = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������)");
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("ū��: "+ x + "  ������: " + y);
		
//		for(int i=2; i <=x && i<=y; i++) {
//			if(x%i == 0 && y%i == 0) {
//				min = i;
//				
//			}
//		}
//		max = x*y/min;
//		System.out.println("�ּҰ���� : "+ max);
//		System.out.println("�ִ����� : "+ min);
//		
		int j = 2;
		while(j<=x && j<=y) {
			if(x%j ==0 && y%j == 0) {
				min = j;
				
			}
			j++;
			
		}
		
		max = x*y/min;
		System.out.println("�ּҰ���� : "+ max);
		System.out.println("�ִ����� : "+ min);
//		
//		
//		while(y != 0) {
//			num = x % y;//48%36 = 
//			System.out.println(cnt + "��° ������: " + num);
//			cnt++;
//			x = y;
//			y = num;
//		}
//		System.out.println("�� ���� �ִ����� : "  + x);

	}

}
