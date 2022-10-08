package 자바2_10week;

public class p14_Wrapper이용해서연산 {

	public static void main(String[] args) {
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[2]);
			int sum =0;
			
		
			switch(args[1]) {
			case "+":
				sum = value1 + value2;
				System.out.println(value1 + " + " + value2  + " = " + sum);
				break;
			case "-":
				sum = value1 - value2;
				System.out.println(value1 + " - " + value2  + " = " + sum);
				break;
			default:
				System.out.println("덧셈과 뺄셈만 가능합니다.");
			}
		}catch(NumberFormatException e) {
			System.out.println(args[1] + " == * 는 Run Confi 에서 사용 불가합니다. ");
			System.exit(0);
		}catch(Exception e) {
			System.out.println("다른 오류 발생 ");
			System.exit(0);
		}

		
	}

}
