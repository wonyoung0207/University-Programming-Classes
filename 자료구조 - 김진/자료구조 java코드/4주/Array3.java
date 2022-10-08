
public class Array3 {

	public static void main(String[] args) {
		int cnt = 10;
		int arr[][] = new int[5][4];
		
		for(int row = 0; row != 5; row++) {
			for(int col = 3; col >= 0; col--) {
				arr[row][col] = cnt;
				cnt++;				
			}
		}
		
		for(int i = 0; i !=5;i++) {
			for(int j = 0; j !=4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
				
					
			
		
	}
}
