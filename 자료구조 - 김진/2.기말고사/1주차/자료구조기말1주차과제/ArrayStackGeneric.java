import java.util.EmptyStackException;

public class ArrayStackGeneric<E> {

	private E s[];					//E��� �ڷ��������� s�迭 ����
	private int top;
	
	public ArrayStackGeneric(){		//
		s = (E[]) new Object[1];	//�ڷ����� E[] �� �ٲ��ִ°�.
		top = -1;					//top�� �ʱⰪ�� -1 �̴�.
	}
	
	public int size() {				//�迭�� ũ��� top+1 �̴�.
		return top + 1;
	}
	
	public boolean isEmpty(){
		return (top == -1);			//top�� -1�̸� ����ٴ°���.
	}
	
	public E peek(){
		if (isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void push(E newItem){
		System.out.println(size()+" "+s.length);	//ó�� sizeũ��� size �żҵ忡�� +1�Ǹ� 0,s.length
		if (size() == s.length) {
			resize(2 * s.length);
		}
		s[++top]  = newItem;
	}
	
	public E pop(){
		if (isEmpty()){
			throw new EmptyStackException();
		}
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size() == s.length/4) {
			resize(s.length/2);
		}
		return item;
	}
	
	private void resize(int newSize){				//size�� ũ�⸦ �÷��ִ� ������ ��.
		System.out.println("newSize " + newSize);
		Object[] t = new Object[newSize];
		for (int i = 0; i < (top + 1); i++){		//���θ��� object�� �迭�� t���ٰ� ���� �迭 s���ִ� ������ ������ �־��ش�.
			t[i] = s[i];
		}
		s = (E[]) t;								//�ڷ����� E[] ���ϴ� ���� t�� s�� ����
	}
	public void printStack(){
		for (int i =0; i <= top; i++) {
			System.out.print(" " + s[i]);
		}
		System.out.println();
	}
}
