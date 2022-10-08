package 알고리즘_5week;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


//연결리스트로 그래프 구현 

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
	
	//DFS(깊이우선탐색) 와 BFS(너비우선탐색) 에 사용하기 위한 변수 
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
	
	
	public void DFS(int startV) { // 깊이우선탐색으로, 스택을 사용한다. 
		// startV : 시작할 노드를 정함 
		Node tmpNode;
		int v;
		
		for(int i=0; i < N; i++) {
			visited[i] = false;
		}
		Stack s = new Stack();
		s.push(startV);
		while(!s.isEmpty()) {// 스택이 비어있을때까지 실행 
			v = (int)s.pop();
			if(visited[v] == false) {// 방문하지 않았으면 실행
				visited[v] = true; // 방문한 것으로 바꾸고
				System.out.print(" -> " + v); // 해당 값을 output 해준다. 
				tmpNode = header[v]; //연결리스트 사용 
				while(tmpNode != null) {// 연결리스트에 값이 들어 있을경우 실행
					if( visited[tmpNode.data] == false) {
						// 방문한 데이터가 방문이 안된 데이터라면 
						s.push(tmpNode.data);//다시 push로 stack 에 넣어줌 
					}
					tmpNode = tmpNode.link;
				}
			}
			
		}System.out.println();
	}
	
	public void BFS(int startV) { // 깊이우선탐색으로, 스택을 사용한다. 
		// startV : 시작할 노드를 정함 
		Node tmpNode;
		int v;
		
		for(int i=0; i < N; i++) {
			visited[i] = false;
		}
		Queue<Integer> q = new LinkedList();
		q.add(startV);
		while(!q.isEmpty()) {// 스택이 비어있을때까지 실행 
			v = (int)q.remove();
			if(visited[v] == false) {// 방문하지 않았으면 실행
				visited[v] = true; // 방문한 것으로 바꾸고
				System.out.print(" -> " + v); // 해당 값을 output 해준다. 
				tmpNode = header[v]; //연결리스트 사용 
				while(tmpNode != null) {// 연결리스트에 값이 들어 있을경우 실행
					if( visited[tmpNode.data] == false) {
						// 방문한 데이터가 방문이 안된 데이터라면 
						q.add(tmpNode.data);//다시 push로 stack 에 넣어줌 
					}
					tmpNode = tmpNode.link;
				}
			}
			
		}System.out.println();
	}
	
}

public class GraphList {

	public static void main(String[] args) {//연결리스트로 그래프 구현 
		Graph2 g2 = new Graph2();
		g2.build();
		System.out.println("Graph g2 -> List로 구현");
		g2.printList();
		
		System.out.println("Graph DFS -> Stack 으로 구현");
		g2.DFS(0);
		System.out.println("Graph BFS -> Queue 으로 구현");
		g2.BFS(0);
	}

}
