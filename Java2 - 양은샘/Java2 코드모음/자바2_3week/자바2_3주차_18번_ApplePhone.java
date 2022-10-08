package 자바2_3week;

class 자바2_3주차_18번_ApplePhone extends  자바2_3주차_18번_Phone {
	
	public 자바2_3주차_18번_ApplePhone() {
		super();
		
	}
	public 자바2_3주차_18번_ApplePhone(String w) {
		super(w);//this.who 로 사용 가능하지만 여기서는 안됨 . private라서 .
		
	}
	public void call(){//안드로이드는 girl이 사용, 오버라이딩
		System.out.println(super.getWho() + "영상통화,녹음 합니다. ");
		
	}
}
