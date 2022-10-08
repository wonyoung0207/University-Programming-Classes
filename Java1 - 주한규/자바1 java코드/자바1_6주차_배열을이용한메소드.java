package 자바1프로젝트;
//메소드 이용해서 배열의 합 구하기
//void는 return 안해도 되고, 데이터형 써준다면 return 해야함

public class 자바1_6주차_배열을이용한메소드 {
	
	public static int sum(int[] a) {//배열이기 때문에 꼭 "int[] 매개변수" 로 작성해야한다.int는 리턴 데이터형
		int total = 0;
		for(int i=0; i < a.length; i++) {
			total = total + a[i];
			System.out.println(i + "번째 값 : " + total);
		}

//		for(int value : a) { //for-each문으로, 앞 for문과 똑같다. for(사용할변수 : 배열)
//			total = total + value;
//			System.out.println("");
//		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};//배열을 생성
		System.out.println("배열 길이 :"+num.length);
		System.out.println("숫자들의 합 : " + sum(num));
	}
}
