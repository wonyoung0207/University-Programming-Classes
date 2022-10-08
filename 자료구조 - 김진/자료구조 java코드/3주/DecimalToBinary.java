
public class DecimalToBinary {	//10진수를 2진수로 변경하는 프로그램
	
	static void decToBin(int num, int base) {
		if(num > 0) { //양수라면
			decToBin(num/base, base);	//2로 나누고 다시 함수 호출 안나눠 질때까지
			
			/*
			 * 20 / 2 = 10	나머지 0
			 * 10 / 2 = 5	나머지 0
			 * 5 / 2 = 2 	나머지 1
			 * 2 / 2 = 1	나머지 0
			 * -> 읽는 순서 : 맨밑에 몫 1 -> 나머지 0 ...
			 * 따라서 1 0 1 0 0
			 */
			System.out.println(num % base);	//입력값을 2로 나눈 나머지를 프린트
		}else if(num < 0) {
			System.out.println("음수입니다");
		}
	}	

	public static void main(String[] args) {
		int decNo = 20;
		System.out.println("십진수" + decNo + "를 이진수로 변환 -> ");
		decToBin(decNo, 2);
		System.out.println();

	}

}
