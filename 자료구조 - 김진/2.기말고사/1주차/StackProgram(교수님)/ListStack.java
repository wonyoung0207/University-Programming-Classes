
public class ListStack<E> {

	private Node<E> top;
	private int size;
	public ListStack() {
		top = null;
		size = 0;
	}
	 
	public int stackSize() { return size; }
    public boolean isEmpty(){ return size == 0;}
    
    public void push(E newItem){
    	Node<E> t = new Node<E>(newItem, null);
    	t.next = top;
    	top = t;
    	size++;
    }
    
    public E pop(){
    	E t;
    	t = top.item;
    	top = top.next;
    	size--;
    	return t;
    }
    public void printStack(){
    	Node<E> t;
    	t = top;
    	while(t != null){
    		System.out.println(t.item);
    		t = t.next;
    	}
    	
    }
}
