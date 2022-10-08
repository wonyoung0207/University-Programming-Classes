package �˰���_5week;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


//���Ḯ��Ʈ�� �׷��� ���� 

class Node{
	int data;
	Node link;
	
	Node(int n, Node m){
		data = n;
		link = m;
	}
}

class Graph2{
	int N = 7;
	Node header[] = new Node[N];
	
	//DFS(���̿켱Ž��) �� BFS(�ʺ�켱Ž��) �� ����ϱ� ���� ���� 
	boolean visited[] = new boolean[N];// true : visited, false : unvisited
	
	public void build() {
		Node tmpNode;
		tmpNode = new Node(3,null);
		tmpNode = new Node(2,tmpNode);
		tmpNode = new Node(1,tmpNode);
		header[0] = tmpNode;
		header[1] = new Node(0, new Node(4,null));
		header[2] = new Node(0, new Node(4, new Node(5, null)));
		header[3] = new Node(0, new Node(5, null));
		header[4] = new Node(1, new Node(5, new Node(6,null)));
		header[5] = new Node(2, new Node(3, new Node(6,null)));
		header[6] = new Node(4, new Node(5, null));
			
		
	}
	
	
	public void printList() {
		Node tmpNode;
		for(int i=0; i < N; i++) {
			tmpNode = header[i];
			System.out.print(i + " : ");
			while(tmpNode != null) {
				System.out.print(" -> " + tmpNode.data);
				tmpNode = tmpNode.link;
				
			}
			
			System.out.println();
		}
	}
	
	
	public void DFS(int startV) { // ���̿켱Ž������, ������ ����Ѵ�. 
		// startV : ������ ��带 ���� 
		Node tmpNode;
		int v;
		
		for(int i=0; i < N; i++) {
			visited[i] = false;
		}
		Stack s = new Stack();
		s.push(startV);
		while(!s.isEmpty()) {// ������ ������������� ���� 
			v = (int)s.pop();
			if(visited[v] == false) {// �湮���� �ʾ����� ����
				visited[v] = true; // �湮�� ������ �ٲٰ�
				System.out.print(" -> " + v); // �ش� ���� output ���ش�. 
				tmpNode = header[v]; //���Ḯ��Ʈ ��� 
				while(tmpNode != null) {// ���Ḯ��Ʈ�� ���� ��� ������� ����
					if( visited[tmpNode.data] == false) {
						// �湮�� �����Ͱ� �湮�� �ȵ� �����Ͷ�� 
						s.push(tmpNode.data);//�ٽ� push�� stack �� �־��� 
					}
					tmpNode = tmpNode.link;
				}
			}
			
		}System.out.println();
	}
	
	public void BFS(int startV) { // ���̿켱Ž������, ������ ����Ѵ�. 
		// startV : ������ ��带 ���� 
		Node tmpNode;
		int v;
		
		for(int i=0; i < N; i++) {
			visited[i] = false;
		}
		Queue<Integer> q = new LinkedList();
		q.add(startV);
		while(!q.isEmpty()) {// ������ ������������� ���� 
			v = (int)q.remove();
			if(visited[v] == false) {// �湮���� �ʾ����� ����
				visited[v] = true; // �湮�� ������ �ٲٰ�
				System.out.print(" -> " + v); // �ش� ���� output ���ش�. 
				tmpNode = header[v]; //���Ḯ��Ʈ ��� 
				while(tmpNode != null) {// ���Ḯ��Ʈ�� ���� ��� ������� ����
					if( visited[tmpNode.data] == false) {
						// �湮�� �����Ͱ� �湮�� �ȵ� �����Ͷ�� 
						q.add(tmpNode.data);//�ٽ� push�� stack �� �־��� 
					}
					tmpNode = tmpNode.link;
				}
			}
			
		}System.out.println();
	}
	
}

public class GraphList {

	public static void main(String[] args) {//���Ḯ��Ʈ�� �׷��� ���� 
		Graph2 g2 = new Graph2();
		g2.build();
		System.out.println("Graph g2 -> List�� ����");
		g2.printList();
		
		System.out.println("Graph DFS -> Stack ���� ����");
		g2.DFS(0);
		System.out.println("Graph BFS -> Queue ���� ����");
		g2.BFS(0);
	}

}
