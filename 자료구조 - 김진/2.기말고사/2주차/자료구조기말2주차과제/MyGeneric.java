import java.util.Stack;

class MyNode{
	public int id;
	public String name;
	public MyNode(int id, String name){
		this.id =id;
		this.name=name;
	}
	public MyNode() {
	}
	public void printMyNode() {
		System.out.println(id+name);
	}
}


public class MyGeneric {
	public static void main(String[] ar) {
		MyNode node1, node2 ,node3;
		MyNode a;
		
		node1 = new MyNode();
		node1.id = 1;
		node1.name="Kim";
		node2= new MyNode();
		node2.id = 2;
		node2.name="Lee";
		node3= new MyNode();
		node3.id = 3;
		node3.name="Choi";
		
		Stack<MyNode> stack1 = new Stack<>();
		stack1.push(node1);
		stack1.push(node2);
		stack1.push(node3);
		
		while(!stack1.isEmpty()) {
			a = stack1.pop();
			a.printMyNode();
		}
	}
}
