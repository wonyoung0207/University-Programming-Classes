package �ڹ�2_5week;

import java.util.Random;

public class �ڹ�2_5����_�����н�12��_Student extends �ڹ�2_5����_�����н�12��_Person implements 
	�ڹ�2_5����_�����н�12��_IJob,�ڹ�2_5����_�����н�12��_IPin{
	
	private int enter;
	private double pay;
	
	�ڹ�2_5����_�����н�12��_Student(){
		this(0,0);
	}
	
	�ڹ�2_5����_�����н�12��_Student(int e,double h){
		this.enter = e;//���г⵵ 
		this.pay = getPay(h);
		super.num = Integer.toString(this.enter) + Integer.toString(getPin()); 
	}
	
	public double getPay(double hour) {
		return 7000 * hour;
	}
	
	public int getPin() {//���� ���ڸ� ��ȣ ���� �� ���� 
		Random r = new Random();
		return r.nextInt(100);//100���� �� ���� �߻�
	}
	
	public String toString() {
		return "Student [enter : " + this.enter + ", pay : " + this.pay + "]";
	}

}
