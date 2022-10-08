//package 알고리즘_6week;
//다익스트라 알고리즘 -> 네비게이션에 사용됨 
//1. 양의 가중치를 가진 그래프에서 최단경로를 구하는 알고리즘
//2. 가중치의 합이 음이 되는 사이클이 있는 그래프는 
//   최단경로를 구할 수 없기 때문에 다익스트라 알고리즘 사용 불가
//3. 최소 우선순위 큐를 시용한다. 
//4. 인접한 정점중 가중치 합이 낮은 정점으로 감.
//   선택된 정점을 거처 가중치 합 계산(기존 합이 더 작으면 그대로 진행)
//   모든 정점이 선택될때까지 진행 

class Dijkstra{
	int V = 5;//정점의 갯수 
	public void shortestPath(int graph[][], int src) {//2차원배열과 출발점을 인수로 받음 
		int dist[] = new int[V];//정점 5개 배열 생성
		Boolean visited[] = new Boolean[V];
		
		for(int i=0; i<V; i++) {//모든 정점을 초기화 -> 총 5개의 노드를 가지는 배열 dist 생성 
			dist[i] = 99;// for문 수행 결과 : {99, 99, 99, 99, 99}
			visited[i] = false;//{false,false,false,false,false}
		}
		dist[0] = 0;//시작점 
		
		for(int count=0; count<V; count++) {//graph가 5행 5열이라, 해당 for문은 행을 반복수행 
			int u = minDistance(dist, visited);// 5개의 노드를 가진 배열에서 가장 작은 가중치를 가진 index를 리턴받는다. 
			visited[u] = true;//가장 작은 가중치를 가진 것을 방문한것으로 바꿈. 
			for(int v=0; v<V; v++) {// 5개의 노드를 순차적으로 방문 , 해당 for문은 열의 반복수행 
				if(!visited[v] && dist[u]+graph[u][v] < dist[v]) {// 방문하지 않았고, 
					dist[v] = dist[u] + graph[u][v];//dist에는 가장 작은 원소를 가지는 노드의 가중치를 가진다.
					// 현재 노드에서 가장 작은 가중치와, graph에서 나온 가중치를 더해준다. 
					System.out.println("u: " + u + " ,v: "+ v +" , 간선경로("+ dist[u] + " ," + graph[u][v] +")"+ ", dist:" +dist[v] );
				}
			}
			
		}
		
		printShortestPath(dist);
		
	}
	int minDistance(int[] dist, Boolean[] visited) {
		int min=99;//최소 가중치를 구하기 위해 가장 큰 가중치부터 계산 
		int minIndex=-1;
		for(int v=0; v<V; v++) {//현재 가져온 5개의 노드를 가진 배열을 차례로 비교 
			if(!visited[v] && dist[v]<= min) {
				// 5개의 노드 중 방문하지 않은 노드를 확인하고, 그 값 중 가장 작은 값의 인덱스를 구한다.   
				min = dist[v];//가장 작은 원소를 min이 가진다. 
				minIndex=v;//가장 작은 원소의 인덱스를 가진다. 
			}
		}
		return minIndex;//가장 작은 원소를 가진 인덱스를 리턴한다. 
	}
	
	public void printShortestPath(int dist[]) {
		for(int i = 0; i<V; i++) {
			System.out.println("0 -> " + i + ", 누적가중치 : " + dist[i]);
		}
		System.out.println();
	}
}


public class DijkstraMain {

	public static void main(String[] args) {
//		int graph[][] = new int[][] {//99로 된 부분은 무한대라고 생각함. 
//			{0, 5, 10, 99, 99},
//			{99, 0, 3, 9, 2},
//			{99, 2, 0, 1, 99},
//			{99, 99, 99, 0, 4},
//			{7, 99, 99, 6, 0},
//		};
		
		int graph[][] = new int[][] {//99로 된 부분은 무한대라고 생각함. 
			{99, 3, 8, 99, 4},
			{99, 99, 99, 1, 7},
			{99, 4, 99, 99, 99},
			{2, 99, 5, 99, 99},
			{99, 99, 99, 6, 99},
		};
		
		Dijkstra g1 = new Dijkstra();
		g1.shortestPath(graph, 0);

	}

}
