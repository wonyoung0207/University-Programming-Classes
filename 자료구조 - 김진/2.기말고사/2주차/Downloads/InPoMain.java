
public class InPoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="3+5*8-4";
		System.out.println("���� ǥ���: "+exp);
		String post=InfixToPostfix.calc(exp);
		System.out.println("���� ǥ���: "+post);
		System.out.println("���� ǥ��� ��� ��� : " + UtilStack.calc(post));
	}

}
