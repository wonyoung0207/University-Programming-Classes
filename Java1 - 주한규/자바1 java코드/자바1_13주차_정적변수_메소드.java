package �ڹ�1������Ʈ;
// Ŭ���� ��� = ���� ��� + �ν��Ͻ� ���
// �������(static) = �������� + ���� �޼ҵ� 
// �ν��Ͻ� ���(heap) = �� �ν��Ͻ�(��ü)�� ����Ǵ� ���� 

// ���� �޼ҵ�� �ν��Ͻ� �������� �ʰ� �ٷ� ����� �� �ִٴ� ������ �ִ�. 
// �������(static) : Ŭ������ ������ �����, ��� ��ü�� �� ���� �����Ѵ�. -> ��� ��ü�� ���� �����ϴ�.
// static �Ⱦ��� ��ü�����ϰ� ����ؾ� ������, static ���ָ� ��� ��ü���� ���������� �׳� ������ ����� �� �ִ�. 
// static���� this ��� ���� 

public class �ڹ�1_13����_��������_�޼ҵ� {
	private String model;
	private String color;
	private int speed;
	
	private int id;//�ڵ��ڰ� ������� 
	private static int numbers = 0;//�������� ����
	static String test = "12";
	static int[] arr = {1,2,3};
	
	
	
	static String gettest() {//�����޼ҵ� Ȯ���غ��� 
		return "34";
	}
	
	public �ڹ�1_13����_��������_�޼ҵ�(String m, String c, int s) {//�����ڸ� ������ش�. 
		model = m;
		color = c;
		speed = s;
		
//�ؿ� Ǯ�̵� ���� 
//		this.model = m;
//		this.color = c;
//		this.speed = s;
		
		numbers++;
//		id = ++numbers;//�ڵ����� ����� ���� 
	}
	public static int getNumberOfCars() {//�����޼ҵ�
		return numbers;
	}
	
	public String getCarOption() {
		return " �𵨸�:"+ model + " ����: " + color + "�ӵ�: "+ speed;
		
	}
	

}
