
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
			int n;//�������� ����
	        int row,col;//�� ��
	        int k=0;//������ �������� �� ���� ���ҵǴ� ��,�� ��ŭ ����� ����
	        int snail[][]= new int [5][5];//������ �迭
	        int i =1;//������ �迭�� ���� ����      
	        
	        for(n=5; n > 0; n -= 2){//���ؿ� ������ ���� ��� �ݺ�����
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
	        
	        //��¹�
	        for(row=0;row<5;row++){
	            for(col=0;col<5;col++){
	                System.out.printf("%3d",snail[row][col]);
	            }
	            System.out.println("");
	        }
	}
	
}
