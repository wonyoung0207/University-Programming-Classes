package 자바2_11week;

public class p2_Test {

	public static void main(String[] args) {
		Thread t = new p2_Job();
		//p2_Job t = new p2_Job();// 이것도 가능
		t.start();

	}

}
