// ����ǥ����� ����ǥ������� �ٲٴ� ���α׷���
//����ǥ����� ����� ����� ��Ÿ���� ���α׷�

public class InfixToPostfixMain {

	public static void main(String[] args) {

		//String exp = "a+b*(c^d-e)^(f+g*h)-i";
		String exp="1*(3-2)+((6-2)/4)";
		System.out.println("���� ǥ���: "+exp);
		String post=InfixToPostfix.calc(exp);//post�� ����ǥ����� ����ǥ������� �ٲ۰� ����.
		
		System.out.println("���� ǥ���: "+post);
		System.out.println("���� ǥ��� ��� ��� : " + UtilStack.calc(post));
		

	}

}
