package �ڹ�2_5week;

import java.util.Random;

public class �ڹ�2_5����_�����н�12��_Stafe extends �ڹ�2_5����_�����н�12��_Person implements 
	�ڹ�2_5����_�����н�12��_IPin,�ڹ�2_5����_�����н�12��_IJob {
	
	private double pay;
	private static int order;
	
	public �ڹ�2_5����_�����н�12��_Stafe() {
		this(0);
	}
	public �ڹ�2_5����_�����н�12��_Stafe(double h) {//�ð��� ������ ���� 
		order++;//�ο��� ���� 
		this.pay = getPay(h);
		//int ���� String ������ ����, ������ ���� ������ ���� �߻��Ȱ����� �й��� ���� 
		super.num = Integer.toString(order) + Integer.toString(getPin()); 
	}
	
	
	public double getPay(double hour) {
		return 8000 * hour;
	}
	
	public int getPin() {//���� ���ڸ� ��ȣ ���� �� ���� 
		Random r = new Random();
		return r.nextInt(100);//100���� �� ���� �߻�
	}
	
	public String toString() {
		return "Stafe [pay : " + this.pay + ", num : " + super.num + "]";
	}
}
