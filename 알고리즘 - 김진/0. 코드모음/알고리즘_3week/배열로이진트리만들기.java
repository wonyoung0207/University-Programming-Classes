package 알고리즘_3week;

public class 배열로이진트리만들기 {
	
	static int count = 1;
	static int leafcount = 0;
	
	static void pancestor(char tree[], int i) {// 조상 찾기
		
		if (i == 1) {
			return;
		} else {
			System.out.print(tree[i/2] + " ");
			pancestor(tree, i / 2);
			
		}

	}

	static void decendent(char tree[], int i) {// 후손 찾기
		if (tree[i] == '\0') {
			return;
		} else {
			decendent(tree, i * 2);// 왼쪽 노드로 나아감
			System.out.print(tree[i] + " ");
			decendent(tree, (i * 2) + 1);// 오른쪽 노드로 나아감
			

		}

	}
	
	static void inorder(char tree[], int root) {//중위 순회 -> L -> P -> R
		if(tree[root*2] != '\0' ) {
			inorder(tree,root*2);
		}
		System.out.print(tree[root] + " ");
		if(tree[root*2+1] != '\0') {
			inorder(tree,root*2+1);
		}
	}
	
	static void preorder(char tree[], int root) {//전위 순회 -> P -> L -> R

		System.out.print(tree[root] + " ");
		if(tree[root*2] != '\0' ) {
			preorder(tree,root*2);
		}
		if(tree[root*2+1] != '\0') {
			preorder(tree,root*2+1);
		}
	}
	
	static void postorder(char tree[], int root) {//후위 순회 -> -> L -> R -> P 

		
		if(tree[root*2] != '\0' ) {
			postorder(tree,root*2);
		}
		if(tree[root*2+1] != '\0') {
			postorder(tree,root*2+1);
		}
		System.out.print(tree[root] + " ");
	}
	
	
	static void nodecount(char tree[], int root) {
		if(tree[root*2] != '\0') {
			count++;
			nodecount(tree,root*2);
		}
		if(tree[root*2+1] != '\0') {
			count++;
			nodecount(tree,root*2+1);
		}
	}
	
	static void leafnode(char tree[], int root) {
		
		if(tree[root*2] == '\0' && tree[root*2+1] == '\0') {
			leafcount++;
		}


		if(tree[root*2] != '\0') {
			leafnode(tree,root*2);
		}
		if(tree[root*2+1] != '\0') {

			leafnode(tree,root*2+1);
		}

	}
	
	
	
	public static void main(String[] args) {
		char[] tree = new char[50];
		
		tree[1] = 'A';
		tree[2] = 'B';
		tree[3] = 'C';
		tree[4] = 'D';
		tree[5] = 'E';
		tree[6] = 'F';
		tree[7] = 'G';
		tree[8] = 'H';
		tree[9] = 'I';
		tree[10] = 'J';
//		tree[11] = 'K';
//		tree[12] = 'L';
		
		pancestor(tree, 5);// 5번방 원소의 선조를 찾아라
		System.out.println("");
		decendent(tree, 3); // 3번방 원소의 후손을 모두 찾아라
		
		
		System.out.println("");		
		inorder(tree, 1);
		System.out.println("");
		preorder(tree, 1);
		System.out.println("");
		postorder(tree, 1);
		
		
//		System.out.println("");
//		nodecount(tree,1);
//		System.out.println("nodecount : " + count);
//		
		System.out.println("");
		leafnode(tree,1);
		System.out.println("leafcount : " + leafcount);
		
	} // end of main
} // end of class treearray
