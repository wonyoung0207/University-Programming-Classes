package �ڹ�1������Ʈ;

public class �ڹ�1_11����_circle���� {

	public static void main(String[] args) {
		�ڹ�1_11��ġ_circle circle = new �ڹ�1_11��ġ_circle(5);
		
		circle.increaseByPercent(10);//10�ۼ�Ʈ��ŭ ���� �������� Ű��
		System.out.println(circle);
		System.out.println("���� ���� : " + circle.area());
		
		circle.decreaseByPercent(20);
		System.out.println(circle);
		System.out.println("���� ���� : " + circle.area());
		

	}

}
