package �ڹ�1������Ʈ;
import java.util.*;

public class �ڹ�1_6����_�迭�̿�_���_����_�ְ�������� {
	
	public static double mean(int[] score,int size) {//��� ���ϴ� �޼ҵ�
		double avg = 0;
		int total = 0;
		
		for(int i = 0; i < size; i++) {
			total = total + score[i];
		}
		avg = (double)total / size;//��ձ��ؼ� ����
		return avg;
	}
	
	public static void swap(int[]arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
//		temp = score[k];//�ε��� 0������ ����
//		score[k] = score[max];//������ ũ�� ������ �ε���0����, ũ�� �ʴٸ� �״�� ���ּ� �ε���0�� �� ū������
//		score[max] = temp;//������ ũ�� �ε���1�� ������(�ε���0) ����, ������ ������ ��ġ �ٲ��� �ʰ�
	}
	
	public static void main(String[] args) {
		int[] score = new int[100];
		int size = 0;
		int num = 0;	
		int max = 0;
		int min = 0;
		int temp = 0;

		System.out.print("������ �Է��ϼ���...(-1�� �Է��ϸ� �Է�����): ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
///////////////////////////////////////////////////////////////////////
///////////���� �Է� �޴� ��//////////////////////////////////////////////
		while(num >= 0) {
			score[size] = num;
			size++;
			System.out.print("������ �Է��ϼ���...(-1�� �Է��ϸ� �Է�����): ");
			num = input.nextInt();
		}
		System.out.print("���� : ");
		for(int j = 0; j < size; j++) {
		System.out.print(" " + score[j]);
		}
		System.out.println("");
///////////////////////////////////////////////////////////////////////
///////////�迭 ���ġ �ϴ� ��//////////////////////////////////////////////
		
		for(int k = 0; k < size-1; k++) {
			max = k;
			for(int p = k+1; p < size; p++) {
				if(score[p] >= score[max]) {
					max = p;
				}
			}swap(score,k,max);
		}
		
		System.out.print("�迭 ���ġ ���");
		for(int e = 0; e < size; e++) {
		System.out.print(" "+score[e]);
		}
		System.out.println("");

		System.out.println("�迭�� ��� : " + mean(score,size));
		System.out.print("�ְ����� : " + score[0] + " , " + "�������� : " + score[size-1]);
		System.out.println("");
		
///////////////////////////////////////////////////////////////////////
///////////��� ã�°�//////////////////////////////////////////////
		
		System.out.print("����� �˰���� ������ �Է��ϼ���...(-1�� �Է��ϸ� �Է�����): ");
		num = input.nextInt();
		
		while(num >= 0) {
			int key = 0;
			for(int q = 0; q < size-1; q++) {
				if(score[q] == num) {
					key = q;
				}
			}
			if(score[key] == num) {
				System.out.println("ã�� ������ " + (key+1) + "�� �Դϴ�.");
			}
			else {
				System.out.println("ã�� ������ �������� �ʽ��ϴ�. ");
			}
			System.out.print("����� �˰���� ������ �Է��ϼ���...(-1�� �Է��ϸ� �Է�����): ");
			num = input.nextInt();
		}
	}
}
