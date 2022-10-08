package �˰���_11week;
import java.util.*;


public class SortMain {
	private static final int MAX = 100000;
	private static final int SIZE = 2000;
	
	public static void main(String[] args) {				
					
		int a[]	= new int[SIZE];
		int b[]	= new int[SIZE];
		int c[]	= new int[SIZE];
		Random r = new Random();
		
//		// 1. �迭�� ������ ��� 
//		for(int i=0; i < SIZE; i++) {
//			a[i] = r.nextInt(MAX);
//			b[i] = a[i];
//			c[i] = a[i];
//		}
		
		
		
//		// 2. �迭�� ������ �� ���
//		for(int i=0; i < SIZE; i++) {
//			a[i] = r.nextInt(MAX);
//		}
//		Arrays.sort(a);
//		for(int i = 0; i < SIZE; i++) {
//			b[i] = a[i];
//			c[i] = a[i];
//		}
		
		
		
		// 3. �迭�� ������ �� ���
		for(int i=0; i < SIZE; i++) {
			a[i] = r.nextInt(MAX);
		}
		// int�����δ� reverseOrder ����� �� ��� Integer ������ �����ؾ��� 
		Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());//Integer ������ ��ȯ�� �� ����
		
		
		a = new int[SIZE];//a�迭 �ٽ� ����ϱ� ���� �ʱ�ȭ 
		//���ĵ� Integer �迭�� int������ �ٽ� ����ȯ 
		a = Arrays.stream(arr).mapToInt(i -> i).toArray();
		
		for(int i = 0; i < SIZE; i++) {
			b[i] = a[i];
			c[i] = a[i];
		}


		
		
		try{
			
			// QuickSort �� �ɸ��� �ð� ����
			long start = System.currentTimeMillis();
			Sorting.quickSort(a);
			long end = System.currentTimeMillis();
			long diff= end - start;
			System.out.println(" ");
			System.out.println("quickSort �ð� : " + diff);
			
			
			// mergeSort �� �ɸ��� �ð� ����
//			start = System.currentTimeMillis();
//			Sorting.mergeSort(b);
//			end = System.currentTimeMillis();
//			diff= end - start;
//			System.out.println(" ");
//			System.out.println("mergeSort �ð� : " + diff);
//			
			
			// heapSort �� �ɸ��� �ð� ����
//			start = System.currentTimeMillis();
//			Sorting.heapSort(c);
//			end = System.currentTimeMillis();
//			diff= end - start;
//			System.out.println(" ");
//			System.out.println("heapSort �ð� : " + diff);
//			
			
		} catch (Exception e){
			System.out.println("An exception occurs");
		}
		
		
	}

}
