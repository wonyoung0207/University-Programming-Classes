package �ڹ�2_10week;

import java.util.Arrays;

public class p19_�迭���������� {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
		
		System.out.println("============Before Sort==============");
		
		String[] tmp = new String[args.length];
		tmp = Arrays.copyOf(args, args.length);//�迭�� �迭 ���̸� �����
		
		for(String s:tmp) {
			System.out.println(s);
		}
		
		System.out.println("============After Sort==============");
		
		Arrays.sort(tmp);
		for(String s: tmp) {
			System.out.println(s);
		}
	}

}
