package 알고리즘_6week;
import java.util.ArrayList;
import java.util.Collections;
 

//1.Union find 진행 시 둘 중 큰 부모의 간선으로 간선이 향하게 만든다. 
//2.루트를 비교해서 부모가 같으면 사이클이 존재하는 것임

//Comparable 은 정렬을 위해서
class Edge implements Comparable<Edge> {//간선과 가중치를 나타냄 
    int v1;
    int v2;
    int cost;
 
    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
 
    @Override
    public int compareTo(Edge o) {  // cost를 가지고 정렬을 하겠다고 기준을 만듬
        if (this.cost < o.cost) {
            return - 1;
        }
        else if (this.cost == o.cost) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
 
public class Kruskal {
    public static int[] parent;
    public static ArrayList<Edge> edgeList;
 
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
 
        if (x != y) {
            parent[y] = x;
        }
    }
 
    public static int find(int x) {  // 부모 노드 찾는 메소드
        if (parent[x] == x) {// 부모 노드를 찾아가는 곳. -> 루트를 비교해서 부모노드가 같으면 사이클이 있는것임 
            return x;//부모와 x 노드가 같으면 사이클이 있는것임 
        }
 
        return parent[x] = find(parent[x]);
    }
 
    //same parent means cycle
    public static boolean isSameParent(int x, int y) {
        x = find(x);  // find 메소드를 통해서 부모 노드 번호를 리턴 받음
        y = find(y);
 
        if (x == y) {
            return true;
        }
        else {
            return false;
        }
    }
 
    public static void main(String[] args) {
        edgeList = new ArrayList<Edge>();
 
//        edgeList.add(new Edge(0, 1, 5));//간선을 나타냄 -> 정점0과1의 가중치 5
//        edgeList.add(new Edge(0, 2, 4));   
//        edgeList.add(new Edge(1, 2, 2));
//        edgeList.add(new Edge(1, 3, 7));
//        edgeList.add(new Edge(2, 3, 6));
//        edgeList.add(new Edge(3, 4, 3));
//        edgeList.add(new Edge(3, 5, 8));
//        edgeList.add(new Edge(4, 5, 8));
        
        edgeList.add(new Edge(1, 2, 8));
        edgeList.add(new Edge(1, 6, 10));
        edgeList.add(new Edge(1, 8, 5));
        edgeList.add(new Edge(2, 1, 8));
        edgeList.add(new Edge(2, 3, 4));
        edgeList.add(new Edge(2, 6, 4));
        edgeList.add(new Edge(2, 8, 4));
        edgeList.add(new Edge(2, 5, 4));
        edgeList.add(new Edge(3, 6, 3));
        edgeList.add(new Edge(3, 2, 4));
        edgeList.add(new Edge(3, 4, 3));
        edgeList.add(new Edge(4, 3, 3));
        edgeList.add(new Edge(4, 5, 1));
        edgeList.add(new Edge(5, 2, 4));
        edgeList.add(new Edge(5, 4, 1));
        edgeList.add(new Edge(5, 7, 3));
        edgeList.add(new Edge(6, 1, 10));
        edgeList.add(new Edge(6, 2, 4));
        edgeList.add(new Edge(6, 3, 3));
        edgeList.add(new Edge(6, 4, 6));
        edgeList.add(new Edge(7, 4, 2));
        edgeList.add(new Edge(7, 5, 3));
        edgeList.add(new Edge(7, 8, 3));
        edgeList.add(new Edge(8, 1, 5));
        edgeList.add(new Edge(8, 2, 4));
        edgeList.add(new Edge(8, 7, 3));
        
        parent = new int[25];
 
        for (int i = 1; i <= 24; ++i) {//부모노드 설정 
            parent[i] = i;
        }
 
        Collections.sort(edgeList);// 간선들을 정렬-> 자바가 제공하는 함수를 이용 
 
        int sum = 0;
        for (int i = 0; i < edgeList.size(); ++i) {
            Edge edge = edgeList.get(i);
            if(!isSameParent(edge.v1, edge.v2)) {// 사이클을 만드는지 체크  -> treu면 사이클을 만든다. 
            	System.out.println("간선: ("+edge.v1+" , "+edge.v2 + ")");
                sum += edge.cost;
                union(edge.v1, edge.v2);
            }
        }
 
        System.out.println("가중치 총 합: " + sum);
    }
}
