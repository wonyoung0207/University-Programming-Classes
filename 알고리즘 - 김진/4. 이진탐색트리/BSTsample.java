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
		} else if (x.compareTo(T.key) < 0) {// x<T.key이면 x를
			T.left = insertKey(T.left, x); // T의 왼쪽서브트리에 삽입
			return T;
		} else if (x.compareTo(T.key) > 0) {// x>T.key이면 x를
			T.right = insertKey(T.right, x); // T의 오른쪽서브트리에 삽입
			return T;
		} else { // key값 x가 이미 T에 있는 경우
			return T;
		}
	}// 삽입보조끝

	void insert(String x) {
		rootNode = insertKey(rootNode, x);
	}// 삽입끝

	TreeNode find(String x) { // 키값 x를 가지고 있는 TreeNode의
		TreeNode T = rootNode; // 포인터를 반환
		int result;
		while (T != null) {
			if ((result = x.compareTo(T.key)) < 0) {//왼쪽으로 가라
				//채워라
			} else if (result == 0) { //찾았음
				return T;
			} else { // 오른쪽으로 가라.
				T = T.right;
			}
		}
		return T;
	}// 찾기끝

	private void printNode(TreeNode N) {
		// printBST() 메소드에 의해 사용되는 순환 메소드
		if (N != null) {
			System.out.print("(");
			printNode(N.left);
			//중위순회방식으로 출력, 이 부분을 채워라
			printNode(N.right);
			System.out.print(")");
		}
	}// 출력보조끝

	void printBST() {
		// 트리를 괄호를 사용하여 출력
		printNode(rootNode);
		System.out.println();
	}// 출력끝

	void delete(String x) {
		rootNode = deleteKey(rootNode, x);
	}

	TreeNode deleteKey(TreeNode T, String x) {
		TreeNode p;
		TreeNode parent;
		TreeNode q;
		p = T;
		parent = null;

		while (p != null && p.key != x) {  //삭제하고자하는 키 탐색
			parent = p;
			if (( x.compareTo(p.key)) < 0) {
				p = p.left;
			} else {
				p = p.right;
			}
		}// 루트로부터 탐색하여 key값과 같은 노드를 찾아 p에 저장
			// parent에 찾은 노드 상위값을 저장해둠

		if (p == null)
			return null; //삭제할 원소가 없음

		if (p.left == null && p.right == null) { // 자식이 없는 노드
			//채워라
		}

		else if (p.left == null || p.right == null) { // 자식이 하나 있을때
			//채워라 
		}
		else if (p.left != null && p.right != null) {// 자식이 둘 다 있을 때
			q = maxNode(p.left);
			p.key = q.key;
			deleteKey(p.left, p.key);
		}// 자식이 둘다 있는 경우
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
			while (p.right != null) {
				p = p.right;
			}
			return p;
		}
	}

	
}// BinarySearchTree 끝

public class BinarySearchTreeTest {

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
		// 값을 삽입하여 ppt 2쪽의 트리를 구현

		System.out.println("이트리는");
		T.printBST();
		System.out.println("의 값을 가지고 있습니다.");
		// 구축된 이진탐색트리 출력

		System.out.println("값을 검색합니다.");
		String key = "G"; //키값을 변경하면서 테스트해볼것
		TreeNode P = T.find(key);
		if (P != null) {
			System.out.println("찾으시는 값 " + key + "를 탐색성공함.");
		} else {
			System.out.println("찾으시는 값 " + key + "를 탐색실패하였음.");
		}// key값을 탐색하고 출력
		System.out.println();
		
		
		
		System.out.println(key + "값을 삭제합니다.");
		T.delete(key);

		System.out.println("다시 값을 검색합니다.");
		P = T.find(key);
		if (P != null) {
			System.out.println("찾으시는 값 " + key + "를 탐색성공함.");
		} else {
			System.out.println("찾으시는 값 " + key + "를 탐색실패함.");
		}
		System.out.println();
		
		
	}// 메인 끝
}// BinarySearchTreeTest 끝
