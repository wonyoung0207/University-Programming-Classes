package 자바1프로젝트;
// 메소드 바로 종료시키고 싶으면 return 하면 된다. -> void 같은 경우에는 반환값이 없어도 된다.
// 반환형이 void 일 경우, return 하지 않아도 된다.

public class 자바1_10주차_Television {
	int channel; 	// 채널 번호
	int volume; 	// 볼륨 
	boolean onOff; 	// 전원 상태
	String system_onoff;
	
	
	void print() {//메소드(동작) 생성 -> 반환형이 void이기 때문에 return 하지 않아도 된다. 
		if (onOff == true){
			system_onoff = "on";
		}
		else {
			system_onoff = "off";
		}
		System.out.println("텔레비전의 전원상태는 " + system_onoff + " 입니다. ");
		System.out.println("채널은 " + channel + 
			"이고 볼륨은 " + volume + "입니다.");
	}
	int getChennel() {
		return channel;//반환형이 int이기 때문에 return값이 int형이여야 한다.
	}
	int add(int channel, int volume) {//채널과 볼륨 더해서 리턴해주는 것
		return channel + volume;
	}
	void setchannel(int ch) {
		channel = ch;
	}
}


