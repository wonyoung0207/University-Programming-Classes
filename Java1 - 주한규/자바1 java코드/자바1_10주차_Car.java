package �ڹ�1������Ʈ;

public class �ڹ�1_10����_Car {
	String color = "red";
	int speed = 0;
	int gear = 0;
	
	public String toString() {//��ü�� �ҷ��ָ� �ڵ����� �޼ҵ尡 ����ȴ�. ->public �Ⱦ��� �ȵ�
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
