package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�9��_Person implements �ڹ�2_5����_�����н�9��_IComparable{
	private String name;
	private double height;
	
	public String toString() {//sysout ���� person���·� ������ ��ü�� �θ���� ȣ��� 
		return "Person [name = " + this.name + ", height = " + this.height + "]";
	}
	
	public �ڹ�2_5����_�����н�9��_Person() {
		this("anonymous", 0);
		//����Ʈ �����ڷ� ���� ���� �ؿ��ִ� �Ű����� 2��¥�� �����ڷ� �� �� �ֵ��� ȣ�� 
	}
	
	public �ڹ�2_5����_�����н�9��_Person(String name, double height) {
		this.height = height;
		this.name = name;
	}
	
	public int compareTo(Object other) {
		//Object�� ���� ���� ��ü��, � ��ü�� ������ �𸦶� ����Ѵ�. 
		// ���� ���� other�� ���¸� �ӽ÷� ���� height�� Ÿ������ ������ ��� �Ѵ�. 
		// �̶� ��ȣ�� " ((Ÿ��)������ ��ü).�ʵ� "�� �������� �ۼ��� ��� �Ѵ�. 
		if(this.height > ((�ڹ�2_5����_�����н�9��_Person)other).height) {
			return 1;
		}
		else if(this.height == ((�ڹ�2_5����_�����н�9��_Person)other).height) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
