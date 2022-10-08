package 자바1프로젝트;
import java.math.*;
import java.util.Scanner;


import java.util.*;

public class 자바1_7주차_실습5_랜덤숫자정렬 {

	public static void main(String[] args) {
		final int Size = 10;
		int[] numbers = new int[Size];
		
		for(int i = 0; i < Size; i++) {
			int r = (int)(Math.random() * 100); //0~1사이 값 랜덤인데 100곱해서 0~100으로 바꿔줌
			
			numbers[i] = r;
			
		}
		
		System.out.print("처음만들어진 리스트 : ");
		for(int i = 0; i < Size; i++) {
			System.out.print(numbers[i] + " ");
			
		}
		System.out.println("");
		
		Arrays.sort(numbers);
		
		System.out.print("정렬된 리스트 : ");
		for(int i = 0; i < Size; i++) {
			System.out.print(numbers[i] + " ");
			
		}
	}

}
