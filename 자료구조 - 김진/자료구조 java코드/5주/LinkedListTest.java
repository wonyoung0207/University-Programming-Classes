import java.util.LinkedList;	//�̰� ��ũ�帮��Ʈ ������ �����;���
/*LinkedList�� ArrayList �������� ������ ã����� LinkedList�� �� ���� �����ؼ� ��ũ�� ���������� �����Ѵ�.ã������ �ϳ��ϳ��� ���İ��鼭 ã�ƾ��ϰ�,
 * ArrayList �� �ε�����ȣ�� �������־� �ѹ��� �����͸� ã���� �ִ�.
 * LinkedList �� �ϳ��� �� �ȿ� ��ü�� ���� ��ü�� �ּҸ� ������ �ִ�.
 */


public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list2 = new LinkedList<String>();//ArrayList �� ���� ����
		
		list2.add("apple");
		list2.add("strawberry");
		list2.add("orange");
		list2.add("banana");
		list2.add("melon");
		System.out.println("������ ��� = " + list2);	//������ �迭 ���
		
		list2.add(0,"pineapple"); //���ο� ���� �߰�
		System.out.println("���� �߰��� ��� = " + list2);	//���� �߰� �� �迭 ���
		
		list2.remove(1);
		System.out.println("�ι�° �������� �� ���" + list2);
		
		System.out.println("list2�� ���� ���� = " + list2.size());	// ������ ������ ���
		
		list2.add("durian");
		System.out.println("�θ����߰�" + list2);		//�θ��� �� �ڿ��ٰ� �߰�
		
		}

}
