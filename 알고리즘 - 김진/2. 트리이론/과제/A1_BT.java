//package 알고리즘_2week;

//전위순회, 후위순회, 중위순회에 재귀가 사용됨 -> 스택이 사용됨 

class Node{
	int key;
	Node left,right;
	public Node(int item) {
		key = item;
		left = null;
		right = null;

	}
}

class BT1_BinaryTree{
	Node root;
	public BT1_BinaryTree() {//생성자
		root = null;
	}
	
	public void preoder(Node node) {//전위순회 => p -> L -> R 
		
		if(node == null) {
			return ;		
		}
		System.out.print(" " + node.key);//P
		preoder(node.left);//L
		preoder(node.right);//R
		
	}
	
	public void inoder(Node node) {//중위순회 =>  L -> P -> R 
		
		if(node == null) {
			return ;		
		}
		preoder(node.left);//L
		System.out.print(" " + node.key);//P
		preoder(node.right);//R
		
	}
	
	public void postoder(Node node) {//후위순회 =>  L -> R -> P 
		
		if(node == null) {
			return ;		
		}
		preoder(node.left);//L
		preoder(node.right);//R
		System.out.print(" " + node.key);//P
		
	}
}


public class A1_BT {
	public static void main(String[] args) {
		BT1_BinaryTree tree = new BT1_BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		
//		//이 풀이로 해도 됨 
//		Node node1 = new Node(1);
//		Node node2 = new Node(2);
//		Node node3 = new Node(3);
//		Node node4 = new Node(4);
//		Node node5 = new Node(5);
//		
//		node2.left = node4;
//		node2.right = node5;
//		node1.left = node2;
//		node1.right = node3;
		
		
		
		System.out.println(" +++ PreOder 후위순회 +++");//후위순회
		tree.preoder(tree.root);
		
		System.out.println("\n +++ inOder 중위순회 +++");//중위순회
		tree.inoder(tree.root);
		
		System.out.println("\n +++ PostOder 후위순회 +++");//후위순회
		tree.postoder(tree.root);
		
		
		
	}

}
