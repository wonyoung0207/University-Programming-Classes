
public class PostExpMain {

	public static void main(String[] ar){
		String exp="231*+9-";
		//System.out.println("Postfix Evaluation : " + ArrayEvalPostfix.calc(exp));
		exp="231*+9-";
		System.out.println("Postfix Evaluation : " + ListEvalPostfix.calc(exp));//����ǥ��� ��� ����
		exp="231*+9-";
		//System.out.println("Postfix Evaluation : " + UtilStack.calc(exp));
		
		
	}
}
