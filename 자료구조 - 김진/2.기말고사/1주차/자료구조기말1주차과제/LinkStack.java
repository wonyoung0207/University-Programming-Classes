
public class LinkStack {
	ListNode top;

	public LinkStack() {
		top = null;				//ArrayStack 이랑 차이점,제일 밑에있는 값의 주소에 null이 들어감.
	}

	void push(int x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		if (top == null) {		// stack empty
			top = newNode;		//원소가 없을경우 top에다가 newNode 넣어주고 다음주소에 null대입.
			top.link = null;
		} else {				//원소가 있다면 
			newNode.link = top;	//새로 추가되는 newNode의 다음 주소에 원래있던 top의 값을 넣어준다.
			top = newNode;		//다시 top에다가 새로받은 newNode를 넣어준다.->처음 추가된 값이 계속 밑으로 내려가게됨.
		}
	}

	int pop() {
		int x;
		if (top == null) {		//Empty()-> 리스트가 비었다면 주소가 null이기 때문에
			System.out.println("Stack underflow");
			return -1;
		} else {				//x라는 변수 하나에 제일위의top값을 넣어주고 top의 주소를 다음주소로 바꿔주고 x값을 리턴
			x = top.data;
			top = top.link;
			return x;
		}
	}

	int peek() {				//스택의 top원소 값을 리턴
		if (top == null) {		//Empty()리스트가 비었다면 -1을 리턴.
			return -1;
		}
		else {					//값이 있다면 제일 위에 top값의 데이터를 리턴
			return (top.data);
		}
	}

	void delete() {				//top데이터를 삭제하는 메소드
		if (top == null)		//Empty()
			return;
		else					//top의 주소를 다음주소로 변경해서 원래있던 top값 없어지게함.
			top = top.link;
	}

	boolean Empty() {
		if (top == null) {
			return true;
		} else
			return false;
	}
}
