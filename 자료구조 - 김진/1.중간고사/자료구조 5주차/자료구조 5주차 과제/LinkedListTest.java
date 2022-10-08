import java.util.LinkedList;	//이거 링크드리스트 쓰려면 가져와야함
/*LinkedList와 ArrayList 차이점은 데이터 찾을경우 LinkedList는 각 방을 생성해서 링크로 순차적으로 연결한다.찾을때는 하나하나씩 거쳐가면서 찾아야하고,
 * ArrayList 는 인덱스번호를 가지고있어 한번에 데이터를 찾을수 있다.
 * LinkedList 는 하나의 방 안에 객체와 다음 객체의 주소를 가지고 있다.
 */


public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list2 = new LinkedList<String>();//ArrayList 랑 같이 선언
		
		list2.add("apple");
		list2.add("strawberry");
		list2.add("orange");
		list2.add("banana");
		list2.add("melon");
		System.out.println("변경전 출력 = " + list2);	//변경전 배열 출력
		
		list2.add(0,"pineapple"); //선두에 원소 추가
		System.out.println("원소 추가후 출력 = " + list2);	//원소 추가 후 배열 출력
		
		list2.remove(1);
		System.out.println("두번째 원소제거 후 출력" + list2);
		
		System.out.println("list2의 원소 갯수 = " + list2.size());	// 원소의 갯수를 출력
		
		list2.add("durian");
		System.out.println("두리안추가" + list2);		//두리안 맨 뒤에다가 추가
		
		}

}
