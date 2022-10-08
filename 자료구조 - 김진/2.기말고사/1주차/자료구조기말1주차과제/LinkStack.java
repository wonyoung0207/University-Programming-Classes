
public class LinkStack {
	ListNode top;

	public LinkStack() {
		top = null;				//ArrayStack �̶� ������,���� �ؿ��ִ� ���� �ּҿ� null�� ��.
	}

	void push(int x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		if (top == null) {		// stack empty
			top = newNode;		//���Ұ� ������� top���ٰ� newNode �־��ְ� �����ּҿ� null����.
			top.link = null;
		} else {				//���Ұ� �ִٸ� 
			newNode.link = top;	//���� �߰��Ǵ� newNode�� ���� �ּҿ� �����ִ� top�� ���� �־��ش�.
			top = newNode;		//�ٽ� top���ٰ� ���ι��� newNode�� �־��ش�.->ó�� �߰��� ���� ��� ������ �������Ե�.
		}
	}

	int pop() {
		int x;
		if (top == null) {		//Empty()-> ����Ʈ�� ����ٸ� �ּҰ� null�̱� ������
			System.out.println("Stack underflow");
			return -1;
		} else {				//x��� ���� �ϳ��� ��������top���� �־��ְ� top�� �ּҸ� �����ּҷ� �ٲ��ְ� x���� ����
			x = top.data;
			top = top.link;
			return x;
		}
	}

	int peek() {				//������ top���� ���� ����
		if (top == null) {		//Empty()����Ʈ�� ����ٸ� -1�� ����.
			return -1;
		}
		else {					//���� �ִٸ� ���� ���� top���� �����͸� ����
			return (top.data);
		}
	}

	void delete() {				//top�����͸� �����ϴ� �޼ҵ�
		if (top == null)		//Empty()
			return;
		else					//top�� �ּҸ� �����ּҷ� �����ؼ� �����ִ� top�� ����������.
			top = top.link;
	}

	boolean Empty() {
		if (top == null) {
			return true;
		} else
			return false;
	}
}
