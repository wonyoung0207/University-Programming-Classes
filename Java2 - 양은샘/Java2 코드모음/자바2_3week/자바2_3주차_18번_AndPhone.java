package 자바2_3week;

class 자바2_3주차_18번_AndPhone extends 자바2_3주차_18번_Phone {
	public 자바2_3주차_18번_AndPhone() {
		super();
		
	}
	public 자바2_3주차_18번_AndPhone(String w) {
		super(w);
		
	}
	
//오버라이딩을 해주면 됨 
	public void call(){//안드로이드는 girl이 사용, 오버라이딩
		System.out.println(super.getWho() + "영상통화를 합니다. ");
		
	}

}
