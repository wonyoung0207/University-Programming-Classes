
class ArrayStack {
	int max = 10;
	int stack[] = new int[max];//스택 생성,일차원 배열
	private int top;

	public ArrayStack() {
		top = -1;
	}

	public boolean stackFull() {
		if (top == max - 1) {
			return true;
		} else {
			return false;
		}
	}

	void push(int x) {			//스택에 top증가시키면서 값을 대입.top에는 초기값 -1들어있음, push의 기능은 값을 넣는것임.
		top = top + 1; 			//->주요 코드
		if (top >= max) {		//만약에 top크기보다 커지면 맥스를 늘려라.
			max += 20;
			int tmpstack[] = new int[max];
			for (int i = 0; i <= top; i++) {
				tmpstack[i] = stack[i];		//새로만든 사이즈 늘린 배열에다가 기존배열인 stack 배열의 값을 stack[0]값부터 넣어줌
			}
			stack = tmpstack;	//stack 배열에다가 다시 넣어줌
		}else {
			stack[top] = x;		//->주요코드
		}
	}

	int peek() {				//스택의 top원소 검색하는 기능
		if (empty())
			return -1;			// 공백인경우
		else
			return stack[top];

	}

	int pop() {					//pop은 값을 꺼내는 기능
		int y = 0;
		if (top < 0) {			//top이 0보다 작을경우는 언더플로우, 클경우 오버플로우
			System.out.println("Stack Underflow");
		} else {
			y = stack[top];
			top = top - 1;		//값을 하나씩 꺼내기 위해서 top감소시킴
		}
		return y;				//제일 위에있는 값부터 꺼내서 보여줌
		
	}

	void remove() {				//스택의 top 원소를 삭제 
		if (empty()) {
			return;
		} else {
			top -= 1;			//top을 top-1하면 top값이 없어짐.
		}
	}

	boolean empty() {
		if (top < 0) {
			return true;
		} else
			return false;
	}
}
