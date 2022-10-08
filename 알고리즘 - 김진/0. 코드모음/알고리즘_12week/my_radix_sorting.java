package 알고리즘_12week;

import java.util.Arrays;
public class my_radix_sorting {
	
	static int get_max_val(int my_arr[], int arr_len) { int max_val = my_arr[0];
		for (int i = 1; i < arr_len; i++) {
			if (my_arr[i] > max_val) {
				max_val = my_arr[i];
			}
		}
		return max_val;
	}
	
	static void countSort(int my_arr[], int arr_len, int exp) {
		int result[] = new int[arr_len]; int i;
		int count[] = new int[10]; Arrays.fill(count,0);
		for (i = 0; i < arr_len; i++) {
			count[ (my_arr[i]/exp)%10 ]++;
		}
		for (i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
		for (i = arr_len - 1; i >= 0; i--) {
			result[count[ (my_arr[i]/exp)%10 ] - 1] = my_arr[i]; 
			count[ (my_arr[i]/exp)%10 ]--;
		}
		for (i = 0; i < arr_len; i++) {
			my_arr[i] = result[i];
		}
		
	}
	
	static void radix_sort(int my_arr[], int arr_len) { 
		int m = get_max_val(my_arr, arr_len);
		
		for (int exp = 1; m/exp > 0; exp *= 10) {
			countSort(my_arr, arr_len, exp);
		}

	}
	
	public static void main (String[] args) {
		int my_arr[] = {56, 78, 102, 345, 67, 90, 102, 45, 78};
		int arr_len = my_arr.length;
		
		System.out.println("The array after performing radix sort is "); 
		radix_sort(my_arr, arr_len);
		
		for (int i=0; i<arr_len; i++) {
			System.out.print(my_arr[i]+" "); 
		}
	}
	
	
}
