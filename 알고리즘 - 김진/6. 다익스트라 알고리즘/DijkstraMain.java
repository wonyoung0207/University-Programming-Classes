//package �˰���_6week;
//���ͽ�Ʈ�� �˰��� -> �׺���̼ǿ� ���� 
//1. ���� ����ġ�� ���� �׷������� �ִܰ�θ� ���ϴ� �˰���
//2. ����ġ�� ���� ���� �Ǵ� ����Ŭ�� �ִ� �׷����� 
//   �ִܰ�θ� ���� �� ���� ������ ���ͽ�Ʈ�� �˰��� ��� �Ұ�
//3. �ּ� �켱���� ť�� �ÿ��Ѵ�. 
//4. ������ ������ ����ġ ���� ���� �������� ��.
//   ���õ� ������ ��ó ����ġ �� ���(���� ���� �� ������ �״�� ����)
//   ��� ������ ���õɶ����� ���� 

class Dijkstra{
	int V = 5;//������ ���� 
	public void shortestPath(int graph[][], int src) {//2�����迭�� ������� �μ��� ���� 
		int dist[] = new int[V];//���� 5�� �迭 ����
		Boolean visited[] = new Boolean[V];
		
		for(int i=0; i<V; i++) {//��� ������ �ʱ�ȭ -> �� 5���� ��带 ������ �迭 dist ���� 
			dist[i] = 99;// for�� ���� ��� : {99, 99, 99, 99, 99}
			visited[i] = false;//{false,false,false,false,false}
		}
		dist[0] = 0;//������ 
		
		for(int count=0; count<V; count++) {//graph�� 5�� 5���̶�, �ش� for���� ���� �ݺ����� 
			int u = minDistance(dist, visited);// 5���� ��带 ���� �迭���� ���� ���� ����ġ�� ���� index�� ���Ϲ޴´�. 
			visited[u] = true;//���� ���� ����ġ�� ���� ���� �湮�Ѱ����� �ٲ�. 
			for(int v=0; v<V; v++) {// 5���� ��带 ���������� �湮 , �ش� for���� ���� �ݺ����� 
				if(!visited[v] && dist[u]+graph[u][v] < dist[v]) {// �湮���� �ʾҰ�, 
					dist[v] = dist[u] + graph[u][v];//dist���� ���� ���� ���Ҹ� ������ ����� ����ġ�� ������.
					// ���� ��忡�� ���� ���� ����ġ��, graph���� ���� ����ġ�� �����ش�. 
					System.out.println("u: " + u + " ,v: "+ v +" , �������("+ dist[u] + " ," + graph[u][v] +")"+ ", dist:" +dist[v] );
				}
			}
			
		}
		
		printShortestPath(dist);
		
	}
	int minDistance(int[] dist, Boolean[] visited) {
		int min=99;//�ּ� ����ġ�� ���ϱ� ���� ���� ū ����ġ���� ��� 
		int minIndex=-1;
		for(int v=0; v<V; v++) {//���� ������ 5���� ��带 ���� �迭�� ���ʷ� �� 
			if(!visited[v] && dist[v]<= min) {
				// 5���� ��� �� �湮���� ���� ��带 Ȯ���ϰ�, �� �� �� ���� ���� ���� �ε����� ���Ѵ�.   
				min = dist[v];//���� ���� ���Ҹ� min�� ������. 
				minIndex=v;//���� ���� ������ �ε����� ������. 
			}
		}
		return minIndex;//���� ���� ���Ҹ� ���� �ε����� �����Ѵ�. 
	}
	
	public void printShortestPath(int dist[]) {
		for(int i = 0; i<V; i++) {
			System.out.println("0 -> " + i + ", ��������ġ : " + dist[i]);
		}
		System.out.println();
	}
}


public class DijkstraMain {

	public static void main(String[] args) {
//		int graph[][] = new int[][] {//99�� �� �κ��� ���Ѵ��� ������. 
//			{0, 5, 10, 99, 99},
//			{99, 0, 3, 9, 2},
//			{99, 2, 0, 1, 99},
//			{99, 99, 99, 0, 4},
//			{7, 99, 99, 6, 0},
//		};
		
		int graph[][] = new int[][] {//99�� �� �κ��� ���Ѵ��� ������. 
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
