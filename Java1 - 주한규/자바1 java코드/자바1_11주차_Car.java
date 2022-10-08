package 자바1프로젝트;


public class 자바1_11주차_Car {
	int gear;
	double speed;
	String color;

	
	자바1_11주차_Car(){//생성자
		gear = 1;
		speed = 10.4;
		color = "blue";
	}
	
	public String toString() {//객체를 불러주면 자동으로 메소드가 실행된다. 
		System.out.println("차 색상: " + color);
		System.out.println("기어: " + gear);
		System.out.println("속도: " + speed);
		
		return "---------------------";
	}
		
	void changeGear(int g) {
		gear = g;
	}
	void speedup() {
		speed = speed + 10;
	}
	void speeddown() {
		speed = speed - 10;
	}
}
