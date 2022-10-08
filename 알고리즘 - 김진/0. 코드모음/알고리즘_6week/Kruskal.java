package �˰���_6week;
import java.util.ArrayList;
import java.util.Collections;
 

//1.Union find ���� �� �� �� ū �θ��� �������� ������ ���ϰ� �����. 
//2.��Ʈ�� ���ؼ� �θ� ������ ����Ŭ�� �����ϴ� ����

//Comparable �� ������ ���ؼ�
class Edge implements Comparable<Edge> {//������ ����ġ�� ��Ÿ�� 
    int v1;
    int v2;
    int cost;
 
    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
 
    @Override
    public int compareTo(Edge o) {  // cost�� ������ ������ �ϰڴٰ� ������ ����
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
 
    public static int find(int x) {  // �θ� ��� ã�� �޼ҵ�
        if (parent[x] == x) {// �θ� ��带 ã�ư��� ��. -> ��Ʈ�� ���ؼ� �θ��尡 ������ ����Ŭ�� �ִ°��� 
            return x;//�θ�� x ��尡 ������ ����Ŭ�� �ִ°��� 
        }
 
        return parent[x] = find(parent[x]);
    }
 
    //same parent means cycle
    public static boolean isSameParent(int x, int y) {
        x = find(x);  // find �޼ҵ带 ���ؼ� �θ� ��� ��ȣ�� ���� ����
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
 
//        edgeList.add(new Edge(0, 1, 5));//������ ��Ÿ�� -> ����0��1�� ����ġ 5
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
 
        for (int i = 1; i <= 24; ++i) {//�θ��� ���� 
            parent[i] = i;
        }
 
        Collections.sort(edgeList);// �������� ����-> �ڹٰ� �����ϴ� �Լ��� �̿� 
 
        int sum = 0;
        for (int i = 0; i < edgeList.size(); ++i) {
            Edge edge = edgeList.get(i);
            if(!isSameParent(edge.v1, edge.v2)) {// ����Ŭ�� ������� üũ  -> treu�� ����Ŭ�� �����. 
            	System.out.println("����: ("+edge.v1+" , "+edge.v2 + ")");
                sum += edge.cost;
                union(edge.v1, edge.v2);
            }
        }
 
        System.out.println("����ġ �� ��: " + sum);
    }
}
