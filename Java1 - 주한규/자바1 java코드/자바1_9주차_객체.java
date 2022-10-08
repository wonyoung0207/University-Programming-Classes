package 자바1프로젝트;
//클래스 = 값을 가져야 된다고 하는것
//객체 = 자기값을 가지는 것
//Person p = new person() -> person이라는 클래스 이용해서 p라는 객체 생성
//Person클래스는 id 와 name을 가질 수 있다. -> p라는 객체는 id와 name을 가질 수 있다.

//프로그램은 main 매소드에서 시작된다. Television의 클래스로 객체를 만든다,
//Tv가 television의 주소를 가지고있다.

//tv라는 객체 생성하면 자신만의 메모리를 같게된다.
//객체는 클래스의 필드값을 가질 수 있다. -> 자기 자신만에 메모리에 필드값을 저장한다.

public class 자바1_9주차_객체 {

	public static void main(String[] args) {
		자바1_9주차_클래스 tv = new 자바1_9주차_클래스();//자기 자신만의 메모리에 클래스의 필드값들을 이용할 수 있다.
		tv.channel = 5;
		tv.volume = 5;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은 "+ tv.channel + "이고 볼륨은 " + tv.volume + "입니다.");
		
		자바1_9주차_클래스 mytv = new 자바1_9주차_클래스();
		mytv.channel = 10;
//		mytv.volume = 10;
//		mytv.onOff = true;
//		
		System.out.println("텔레비전의 채널은 " + mytv.channel + "이고 볼륨은 " + mytv.volume + "입니다.");

	}

}
