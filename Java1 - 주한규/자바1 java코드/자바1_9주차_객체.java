package �ڹ�1������Ʈ;
//Ŭ���� = ���� ������ �ȴٰ� �ϴ°�
//��ü = �ڱⰪ�� ������ ��
//Person p = new person() -> person�̶�� Ŭ���� �̿��ؼ� p��� ��ü ����
//PersonŬ������ id �� name�� ���� �� �ִ�. -> p��� ��ü�� id�� name�� ���� �� �ִ�.

//���α׷��� main �żҵ忡�� ���۵ȴ�. Television�� Ŭ������ ��ü�� �����,
//Tv�� television�� �ּҸ� �������ִ�.

//tv��� ��ü �����ϸ� �ڽŸ��� �޸𸮸� ���Եȴ�.
//��ü�� Ŭ������ �ʵ尪�� ���� �� �ִ�. -> �ڱ� �ڽŸ��� �޸𸮿� �ʵ尪�� �����Ѵ�.

public class �ڹ�1_9����_��ü {

	public static void main(String[] args) {
		�ڹ�1_9����_Ŭ���� tv = new �ڹ�1_9����_Ŭ����();//�ڱ� �ڽŸ��� �޸𸮿� Ŭ������ �ʵ尪���� �̿��� �� �ִ�.
		tv.channel = 5;
		tv.volume = 5;
		tv.onOff = true;
		System.out.println("�ڷ������� ä���� "+ tv.channel + "�̰� ������ " + tv.volume + "�Դϴ�.");
		
		�ڹ�1_9����_Ŭ���� mytv = new �ڹ�1_9����_Ŭ����();
		mytv.channel = 10;
//		mytv.volume = 10;
//		mytv.onOff = true;
//		
		System.out.println("�ڷ������� ä���� " + mytv.channel + "�̰� ������ " + mytv.volume + "�Դϴ�.");

	}

}
