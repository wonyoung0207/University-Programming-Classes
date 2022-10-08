package 자바1프로젝트;

public class 자바1_11주차_Rectangle {
	double width=0;
	double height=0;
	
	public String toString() {//객체를 불러주면 자동으로 메소드가 실행된다. 
		
		return "넓이: " + area(width, height) + "  둘레: " + 
				perimeter(width, height);

	}
	static double area(double width, double height) {//사각형의 넓이 반환
		return width*height;
	}
	static double perimeter(double width, double height) {//사각형의 둘래길이 반환
		return (2*width)+(2*height);
	}
	void modify(double w, double h) {//매개변수로 넓이와 높이 변경
		width = w;
		height = h;
	}
	void modifyRatio(double r) {//매개변수 비율만큼 넓이와 높이 변경
		width = width*r;
		height = height*r;
	}

}
