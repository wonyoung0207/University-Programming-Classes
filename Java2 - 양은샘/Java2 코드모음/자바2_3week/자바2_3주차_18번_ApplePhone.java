package �ڹ�2_3week;

class �ڹ�2_3����_18��_ApplePhone extends  �ڹ�2_3����_18��_Phone {
	
	public �ڹ�2_3����_18��_ApplePhone() {
		super();
		
	}
	public �ڹ�2_3����_18��_ApplePhone(String w) {
		super(w);//this.who �� ��� ���������� ���⼭�� �ȵ� . private�� .
		
	}
	public void call(){//�ȵ���̵�� girl�� ���, �������̵�
		System.out.println(super.getWho() + "������ȭ,���� �մϴ�. ");
		
	}
}
