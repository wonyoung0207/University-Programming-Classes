class LinkedList2 {
	String data;
	LinkedList2 link;
}

public class LinkedListBasic {

	public static void main(String[] ar) {
		// list1 = ("Kim", "Lee", "Park")
		LinkedList2 list1;
		LinkedList2 tmp;
		tmp = new LinkedList2();
		tmp.data = "Kim";
		tmp.link = null;
		list1 = tmp; // 찍어낸 빵의 주소를 list1에 저장. 드디어 list1에 첫번째 원소가 저장됨.
		// 두번째 원소
		tmp = new LinkedList2();
		tmp.data = "Lee";
		tmp.link = null;
		list1.link = tmp; // 2번째 원소를 끝에 연결
		// 세번째 원소
		tmp = new LinkedList2();
		tmp.data = "Park";
		tmp.link = null;
		list1.link.link = tmp;
		System.out.print("list1 = (");
		System.out.print(list1.data + ", ");
		System.out.print(list1.link.data + ", ");
		System.out.println(list1.link.link.data + ")");
		// 1. list2 = ("apple", "strawberry", "orange", "banana", "melon") 만들어라.
		// 선두에 원소추가하라
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
		// 만들어라
		// 두번째 원소를 제거하라.
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		// 4. list2의 원소의 개수를 계산하여 출력하라.
		// 5. list2의 마지막에 "durian"을 추가하라
		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		// 6. 세번째 원소인 "orange"를 "grape"로 변경하라
	}
}
