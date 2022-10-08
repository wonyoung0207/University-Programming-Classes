package ÀÚ¹Ù2_11week;

public class p3_Job extends Thread{
	private String name;
	
	public p3_Job(String name) {
		this.name = name;
	}
	
	public void run(){
		int n = 0;
		while(true) {
			System.out.println(this.name + (n++));
			if(n > 10) break; 
		}
	}

}
