package 자바1프로젝트;
//복소수 연산하게 해주는 클래스


public class 자바1_13주차_복소수 {
	private double real; //실수
	private double imagine;//허수
	
	public 자바1_13주차_복소수() {//생성자1
		setReal(0.0);
		setImaginary(0.0);
	}
	
	public 자바1_13주차_복소수(double r) {//생성자2
		setReal(r);
		setImaginary(0.0);
	}
	
	public 자바1_13주차_복소수(double r, double i) {//생성자3
		setReal(r);
		setImaginary(i);
	}
	
	public String toString () {
		return getReal() + " + " + getImaginary() + "i";
	}

	public void setReal(double r) {
		real = r;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setImaginary(double i) {
		imagine = i;
	}
	
	public double getImaginary() {
		return imagine;
	}
	
	public 자바1_13주차_복소수 add(자바1_13주차_복소수 o) {//덧셈 해주는 함수
		자바1_13주차_복소수 a = new 자바1_13주차_복소수(0,0);
		
		a.real = real + o.real;//실수계산
		a.imagine = imagine + o.imagine;//허수계산
		return a;
		
	}
	
	public 자바1_13주차_복소수 mul(자바1_13주차_복소수 o) {//복소수 곱셈 해주는 함수
		자바1_13주차_복소수 a = new 자바1_13주차_복소수(0,0);
		
		a.real = (real * o.real) - (imagine * o.imagine);//실수계산
		a.imagine = (real * o.imagine) + (imagine * o.real);//허수계산
		return a;
		
	}
	
	public boolean equals(자바1_13주차_복소수 o) {//두개의 복소수가 같다면 true리턴
		if (real == o.real && imagine == o.imagine) {
			return true;
		}else {
			return false;
		}

	}

}
