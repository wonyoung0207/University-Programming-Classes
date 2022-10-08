package �˰���_12week;

// 1. �����İ� ���������� �� 
// 2. �������İ� shellshort�� ��
// 3. bucket ���� �����϶� 
// 4. radix sort �����϶� 


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraySort {
	private static final int MAX = 10000;
	private static final int SIZE = 8000;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ShellSort shell = new ShellSort(); 
		//int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
		int [] array= new int[MAX];	
		int [] temp = new int[MAX];
		int [] temp2 = new int[MAX]; 
		Random R = new Random();
		
		//1. �迭�� ������ ��� 
		for(int i=0; i<array.length; i++)
		{
			//a[i]=i;//����
			array[i]=R.nextInt(SIZE);//����
			temp[i] = array[i];
			temp2[i]=array[i];
		}
		
		
//		// 2. �迭�� ������ �� ���
//		for(int i=0; i < SIZE; i++) {
//			array[i] = R.nextInt(MAX);
//		}
//		Arrays.sort(array);
//		for(int i = 0; i < SIZE; i++) {
//			temp[i] = array[i];
//		}
		
		
//		// 3. �迭�� ������ �� ���
//		for(int i=0; i < SIZE; i++) {
//			array[i] = R.nextInt(MAX);
//		}
//		// int�����δ� reverseOrder ����� �� ��� Integer ������ �����ؾ��� 
//		Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
//		Arrays.sort(arr,Collections.reverseOrder());//Integer ������ ��ȯ�� �� ����
//		
//		
//		array = new int[SIZE];//a�迭 �ٽ� ����ϱ� ���� �ʱ�ȭ 
//		//���ĵ� Integer �迭�� int������ �ٽ� ����ȯ 
//		array = Arrays.stream(arr).mapToInt(i -> i).toArray();
//		
//		for(int i = 0; i < SIZE; i++) {
//			temp[i] = array[i];
//		}
		


//		////////�ڹ� ���� ���� �Լ�//////////////////////////////
//		//Array.sort(array, 2,7);		
//		try{
//			long start = System.currentTimeMillis();
//			Arrays.sort(array); //����
//			long end = System.currentTimeMillis();
//			long diff = end - start; 
//			System.out.println("�ڹ� ���� ���� ����ð�:"+diff);			
//		}catch(Exception e){System.out.println("���� �߻�");}
//		//printArray("Sorted array", array);
//		//int index = Arrays.binarySearch(array, 4); //����Ž��
//		//System.out.println("Found 4 @"+index);// 4�� ����濡 �ֳ�?



		/////////shellsort/////////
		try{
			long start = System.currentTimeMillis();
			shell.shellSort(temp2);
			long end = System.currentTimeMillis();
			long diff = end - start; 
			System.out.println("shell ����ð�:"+diff);			
		}catch(Exception e){System.out.println("���� �߻�");}
	}
	

	private static void printArray(String message, int array[])
	{
		System.out.println(message + ": [length:"+ array.length+"]");
		for(int i=0; i<array.length; i++)
		{
			if(i != 0)
			{
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();

	}

}
