package �ڹ�2_11week;

public class p5_Test {
	private int count = 1;
	
	public synchronized void sub(String n) {//�Ӱ迵�������� �������۵� t1�� ������ ������ t2�� ����ȴ�. 
		for(int i = 0; i < 10; i++) {
			System.out.println(n + ", " + count++);
		}
	}

	public static void main(String[] args) {
		p5_Test test = new p5_Test();
		Thread t1 = new p5_A(test,"t1");
		Thread t2 = new p5_A(test,"t2");
		t1.start();//���� ���ÿ� start ������, sub �޼ҵ��� ������ �Ӱ迵������ ���� t1�� ������ t2�� �����
		t2.start();
		
		
	}

}
