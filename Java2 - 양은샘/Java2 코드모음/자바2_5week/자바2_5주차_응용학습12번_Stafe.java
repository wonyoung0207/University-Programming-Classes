package 자바2_5week;

import java.util.Random;

public class 자바2_5주차_응용학습12번_Stafe extends 자바2_5주차_응용학습12번_Person implements 
	자바2_5주차_응용학습12번_IPin,자바2_5주차_응용학습12번_IJob {
	
	private double pay;
	private static int order;
	
	public 자바2_5주차_응용학습12번_Stafe() {
		this(0);
	}
	public 자바2_5주차_응용학습12번_Stafe(double h) {//시간을 변수로 받음 
		order++;//인원수 측정 
		this.pay = getPay(h);
		//int 형을 String 형으로 변경, 스태프 들어온 순서와 난수 발생된것으로 학번을 만듬 
		super.num = Integer.toString(order) + Integer.toString(getPin()); 
	}
	
	
	public double getPay(double hour) {
		return 8000 * hour;
	}
	
	public int getPin() {//랜덤 두자리 번호 생성 후 리턴 
		Random r = new Random();
		return r.nextInt(100);//100까지 중 난수 발생
	}
	
	public String toString() {
		return "Stafe [pay : " + this.pay + ", num : " + super.num + "]";
	}
}
