import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int sum = 0,avg;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("(i+1)번째 수 입력");
			int n = sc.nextInt();
			if(n < 0 ||n>100) {
				System.out.println("오류 입니다. 1부터 100까지 숫자 입력해주세요");
				i--;
				continue;
			}
			a[i] = n;
			sum += n;
							
		}
		avg = sum/10;
		System.out.println("성적의 총합 : "+ sum + "\n성적의 평균은 : " + avg);
	}

}
