
// Java implementation to
// sort the given matrix
import java.io.*;
import java.util.*;

class SortMatrix {
	static int SIZE = 10;

	// function to sort the given matrix
	static void sortMat(int mat[][], int n) {
		// temporary matrix of size n^2
		int temp[] = new int[n * n];
		int k = 0;
		// copy the elements of matrix
		// one by one into temp[]
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				temp[k++] = mat[i][j];
		// sort temp[]
		Arrays.sort(temp);
		// copy the elements of temp[]
		// one by one in mat[][]
		k = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				mat[i][j] = temp[k++];
	}

	// function to print the given matrix
	static void printMat(int mat[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	// Driver program to test above
	public static void main(String args[]) {
		int mat[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };
		int n = 3;
		System.out.println("Original Matrix:");
		printMat(mat, n);
		sortMat(mat, n);
		System.out.println("Matrix After Sorting:");
		printMat(mat, n);
	}
}