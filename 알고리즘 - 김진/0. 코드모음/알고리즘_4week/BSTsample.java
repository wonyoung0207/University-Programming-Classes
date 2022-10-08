package 알고리즘_4week;
//연결리스트로 트리를 만들고 삽입과 삭제 진행 

class TreeNode {
	String key;
	TreeNode left;
	TreeNode right;
}

class BinarySearchTree {
	private TreeNode rootNode;

	private TreeNode insertKey(TreeNode T, String x) {
		// insert()메소드에 의해 사용되는 보조 순환 메소드 
		if (T == null) {
			TreeNode newNode = new TreeNode();
			newNode.key = x;
			return newNode;
		} else if (x.compareTo(T.key) < 0) {// 들어온 값이 루트 보다 작으면 x를 T의 왼쪽 서브트리에 삽입 
			T.left = insertKey(T.left, x);
			return T;
		} else if (x.compareTo(T.key) > 0) {// 들어온 값이 T.key보다 크면 x를 T의 오른쪽 서브트리에 삽입
			T.right = insertKey(T.right, x);
			return T;
		} else { // key값 x가 이미 T에 있는 경우 
			return T;
		}
	}//삽입 보조 끝 

	void insert(String x) {//삽입할 값과 root를 insert할 메소드로 전달 
		rootNode = insertKey(rootNode, x);
	}// 삽입 끝

	TreeNode find(String x) { // 키값 x를 가지고 있는 TreeNode의 포인터를 반환 
		TreeNode T = rootNode;
		int result;
		while (T != null) {//이진트리의 특징을 활용해서 이진탐색으로 나아감. 
			//( 작으면 왼쪽, 크면 오른쪽 서브노드로 이동)
			
			if ((result = x.compareTo(T.key)) < 0) {
				// 매개변수값과 현재 node의 key값이 같으면 0이 나옴 
				T = T.left;//0보다 작으면 왼쪽 서브노드로 가야함 
			} else if (result == 0) { //result가 0이면 값을 찾은것임
				return T; //주소값을 리턴 
			} else { //찾는 key값이 해당 노드의 key값보다 크다면 오른쪽 서브노드로 이동 
				T = T.right;
			}
		}
		return T;//result가 0이면 값을 찾은거
	}// BinarySearchTree 끝 

	private void printNode(TreeNode N) {
		// printBST() 메소드에 의해 사용되는 순환 메소드 
		if (N != null) {
			
			printNode(N.left);
			System.out.print(N.key + " => ");
			printNode(N.right);
			
		}
	}// 출력보조끝 

	void printBST() {
		// 트리를 괄호를 사용하여 출력 
		printNode(rootNode);
		System.out.println();
	}// 출력끝 

	void delete(String x) {//삭제할 값을 받아와서 rootNode에서 삭제 
		rootNode = deleteKey(rootNode, x);
	}

	TreeNode deleteKey(TreeNode T, String x) {//실질적으로 삭제하는 메소드 
		//삭제 연산은 크게 3가지로 나뉜다
		// 1. 자식이 하나인 노드의 삭제 -> 자식 노드로 대체 
		// 2. 자식이 둘인 노드의 삭제  -> 왼쪽 서브트리에서 최대 키값을 가진 원소를 탐색 
		// 3. 삭제할 노드가 리프 노드인 경우 -> 그냥 삭제 
		
		TreeNode p;//주어진 키값 x를 가진 노드 
		TreeNode parent;//삭제할 노드의 부모 노드 
		TreeNode q;
		p = T;
		parent = null;

		while (p != null && p.key != x) {//부모노드를 찾기위해서 사용 
			parent = p;//현재 노드를 저장. 
			if (( x.compareTo(p.key)) < 0) {
				p = p.left;// 해당 키값보다 작으면 왼쪽 서브노드로 p를 이동 
			} else {
				p = p.right;// 해당 키값보다 크면 오른쪽 서브노드로 p를 이동 
			}
		}

		if (p == null)//삭제할 원소가 없는 경우
			return null; //삭제할 수 없다. 그냥 리턴 

		if (p.left == null && p.right == null) { // 자식이 왼쪽 , 오른쪽 둘다 없을 경우 
			//그냥 삭제 
			if(parent.left == p) {// 부모노드의 왼쪽이 삭제하려는 값일경우 
				parent.left = null;
			}else {
				parent.right = null;
			}
		}

		else if (p.left == null || p.right == null) { //자식이 한개인 경우  
			//자식을 부모 노드에 대체시킴			
			if(p.left != null){//p의 왼쪽 서브노드에 자식이 있는경우 
				if(parent.left == p) {
					//부모의 왼쪽에 자식이 있을경우 
					//부모노드의 left가 p(현재 키값으로, 삭제할 노드를 가리킴)라면,  
					//부모노드의 left를 현재노드의 left로 교체
					parent.left = p.left;
				}else {
					//부모의 오른쪽에 자식이 있을경우 
					//부모의 오른쪽을 p의 left로 교체 
					parent.right = p.left;
				}
				
			}else {
				//오른쪽 서브노드에 자식이 있는 경우 
				if(parent.left== p) {
					parent.left = p.right;
				}else {
					parent.right = p.right;
				}
			}
			
		}
		else if (p.left != null && p.right != null) {//자식이 두개인 경우  
			// 왼쪽 서브트리에서 최대 키값을 가진 원소를 찾아서 삭제 
			q = maxNode(p.left);//왼쪽 서브트리에서 가장 큰 노드 
			p.key = q.key;
			deleteKey(p.left, p.key);//가장 큰 노드의 값을 삭제시킴 
		}// 
		return T;
	}

	TreeNode maxNode(TreeNode B) { // 서브트리의 최대원소를 리턴 
		TreeNode p;
		p = B;
		if (p == null)
			return p;
		else if (p.right == null)
			return p;
		else {
			while (p.right != null) {// 오른쪽으로 계속 내려간다. 
				p = p.right;
			}
			return p;
		}
	}

}// BinarySearchTree 끝

public class BSTsample {

	public static void main(String[] args) {
		BinarySearchTree T = new BinarySearchTree();
		T.insert("S");
		T.insert("J");
		T.insert("B");
		T.insert("D");
		T.insert("U");
		T.insert("M");
		T.insert("R");
		T.insert("Q");
		T.insert("A");
		T.insert("G");
		T.insert("E");
		// 값을 삽입하여 트리를 구현 
		
		System.out.println("20155137 안원영");

		System.out.print("이트리는 중위순회 : ");
		T.printBST();
		System.out.print("의 값을 가지고 있습니다. ");
		// 구축된 이진탐색트리 출력 

		System.out.println("값을 검색합니다... ");
		String key = "G"; //검색할 트리의 값 
		TreeNode P = T.find(key);
		if (P != null) {
			System.out.println("찾으시는 값 " + key + "를 찾았습니다.");
		} else {
			System.out.println("찾으시는 값 " + key + "를 못찾았습니다. ");
		}// key값을 탐색하고 출력 

		System.out.println();
		
		System.out.println(key + "값을 삭제합니다. ");
		T.delete(key);

		System.out.println();
		System.out.println("다시 값을 검색합니다... ");
		P = T.find(key);
		if (P != null) {
			System.out.println("찾으시는 값 " + key + "를 찾았습니다. ");
		} else {
			System.out.println("찾으시는 값  " + key + "를 못찾았습니다. ");
		}
		System.out.println();
		
		
	}// 메인 끝
}// BinarySearchTreeTest 끝
