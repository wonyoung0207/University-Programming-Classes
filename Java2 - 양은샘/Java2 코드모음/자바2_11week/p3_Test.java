package 자바2_11week;

public class p3_Test {

	public static void main(String[] args) {
		Thread ta = new p3_Job("a");
		ta.start();
		Thread tb = new p3_Job("b");
		tb.start();
		//스레드는 독립적으로 실행된다. -> main스레드 따로, ta 스레드 따로, tb 스레드 따로 실행됨 
		
	}

}
