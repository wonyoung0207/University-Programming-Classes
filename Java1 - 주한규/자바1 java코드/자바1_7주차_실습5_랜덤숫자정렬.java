package �ڹ�1������Ʈ;
import java.math.*;
import java.util.Scanner;


import java.util.*;

public class �ڹ�1_7����_�ǽ�5_������������ {

	public static void main(String[] args) {
		final int Size = 10;
		int[] numbers = new int[Size];
		
		for(int i = 0; i < Size; i++) {
			int r = (int)(Math.random() * 100); //0~1���� �� �����ε� 100���ؼ� 0~100���� �ٲ���
			
			numbers[i] = r;
			
		}
		
		System.out.print("ó��������� ����Ʈ : ");
		for(int i = 0; i < Size; i++) {
			System.out.print(numbers[i] + " ");
			
		}
		System.out.println("");
		
		Arrays.sort(numbers);
		
		System.out.print("���ĵ� ����Ʈ : ");
		for(int i = 0; i < Size; i++) {
			System.out.print(numbers[i] + " ");
			
		}
	}

}
