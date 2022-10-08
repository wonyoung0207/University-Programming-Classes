
public class Node<E>{
	public E item;
	public Node<E> next;
	public Node(E newItem, Node<E> node){
		item = newItem;
		next = node;
	}
}