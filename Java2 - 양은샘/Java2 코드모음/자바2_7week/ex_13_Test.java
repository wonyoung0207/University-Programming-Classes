package �ڹ�2_7week;

import java.lang.reflect.Array;

public class ex_13_Test {

	public static void main(String[] args) {
		try {
			sub();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���ܹ߻� ");
		}catch(Exception e) {
			System.out.println("�ٸ����� : " + e.getMessage());
		}

	}
	
//	public static void sub() {
//		int[] array = new int[10];
//		int i = array[10];
//	}
	
	public static void sub() throws ArrayIndexOutOfBoundsException{//try catch �Ⱦ��� ��� ����ϴ��� 
		int[] array = new int[10];
		int i = array[10];
	}

}
