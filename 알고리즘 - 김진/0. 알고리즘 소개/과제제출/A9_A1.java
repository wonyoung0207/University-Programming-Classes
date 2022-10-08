package 알고리즘_1week;

public class A9_A1 {
	private int a = 100;
	private int b = 200;
	private int sum = 0;
	private int avg = 0;
	
	
	int getSum() {
		this.sum = a + b;
		return sum;
	}
	
	int getAvg() {
		this.avg = sum / 2;
		return avg;
	}
	

}
