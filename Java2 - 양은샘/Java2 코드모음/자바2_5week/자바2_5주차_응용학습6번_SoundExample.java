package 자바2_5week;

public class 자바2_5주차_응용학습6번_SoundExample {

	//객체생성 없이 불러야 하기 때문에 
	public static void printSound(자바2_5주차_응용학습6번_ISound is) {//정적 메소드로 변경해 줘야함 
		System.out.println(is.sound());
	}

	public static void main(String[] args) {
		자바2_5주차_응용학습6번_ISound is = null;//여기를 각각 Cat과 Dog 로해도 결과는 같다. 
		
		//인터페이스는 객체를 직접적으로 생성할 수 없기 떄문에 클래스 이용해서 객체 생성해야한다. 
		is = new 자바2_5주차_응용학습6번_Dog();//dog 형식으로 객체 생성 
		printSound(is);

		is = new 자바2_5주차_응용학습6번_Cat();
		printSound(is);

	}

}
