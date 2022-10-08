import java.io.*;

class MoveZero {
// Function which pushes all zeros to end of an array.
	static void pushZerosToEnd(int arr[], int n) {
// Ã¤¿ö¶ó
		int []temp=new int[n];
		int k=0;
		
		for (int i = 0; i < n; i++) {
			if(arr[i]!=0) {
				temp[k++]=arr[i];
			}

		}
		for (int x=0;x<temp.length;x++) {
			arr[x]=temp[x];
			
		}

				
	}

	/* Driver function to check for above functions */
	/* Driver function to check for above functions */
	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}