import java.util.NoSuchElementException;

public class ListQueue2 {

	private Node2 front, rear;
	private int size;
	
	public ListQueue2(){
		front = rear = null;
		size = 0;									//size�� ���� ���� �˼��ִ� ����
	}
	public int queueSize(){ return size; }
	
	public boolean isEmpty() { return queueSize() == 0; }
	
	public void add(String newItem){
		Node2 newNode = new Node2(newItem, null);
		if (isEmpty()) { 							//���� ���ٸ� front�� rear���ٰ� ���� ����
			front = newNode; rear = newNode;
		} else {									//���� ����ִٸ� rear�������� ���� �־��ְ� rear���ٰ� ������ �־��ش�.
			rear.next = newNode;
			rear = newNode;
		}
		size++;										//���� �ϳ� ������ size�� �ϳ� ����.
	}
	public void printQueue(){						//ť�� ����ִ� ���� �����
		Node2 t;
		
		t = front;
		while (t != null) {							//front�� null�� �ƴҶ������ݺ�
			System.out.print("-> " + t.item);		//front�� �����Ͱ��� ���
			t = t.next;								//front�����ּ� ����Ű����
		}
		System.out.println();
	}
	
	public String remove(){
		if (isEmpty()) { //throw new NoSuchElementException();
			return null;
		}
		String frontItem = front.item;
		front = front.next;						//front�� �����ּ� ����Ű���ϸ� �ڵ����� ����
		size--;
		return frontItem;						//�����Ѱ��� ����
	}
	
	public String peek() {						//ù���Ҹ� ����
		String item;
		
		if(isEmpty()) {
			return null;
		}
		return front.item;
		
	}
	public void delete() {
		if (isEmpty()) { //throw new NoSuchElementException();
			System.out.println("���� ���� �����ϴ�.");
		}
		String frontItem = front.item;
		front = front.next;
		size--;
	}
}
