package �ڹ�2_11week;

public class p6_Job extends Thread{
	
	private String name;
	private int num=0;
	
	public p6_Job(String name) {
		this.name = name;		
	}
	
	public synchronized int getNum() {	
		return ++this.num;
	}
	
	public void run() {
		try {
			for(int i=0; i< 10; i++) {
				Thread.sleep(500);//0.5�ʰ� ���� -> ������ ���鼭 0.5�� �������� t1�� t2�� num�� ������ų���� 
				int num = getNum();
				if(num > 10) {
					break;
				}
				System.out.println(this.name + " : " + num);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
