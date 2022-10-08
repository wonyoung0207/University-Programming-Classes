import java.util.NoSuchElementException;

public class ListQueue2 {

	private Node2 front, rear;
	private int size;
	
	public ListQueue2(){
		front = rear = null;
		size = 0;									//size는 원소 갯수 알수있는 변수
	}
	public int queueSize(){ return size; }
	
	public boolean isEmpty() { return queueSize() == 0; }
	
	public void add(String newItem){
		Node2 newNode = new Node2(newItem, null);
		if (isEmpty()) { 							//값이 없다면 front랑 rear에다가 새값 대입
			front = newNode; rear = newNode;
		} else {									//값이 들어있다면 rear다음값에 새값 넣어주고 rear에다가 새값을 넣어준다.
			rear.next = newNode;
			rear = newNode;
		}
		size++;										//값이 하나 들어갔으니 size를 하나 증가.
	}
	public void printQueue(){						//큐에 들어있는 값을 찍어줌
		Node2 t;
		
		t = front;
		while (t != null) {							//front가 null이 아닐때까지반복
			System.out.print("-> " + t.item);		//front의 데이터값을 출력
			t = t.next;								//front다음주소 가리키게함
		}
		System.out.println();
	}
	
	public String remove(){
		if (isEmpty()) { //throw new NoSuchElementException();
			return null;
		}
		String frontItem = front.item;
		front = front.next;						//front를 다음주소 가르키게하면 자동으로 삭제
		size--;
		return frontItem;						//삭제한값을 리턴
	}
	
	public String peek() {						//첫원소를 꺼냄
		String item;
		
		if(isEmpty()) {
			return null;
		}
		return front.item;
		
	}
	public void delete() {
		if (isEmpty()) { //throw new NoSuchElementException();
			System.out.println("지울 값이 없습니다.");
		}
		String frontItem = front.item;
		front = front.next;
		size--;
	}
}
