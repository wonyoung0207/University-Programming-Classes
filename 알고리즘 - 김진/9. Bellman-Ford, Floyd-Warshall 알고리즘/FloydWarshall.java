//package 알고리즘_9week;

// Floyd-Warshall 알고리즘
// 가중치 그래프 중 최단경로를 구하는 알고리즘으로, 음의 가중치도 고려한다. 
// bellmanFord와 다익스트라 알고리즘과는 다르게 시작하는 정점이 하나가 아니라 여러개이다. 
// 따라서 V의 세제곱만큼 시간이 걸린다. 
// 가중치 행렬을 통해 하나의 정점을 경유하는 경우로 최단경로를 구하며 행렬을 만든다. 

// ex) A,B,C,D,E 중 A경로를 거쳐서 가는 것 => 만약 정점 D에서 정점 A로가는 간선이 존재하고,
// 정점 A에서 진출차수가 B와 C 로 두개가 존재한다면
// (D -> A , A -> B)   (D -> A,  A->C) 로 진행하며 가중치로 최단거리를 계산한다. 

class AllShortestPath{
	public void floydWarshall(int graph[][], int V) {
		int dist[][] = new int[V][V];
		
		for(int i=0; i<V; i++) {//배열을 복사 
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
		int V = 5;//정점 수 
		
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
