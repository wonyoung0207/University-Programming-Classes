
import java.util.LinkedList;
import java.util.Queue;

class ArrayQueue<E> {

	private E[] q;
	private int front, rear, size;

	public ArrayQueue() {

		//q = (String[]) new String[2];
		q = (E[]) new Object[2];
		front = rear = size = 0;

	}

	
	public int queueSize(){
		
		return size;
		
	}

	
	public boolean isEmpty(){

		return(size == 0);

	}

	// 큐가 full이면, 큐크기를 두배로 늘림

	public void add(E newItem){

		if ((rear + 1) % q.length == front) { // queue full
			resize(2*q.length);
		}
		rear = (rear +1) % q.length;
		q[rear] = newItem;
		size++;

	}

	public E remove() {

		E item;
		if (isEmpty()) { //throw new NoSuchElementException(); 
			System.out.println("Underflow");
			return null;
		}
		front = (front +1) % q.length;
		item = q[front];
		q[front] = null;
		size--;
		if (size > 0 && size == q.length/4){
			resize(q.length/2);
		}
		return item;
	}
	// 큐 크기를 조정한다.

	private void resize(int newSize){

		E[] t = (E[]) new Object[newSize];
		for (int i = 1, j = front + 1; i < size+1; i++, j++) {
			t[i] = q[j%q.length];
		}
		front =0;
		rear = size;
		//q = (String[]) t;
		q=t;

	}

	

	public void printQueue(){

		for (int i = front + 1; i <= rear; i++){
			System.out.print("-> " + q[i]);
		}
		System.out.println();
	}

	

	public E peek() {

		E item;
		if(isEmpty()) {
			return null;
		}
		item = q[front+1];
		return item;

	}

	

	public void delete() {

		E item;
		if (isEmpty()) { //throw new NoSuchElementException(); 
			System.out.println("Underflow");
		}

		front = (front +1) % q.length;
		item = q[front];
		q[front] = null;
		size--;

		if (size > 0 && size == q.length/4){
			resize(q.length/2);

		}

	}

}




class Node<E>{

	public static final String name = null;
	public E item = null;
	public Node<E> next;

	public Node(E newItem,Node<E> object) {
		
		this.item=newItem;
		this.next=object;


	}

	public Node(int newItem, String string) {
		// TODO 자동 생성된 생성자 스텁
	}

}


class ListQueue<E> {

	private Node<E> front, rear;
	private int size;

	public ListQueue(){

		front = rear = null;
		size = 0;

	}

	public int queueSize(){ return size; }

	public boolean isEmpty() { return queueSize() == 0; }

	public void add(E newItem){

		Node<E> newNode = new Node<E>(newItem, null);
		if (isEmpty()) { 

			front = newNode; rear = newNode;
			
		} else {

			rear.next = newNode;
			rear = newNode;

		}
		size++;
	}

	public void printQueue(){

		Node<E> t;
		t = front;

		while (t != null) {

			System.out.print("-> " + t.item);
			t = t.next;

		}
		System.out.println();
	}

	public E remove(){

		if (isEmpty()) { //throw new NoSuchElementException();
			return null;
		}
		E frontItem = front.item;
		front = front.next;
		size--;
		return frontItem;
	}

	public E peek() {

		if (isEmpty()) {
			return null;
		}
		return front.item;
	}

	public void delete(){

		if (isEmpty()) { //throw new NoSuchElementException();
		}
		front = front.next;
		size--;
	}
}

public class QueueGeneric {
	
	public static void main(String[] ar) {

		System.out.println("Array Queue : ");
//구현 부분 
		Queue<Node> q2 = new LinkedList<>();
		Node node1 = new Node(100, "Kim");

		q2.add(node1);
		Node remove = q2.remove();
		System.out.println("remove : "+remove.name);
		System.out.println();

		ArrayQueue<String> aq1 = new ArrayQueue<String>();
		aq1.add("banana");
		aq1.add("tomato");
		aq1.add("pineapple");
		System.out.println("peek item : "+aq1.peek());
		aq1.printQueue();
		
		while(aq1.peek()!= null){

			System.out.println("remove : "+aq1.remove());

		}
		
		aq1.printQueue();
		
		System.out.println("LinkedList Queue : ");
		 //제네릭을 만들어서 사용해볼수 있을까?
		ListQueue<String> lq1 = new ListQueue<String>();
		lq1.add("banana");
		lq1.add("tomato");
		lq1.add("pineapple");
		lq1.printQueue();
		System.out.println("remove : "+lq1.remove());
		lq1.printQueue();
		System.out.println();
		
		
		ListQueue<Integer> lq3 = new ListQueue<Integer>();
		lq3.add(95);
		lq3.add(88);
		lq3.add(77);
		lq3.add(37);
		lq3.printQueue();
		System.out.println("remove : "+lq3.remove());
		lq3.printQueue();
		System.out.println();
		 //제네릭이 이해 안된다면 제네릭을 사용하지 말자

	}

}
