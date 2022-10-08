package 자바1프로젝트;

public class 자바1_11주차_string클래스이용 {

	public static void main(String[] args) {
		
		String pro = "A barking dog";
		String pro_x1 = "A bark";
		String pro_x2 = "a bark";
		String pro_equal = "A barking dog";

		String s1,s2,s3,s4;
		char s6;
		int s5,s8,s9;
		boolean s7;
		
		System.out.println("문자열의 길이 = " + pro.length());//문자열 길이 출력, 띄어쓰기 포함
		
		s1 = pro.concat("never Bit");//문자열 추가
		s2 = pro.replace("B", "b");//B를 b로 바꿔줌
		s3 = pro.substring(2,5);//부분 문자열 출력 -> 인덱스2부터 5전까지.->인덱스 2,3,4 출력
		s4 = pro.toUpperCase();//대문자로 바꿔줌 -> toLowerCase()로 소문자도 가능
		s5 = pro.compareTo(pro_x1); //사전적 순서로 문자열을 비교, 현재객체가 더 작으면 음수, 크면 양수 반환 
		//전달받은것보다 전에있으면 작은것이기 때문에 음의 정수 리턴 
		s9 = pro.compareTo(pro_x2);// 따라서 전체적으로 계산시 "-" 나온 문자열이 더 작은게 됨
		s8 = pro.compareTo(pro_equal);//한글자씩 비교함, 완전히 비슷해서 0을 출력
		s6 = pro.charAt(0);//지정된 인덱스에 있는 문자를 반환 -> 띄어쓰기도 포함
		s7 = pro.equals(pro_x1);//같은지 비교해줌		
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		System.out.println("s4 = "+s4);
		System.out.println("s5 = "+s5);
		System.out.println("s9 = "+s9);
		System.out.println("s8 = "+s8);
		System.out.println("s6 = "+s6);
		System.out.println("s7 = "+s7);
		
		// comparTo를 이용해 문자열 크고 작음 비교 -> 전체적으로 계산 결과가 음수 나오면 현재객체(pro)가 작은것임
		String p1 = "The student";
		System.out.println("pro 와 p1 비교: " +pro.compareTo(p1));
		// - 나온다면 현재 객체가 더 작은것임 
		if(pro.compareTo(p1) < 0) {//크고 작음 비교  -> 앞에서부터 순차적으로 비교, pro 가 더 작으면 -1 누적
			System.out.println(pro + " is less then " + p1);
		}else if(pro.compareTo(p1) > 0) {
			System.out.println(pro + " is greater then " + p1);
		}else {
			System.out.println(pro + " is equal to " + p1);
		}
		
		//pro를 거꾸로 출력
		String pro_reverse = "";
		for(int i=pro.length()-1; i >= 0; i--) {
			pro_reverse += (pro.charAt(i));
		}

		System.out.println("pro를 거꾸로 출력: "+pro_reverse);
		
		//랩퍼 클래스 = 기초자료형을 객체처럼 다루기위해 클래스로 만들고 싶을경우 사용
		System.out.println("<<<<랩퍼 클래스 시작>>>");
		int a = Integer.parseInt("123");
		System.out.println("문자열을 int형으로 바꿈: "+a);
		double b = Double.parseDouble("3.1456");
		System.out.println("문자열을 double형으로 바꿈:"+b);
		
		String a1 = "abcd";
		String b1 = "c";
		System.out.println(a1.compareTo(b1));
	
	}
}
