package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�6��_SoundExample {

	//��ü���� ���� �ҷ��� �ϱ� ������ 
	public static void printSound(�ڹ�2_5����_�����н�6��_ISound is) {//���� �޼ҵ�� ������ ����� 
		System.out.println(is.sound());
	}

	public static void main(String[] args) {
		�ڹ�2_5����_�����н�6��_ISound is = null;//���⸦ ���� Cat�� Dog ���ص� ����� ����. 
		
		//�������̽��� ��ü�� ���������� ������ �� ���� ������ Ŭ���� �̿��ؼ� ��ü �����ؾ��Ѵ�. 
		is = new �ڹ�2_5����_�����н�6��_Dog();//dog �������� ��ü ���� 
		printSound(is);

		is = new �ڹ�2_5����_�����н�6��_Cat();
		printSound(is);

	}

}
