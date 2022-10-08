package ÀÚ¹Ù2_11week;

public class p1_Test {

	public static void main(String[] args) {
		Thread t = new Thread(new p1_Job());
		t.start();

	}

}
