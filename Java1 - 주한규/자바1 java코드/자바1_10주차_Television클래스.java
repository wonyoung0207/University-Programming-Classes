package �ڹ�1������Ʈ;

public class �ڹ�1_10����_TelevisionŬ���� {
	public static void main(String[] args) {
		�ڹ�1_10����_Television myTv = new �ڹ�1_10����_Television(); 	
		myTv.channel = 7;	
		myTv.volume = 9;
		myTv.onOff = true;		
		myTv.print();//�޼ҵ带 ȣ��
		int ch = myTv.getChennel();//��ȯ���� int�̱� ������ 
		System.out.println("���� ä���� "+ ch + "�Դϴ�.");//ä�� ����ϴ� �޼ҵ� ȣ��
		int sum = myTv.add(myTv.channel,myTv.volume);
		System.out.println("ä�ΰ� ������ ���� "+ sum + "�Դϴ�.");
		System.out.println();
		
		�ڹ�1_10����_Television yourTv = new �ڹ�1_10����_Television();//���ο� ��ü ����
		yourTv.channel = 9;	
		yourTv.volume = 12;	
		yourTv.onOff = true;
		yourTv.print();//�޼ҵ� ȣ��
		System.out.println();
		yourTv.setchannel(123);//9���� 123ä�η� ����
		yourTv.print();//����� ä���� ���
		
	
	}


}



