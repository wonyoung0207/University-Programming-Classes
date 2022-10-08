package ÀÚ¹Ù2_11week;

public class p1_Job implements Runnable{
	public void run() {
		int n = 0;
		while(true) {
			System.out.println("" + n++);
			if(n > 100) break;
		}
	}

}
