package �˰���_6week;
import java.util.*;
import java.util.ArrayList;


class Edge_prim implements Comparable<Edge_prim> {//�켱���� ť �ȿ��� ���Ҹ� ���ϱ� ���� 
	int from, to, cost;

	public Edge_prim(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override // Prioirty Queue �켱���� ť�� ����ϱ� ���� �Լ� �������̵�
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

	// ����� �׷���
	public void addEdge_prim(int from, int to, int cost) {
		Edge_prim[from].add(new Edge_prim(from, to, cost));
		Edge_prim[to].add(new Edge_prim(to, from, cost));
	}

}

public class Prim {
	static int V, E, min = 0;
	static Graph g1;
	static boolean[] visited;//�湮�ߴ��� ǥ��
	static ArrayList<Edge_prim> mst; //mst������ ����

	public static void Prim() {
		PriorityQueue<Edge_prim> pq = new PriorityQueue<>(); // ����ġ�� ���� ����� ������ ������ �켱����
		Queue<Integer> queue = new LinkedList<>();      // �����湮 ������ ó���� ���� ť

		queue.add(0);                                   // ���� 1�� ������������ ����

		while (!queue.isEmpty()) {
			int from = queue.poll();
			visited[from] = true;

			for (Edge_prim Edge_prim : g1.Edge_prim[from]) {        // ���� ���� from�� ����� ���� ��
				if (!visited[Edge_prim.to]) {                // ���� ���� to�� �湮���� �ʾҴٸ�
					pq.add(Edge_prim);                       // �켱���� ť�� ������ �߰��Ѵ�. �켱����ť�̹Ƿ� �����Ϳ��� ū ������������
				}
			}

			while (!pq.isEmpty()) {// Edge_prims are in pq 
				Edge_prim Edge_prim = pq.poll();             // ����ġ�� ���� ���� ������ ���� ���̸�,
				if (!visited[Edge_prim.to]) {                // ������ ����� ���� to�� �湮�� ���� ���ٸ�,
					queue.add(Edge_prim.to);                 // ť�� �����Ͽ� ������ �湮�Ѵ�.
					visited[Edge_prim.to] = true;            // �湮�ߴ� ������ �ٽ� �湮���� �ʵ��� �湮ǥ��.
					mst.add(Edge_prim);                      // �ּ� ���д� Ʈ���� �����ϴ� ���� �߰�.
					min += Edge_prim.cost;                   // �� �ּ� ����ġ ���� ���ϱ� ���� ����.
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

