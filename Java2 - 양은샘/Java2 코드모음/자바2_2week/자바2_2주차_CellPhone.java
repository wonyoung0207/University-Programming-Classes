package �ڹ�2_2week;

//******************************������ Ǯ��*************************************
//***************************************************************************

public class �ڹ�2_2����_CellPhone{
	private String telNum;//��� ����(�� Ŭ���� �ȿ����� ����� �� �ִ� ����)
	private boolean power;
	static private int count;
	//static = �������� �������(���� ������ �޶� ��ü �������� ��밡��, �ʱ�ȭ���� �ʾƵ� �ڵ����� �ʱ�ȭ ��)
	
	�ڹ�2_2����_CellPhone(){//����Ʈ ������
		this("000-000-0000");//�Ű������� 1���� �����ڸ� ȣ��
	}
	// "this." = ��������� �޼ҵ带 ȣ�� , 	"this" = �����ڸ� ȣ��
	�ڹ�2_2����_CellPhone(String tn){//������
		this.telNum = tn;
		this.power = true;
		count++;//���������� �ʱ�ȭ ���� �ʾƵ� ��
	}
	
	void powerToggle() {
		this.power = !this.power;//if,else ���� ���� �ʰ� ���� ����������� ����� ���� �� �ִ�. 
	}
	
	public String toString() {//public �� ����ؾ��Ѵ�. 
		//�ڹٿ� �ִ� ��Ӱ�����, sysout ���ٰ� ��ü�� ����ϰ� �Ǹ� �ڹٷ��� toString�� ȣ�����ش�. 
		//��ü�� ȣ���ϸ� �ڹٷ����� toString �޼ҵ� �ڵ����� �����ͼ� ȣ��, ���� ���� toString �������� ��toStirng ȣ��
		return "\n toString() -> ����ȣ : " + this.telNum + " , �������� : " + this.power;
	}
	
	static int getCount() {//���������� �����ϴ� �޼ҵ嵵 static������ ����ؾ� �Ѵ�. 
		return count;//��� ��ü�������� ȣ�� ����, �ٸ� ������ ���� ����
	}
	
	public String getTelNum() {//�����ڷ�, ���(private)�� ����� �������� �������� ����ϴ� �޼ҵ�
		return this.telNum;
	}
	
	public boolean getPower() {
		return this.power;
	}
	
}





//********************************** ���� Ǯ�� ******************************************

//
//public class �ڹ�2_2����_CellPhone {
//	
//	int telNum;//�Է¹��� ��ȭ��ȣ
//	boolean power;//��������
//	private static int count = 0;//�Էµ� �޴��� �� -> ���������ڷ�, �� Ŭ���� �ȿ����� ��� ���� 
//	
//	public String toString() {
//		return "�� ��ȣ : " + telNum + "    ���� ���� : " + power;
//	}
//	
//
//	�ڹ�2_2����_CellPhone(int num){//������ -> �������¿� ��ȭ��ȣ�� ���� 
//		this.power = true;
//		this.telNum = num;
//		count++;//���� ������ ��� ��ü�� ���� ����. 
//		System.out.println(getCount());
//	}
//	
//	public static String getCount() {//������ -> �Էµ� �ڵ��� �� ���� 
//		return "���� �� " + count + " ���� �ڵ����� ��ϵǾ����ϴ�. ";
//	}
//	
//	public boolean powerToggle() {//������ -> �������� ����
//		return this.power;
//	}
//
//}
