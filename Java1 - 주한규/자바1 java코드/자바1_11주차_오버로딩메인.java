package �ڹ�1������Ʈ;

// �ڹٴ� �����ε��� �����Ѵ�.
// �����ε� = ���� �̸��� �޼ҵ尡 ������ �� �ִ�. -> �����̸��� �޼ҵ�� �Ű������� �����Ϳ� ���� �Ǵ��Ѵ�.

// �޼ҵ� �̸��� �Ű����� ����, ������������ ���� ���� �ȵ�.
// int add(int x, int y)    vs     double add(int x, int y) -> �̷��� �ϸ� �ȵ� 

public class �ڹ�1_11����_�����ε����� {

	public static void main(String[] args) {
		�ڹ�1_11����_�����ε� obj = new �ڹ�1_11����_�����ε�();
		System.out.println(obj.square(10));//���������� int�� �޼ҵ� ȣ��
		System.out.println(obj.square(3.14));//���������� double�� �޼ҵ� ȣ��
		System.out.println(obj.add(1, 2));//���� 2��
		System.out.println(obj.add(1, 2, 3));
		System.out.println(obj.add("a","b"));//���ڿ� 2�� -> String 
		System.out.println(obj.add("aa","bb","cc"));//���ڿ� 3��
		System.out.println(obj.add('a','b'));//���� 2�� -> char
		

	}

}
