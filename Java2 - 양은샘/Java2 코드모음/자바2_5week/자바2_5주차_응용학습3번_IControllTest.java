package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�3��_IControllTest {//������ ����ٰ� implements ������� 

	public static void main(String[] args) {
		//�������̽��� ���� Ŭ������ ���� 
		�ڹ�2_5����_�����н�3��_IControll ic = new �ڹ�2_5����_�����н�3��_IControll() {//�������̽��� ��ü ������ �ٵ� ����Ŭ������������ ���� �����Ѱ��� 
			public void play() {//�߻�޼ҵ带 ����  
				System.out.println("PLAY");
			}
			public void stop() {
				System.out.println("STOP");
			}
		};//���� �����ٴ� ; �� ����ؾ��� 
		
		ic.play();
		ic.stop();

	}

}
