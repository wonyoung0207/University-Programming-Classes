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
		list1 = tmp; // �� ���� �ּҸ� list1�� ����. ���� list1�� ù��° ���Ұ� �����.
		// �ι�° ����
		tmp = new LinkedList2();
		tmp.data = "Lee";
		tmp.link = null;
		list1.link = tmp; // 2��° ���Ҹ� ���� ����
		// ����° ����
		tmp = new LinkedList2();
		tmp.data = "Park";
		tmp.link = null;
		list1.link.link = tmp;
		System.out.print("list1 = (");
		System.out.print(list1.data + ", ");
		System.out.print(list1.link.data + ", ");
		System.out.println(list1.link.link.data + ")");
		// 1. list2 = ("apple", "strawberry", "orange", "banana", "melon") ������.
		// ���ο� �����߰��϶�
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
		// ������
		// �ι�° ���Ҹ� �����϶�.
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		// 4. list2�� ������ ������ ����Ͽ� ����϶�.
		// 5. list2�� �������� "durian"�� �߰��϶�
		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		// 6. ����° ������ "orange"�� "grape"�� �����϶�
	}
}
