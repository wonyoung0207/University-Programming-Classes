package 자바2_3week;

public class 자바2_3주차_19번_Cat extends 자바2_3주차_19번_Animal{
	
	public String toString() {
		return getName() + "고양이";
	}
	public 자바2_3주차_19번_Cat()	{
		this("Anonymous");
	}
	public 자바2_3주차_19번_Cat(String cat_name)	{
		setName(cat_name);//super(cat_name) // 이것도 가능 
	}
	public void sound() {//오버라이딩 -> 상위클래스와 타입과 매개변수 같아야함. 
		System.out.print(" 야~옹");		
	}

}
