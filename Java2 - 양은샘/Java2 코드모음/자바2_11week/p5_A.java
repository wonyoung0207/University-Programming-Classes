package 切郊2_11week;

public class p5_A extends Thread{
	p5_Test demo;
	String name;
	
	public p5_A(p5_Test td, String name) {//持失切
		this.demo = td;
		this.name = name;
	}
	
	public void run() {
		demo.sub(name);
	}

}
