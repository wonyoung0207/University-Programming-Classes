package �ڹ�2_10week;

import java.util.regex.Pattern;

public class p10_���ڿ��������ڰ���ī��Ʈ {

	public static void main(String[] args) {
		int count = 0;
		String s = args[0];
		
		System.out.println(s);
		
		for(int i=0; i<args[0].length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
				count++;
			}
		}
		System.out.println("���ڴ� �� " + count + " �� �Դϴ�.");
		
		
		System.out.println("======= �ٸ� Ǯ�� ======");
		count = 0;
		s = args[0];
		
//���⼭���ʹ� �ȵ� 
//		for(int i=0; i<args[0].length(); i++) {
//			if(Pattern.matches("^[0-9]*$", s.charAt(i))) {
//				count++;
//			}
//		}
//		System.out.println("���ڴ� �� " + count + " �� �Դϴ�.");
//		

	}

}
