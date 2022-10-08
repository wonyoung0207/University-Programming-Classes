import java.util.*;

public class sum1 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			for (int i = 1; i < n; i++) {
				sum = sum + i;
			}
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference 걸린시간 : " + diff);
			System.out.println(sum);

		} catch (Exception e) {
			System.out.println("An exception occurs");
		}
	}
}
