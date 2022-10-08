package 자바1프로젝트;

public class 자바1_11주치_circle {
	private double radius;
	
	자바1_11주치_circle(int r){
		radius = r;
	}
	
	double area() {
		
		return 3.14 * radius * radius;	//원의 면적 = 2 * pi * R
	}
	
	void increaseByPercent(double p) {//원의 반지름 크기를 퍼센트만큼 키우는 메소드
		radius = radius + (radius * p * 0.01);
		System.out.println("반지름 증가: " + radius);
	}
	void decreaseByPercent(double p) {//원의 반지름 크기를 퍼센트만큼 줄이는 메소드
		radius = radius - (radius * p * 0.01);
		System.out.println("반지름 감소: " + radius);
	}
	
	public String toString() {
		return ("Circle, radius: "
				+ radius);
	}

}
