package �ڹ�1������Ʈ;
// ���Ҽ��� ����, ����, �� ���ִ� Ŭ���� 


public class �ڹ�1_13����_���Ҽ�_���� {

	public static void main(String[] args) {
		
		�ڹ�1_13����_���Ҽ� c1 = new �ڹ�1_13����_���Ҽ�(3.0, 2.0);
		�ڹ�1_13����_���Ҽ� c2 = new �ڹ�1_13����_���Ҽ�(1.0, 7.0);
		�ڹ�1_13����_���Ҽ� r1 = c1.add(c2);
		�ڹ�1_13����_���Ҽ� r2 = c1.mul(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(r1);
		System.out.println(r2);
		
		�ڹ�1_13����_���Ҽ� c3 = new �ڹ�1_13����_���Ҽ�(3.0, 2.0);
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c3));
		

	}

}
