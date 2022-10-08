package 자바1프로젝트;
// 클래스 멤버 = 정적 멤버 + 인스턴스 멤버
// 정적멤버(static) = 정적변수 + 정적 메소드 
// 인스턴스 멤버(heap) = 각 인스턴스(객체)가 저장되는 공간 

// 정적 메소드는 인스턴스 생성하지 않고 바로 사용할 수 있다는 장점이 있다. 
// 정적멤버(static) : 클래스에 고정된 멤버로, 모든 객체가 이 값을 공유한다. -> 모든 객체가 접근 가능하다.
// static 안쓰면 객체생성하고 사용해야 하지만, static 써주면 모든 객체에서 공유됨으로 그냥 가져다 사용할 수 있다. 
// static에는 this 사용 못함 

public class 자바1_13주차_정적변수_메소드 {
	private String model;
	private String color;
	private int speed;
	
	private int id;//자동자가 몇대인지 
	private static int numbers = 0;//정적변수 생성
	static String test = "12";
	static int[] arr = {1,2,3};
	
	
	
	static String gettest() {//정적메소드 확인해보기 
		return "34";
	}
	
	public 자바1_13주차_정적변수_메소드(String m, String c, int s) {//생성자를 만들어준다. 
		model = m;
		color = c;
		speed = s;
		
//밑에 풀이도 가능 
//		this.model = m;
//		this.color = c;
//		this.speed = s;
		
		numbers++;
//		id = ++numbers;//자동차의 댓수를 증가 
	}
	public static int getNumberOfCars() {//정적메소드
		return numbers;
	}
	
	public String getCarOption() {
		return " 모델명:"+ model + " 색상: " + color + "속도: "+ speed;
		
	}
	

}
