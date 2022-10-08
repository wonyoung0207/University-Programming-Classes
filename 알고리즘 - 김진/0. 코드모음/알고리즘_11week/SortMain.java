package 알고리즘_11week;
import java.util.*;


public class SortMain {
	private static final int MAX = 100000;
	private static final int SIZE = 2000;
	
	public static void main(String[] args) {				
					
		int a[]	= new int[SIZE];
		int b[]	= new int[SIZE];
		int c[]	= new int[SIZE];
		Random r = new Random();
		
//		// 1. 배열이 랜덤인 경우 
//		for(int i=0; i < SIZE; i++) {
//			a[i] = r.nextInt(MAX);
//			b[i] = a[i];
//			c[i] = a[i];
//		}
		
		
		
//		// 2. 배열이 정방향 일 경우
//		for(int i=0; i < SIZE; i++) {
//			a[i] = r.nextInt(MAX);
//		}
//		Arrays.sort(a);
//		for(int i = 0; i < SIZE; i++) {
//			b[i] = a[i];
//			c[i] = a[i];
//		}
		
		
		
		// 3. 배열이 역방향 일 경우
		for(int i=0; i < SIZE; i++) {
			a[i] = r.nextInt(MAX);
		}
		// int형으로는 reverseOrder 사용할 수 없어서 Integer 형으로 변경해야함 
		Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());//Integer 형으로 변환한 뒤 정렬
		
		
		a = new int[SIZE];//a배열 다시 사용하기 위해 초기화 
		//정렬된 Integer 배열을 int형으로 다시 형변환 
		a = Arrays.stream(arr).mapToInt(i -> i).toArray();
		
		for(int i = 0; i < SIZE; i++) {
			b[i] = a[i];
			c[i] = a[i];
		}


		
		
		try{
			
			// QuickSort 에 걸리는 시간 측정
			long start = System.currentTimeMillis();
			Sorting.quickSort(a);
			long end = System.currentTimeMillis();
			long diff= end - start;
			System.out.println(" ");
			System.out.println("quickSort 시간 : " + diff);
			
			
			// mergeSort 에 걸리는 시간 측정
//			start = System.currentTimeMillis();
//			Sorting.mergeSort(b);
//			end = System.currentTimeMillis();
//			diff= end - start;
//			System.out.println(" ");
//			System.out.println("mergeSort 시간 : " + diff);
//			
			
			// heapSort 에 걸리는 시간 측정
//			start = System.currentTimeMillis();
//			Sorting.heapSort(c);
//			end = System.currentTimeMillis();
//			diff= end - start;
//			System.out.println(" ");
//			System.out.println("heapSort 시간 : " + diff);
//			
			
		} catch (Exception e){
			System.out.println("An exception occurs");
		}
		
		
	}

}
