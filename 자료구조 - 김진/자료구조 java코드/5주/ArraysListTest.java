import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListTest {

	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		/*
		 * for(int i = 0; i < 10; i++) { //10���� �̸��Է� System.out.println("�̸��� �Է� =");
		 * alist.add(input.next()); }
		 */

		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		alist.add("Ahn");
		alist.add("Pack");
		alist.add("Kim");
		alist.add("Lee");

		System.out.println(alist.get(5)); // 5��° ���� ��������

		alist.remove(5);
		System.out.println(alist); // 5��° ���� ���� �� ���

		int num = alist.size();
		System.out.println("���� ������ ���� " + num); // �迭�� ���� ���

		System.out.println(alist.get(num - 3)); // 9-3 = 6 ��° ���� ���

		System.out.println(alist); // ��ü �迭 ���

		System.out.println("contains : " + alist.contains("Kim"));// ���Ҹ� �����ϴ���. true or false �� ����

		int post = alist.indexOf("Kim");
		System.out.println("post : " + post); // ���Ұ� ����ִ� �ε��� ���

		// ��ġ��� �����. ��� ���� �ٲ۴�.
		

		int arr[][] = { { 15, 22, -15 }, { 11, 3, 0 }, { 91, 28, -6 } };
		int temp = 0; // ��ġ �Ҽ� �ְ� �迭 �ϳ� �������
		System.out.println("��ġ��� �� �迭");
		for (int i = 0; i < arr.length; i++) { // �ʱ� ��� ���
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 * for(int i = 0; i <arr.length; i++){
		 * 		for(int j = 0; j <arr.length -1; j++){
		 * 			if(arr[j] == 0 
		 */

		System.out.println("��ġ��� �� �迭"); // ���� ���Ϸ��� ����

		for (int i = 0; i < arr.length; i++) { // ��ġ��� �ٷ� ���
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");// 15 11 91 / 22 3 28 / -15 0 -6
			}
			System.out.println();
		}
	}
}

/*
 * ������ �ڵ�
 * 
 * System.out.println(alist);//1.�߰��� �迭 ���� ��� //[Steve, Tim, Lucy, Pat, Angela,
 * Tom]
 * 
 * alist.add(3, "Steve"); System.out.println(alist); //2.�߰��ϸ� ���� �ִ� �� �ڷ� �з��� �迭
 * ���� Ȯ��
 * 
 * alist.remove(2); System.out.println(alist); //3.�ε��� 3���ִ� �� ���� �� ��ĭ�� ������ ������
 * �ٽ� �迭�پ��
 * 
 * alist.remove("Steve"); System.out.println(alist); //4.�Ǿտ� �ִ� Steve ����, �ڿ�
 * �߰��ߴ� Steve�� ��������
 * 
 * for(String str:alist) System.out.println(str);
 * 
 * //Updating an element at the 4th position alist.set(4, "Kim");
 * System.out.println(alist); int numberOfItems = alist.size();
 * System.out.println( "number of item : " + numberOfItems);
 * System.out.println("contains : " + alist.contains("Kim")); int post =
 * alist.indexOf("Kim"); System.out.println("post : " + post);
 * 
 * ArrayList<Integer> blist=new ArrayList<Integer>(); int������ �� ArrayList
 * blist.add(1); blist.add(2); blist.add(3); blist.add(5); blist.add(8);
 * blist.add(0); for(int a:blist) System.out.println(a); }
 */