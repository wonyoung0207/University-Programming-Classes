package �ڹ�1������Ʈ;
// �����ε� = ���� �̸��� ���� �޼ҵ�� ���������� ���� ������ �� �ִ�.

public class �ڹ�1_11����_�����ε� {
	int square(int i) {//���������� int�� ����
		return i*i;
	}
	
	double square(double i) {//���������� double�̸� ����
//		double c = i*i;
//		int d = Integer.parseInt(c);//-> String �� int ������ ��ȯ 
		return i*i;
	}
	

	int add(int x, int y) {//������ 2���� ���
		return x+y;
	}
	
	int add(int x, int y, int z) {//������ 3���� ���
		return x+y+z;
	}
	
	String add(String x, String y) {//���ڿ� 2���� ��� 
		return "���ڿ� 2��: "+x+y;
	}
	
	String  add(String x, String y, String z) {// ���ڿ� 3���� ���
		return "���ڿ� 3��: " + x+y+z;
	}
	
	String  add(char x, char y) {// ���ڿ� 2���� ��� Character.toString -> char���� String���� ���� 
//		return "����(char) 2��: "+(Character.toString(x)) + (Character.toString(y));//�̰͵� ���� 
		return "����(char) 2��: "+ Character.valueOf(x) + Character.valueOf(y);//���ڿ��� �����ֱ� ���ؼ� 
	}
	
	
}
