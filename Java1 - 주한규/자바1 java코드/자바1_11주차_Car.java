package �ڹ�1������Ʈ;


public class �ڹ�1_11����_Car {
	int gear;
	double speed;
	String color;

	
	�ڹ�1_11����_Car(){//������
		gear = 1;
		speed = 10.4;
		color = "blue";
	}
	
	public String toString() {//��ü�� �ҷ��ָ� �ڵ����� �޼ҵ尡 ����ȴ�. 
		System.out.println("�� ����: " + color);
		System.out.println("���: " + gear);
		System.out.println("�ӵ�: " + speed);
		
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
