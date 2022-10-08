package 자바2_9week;
//args 매개변수 이용방법 : 실행 -> 실행구성 -> 인수 입력
//args는 공백을 기준으로 하나의 문자열로 배열에 저장됨 -> String 배열을 사용하기 때문에 
//전체 문자열을 하나로 묶어서 배열에 저장하고 싶으면 "" 로 묶으면 됨 

public class API실습1_main사용법 {
	//public : 접근자 
	//static : 객체생성 없이도 사용할 수 있는 메소드 이다. 
	//void : 리턴값이 없다
	//main : 메소드 이름
	//String[] args : 메인함수의 매개변수
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i + ", " + args[i]);
	
		}
		//더하기 하고싶은 경우 
		//System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		
		//args로 숫자 2개와 연산자 입력받아서 계산할 경우 
		int a = Integer.parseInt(args[0]);//숫자1
		int b = Integer.parseInt(args[2]);//숫자2
		if(args[1].equals("+")) {//연산자 입력 
			System.out.println(args[0] + args[1] + args[2] + " = " + (a+b));
		}else if(args[1].equals("-")) {
			System.out.println(args[0] + args[1] + args[2] + " = " + (a-b));
		}else {
			System.out.println("연산자를 +와- 로 입력하세요 ");
		}
			
	}

}
