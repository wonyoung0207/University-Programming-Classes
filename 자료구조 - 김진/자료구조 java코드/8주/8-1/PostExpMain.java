
public class PostExpMain {

	public static void main(String[] ar){
		String exp="231*+9-";
		//System.out.println("Postfix Evaluation : " + ArrayEvalPostfix.calc(exp));
		exp="231*+9-";
		System.out.println("Postfix Evaluation : " + ListEvalPostfix.calc(exp));//후위표기식 계산 나옴
		exp="231*+9-";
		//System.out.println("Postfix Evaluation : " + UtilStack.calc(exp));
		
		
	}
}
