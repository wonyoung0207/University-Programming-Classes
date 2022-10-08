// 중위표기식을 후위표기식으로 바꾸는 프로그램과
//후위표기식을 계산한 결과를 나타내는 프로그램

public class InfixToPostfixMain {

	public static void main(String[] args) {

		//String exp = "a+b*(c^d-e)^(f+g*h)-i";
		String exp="1*(3-2)+((6-2)/4)";
		System.out.println("중위 표기법: "+exp);
		String post=InfixToPostfix.calc(exp);//post에 중위표기식을 후위표기식으로 바꾼걸 대입.
		
		System.out.println("후위 표기법: "+post);
		System.out.println("후위 표기식 계산 결과 : " + UtilStack.calc(post));
		

	}

}
