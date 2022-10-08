
import java.util.LinkedList;

public class LinkedListUtil {
	public static void main(String args[]) {
		// Creating object of class linked list
		LinkedList<String> object = new LinkedList<String>();
		LinkedList<Integer> score = new LinkedList<Integer>();
		
		score.add(80);
		score.add(95);
		score.add(72);
		score.add(83);
		score.add(57);
		System.out.println("1.score ����Ʈ ����" + score);
		
		for(int i = 0; i < score.size(); i++) {
			System.out.println(i + "��°����" + score.get(i));
			
		}
		
		int sum = 0;
		int num;
		
		for(int j = 0; j < score.size(); j++) {
			
			num = score.get(j);
			sum = sum + num;
			
		}
		
		sum = sum / score.size();
		System.out.println("�迭�� ��� = " + sum);

		
		
		// Adding elements to the linked list
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		System.out.println("Linked list : " + object);

		// Removing elements from the linked list
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		System.out.println("Linked list after deletion: " + object);
		// Finding elements in the linked list
		boolean status = object.contains("E");//contain �� ��ü�� ����Ʈ�� �����ϸ� true �� ����

		if (status)	//������� true �����ϱ� ������
			System.out.println("����Ʈ�� E��� ���Ұ� �����մϴ�. 'E' ");
		else
			System.out.println("����Ʈ�� E��� ���Ұ� �������� �ʽ��ϴ�. 'E'");

		// Number of elements in the linked list
		int size = object.size();	//����Ʈ�� ũ�⸦ �˼��ִ� �żҵ�
		System.out.println("���� �� ����Ʈ�� ũ���  " + size);

		// Get and set elements from linked list
		Object element = object.get(2);	//get�� Ư����ġ�� ���Ҹ� ������������� ���
		System.out.println("���ϴ� ��ġ�� ����ִ� �� =  " + element);
		object.set(2, "Y");	//Ư����ġ�� ���Ҹ� ������ ���
		System.out.println("���ϴ� ��ġ�� ���ϴ� ���� ���� = " + object);
	}
}
