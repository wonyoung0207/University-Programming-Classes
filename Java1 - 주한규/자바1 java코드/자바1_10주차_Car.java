package 자바1프로젝트;

public class 자바1_10주차_Car {
	String color = "red";
	int speed = 0;
	int gear = 0;
	
	public String toString() {//객체를 불러주면 자동으로 메소드가 실행된다. ->public 안쓰면 안됨
		return "Car : [ color: " + color + ", gear: " 
					+ gear + ",speed: " + speed + " ]";
		
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
