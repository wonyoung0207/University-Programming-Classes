package 자바2_5week;

import java.util.Random;

public class 자바2_5주차_응용학습12번_Student extends 자바2_5주차_응용학습12번_Person implements 
	자바2_5주차_응용학습12번_IJob,자바2_5주차_응용학습12번_IPin{
	
	private int enter;
	private double pay;
	
	자바2_5주차_응용학습12번_Student(){
		this(0,0);
	}
	
	자바2_5주차_응용학습12번_Student(int e,double h){
		this.enter = e;//입학년도 
		this.pay = getPay(h);
		super.num = Integer.toString(this.enter) + Integer.toString(getPin()); 
	}
	
	public double getPay(double hour) {
		return 7000 * hour;
	}
	
	public int getPin() {//랜덤 두자리 번호 생성 후 리턴 
		Random r = new Random();
		return r.nextInt(100);//100까지 중 난수 발생
	}
	
	public String toString() {
		return "Student [enter : " + this.enter + ", pay : " + this.pay + "]";
	}

}
