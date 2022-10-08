package 자바2_6week;
//args에 값 넣어주는 방법
// 1.실행창 - 2.실행구성(Run Configuration) - 3.args 인수 -> 띄어쓰기로 배열 나눌 수 있음 
//catch의 순서가 중요하다. 상위 클래스(Exception)은 가장 나중에 잡아야 한다. 
//순서에 따라 안잡힐수 있기 때문에 

public class 자바2_6주차_예외처리_실행예외 {

	public static void main(String[] args) {

//		System.out.println(args[0]);//args에 아무것도 안줄경우 ArrayIndexOutOfBoundsException 발생 

		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
			
		}catch(ArrayIndexOutOfBoundsException e) {//배열의 인덱스가 부족할경우 발생 
			System.out.println("실행 매개값의 수가 부족합니다. ");
		}
//		catch(NumberFormatException e) {//전달받은 배열의 형태가 숫자가 아닐경우 발생 
//			
//		}
		catch(Exception e) {//NumberFormatException 예외 발생시 수행 
			System.out.println("숫자로 변환할 수 없습니다. ");//args[1]의 값이 aaa이기 때문에 실행
			System.out.println("가장 최상위 클래스 예외는 나중에 처리합니다. ");
		}finally {//무조건 실행되는 실행문 
			System.out.println("다시 실행하세요");
		}
	}

}
