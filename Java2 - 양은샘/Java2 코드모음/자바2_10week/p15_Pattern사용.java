package �ڹ�2_10week;

import java.util.regex.Pattern;

public class p15_Pattern��� {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0; i < args.length; i++) {
			if(Pattern.matches("^[0-9]*$", args[i]) == true) {//���ڸ� ���ϰ� ���� 
				System.out.println(args[i]);
				sum += Integer.parseInt(args[i]);
			}
		}
		
		System.out.println("���� " + sum + "�Դϴ�.");

	}
		
}
