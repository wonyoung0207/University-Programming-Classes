package 알고리즘_9week;

import java.util.Arrays;
//1. BellmanFord 알고리즘 : 
// 가중치 그래프 중, 최단거리를 구하는 알고리즘으로, 음의 가중치가 있어도 최단거리를 구할 수 있는 알고리즘이다. 
// 다익스트라 알고리즘은 사이클이 존재해서는 안되기 때문에 , 사이클 존재한다면 bellmanFord알고리즘을 사용해야 한다. 
// 가중치 행렬을 이용하여 갈수있는 간선의 수에 따른 최단 경로를 표시한다. 

//2. 만드는 방법
// 갈수있는 간선의 갯수를 늘려가며 최단거리를 찾아간다. 
// 간선의 최대 갯수는 (정점 -1 ) 개이다. 



public class BellmanFord {
	public static final int INF = Integer.MAX_VALUE;// 무한대를 표시하기 위한 변수 
	
	public static void bellmanFord(int num, int[][] adj, int src) {
		
		int [] dists = new int[num];//간선의 수를 표시하는 배열 -> 0이면 간선 1, 1이면 간선2
		
		Arrays.fill(dists, INF);
		// 위의 fill과 같은 의미를 가지는 for 문 
		/*for(int i = 0; i < num; i++) {
			dists[i] = INF;
		}
		*/
		
		dists[0] = 0;//간선이 시작되는 곳
		for(int v=0; v<num; v++) {
			for(int i=0; i < num; i++) {
				for(int j=0; j <num; j++) {
					if(adj[i][j] != INF) {//정점과 정점 사이에 간선이 존재한다면
						dists[j] = Math.min(dists[j], dists[i] + adj[i][j]);//가장 작은것을 찾아서 간선의 가중치로 적어준다. 
					}
				}
			}
		}
		
		System.out.println("최단거리 : ");
		for(int i=0; i<num; i++) {
			System.out.print(" " + dists[i]);
		}
		
		System.out.println("");
	}


	public static void main(String[] args) {
		int num = 6;//정점의 갯수 
//		int [][] adj = new int [][] {
//			{0, 6, INF, 7, INF},
//			{INF, 0, 5, 8, -4},
//			{INF, -2, 0, INF, INF},
//			{INF, INF, -3, 0, 9},
//			{2, INF, 7, INF, 0}
//		};
		
		int [][] adj = new int [][] {
			{0, 6, 5, 5, INF,INF},
			{INF, 0, INF, 5, -1,INF},
			{INF, -2, 0, INF, 1,INF},
			{INF, -3, INF, 0, INF,-1},
			{0, INF, INF, INF, 0,3},
			{INF, INF, INF, INF, INF,0}
		};
		
		int src = 0;
		bellmanFord(num, adj, src);

	}

}
