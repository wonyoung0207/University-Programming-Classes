package �ڹ�2_10week;

import java.util.StringTokenizer;

public class p20_StringTokenizer��� {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		StringTokenizer st = new StringTokenizer(args[0]," ");
		int count = st.countTokens();//�ϳ��� ���ڰ� token�� �� 
		System.out.println("�ܾ�(��ū)�� ��� " + count + " �� �Դϴ�. ");
		
		
		System.out.println("======== ���� ��� =======");
		String[] tmp = new String[count];
		
		while(st.hasMoreTokens()) {
			tmp[--count] = st.nextToken();//ù��°���� �� �������� �־��� 
		}
		
		int i=0;
		for(String s : tmp) {
			System.out.println("tmp[" + i + "] = " + s);
			i++;
		}
	}

}
