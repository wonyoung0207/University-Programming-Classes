
public class InPoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="3+5*8-4";
		System.out.println("중위 표기법: "+exp);
		String post=InfixToPostfix.calc(exp);
		System.out.println("후위 표기법: "+post);
		System.out.println("후위 표기식 계산 결과 : " + UtilStack.calc(post));
	}

}
