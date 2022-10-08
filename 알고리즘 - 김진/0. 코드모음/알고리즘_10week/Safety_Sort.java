package �˰���_10week;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Safety_Sort {
	private static final int MAX = 100000;
	private static final int SIZE = 100000;
	
	
	public static void Sorting_SelectionSort(int[] a) {
		int len = a.length;
		
		for(int i=0; i < len-1; i++) {
			int min_idx = i;
			
			for(int j=i+1; j<len; j++) {
				if(a[j] < a[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		
//		for(int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + ", ");
//		}
	}
	
	public static void Sorting_insertSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int temp = a[i];
			int j;
			for(j = i-1; j>=0 && temp < a[j]; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
		
//		for(int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + ", ");
//		}
		
	}
	
	
	public static void Sorting_bubbleSort(int a[]) {
		int len = a.length;
		int i,j,temp;

		for(i=0; i<len-1; i++) {
			for(j=0; j< len-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
//		for(int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + ", ");
//		}
	}
	
	
	public static void Sorting_FlagbubbleSort(int a[]) {
		int len = a.length;
		int i,j,temp;
		boolean swap = false;
		
		for(i=0; i<len-1; i++) {
			swap=false;
			for(j=0; j< len-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
		
//		for(int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + ", ");
//		}
	}
	
	public static void main(String[] args) {
		int a[]	= new int[SIZE];
		int b[]	= new int[SIZE];
		int c[]	= new int[SIZE];
		int d[]	= new int[SIZE];
		Random r = new Random();
		
		// 1. �迭�� ������ ��� 
		for(int i=0; i < SIZE; i++) {
			a[i] = r.nextInt(MAX);
			b[i] = a[i];
			c[i] = a[i];
			d[i] = a[i];
		}
		
		
		
//		// 2. �迭�� ������ �� ���
//		for(int i=0; i < SIZE; i++) {
//			a[i] = r.nextInt(MAX);
//		}
//		Arrays.sort(a);
//		for(int i = 0; i < SIZE; i++) {
//			b[i] = a[i];
//			c[i] = a[i];
//			d[i] = a[i];
//		}
		
		
		
//		// 3. �迭�� ������ �� ���
//		for(int i=0; i < SIZE; i++) {
//			a[i] = r.nextInt(MAX);
//		}
//		// int�����δ� reverseOrder ����� �� ��� Integer ������ �����ؾ��� 
//		Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
//		Arrays.sort(arr,Collections.reverseOrder());//Integer ������ ��ȯ�� �� ����
//		
//		
//		a = new int[SIZE];//a�迭 �ٽ� ����ϱ� ���� �ʱ�ȭ 
//		//���ĵ� Integer �迭�� int������ �ٽ� ����ȯ 
//		a = Arrays.stream(arr).mapToInt(i -> i).toArray();
//		
//		for(int i = 0; i < SIZE; i++) {
//			b[i] = a[i];
//			c[i] = a[i];
//			d[i] = a[i];
//		}
		
		

		System.out.println("++++++ Sorting_insertSort() ���� ++++++");
		long start = System.currentTimeMillis();
		Sorting_insertSort(a);
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("Time sort = " + (end - start));
		
		
		System.out.println("++++++ Sorting_SelectionSort() ���� ++++++");
		start = System.currentTimeMillis();
		Sorting_SelectionSort(b);
		System.out.println();
		end = System.currentTimeMillis();
		System.out.println("Time sort = " + (end - start));
		
		
		System.out.println("++++++ Sorting_BubbleSort() ���� ++++++");
		start = System.currentTimeMillis();
		Sorting_bubbleSort(c);
		System.out.println();
		end = System.currentTimeMillis();
		System.out.println("Time sort = " + (end - start));
				
		
		System.out.println("++++++ Sorting_FlagBubbleSort() ���� ++++++");
		start = System.currentTimeMillis();
		Sorting_FlagbubbleSort(d);
		System.out.println();
		end = System.currentTimeMillis();
		System.out.println("Time sort = " + (end - start));

	}

}
