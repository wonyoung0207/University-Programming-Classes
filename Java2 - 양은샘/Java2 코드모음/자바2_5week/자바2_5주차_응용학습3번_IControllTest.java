package 자바2_5week;

public class 자바2_5주차_응용학습3번_IControllTest {//원래는 여기다가 implements 해줘야함 

	public static void main(String[] args) {
		//인터페이스를 무명 클래스로 구현 
		자바2_5주차_응용학습3번_IControll ic = new 자바2_5주차_응용학습3번_IControll() {//인터페이스는 객체 못만듬 근데 무명클래스형식으로 만들어서 가능한거임 
			public void play() {//추상메소드를 구현  
				System.out.println("PLAY");
			}
			public void stop() {
				System.out.println("STOP");
			}
		};//끝에 끝난다는 ; 꼭 사용해야함 
		
		ic.play();
		ic.stop();

	}

}
