package 자바2_3week;

public abstract class 자바2_3주차_19번_Animal {
	private String name;
	
	public String reaction(자바2_3주차_19번_Animal cat_dog) {//다형성 이용
		//cat_dog 객체가 "자바2_3주차_19번_Cat" 안에서 생성된 객체니?
		if (cat_dog instanceof 자바2_3주차_19번_Cat) {//매개변수로 온 객체가 Cat클래스의 객체라면 실행
			return "꼬리내리고";			
		}
		else {//매개변수로 온 객체가 Dog클래스의 객체라면 실행
			return "꼬리올리고";
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}


	
	//추상 메소드는 내용을 정의하지 않는다. 하위클래스에서 구현할것이기 때문에
	public abstract void sound();
	
}
