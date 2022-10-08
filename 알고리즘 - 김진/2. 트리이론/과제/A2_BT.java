//package 알고리즘_2week;


class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {//생성자
		this.data = data;
		left = null;
		right = null;
		
	}
	
}

class BT2_BinaryTree {
	private TreeNode root;
	public static int count = 0;

	
	public TreeNode makenode(TreeNode left,int data, TreeNode right) {
		root = new TreeNode(data);
		root.left = left;
		root.right = right;
				
		return root; 
	}
	
	public void preorder(TreeNode root) {//전위순회 : P -> L -> R
		if(root!= null) {
			System.out.print(" " + root.data + " ");
			preorder(root.left);
			preorder(root.right);
			
		}
	}
	
	public void inorder(TreeNode root) {//중위순회 : L -> P -> R
		if(root!= null) {
			
			inorder(root.left);
			System.out.print(" " + root.data + " ");
			inorder(root.right);
			
		}
	}
	
	public void postorder(TreeNode root) {//후위순회 : L -> R -> P 
		if(root!= null) {
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(" " + root.data + " ");
			
		}
	}
	
	public int nodecount(TreeNode root) {
		if(root!=null) {
			this.count++;
			nodecount(root.left);
			nodecount(root.right);
		}
		
		return this.count;

//		//이 풀이로도 가능 
//		int count = 0;
//		if(root == null) {
//			return 0;
//		}
//		else {
//			count += 1 + nodecount(root.left) + nodecount(root.right);
//			
//		}
//		
//		return count;
					
	}
	
	public int leafcount(TreeNode root) {
		if(root != null) {
			if(root.left == null && root.right == null) {
				this.count++;
			}
			
			leafcount(root.left);
			leafcount(root.right);
			
		}
		return this.count;
		
	}
	
	public int depthcount(TreeNode root) {
		
		int count = -1;
		if(root != null) {
			count = 1 + Math.max(depthcount(root.left), depthcount(root.right));
		}
		return count;		
	}

}


public class A2_BT {

	public static void main(String[] args) {
		BT2_BinaryTree A = new BT2_BinaryTree();
		TreeNode node1 = A.makenode(null, 1, null);
		TreeNode node2 = A.makenode(null, 7, null);
		TreeNode node3 = A.makenode(node1, 3, node2);
		TreeNode node4 = A.makenode(null, 14, null);
		TreeNode node5 = A.makenode(node3, 9, node4);
		TreeNode node6 = A.makenode(null, 44, null);
		TreeNode node7 = A.makenode(null, 36, node6);
		TreeNode node8 = A.makenode(null, 97, null);
		TreeNode node9 = A.makenode(null, 94, node8);
		TreeNode node10 = A.makenode(node7, 67, node9);
		TreeNode node11 = A.makenode(node5, 22, node10);//이게 root 노드가 된다. 
		
		System.out.println("+++ Preorder 전위순회 +++ ");
		A.preorder(node11);//초기 값으로 root를 줘야한다. 
		
		System.out.println("\n+++ inorder 중위순회 +++ ");
		A.inorder(node11);
		
		System.out.println("\n+++ Postorder 후위순회 +++ ");
		A.postorder(node11);
		
		System.out.println("\n노드의 갯수는 총 " + A.nodecount(node11) + "개 입니다. ");
		A.count = 0;//count 변수 다시 쓰기 위해서 초기화 
		
		System.out.println("\n리프 노드의 갯수는 총 " + A.leafcount(node11) + "개 입니다. ");
		
		System.out.println("\n노드의 깊이는 " + A.depthcount(node11) + " 입니다. ");
		
		

	}

}
