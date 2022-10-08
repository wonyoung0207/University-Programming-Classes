package 자바1프로젝트;

public class 자바1_13주차_SafeArray_메인 {

	public static void main(String[] args) {
		자바1_13주차_SafeArray array = new 자바1_13주차_SafeArray(3);//크기가 3인 배열 a 생성 
		
		//여기서 사용된 length는 safeArray 클래스의 length필드이다. 
		for(int i=0; i<(array.length+2); i++) {//일부러 오류나게 하기 위해 array.length+2 해줌
			array.put(i,i*10);
		}
		
		for(int i=0; i < (array.length+2); i++) {//해당 인덱스 값을 출력해준다. 인덱스 넘어가면 -1을 출력
			System.out.print(array.get(i) + " ");
		}

	}

}
