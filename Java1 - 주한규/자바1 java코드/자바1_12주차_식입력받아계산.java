package �ڹ�1������Ʈ;
import java.util.*;

public class �ڹ�1_12����_���Է¹޾ư�� {

	public static void main(String[] args) {
		String formula;
		
		//���⼭ �ڹ�1_12����_���Է¹޴°�ü() �޼ҵ� ȣ��� �ʵ� �ʱ�ȭ
		�ڹ�1_12����_���Է¹޴°�ü mycalc = new �ڹ�1_12����_���Է¹޴°�ü();
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�:");
		formula = input.next();
		mycalc.formula = formula;//�Է¹��� ���ڿ��� �Ѱ���
		
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
//				System.out.println("������ �߸��Է��߽��ϴ�. ");
//			}

		}
		
		System.out.println(mycalc.getCalc());//������
		System.out.println(�ڹ�1_12����_���Է¹޴°�ü.counting());//�����޼ҵ� �̿� 

	}

}
