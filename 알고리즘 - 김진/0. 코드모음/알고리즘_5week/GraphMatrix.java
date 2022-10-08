package 알고리즘_5week;
// 배열을 이용한 그래프 표시 

class Graph1{
	int[][] adjMatrix;
	int N;
	public Graph1(int n) {
		N = n;
		adjMatrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j = 0; j < n; j++) {
				adjMatrix[i][j]=0;//메트릭스를 모두 0으로 초기화 
			}
		}
	}
	
	public void insertEdge(int u, int v) {//간선의 행렬값을 받아오면 배열로 표시 
		adjMatrix[u][v] = 1;
		
	}
	
	public void printMatrix() {
		for(int i=0; i<N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(" " + adjMatrix[i][j]);//메트릭스를 모두 0으로 초기화 
			}
			System.out.println();
		}
		System.out.println();
	}
	
}

public class GraphMatrix {

	public static void main(String[] args) {//배열을 이용한 그래프 표시 
		Graph1 g1;
		g1 = new Graph1(7);//7행 7열의 그래프 생성 => 그래프는 무방향 그래프이다.
		
		// 그래프의 그림을 보고 간선을 입력 
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
