import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListTest {

	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		/*
		 * for(int i = 0; i < 10; i++) { //10개의 이름입력 System.out.println("이름을 입력 =");
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

		System.out.println(alist.get(5)); // 5번째 원소 가져오기

		alist.remove(5);
		System.out.println(alist); // 5번째 원소 삭제 후 출력

		int num = alist.size();
		System.out.println("현재 원소의 갯수 " + num); // 배열의 길이 출력

		System.out.println(alist.get(num - 3)); // 9-3 = 6 번째 원소 출력

		System.out.println(alist); // 전체 배열 출력

		System.out.println("contains : " + alist.contains("Kim"));// 원소를 포함하는지. true or false 로 나옴

		int post = alist.indexOf("Kim");
		System.out.println("post : " + post); // 원소가 들어있는 인덱스 출력

		// 전치행렬 만들기. 행과 열을 바꾼다.
		

		int arr[][] = { { 15, 22, -15 }, { 11, 3, 0 }, { 91, 28, -6 } };
		int temp = 0; // 전치 할수 있게 배열 하나 만들어줌
		System.out.println("전치행렬 전 배열");
		for (int i = 0; i < arr.length; i++) { // 초기 행렬 출력
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

		System.out.println("전치행렬 후 배열"); // 보기 편하려고 띄어쓰기

		for (int i = 0; i < arr.length; i++) { // 전치행렬 바로 출력
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");// 15 11 91 / 22 3 28 / -15 0 -6
			}
			System.out.println();
		}
	}
}

/*
 * 교수님 코드
 * 
 * System.out.println(alist);//1.추가한 배열 원소 출력 //[Steve, Tim, Lucy, Pat, Angela,
 * Tom]
 * 
 * alist.add(3, "Steve"); System.out.println(alist); //2.추가하면 원래 있던 값 뒤로 밀려서 배열
 * 길이 확장
 * 
 * alist.remove(2); System.out.println(alist); //3.인덱스 3에있는 값 삭제 후 한칸씩 앞으로 땡겨짐
 * 다시 배열줄어듬
 * 
 * alist.remove("Steve"); System.out.println(alist); //4.맨앞에 있던 Steve 삭제, 뒤에
 * 추가했던 Steve는 남아있음
 * 
 * for(String str:alist) System.out.println(str);
 * 
 * //Updating an element at the 4th position alist.set(4, "Kim");
 * System.out.println(alist); int numberOfItems = alist.size();
 * System.out.println( "number of item : " + numberOfItems);
 * System.out.println("contains : " + alist.contains("Kim")); int post =
 * alist.indexOf("Kim"); System.out.println("post : " + post);
 * 
 * ArrayList<Integer> blist=new ArrayList<Integer>(); int형으로 된 ArrayList
 * blist.add(1); blist.add(2); blist.add(3); blist.add(5); blist.add(8);
 * blist.add(0); for(int a:blist) System.out.println(a); }
 */