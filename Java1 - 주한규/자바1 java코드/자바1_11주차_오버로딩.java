package 자바1프로젝트;
// 오버로딩 = 같은 이름을 가진 메소드는 데이터형에 따라 구분할 수 있다.

public class 자바1_11주차_오버로딩 {
	int square(int i) {//데이터형이 int면 수행
		return i*i;
	}
	
	double square(double i) {//데이터형이 double이면 수행
//		double c = i*i;
//		int d = Integer.parseInt(c);//-> String 을 int 형으로 변환 
		return i*i;
	}
	

	int add(int x, int y) {//정수가 2개인 경우
		return x+y;
	}
	
	int add(int x, int y, int z) {//정수가 3개인 경우
		return x+y+z;
	}
	
	String add(String x, String y) {//문자열 2개일 경우 
		return "문자열 2개: "+x+y;
	}
	
	String  add(String x, String y, String z) {// 문자열 3개인 경우
		return "문자열 3개: " + x+y+z;
	}
	
	String  add(char x, char y) {// 문자열 2개인 경우 Character.toString -> char형을 String으로 변형 
//		return "문자(char) 2개: "+(Character.toString(x)) + (Character.toString(y));//이것도 가능 
		return "문자(char) 2개: "+ Character.valueOf(x) + Character.valueOf(y);//문자열로 돌려주기 위해서 
	}
	
	
}
