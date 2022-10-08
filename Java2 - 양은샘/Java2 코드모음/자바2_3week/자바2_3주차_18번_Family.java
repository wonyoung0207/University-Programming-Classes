package 자바2_3week;

class 자바2_3주차_18번_Family {
	
	자바2_3주차_18번_Phone [] p = {
			new 자바2_3주차_18번_Phone("dad"),
			new 자바2_3주차_18번_Phone("mom"),
			new 자바2_3주차_18번_Phone("boy"),
			new 자바2_3주차_18번_Phone("girl")
			};

	public void operation()	{
		for(자바2_3주차_18번_Phone obj : p) {
			obj.call();
		}
		
	}
	
	public boolean change(String peple, String device) {
		System.out.println(peple + "의 핸드폰을 교환합니다.");
		boolean success = false;
		for(int i = 0; i < p.length;i++) {
			//이름이 맞는지 확인.
			if(p[i].getWho().equals(peple)) {
				switch(device) {
				case "applephone" : 
					p[i] = new 자바2_3주차_18번_ApplePhone(peple);//자식객체로 형변환
					success = true;
					break;
				case "andphone" : 
					p[i] = new 자바2_3주차_18번_AndPhone(peple);
					success = true;
					break;
				
				}
			}
			
		}
		
		return success;
		
	}
}