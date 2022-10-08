package 자바1프로젝트;
import java.util.*;

public class 자바1_6주차_배열이용_평균_최저_최고점수출력 {
	
	public static double mean(int[] score,int size) {//평균 구하는 메소드
		double avg = 0;
		int total = 0;
		
		for(int i = 0; i < size; i++) {
			total = total + score[i];
		}
		avg = (double)total / size;//평균구해서 리턴
		return avg;
	}
	
	public static void swap(int[]arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
//		temp = score[k];//인덱스 0번쨰꺼 대입
//		score[k] = score[max];//다음게 크면 다음껄 인덱스0으로, 크지 않다면 그대로 나둬서 인덱스0에 더 큰수오게
//		score[max] = temp;//다음게 크면 인덱스1에 작은값(인덱스0) 들어가게, 다음게 작으면 배치 바뀌지 않게
	}
	
	public static void main(String[] args) {
		int[] score = new int[100];
		int size = 0;
		int num = 0;	
		int max = 0;
		int min = 0;
		int temp = 0;

		System.out.print("점수를 입력하세요...(-1을 입력하면 입력종료): ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
///////////////////////////////////////////////////////////////////////
///////////점수 입력 받는 곳//////////////////////////////////////////////
		while(num >= 0) {
			score[size] = num;
			size++;
			System.out.print("점수를 입력하세요...(-1을 입력하면 입력종료): ");
			num = input.nextInt();
		}
		System.out.print("점수 : ");
		for(int j = 0; j < size; j++) {
		System.out.print(" " + score[j]);
		}
		System.out.println("");
///////////////////////////////////////////////////////////////////////
///////////배열 재배치 하는 곳//////////////////////////////////////////////
		
		for(int k = 0; k < size-1; k++) {
			max = k;
			for(int p = k+1; p < size; p++) {
				if(score[p] >= score[max]) {
					max = p;
				}
			}swap(score,k,max);
		}
		
		System.out.print("배열 재배치 출력");
		for(int e = 0; e < size; e++) {
		System.out.print(" "+score[e]);
		}
		System.out.println("");

		System.out.println("배열의 평균 : " + mean(score,size));
		System.out.print("최고점수 : " + score[0] + " , " + "최저점수 : " + score[size-1]);
		System.out.println("");
		
///////////////////////////////////////////////////////////////////////
///////////등수 찾는곳//////////////////////////////////////////////
		
		System.out.print("등수를 알고싶은 점수를 입력하세요...(-1을 입력하면 입력종료): ");
		num = input.nextInt();
		
		while(num >= 0) {
			int key = 0;
			for(int q = 0; q < size-1; q++) {
				if(score[q] == num) {
					key = q;
				}
			}
			if(score[key] == num) {
				System.out.println("찾는 점수는 " + (key+1) + "등 입니다.");
			}
			else {
				System.out.println("찾는 점수는 존재하지 않습니다. ");
			}
			System.out.print("등수를 알고싶은 점수를 입력하세요...(-1을 입력하면 입력종료): ");
			num = input.nextInt();
		}
	}
}
