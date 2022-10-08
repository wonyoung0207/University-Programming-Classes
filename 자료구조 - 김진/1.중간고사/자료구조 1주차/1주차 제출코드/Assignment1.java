package ahn;

public class Assignment1 {

	public static void main(String[] args) {
		
		int[] score;
		score = new int[10];
		score[0] = 98;
		score[1] = 88;
		score[2] = 77;
		score[3] = 66;
		score[4] = 55;
		score[5] = 44;
		score[6] = 33;
		score[7] = 22;
		score[8] = 11;
		score[9] = 9;
		int result = 0;
		int avg;
		
		for(int i = 0; i < 10; i++) {
			result += score[i];
				
		}
		
		avg = result/10;
		System.out.println("10개 배열의 평균은 " +  result);
		

	}

}
