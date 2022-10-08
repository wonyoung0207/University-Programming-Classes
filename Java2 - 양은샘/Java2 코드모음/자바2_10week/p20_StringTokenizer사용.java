package 자바2_10week;

import java.util.StringTokenizer;

public class p20_StringTokenizer사용 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		StringTokenizer st = new StringTokenizer(args[0]," ");
		int count = st.countTokens();//하나의 문자가 token이 됨 
		System.out.println("단어(토큰)은 모두 " + count + " 개 입니다. ");
		
		
		System.out.println("======== 역순 출력 =======");
		String[] tmp = new String[count];
		
		while(st.hasMoreTokens()) {
			tmp[--count] = st.nextToken();//첫번째값을 맨 마지막에 넣어줌 
		}
		
		int i=0;
		for(String s : tmp) {
			System.out.println("tmp[" + i + "] = " + s);
			i++;
		}
	}

}
