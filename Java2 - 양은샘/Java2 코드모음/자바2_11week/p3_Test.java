package �ڹ�2_11week;

public class p3_Test {

	public static void main(String[] args) {
		Thread ta = new p3_Job("a");
		ta.start();
		Thread tb = new p3_Job("b");
		tb.start();
		//������� ���������� ����ȴ�. -> main������ ����, ta ������ ����, tb ������ ���� ����� 
		
	}

}
