package �ڹ�1������Ʈ;
// �޼ҵ� �ٷ� �����Ű�� ������ return �ϸ� �ȴ�. -> void ���� ��쿡�� ��ȯ���� ��� �ȴ�.
// ��ȯ���� void �� ���, return ���� �ʾƵ� �ȴ�.

public class �ڹ�1_10����_Television {
	int channel; 	// ä�� ��ȣ
	int volume; 	// ���� 
	boolean onOff; 	// ���� ����
	String system_onoff;
	
	
	void print() {//�޼ҵ�(����) ���� -> ��ȯ���� void�̱� ������ return ���� �ʾƵ� �ȴ�. 
		if (onOff == true){
			system_onoff = "on";
		}
		else {
			system_onoff = "off";
		}
		System.out.println("�ڷ������� �������´� " + system_onoff + " �Դϴ�. ");
		System.out.println("ä���� " + channel + 
			"�̰� ������ " + volume + "�Դϴ�.");
	}
	int getChennel() {
		return channel;//��ȯ���� int�̱� ������ return���� int���̿��� �Ѵ�.
	}
	int add(int channel, int volume) {//ä�ΰ� ���� ���ؼ� �������ִ� ��
		return channel + volume;
	}
	void setchannel(int ch) {
		channel = ch;
	}
}


