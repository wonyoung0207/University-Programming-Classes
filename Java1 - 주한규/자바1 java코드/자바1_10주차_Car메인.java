package �ڹ�1������Ʈ;

public class �ڹ�1_10����_Car���� {

	public static void main(String[] args) {
		�ڹ�1_10����_Car mycar = new �ڹ�1_10����_Car();
		mycar.changeGear(10);
		mycar.speedup();
		mycar.speedup();
		System.out.println(mycar);//��ü�� ���ָ� �ڵ����� tostring �޼ҵ尡 ����ȴ�. 
		
		mycar.speeddown();
		System.out.println("�ӵ� ������ mycar-> "+mycar);

	}

}
