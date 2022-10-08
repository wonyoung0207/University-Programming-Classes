package �ڹ�2_7week;

import java.lang.reflect.Array;

public class ex_13_TryCatchFinallyEx {

	public static void main(String[] args) {
		String[] strArray = {"10","2a"};
		int value = 0;
		for(int i = 0; i <= 2 ; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ��Ͽ����ϴ�.");
			}
			catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
			}
			finally {
				System.out.println(value);
			}
		}
	}
}
