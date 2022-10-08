package 자바1프로젝트;
// 배열의 인덱스를 확인하는 클래스
// 인덱스를 넘었을경우 잘못된 인덱스의 위치를 알려주는 get() 메소드 생성
// 인덱스를 넘는 자리는 -1로 채워줌


public class 자바1_13주차_SafeArray {
	private int[] a;//해당 클래스에서만 사용 가능
	public int length;
	
	public 자바1_13주차_SafeArray(int size) {//생성자
		//int[] score = new int[100];// 배열생성 예시 
		a = new int[size];//a = size만큼의 배열을 생성
		length = size;
		
//		for(int i=0; i < a.length; i++) {
//			System.out.println("a배열의 "+i + "번째 값: " + a[i]);
//		}
	}
	
	public void put(int index, int value) {//값을 넣어주는 메소드 
		if (index >= length) {//길이보다 긴 인덱스가 들어온다면 프린트
			System.out.println("잘못된 인덱스 " + index);
		}
		else{//길이보다 작은 인덱스라면 배열 a에다가 값을 넣어준다. 
			a[index] = value;
		}
		
	}
	

	public int get(int index) {//값을 출력해주기 위한 메소드 
		if (index >= length){//배열의 길이보다 길 경우 -1을 리턴
			return -1;
		}
		else {//배열의 길이보다 길지 않다면 배열a의 index위치 값을 리턴
			return a[index];
		}
		
	}

}
