package 자바2_5week;

public class 자바2_5주차_응용학습9번_Person implements 자바2_5주차_응용학습9번_IComparable{
	private String name;
	private double height;
	
	public String toString() {//sysout 에서 person형태로 생성된 객체를 부를경우 호출됨 
		return "Person [name = " + this.name + ", height = " + this.height + "]";
	}
	
	public 자바2_5주차_응용학습9번_Person() {
		this("anonymous", 0);
		//디폴트 생성자로 값이 오면 밑에있는 매개변수 2개짜리 생성자로 갈 수 있도록 호출 
	}
	
	public 자바2_5주차_응용학습9번_Person(String name, double height) {
		this.height = height;
		this.name = name;
	}
	
	public int compareTo(Object other) {
		//Object는 가장 상위 객체로, 어떤 객체가 들어올지 모를때 사용한다. 
		// 따라서 들어온 other의 형태를 임시로 비교할 height의 타입으로 변경해 줘야 한다. 
		// 이때 괄호를 " ((타입)변경할 객체).필드 "의 형식으로 작성해 줘야 한다. 
		if(this.height > ((자바2_5주차_응용학습9번_Person)other).height) {
			return 1;
		}
		else if(this.height == ((자바2_5주차_응용학습9번_Person)other).height) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
