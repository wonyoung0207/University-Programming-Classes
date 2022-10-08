package 알고리즘_12week;

// 1. 퀵정렬과 삽입정렬을 비교 
// 2. 삽입정렬과 shellshort를 비교
// 3. bucket 정렬 따라하라 
// 4. radix sort 따라하라 


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
		
		//1. 배열이 랜덤인 경우 
		for(int i=0; i<array.length; i++)
		{
			//a[i]=i;//정렬
			array[i]=R.nextInt(SIZE);//랜덤
			temp[i] = array[i];
			temp2[i]=array[i];
		}
		
		
//		// 2. 배열이 정방향 일 경우
//		for(int i=0; i < SIZE; i++) {
//			array[i] = R.nextInt(MAX);
//		}
//		Arrays.sort(array);
//		for(int i = 0; i < SIZE; i++) {
//			temp[i] = array[i];
//		}
		
		
//		// 3. 배열이 역방향 일 경우
//		for(int i=0; i < SIZE; i++) {
//			array[i] = R.nextInt(MAX);
//		}
//		// int형으로는 reverseOrder 사용할 수 없어서 Integer 형으로 변경해야함 
//		Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
//		Arrays.sort(arr,Collections.reverseOrder());//Integer 형으로 변환한 뒤 정렬
//		
//		
//		array = new int[SIZE];//a배열 다시 사용하기 위해 초기화 
//		//정렬된 Integer 배열을 int형으로 다시 형변환 
//		array = Arrays.stream(arr).mapToInt(i -> i).toArray();
//		
//		for(int i = 0; i < SIZE; i++) {
//			temp[i] = array[i];
//		}
		


//		////////자바 제공 솔팅 함수//////////////////////////////
//		//Array.sort(array, 2,7);		
//		try{
//			long start = System.currentTimeMillis();
//			Arrays.sort(array); //정렬
//			long end = System.currentTimeMillis();
//			long diff = end - start; 
//			System.out.println("자바 제공 솔팅 경과시간:"+diff);			
//		}catch(Exception e){System.out.println("예외 발생");}
//		//printArray("Sorted array", array);
//		//int index = Arrays.binarySearch(array, 4); //이진탐색
//		//System.out.println("Found 4 @"+index);// 4가 몇번방에 있나?



		/////////shellsort/////////
		try{
			long start = System.currentTimeMillis();
			shell.shellSort(temp2);
			long end = System.currentTimeMillis();
			long diff = end - start; 
			System.out.println("shell 경과시간:"+diff);			
		}catch(Exception e){System.out.println("예외 발생");}
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
