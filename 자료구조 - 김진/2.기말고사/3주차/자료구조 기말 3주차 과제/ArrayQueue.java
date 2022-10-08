import java.util.NoSuchElementException;
//큐는 선입선출이라 먼저들어간게 먼저 삭제된다.
//1차원 배열은 안쓰기 때문에 원형배열로 생각하고 코드를 짠다.
public class ArrayQueue {

	private String[] q;
	private int front, rear, size;
	//front는 원소삭제할때 필요한 변수
	//rear은 원소를 하나씩 방문하면서 갯수를 알수있는 변수
	
	public ArrayQueue() {
		//q = (String[]) new String[2];
		q = new String[2];
		front = rear = size = 0;
	}
	
	public int queueSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return(size == 0);
	}
	// 큐가 full이면, 큐크기를 두배로 늘림
	public void add(String newItem){
		if ((rear + 1) % q.length == front) { 	// queue full,큐의 rear+1을 q배열의 길이로 나눈 값이 front 와 같다면 싸이즈 늘려라
			resize(2*q.length);					//사이즈를 2배로 늘려라
		}
		
		//rear의 값과 front 값이 같지 않을경우 
		rear = (rear +1) % q.length;			//rear에다가 +1을 해주고 q배열 길이를 나눠준 값을 rear 에다가 넣는다.
		q[rear] = newItem;						//q배열rear번째 에다가 새 값을 넣어준다.
		size++;									//size에다가 +1을 해준다.
	}
	
	public String remove() {
		String item;
		if (isEmpty()) { 						//값이 없다면 언더플로우 나오도록
			System.out.println("Underflow");
			return null;						//삭제할 값이 없다면 null을 리턴
		}
		front = (front +1) % q.length;			//front를 증가시켜 배열을 전진
		item = q[front];						//item에 전진한 값을 넣고 -> item은 그냥 삭제값 저장해놓는 변수임.
		q[front] = null;						//전진했던 배열 안에 null을 넣어줌으로써 값을 삭제
		size--;									//삭제시켰으니 size -1해줌
		if (size > 0 && size == q.length/4){	//size가 양수이거나 배열길이를  4로 나눈게 같다면 
			resize(q.length/2);					//사이즈를 재 배열하라 -> 사이즈를 줄이는 코드임
		}
		return item;							//어떤값이 삭제됬는지를 리턴해줌
	}
	
	public String peek() {						//선두원소가 뭔지 보기 위해서 쓰는 메소드
		
		if(isEmpty()) {
			return null;
		}
		return q[front+1];						//front는 -1이기 때문에 +1증가시켜주면 첫원소가 나옴
	}
	
	public void delete() {						//원소 삭제니까 return 필요 없어서 void써줌,remove랑 똑같음
		String item;
		if (isEmpty()) { 						
			System.out.println("Underflow");					
		}
		front = (front +1) % q.length;			//front를 증가시켜 배열을 전진
		item = q[front];						//item에 전진한 값을 넣고 -> item은 그냥 삭제값 저장해놓는 변수임.
		q[front] = null;						//전진했던 배열 안에 null을 넣어줌으로써 값을 삭제
		size--;									//삭제시켰으니 size -1해줌
		if (size > 0 && size == q.length/4){	//size가 양수이거나 배열길이를  4로 나눈게 같다면 
			resize(q.length/2);					//사이즈를 재 배열하라 -> 사이즈를 줄이는 코드임
		}
	}
	
	// 큐 크기를 조정한다.
	private void resize(int newSize){			//큐 크기를 늘리는 메소드
		String[] t = new String[newSize];		//t라는 새 배열을 만들어서 이전 큐 배열에 들어있던 값들을 저장
		for (int i = 1, j = front + 1; i < size+1; i++, j++) {	//front+1값부터 옮기면 됨,size+1은 이전 배열의 사이즈이기 때문에 값 담겨져있는거 다 저장
			t[i] = q[j%q.length];				//t배열에 값들을 저장
		}
		front =0;								//front값을 다시 0 으로 초기화해서 새 배열에서 쓸준비
		rear = size;							//rear에다가 이전배열에서 원소 가져온 갯수만큼의 크기를 대입
		//q = (String[]) t;
		q=t;									//q배열에다가 t배열을 대입
	}
	
	public void printQueue(){					//큐 에 들어있는 값들을 출력
		for (int i = front + 1; i <= rear; i++){//rear은 들어있는 원소 갯수와 같은값임
			System.out.print("-> " + q[i]);
		}
		System.out.println();
	}
}
