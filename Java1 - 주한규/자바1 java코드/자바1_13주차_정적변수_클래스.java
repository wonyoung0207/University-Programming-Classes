package �ڹ�1������Ʈ;

public class �ڹ�1_13����_��������_Ŭ���� {

	public static void main(String[] args) {
		//�������� ���¿� ���� �����
		�ڹ�1_13����_��������_�޼ҵ� car1 = new �ڹ�1_13����_��������_�޼ҵ�("s600","white",80);
		�ڹ�1_13����_��������_�޼ҵ� car2= new �ڹ�1_13����_��������_�޼ҵ�("x1000","blue",100);
		
		System.out.println(car1.getCarOption());

		System.out.println(car2.getCarOption());

		int n = �ڹ�1_13����_��������_�޼ҵ�.getNumberOfCars();//�������� number �� ���
		System.out.println("���ݱ��� ������ ���� ������ " + n + "�� �Դϴ�. ");
//		System.out.println(car1.getNumberOfCars());// -> �� ��ü������ ���� ���� 
		
		System.out.println(�ڹ�1_13����_��������_�޼ҵ�.test);
		System.out.println(�ڹ�1_13����_��������_�޼ҵ�.gettest());
		
		for(int i = 0; i < �ڹ�1_13����_��������_�޼ҵ�.arr.length; i++) {
			System.out.println(�ڹ�1_13����_��������_�޼ҵ�.arr[i]);
		}
		
		for(int i = �ڹ�1_13����_��������_�޼ҵ�.arr.length-1; i >= 0; i--) {
			System.out.println(�ڹ�1_13����_��������_�޼ҵ�.arr[i]);
		}
		

	}

}
