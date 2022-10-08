import java.util.EmptyStackException;

public class ArrayStackGeneric<E> {

	private E s[];					//E라는 자료형을가진 s배열 생성
	private int top;
	
	public ArrayStackGeneric(){		//
		s = (E[]) new Object[1];	//자료형을 E[] 로 바꿔주는것.
		top = -1;					//top의 초기값은 -1 이다.
	}
	
	public int size() {				//배열의 크기는 top+1 이다.
		return top + 1;
	}
	
	public boolean isEmpty(){
		return (top == -1);			//top이 -1이면 비었다는것임.
	}
	
	public E peek(){
		if (isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void push(E newItem){
		System.out.println(size()+" "+s.length);	//처음 size크기는 size 매소드에서 +1되면 0,s.length
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
	
	private void resize(int newSize){				//size의 크기를 늘려주는 역할을 함.
		System.out.println("newSize " + newSize);
		Object[] t = new Object[newSize];
		for (int i = 0; i < (top + 1); i++){		//새로만든 object형 배열의 t에다가 기존 배열 s에있던 값들을 차래로 넣어준다.
			t[i] = s[i];
		}
		s = (E[]) t;								//자료형을 E[] 로하는 변수 t를 s에 대입
	}
	public void printStack(){
		for (int i =0; i <= top; i++) {
			System.out.print(" " + s[i]);
		}
		System.out.println();
	}
}
