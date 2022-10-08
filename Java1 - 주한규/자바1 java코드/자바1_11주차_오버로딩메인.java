package 자바1프로젝트;

// 자바는 오버로딩을 지원한다.
// 오버로딩 = 같은 이름의 메소드가 존재할 수 있다. -> 같은이름의 메소드는 매개변수의 데이터에 따라 판단한다.

// 메소드 이름과 매개변수 갯수, 데이터형까지 같은 것은 안됨.
// int add(int x, int y)    vs     double add(int x, int y) -> 이렇게 하면 안됨 

public class 자바1_11주차_오버로딩메인 {

	public static void main(String[] args) {
		자바1_11주차_오버로딩 obj = new 자바1_11주차_오버로딩();
		System.out.println(obj.square(10));//데이터형이 int인 메소드 호출
		System.out.println(obj.square(3.14));//데이터형이 double인 메소드 호출
		System.out.println(obj.add(1, 2));//숫자 2개
		System.out.println(obj.add(1, 2, 3));
		System.out.println(obj.add("a","b"));//문자열 2개 -> String 
		System.out.println(obj.add("aa","bb","cc"));//문자열 3개
		System.out.println(obj.add('a','b'));//문자 2개 -> char
		

	}

}
