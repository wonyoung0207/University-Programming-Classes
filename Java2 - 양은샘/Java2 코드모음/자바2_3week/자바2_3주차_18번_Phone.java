package 자바2_3week;
//오버로딩 vs  오버라이딩
//오버라이딩 조건 : 부모 메소드의 형식과 동일해야 함.(매개변수 갯수, 리턴 타입, 순서, 이름)
// 오버로딩 : 새롭게 메소드를 정의하는 것 
// 오버라이딩 : 상속받은 기존의 부모 메소드를 재정의 하는것 

class 자바2_3주차_18번_Phone {
	private String who;


	public 자바2_3주차_18번_Phone() {//디폴트 생성자
		this("anonymous");
	}
	
	public 자바2_3주차_18번_Phone(String person) {//생람(person)을 매개변수로 받음 성자
		this.who = person;//사

	}
	
	public void call() {
		System.out.println(this.who + "통화를 합니다.");
	}

	public String getWho() {
		return this.who;
	}
	
}
