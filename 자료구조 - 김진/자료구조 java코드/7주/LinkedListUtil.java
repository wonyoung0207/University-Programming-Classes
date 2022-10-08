
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
		System.out.println("1.score 리스트 원소" + score);
		
		for(int i = 0; i < score.size(); i++) {
			System.out.println(i + "번째원소" + score.get(i));
			
		}
		
		int sum = 0;
		int num;
		
		for(int j = 0; j < score.size(); j++) {
			
			num = score.get(j);
			sum = sum + num;
			
		}
		
		sum = sum / score.size();
		System.out.println("배열의 평균 = " + sum);

		
		
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
		boolean status = object.contains("E");//contain 그 객체가 리스트에 존재하면 true 를 리턴

		if (status)	//있을경우 true 리턴하기 때문에
			System.out.println("리스트에 E라는 원소가 존재합니다. 'E' ");
		else
			System.out.println("리스트에 E라는 원소가 존재하지 않습니다. 'E'");

		// Number of elements in the linked list
		int size = object.size();	//리스트의 크기를 알수있는 매소드
		System.out.println("현재 이 리스트의 크기는  " + size);

		// Get and set elements from linked list
		Object element = object.get(2);	//get은 특정위치의 원소를 가져오고싶을때 사용
		System.out.println("원하는 위치에 들어있는 값 =  " + element);
		object.set(2, "Y");	//특정위치에 원소를 넣을때 사용
		System.out.println("원하는 위치에 원하는 값을 대입 = " + object);
	}
}
