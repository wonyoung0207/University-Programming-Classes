package �ڹ�1������Ʈ;

public class �ڹ�1_11��ġ_circle {
	private double radius;
	
	�ڹ�1_11��ġ_circle(int r){
		radius = r;
	}
	
	double area() {
		
		return 3.14 * radius * radius;	//���� ���� = 2 * pi * R
	}
	
	void increaseByPercent(double p) {//���� ������ ũ�⸦ �ۼ�Ʈ��ŭ Ű��� �޼ҵ�
		radius = radius + (radius * p * 0.01);
		System.out.println("������ ����: " + radius);
	}
	void decreaseByPercent(double p) {//���� ������ ũ�⸦ �ۼ�Ʈ��ŭ ���̴� �޼ҵ�
		radius = radius - (radius * p * 0.01);
		System.out.println("������ ����: " + radius);
	}
	
	public String toString() {
		return ("Circle, radius: "
				+ radius);
	}

}
