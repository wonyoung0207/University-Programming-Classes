package �˰���_9week;

import java.util.Arrays;
//1. BellmanFord �˰��� : 
// ����ġ �׷��� ��, �ִܰŸ��� ���ϴ� �˰�������, ���� ����ġ�� �־ �ִܰŸ��� ���� �� �ִ� �˰����̴�. 
// ���ͽ�Ʈ�� �˰����� ����Ŭ�� �����ؼ��� �ȵǱ� ������ , ����Ŭ �����Ѵٸ� bellmanFord�˰����� ����ؾ� �Ѵ�. 
// ����ġ ����� �̿��Ͽ� �����ִ� ������ ���� ���� �ִ� ��θ� ǥ���Ѵ�. 

//2. ����� ���
// �����ִ� ������ ������ �÷����� �ִܰŸ��� ã�ư���. 
// ������ �ִ� ������ (���� -1 ) ���̴�. 



public class BellmanFord {
	public static final int INF = Integer.MAX_VALUE;// ���Ѵ븦 ǥ���ϱ� ���� ���� 
	
	public static void bellmanFord(int num, int[][] adj, int src) {
		
		int [] dists = new int[num];//������ ���� ǥ���ϴ� �迭 -> 0�̸� ���� 1, 1�̸� ����2
		
		Arrays.fill(dists, INF);
		// ���� fill�� ���� �ǹ̸� ������ for �� 
		/*for(int i = 0; i < num; i++) {
			dists[i] = INF;
		}
		*/
		
		dists[0] = 0;//������ ���۵Ǵ� ��
		for(int v=0; v<num; v++) {
			for(int i=0; i < num; i++) {
				for(int j=0; j <num; j++) {
					if(adj[i][j] != INF) {//������ ���� ���̿� ������ �����Ѵٸ�
						dists[j] = Math.min(dists[j], dists[i] + adj[i][j]);//���� �������� ã�Ƽ� ������ ����ġ�� �����ش�. 
					}
				}
			}
		}
		
		System.out.println("�ִܰŸ� : ");
		for(int i=0; i<num; i++) {
			System.out.print(" " + dists[i]);
		}
		
		System.out.println("");
	}


	public static void main(String[] args) {
		int num = 6;//������ ���� 
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
