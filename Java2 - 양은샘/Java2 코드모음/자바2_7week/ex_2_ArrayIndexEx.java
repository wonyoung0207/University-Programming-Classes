package �ڹ�2_7week;

public class ex_2_ArrayIndexEx {

	public static void main(String[] args) {
		int[] array = new int[2];
		
		try {
			//int a = array[3];
			int b = array[0];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� Ȯ���ؼ� ��� ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
