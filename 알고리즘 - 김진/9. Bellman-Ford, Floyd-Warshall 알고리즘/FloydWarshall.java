//package �˰���_9week;

// Floyd-Warshall �˰���
// ����ġ �׷��� �� �ִܰ�θ� ���ϴ� �˰�������, ���� ����ġ�� ����Ѵ�. 
// bellmanFord�� ���ͽ�Ʈ�� �˰������ �ٸ��� �����ϴ� ������ �ϳ��� �ƴ϶� �������̴�. 
// ���� V�� ��������ŭ �ð��� �ɸ���. 
// ����ġ ����� ���� �ϳ��� ������ �����ϴ� ���� �ִܰ�θ� ���ϸ� ����� �����. 

// ex) A,B,C,D,E �� A��θ� ���ļ� ���� �� => ���� ���� D���� ���� A�ΰ��� ������ �����ϰ�,
// ���� A���� ���������� B�� C �� �ΰ��� �����Ѵٸ�
// (D -> A , A -> B)   (D -> A,  A->C) �� �����ϸ� ����ġ�� �ִܰŸ��� ����Ѵ�. 

class AllShortestPath{
	public void floydWarshall(int graph[][], int V) {
		int dist[][] = new int[V][V];
		
		for(int i=0; i<V; i++) {//�迭�� ���� 
			for(int j=0; j<V; j++) {
				dist[i][j] = graph[i][j];
				
			}
		}
		
		for(int k=0; k<V; k++) {
			for(int i=0; i<V; i++) {
				for(int j=0; j<V; j++) {
					if(dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		
		for(int i=0; i<V; i++) {
			for(int j=0; j<V; j++) {
				System.out.print("   " + dist[i][j]);
			}
			System.out.println();
		}
		
	}
}

public class FloydWarshall {

	public static void main(String[] args) {
		int INF = 99;
		int V = 5;//���� �� 
		
//		int graph[][] = { 
//				{0, 5, INF, 10},
//				{INF, 0, 3, INF},
//				{INF, INF, 0, 1},
//				{INF, INF, INF, 0}
//		};
		
		int graph[][] = { 
				{0, 3, 8, INF, -4},
				{INF, 0, INF, 1, 7},
				{INF, 4, 0, INF, INF},
				{2, INF, -5, 0, INF},
				{INF, INF, INF, 6, 0},
		};
		
		AllShortestPath a = new AllShortestPath();
		a.floydWarshall(graph, V);
		

	}

}
