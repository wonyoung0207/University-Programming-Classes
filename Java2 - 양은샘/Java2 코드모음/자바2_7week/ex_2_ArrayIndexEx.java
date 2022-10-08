package 자바2_7week;

public class ex_2_ArrayIndexEx {

	public static void main(String[] args) {
		int[] array = new int[2];
		
		try {
			//int a = array[3];
			int b = array[0];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 확인해서 사용 ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
