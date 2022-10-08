package 자바2_11week;

public class p5_Test {
	private int count = 1;
	
	public synchronized void sub(String n) {//임계영역때문에 먼저시작된 t1의 실행이 끝나야 t2가 실행된다. 
		for(int i = 0; i < 10; i++) {
			System.out.println(n + ", " + count++);
		}
	}

	public static void main(String[] args) {
		p5_Test test = new p5_Test();
		Thread t1 = new p5_A(test,"t1");
		Thread t2 = new p5_A(test,"t2");
		t1.start();//거의 동시에 start 되지만, sub 메소드의 실행은 임계영역으로 인해 t1이 끝나야 t2가 실행됨
		t2.start();
		
		
	}

}
