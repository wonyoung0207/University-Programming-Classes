package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�12��_Main {

	public static void main(String[] args) {
		�ڹ�2_5����_�����н�12��_Person[] p = new �ڹ�2_5����_�����н�12��_Person[6];
		p[0] = new �ڹ�2_5����_�����н�12��_Person();
		p[1] = new �ڹ�2_5����_�����н�12��_Person("Benny",20);
		p[2] = new �ڹ�2_5����_�����н�12��_Student();
		p[3] = new �ڹ�2_5����_�����н�12��_Student(2015,3);
		p[4] = new �ڹ�2_5����_�����н�12��_Stafe();
		p[5] = new �ڹ�2_5����_�����н�12��_Stafe(8);
		
		for(�ڹ�2_5����_�����н�12��_Person obj : p) {
			System.out.println(obj);
		} 
	}

}
