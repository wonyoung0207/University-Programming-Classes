package �ڹ�1������Ʈ;
import java.util.*;


public class �ڹ�1_4����_HW2_star�ݺ� {

	public static void main(String[] args) {
		
		int i,j,num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ����� �ݺ���Ű�ڽ��ϱ�? :");
		num = input.nextInt();
		
		i = num;
		while(i > 0) {
			j=1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
