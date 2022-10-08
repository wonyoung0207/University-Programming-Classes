package 자바2_7week;

import java.lang.reflect.Array;

public class ex_13_Test {

	public static void main(String[] args) {
		try {
			sub();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외발생 ");
		}catch(Exception e) {
			System.out.println("다른오류 : " + e.getMessage());
		}

	}
	
//	public static void sub() {
//		int[] array = new int[10];
//		int i = array[10];
//	}
	
	public static void sub() throws ArrayIndexOutOfBoundsException{//try catch 안쓰고 어떻게 사용하는지 
		int[] array = new int[10];
		int i = array[10];
	}

}
