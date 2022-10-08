package 자바1프로젝트;

public class 자바1_10주차_Television클래스 {
	public static void main(String[] args) {
		자바1_10주차_Television myTv = new 자바1_10주차_Television(); 	
		myTv.channel = 7;	
		myTv.volume = 9;
		myTv.onOff = true;		
		myTv.print();//메소드를 호출
		int ch = myTv.getChennel();//반환형이 int이기 때문에 
		System.out.println("현재 채널은 "+ ch + "입니다.");//채널 출력하는 메소드 호출
		int sum = myTv.add(myTv.channel,myTv.volume);
		System.out.println("채널과 볼륨의 합은 "+ sum + "입니다.");
		System.out.println();
		
		자바1_10주차_Television yourTv = new 자바1_10주차_Television();//새로운 객체 생성
		yourTv.channel = 9;	
		yourTv.volume = 12;	
		yourTv.onOff = true;
		yourTv.print();//메소드 호출
		System.out.println();
		yourTv.setchannel(123);//9에서 123채널로 변경
		yourTv.print();//변경된 채널이 출력
		
	
	}


}



