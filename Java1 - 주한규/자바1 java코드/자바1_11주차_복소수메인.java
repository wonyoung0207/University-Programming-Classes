package �ڹ�1������Ʈ;

public class �ڹ�1_11����_���Ҽ����� {

	public static void main(String[] args) {
		�ڹ�1_11����_���Ҽ� c1 = new �ڹ�1_11����_���Ҽ�();
		�ڹ�1_11����_���Ҽ� c2 = new �ڹ�1_11����_���Ҽ�();
		
		c1.real = 2; c1.imagine = 3;
		
		c2.real = 3; c2.imagine = 4;
		
		�ڹ�1_11����_���Ҽ� c3 = c1.add(c2);
		System.out.println(c3.real + c3.imagine + "i");

	}

}
