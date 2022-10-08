
public class TwoDimArray {

	public static void main(String[] args) {
/* init1
		int cnt = 10;
		int arr[][] = new int[5][4];
		
		for(int row = 0; row != arr.length; row++) {
			for(int col = 0; col != 4; col++) {
				arr[row][col] = cnt;
				cnt++;
				//System.out.println(arr[row][col]);
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
*/
/* init2
		 * int cnt = 10;
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
*/
			int n;//달팽이의 차수
	        int row,col;//행 열
	        int k=0;//달팽이 안쪽으로 들어갈 수록 감소되는 행,열 만큼 깍아줄 변수
	        int snail[][]= new int [5][5];//달팽이 배열
	        int i =1;//달팽이 배열에 넣을 숫자      
	        
	        for(n=5; n > 0; n -= 2){//달팽에 차수에 따라 몇번 반복할지
	            for(col=0; col < n; col++){
	                snail[k][k+col] = i;
	                i++;	                       
	            }
	            for(row=1; row < n; row++){
	                snail[k+row][5-k-1]=i;
	                i++;
	            }
	            for(col=1;col < n; col++){
	                snail[k+row-1][5-k-col-1]=i;
	                i++;
	            }
	            for(col=1; col< n-1; col++){
	                snail[5-k-col-1][k]=i;
	                i++;
	            }
	            k++;
	        }
	        
	        //출력문
	        for(row=0;row<5;row++){
	            for(col=0;col<5;col++){
	                System.out.printf("%3d",snail[row][col]);
	            }
	            System.out.println("");
	        }
	}
	
}
