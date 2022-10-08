package 자바1프로젝트;
import java.util.*;

public class 자바1_12주차_식입력받아계산 {

	public static void main(String[] args) {
		String formula;
		
		//여기서 자바1_12주차_식입력받는객체() 메소드 호출로 필드 초기화
		자바1_12주차_식입력받는객체 mycalc = new 자바1_12주차_식입력받는객체();
		
		Scanner input = new Scanner(System.in);
		System.out.print("수식 입력:");
		formula = input.next();
		mycalc.formula = formula;//입력받은 문자열을 넘겨줌
		
		for(int i = 0; i<formula.length(); i++) {
	
			if(formula.charAt(i) == '+') {
				mycalc.setOper(i,"+");
				break;
			}			
			else if(formula.charAt(i) == '-') {
				mycalc.setOper(i,"-");
				break;
			}
			else if(formula.charAt(i) == '*') {
				mycalc.setOper(i,"*");
				break;
			}
			else if(formula.charAt(i) == '/') {
				mycalc.setOper(i,"/");
				break;
			}
//			else {
//				System.out.println("수식을 잘못입력했습니다. ");
//			}

		}
		
		System.out.println(mycalc.getCalc());//결과출력
		System.out.println(자바1_12주차_식입력받는객체.counting());//정적메소드 이용 

	}

}
