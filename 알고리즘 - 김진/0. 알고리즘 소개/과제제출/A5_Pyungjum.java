package �˰���_1week;

import java.util.Random;

public class A5_Pyungjum {
	public static void main(String[] args) {

		int i = 70;
		String grade;
		
		
		if(i >= 90 && i <= 100) {
			grade = "A";
		}else if(i >= 80 && i < 90){
			grade = "B";
		}
		else if(i >= 70 && i < 80){
			grade = "C";
		}
		else if(i >= 60 && i < 70){
			grade = "D";
		}else {
			grade = "F";
			
		}
		System.out.println("���� �л��� ������ " + grade + " �Դϴ�.");
	}
}
