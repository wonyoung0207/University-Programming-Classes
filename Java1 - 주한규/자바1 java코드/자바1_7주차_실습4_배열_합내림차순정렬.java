package �ڹ�1������Ʈ;
import java.util.*;

public class �ڹ�1_7����_�ǽ�4_�迭_�ճ����������� {

	public static void main(String[] args) {
		int [][] stu = {//�й�,�߰�,�⸻,��
				{2015,90,80,160},
				{2016,75,60,135},
				{2017,85,100,185}
		};
		
		int size=0;
		int[][] temp = new int[100][4];
		int max;
		
		Scanner input = new Scanner(System.in);
		System.out.println("����� �Է��Ͻðڽ��ϱ�? -> ������ 3 ");
		size = input.nextInt();
		
/////////////////////�������ִ� ��//////////////////////////////
///////////////////////////////////////////////////////////
		for(int i=0; i <size; i++) {
			max = i;
			for(int j=i+1; j < size-1; j++) {
				if(stu[j][3] > stu[max][3]) {
					max = j;
				}
			}
			for(int k =0; k< size; k++) {
				for(int q=0; q<stu[k].length; q++) {
					temp[k][q] = stu[k][q];
					stu[k][q] = stu[max][q];
					stu[max][q] = temp[k][q];
				}
			}
//			temp = stu[i];
//			stu[i] = stu[max];
//			stu[max] = temp;
//			System.out.println( i +"��° ū �迭 : " + stu[i]);
		}
		
////////////////��� ���ϴ� ��//////////////////////////////////
/////////////////////////////////////////////////////////
		int mid = 0;//�߰����� �� ���Ѱ�
		int fin = 0;//�⸻���� �� ���Ѱ�
		double midavg,finavg;
		
		for(int i = 0; i < size; i++) {

			mid = mid + stu[i][1];
			fin = fin + stu[i][2];
		}
		midavg = (double)mid / size;
		finavg = (double)fin / size;
		
		
////////////////////��� ���ϴ°�////////////////////////////
/////////////////////////////////////////////////
		int num = 0;
		System.out.print("����� ã����� �й��� �Է��ϼ��� : -1�Է½� ����");
		num = input.nextInt();
		
		while(num > 0) {
			int rank = 0;
			for(int i = 0; i<size;i++) {
				if(stu[i][0] == num) {
					rank = i;
				}
			}
			if(stu[rank][0] == num) {
				System.out.println(num + "�� ����� " + (rank+1) + "�� �Դϴ�.");
			}
			else {
				System.out.println("�й��� �߸� �Էµƽ��ϴ�. ");
			}
			System.out.print("����� ã����� �й��� �Է��ϼ��� : -1�Է½� ����");
			num = input.nextInt();
			
		}
		
		
///////////////////////��ü �迭 ���///////////
////////////////////////////////////////////////
		for(int i = 0; i < size; i++) {
			System.out.print(i+"������ : ");
			for(int j = 0; j < stu[i].length; j++) {
				System.out.print(" "+stu[i][j]);
			}
			System.out.println("");
		}

	}

}
