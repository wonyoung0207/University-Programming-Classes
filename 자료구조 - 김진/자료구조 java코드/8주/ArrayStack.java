
class ArrayStack {
	int max = 10;
	int stack[] = new int[max];//���� ����,������ �迭
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

	void push(int x) {			//���ÿ� top������Ű�鼭 ���� ����.top���� �ʱⰪ -1�������, push�� ����� ���� �ִ°���.
		top = top + 1; 			//->�ֿ� �ڵ�
		if (top >= max) {		//���࿡ topũ�⺸�� Ŀ���� �ƽ��� �÷���.
			max += 20;
			int tmpstack[] = new int[max];
			for (int i = 0; i <= top; i++) {
				tmpstack[i] = stack[i];		//���θ��� ������ �ø� �迭���ٰ� �����迭�� stack �迭�� ���� stack[0]������ �־���
			}
			stack = tmpstack;	//stack �迭���ٰ� �ٽ� �־���
		}else {
			stack[top] = x;		//->�ֿ��ڵ�
		}
	}

	int peek() {				//������ top���� �˻��ϴ� ���
		if (empty())
			return -1;			// �����ΰ��
		else
			return stack[top];

	}

	int pop() {					//pop�� ���� ������ ���
		int y = 0;
		if (top < 0) {			//top�� 0���� �������� ����÷ο�, Ŭ��� �����÷ο�
			System.out.println("Stack Underflow");
		} else {
			y = stack[top];
			top = top - 1;		//���� �ϳ��� ������ ���ؼ� top���ҽ�Ŵ
		}
		return y;				//���� �����ִ� ������ ������ ������
		
	}

	void remove() {				//������ top ���Ҹ� ���� 
		if (empty()) {
			return;
		} else {
			top -= 1;			//top�� top-1�ϸ� top���� ������.
		}
	}

	boolean empty() {
		if (top < 0) {
			return true;
		} else
			return false;
	}
}
