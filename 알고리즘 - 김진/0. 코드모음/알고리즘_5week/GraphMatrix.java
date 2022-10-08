package �˰���_5week;
// �迭�� �̿��� �׷��� ǥ�� 

class Graph1{
	int[][] adjMatrix;
	int N;
	public Graph1(int n) {
		N = n;
		adjMatrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j = 0; j < n; j++) {
				adjMatrix[i][j]=0;//��Ʈ������ ��� 0���� �ʱ�ȭ 
			}
		}
	}
	
	public void insertEdge(int u, int v) {//������ ��İ��� �޾ƿ��� �迭�� ǥ�� 
		adjMatrix[u][v] = 1;
		
	}
	
	public void printMatrix() {
		for(int i=0; i<N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(" " + adjMatrix[i][j]);//��Ʈ������ ��� 0���� �ʱ�ȭ 
			}
			System.out.println();
		}
		System.out.println();
	}
	
}

public class GraphMatrix {

	public static void main(String[] args) {//�迭�� �̿��� �׷��� ǥ�� 
		Graph1 g1;
		g1 = new Graph1(7);//7�� 7���� �׷��� ���� => �׷����� ������ �׷����̴�.
		
		// �׷����� �׸��� ���� ������ �Է� 
		g1.insertEdge(0,1);
		g1.insertEdge(0,3);
		g1.insertEdge(0,2);
		g1.insertEdge(1,0);
		g1.insertEdge(1,4);
		g1.insertEdge(2,0);
		g1.insertEdge(2,4);
		g1.insertEdge(2,5);
		g1.insertEdge(3,0);
		g1.insertEdge(3,5);
		g1.insertEdge(4,1);
		g1.insertEdge(4,2);
		g1.insertEdge(4,6);
		g1.insertEdge(5,2);
		g1.insertEdge(5,3);
		g1.insertEdge(5,6);
		g1.insertEdge(6,4);
		g1.insertEdge(6,5);

		
		g1.printMatrix();
		

	}

}
