package �ڹ�2_3week;

class �ڹ�2_3����_18��_Family {
	
	�ڹ�2_3����_18��_Phone [] p = {
			new �ڹ�2_3����_18��_Phone("dad"),
			new �ڹ�2_3����_18��_Phone("mom"),
			new �ڹ�2_3����_18��_Phone("boy"),
			new �ڹ�2_3����_18��_Phone("girl")
			};

	public void operation()	{
		for(�ڹ�2_3����_18��_Phone obj : p) {
			obj.call();
		}
		
	}
	
	public boolean change(String peple, String device) {
		System.out.println(peple + "�� �ڵ����� ��ȯ�մϴ�.");
		boolean success = false;
		for(int i = 0; i < p.length;i++) {
			//�̸��� �´��� Ȯ��.
			if(p[i].getWho().equals(peple)) {
				switch(device) {
				case "applephone" : 
					p[i] = new �ڹ�2_3����_18��_ApplePhone(peple);//�ڽİ�ü�� ����ȯ
					success = true;
					break;
				case "andphone" : 
					p[i] = new �ڹ�2_3����_18��_AndPhone(peple);
					success = true;
					break;
				
				}
			}
			
		}
		
		return success;
		
	}
}