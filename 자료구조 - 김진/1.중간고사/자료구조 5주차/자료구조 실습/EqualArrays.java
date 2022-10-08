// Java program to demonstrate
// Array.equals() method
import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get the Arrays
		int intArr[] = { 10, 20, 15, 22, 35 };
		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };
		// To compare both arrays
		System.out.println("Integer Arrays on comparison: "
		+ Arrays.equals(intArr, intArr1));
	}

}
