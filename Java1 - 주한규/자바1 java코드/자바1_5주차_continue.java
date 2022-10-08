package 자바1프로젝트;
//continue를 이용한 글자 n의 갯수 구하기

public class 자바1_5주차_continue {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
		int no_n = 0;
		
		
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) != 'n') {//charAt(0) = n , charAt(1) = o...
				no_n++;
				continue;//바로 증감부분으로 간다. -> i++이 수행되고 다시 위에서부터 수행
			}
			n++;
		}
		System.out.println("총 문자 갯수는 : " + s.length());
		System.out.println("문장에 있는 n 의 갯수는 : "+ n);
		System.out.println("n이 아닌 문자의 갯수는 : "+ no_n);

	}

}
