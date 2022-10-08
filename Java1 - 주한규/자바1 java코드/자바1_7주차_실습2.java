package 자바1프로젝트;

//main의 매개변수 이용 :  run -> 실행구성 -> 프로그램인수
//main 옆에 생성되는 string형인 배열 args에 값이 들어가는 것임. 
//String args[] => 커멘드 입력시 배열로 넘겨받기 위해서 써줌
public class 자바1_7주차_실습2 {

	public static void main(String[] args) {
		int sum = 0;

		if ( args.length > 0) {
			for(int i =0; i <args.length; i++) {
				System.out.println(" " + args[i]);
			}
			for(int i =0; i <args.length; i++) {//string 형이기 때문에 int형으로 바꿔줘야 한다. 
				sum = sum + Integer.parseInt(args[i]);
				
			}
			
			if(args[0].equals("-h"))
				System.out.println("Help ");
		}

	}

}
