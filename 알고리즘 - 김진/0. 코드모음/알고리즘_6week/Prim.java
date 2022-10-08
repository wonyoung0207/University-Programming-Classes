package 알고리즘_6week;
import java.util.*;
import java.util.ArrayList;


class Edge_prim implements Comparable<Edge_prim> {//우선순위 큐 안에서 원소를 비교하기 위해 
	int from, to, cost;

	public Edge_prim(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override // Prioirty Queue 우선순위 큐를 사용하기 위한 함수 오버라이딩
	public int compareTo(Edge_prim e) {  
		return this.cost - e.cost;
	}
}

class Graph {
	List<Edge_prim>[] Edge_prim;

	public Graph(int V) {
		Edge_prim = new LinkedList[V];

		for (int i=0; i < V; i++)
			Edge_prim[i] = new LinkedList<>();
	}

	// 양방향 그래프
	public void addEdge_prim(int from, int to, int cost) {
		Edge_prim[from].add(new Edge_prim(from, to, cost));
		Edge_prim[to].add(new Edge_prim(to, from, cost));
	}

}

public class Prim {
	static int V, E, min = 0;
	static Graph g1;
	static boolean[] visited;//방문했는지 표시
	static ArrayList<Edge_prim> mst; //mst간선을 가짐

	public static void Prim() {
		PriorityQueue<Edge_prim> pq = new PriorityQueue<>(); // 가중치가 낮은 순대로 간선을 정렬할 우선순위
		Queue<Integer> queue = new LinkedList<>();      // 정점방문 스케줄 처리를 위한 큐

		queue.add(0);                                   // 정점 1을 시작정점으로 선택

		while (!queue.isEmpty()) {
			int from = queue.poll();
			visited[from] = true;

			for (Edge_prim Edge_prim : g1.Edge_prim[from]) {        // 현재 정점 from과 연결된 간선 중
				if (!visited[Edge_prim.to]) {                // 아직 정점 to를 방문하지 않았다면
					pq.add(Edge_prim);                       // 우선순위 큐에 간선을 추가한다. 우선순위큐이므로 작은것에서 큰 간선으로정렬
				}
			}

			while (!pq.isEmpty()) {// Edge_prims are in pq 
				Edge_prim Edge_prim = pq.poll();             // 가중치가 가장 적은 간선이 나올 것이며,
				if (!visited[Edge_prim.to]) {                // 간선이 연결된 정점 to를 방문한 적이 없다면,
					queue.add(Edge_prim.to);                 // 큐에 삽입하여 다음에 방문한다.
					visited[Edge_prim.to] = true;            // 방문했던 정점을 다시 방문하지 않도록 방문표시.
					mst.add(Edge_prim);                      // 최소 스패닝 트리를 구성하는 간선 추가.
					min += Edge_prim.cost;                   // 총 최소 가중치 합을 구하기 위해 덧셈.
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		V = 6;
		E = 9;
		visited = new boolean[V];
		mst = new ArrayList<>();
		g1 = new Graph(V);

		g1.addEdge_prim(0, 1, 5);
		g1.addEdge_prim(0, 2, 4);
		g1.addEdge_prim(1, 2, 2);
		g1.addEdge_prim(1, 3, 7);
		g1.addEdge_prim(2, 3, 6);
		g1.addEdge_prim(3, 4, 3);
		g1.addEdge_prim(3, 5, 8);
		g1.addEdge_prim(4, 5, 8);

		Prim();

		for (Edge_prim Edge_prim : mst) {
			System.out.println(Edge_prim.from + " - " + Edge_prim.to + " cost : " + Edge_prim.cost);
		}

		System.out.println(min);
	}


}

