//package �˰���_2week;

//������ȸ, ������ȸ, ������ȸ�� ��Ͱ� ���� -> ������ ���� 

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
	public BT1_BinaryTree() {//������
		root = null;
	}
	
	public void preoder(Node node) {//������ȸ => p -> L -> R 
		
		if(node == null) {
			return ;		
		}
		System.out.print(" " + node.key);//P
		preoder(node.left);//L
		preoder(node.right);//R
		
	}
	
	public void inoder(Node node) {//������ȸ =>  L -> P -> R 
		
		if(node == null) {
			return ;		
		}
		preoder(node.left);//L
		System.out.print(" " + node.key);//P
		preoder(node.right);//R
		
	}
	
	public void postoder(Node node) {//������ȸ =>  L -> R -> P 
		
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
		
		
//		//�� Ǯ�̷� �ص� �� 
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
		
		
		
		System.out.println(" +++ PreOder ������ȸ +++");//������ȸ
		tree.preoder(tree.root);
		
		System.out.println("\n +++ inOder ������ȸ +++");//������ȸ
		tree.inoder(tree.root);
		
		System.out.println("\n +++ PostOder ������ȸ +++");//������ȸ
		tree.postoder(tree.root);
		
		
		
	}

}
