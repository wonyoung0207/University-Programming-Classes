package �ڹ�2_3week;
//�����ε� vs  �������̵�
//�������̵� ���� : �θ� �޼ҵ��� ���İ� �����ؾ� ��.(�Ű����� ����, ���� Ÿ��, ����, �̸�)
// �����ε� : ���Ӱ� �޼ҵ带 �����ϴ� �� 
// �������̵� : ��ӹ��� ������ �θ� �޼ҵ带 ������ �ϴ°� 

class �ڹ�2_3����_18��_Phone {
	private String who;


	public �ڹ�2_3����_18��_Phone() {//����Ʈ ������
		this("anonymous");
	}
	
	public �ڹ�2_3����_18��_Phone(String person) {//����(person)�� �Ű������� ���� ����
		this.who = person;//��

	}
	
	public void call() {
		System.out.println(this.who + "��ȭ�� �մϴ�.");
	}

	public String getWho() {
		return this.who;
	}
	
}
