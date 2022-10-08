import java.util.NoSuchElementException;
//ť�� ���Լ����̶� �������� ���� �����ȴ�.
//1���� �迭�� �Ⱦ��� ������ �����迭�� �����ϰ� �ڵ带 §��.
public class ArrayQueue {

	private String[] q;
	private int front, rear, size;
	//front�� ���һ����Ҷ� �ʿ��� ����
	//rear�� ���Ҹ� �ϳ��� �湮�ϸ鼭 ������ �˼��ִ� ����
	
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
	// ť�� full�̸�, ťũ�⸦ �ι�� �ø�
	public void add(String newItem){
		if ((rear + 1) % q.length == front) { 	// queue full,ť�� rear+1�� q�迭�� ���̷� ���� ���� front �� ���ٸ� ������ �÷���
			resize(2*q.length);					//����� 2��� �÷���
		}
		
		//rear�� ���� front ���� ���� ������� 
		rear = (rear +1) % q.length;			//rear���ٰ� +1�� ���ְ� q�迭 ���̸� ������ ���� rear ���ٰ� �ִ´�.
		q[rear] = newItem;						//q�迭rear��° ���ٰ� �� ���� �־��ش�.
		size++;									//size���ٰ� +1�� ���ش�.
	}
	
	public String remove() {
		String item;
		if (isEmpty()) { 						//���� ���ٸ� ����÷ο� ��������
			System.out.println("Underflow");
			return null;						//������ ���� ���ٸ� null�� ����
		}
		front = (front +1) % q.length;			//front�� �������� �迭�� ����
		item = q[front];						//item�� ������ ���� �ְ� -> item�� �׳� ������ �����س��� ������.
		q[front] = null;						//�����ߴ� �迭 �ȿ� null�� �־������ν� ���� ����
		size--;									//������������ size -1����
		if (size > 0 && size == q.length/4){	//size�� ����̰ų� �迭���̸�  4�� ������ ���ٸ� 
			resize(q.length/2);					//����� �� �迭�϶� -> ����� ���̴� �ڵ���
		}
		return item;							//����� ����������� ��������
	}
	
	public String peek() {						//���ο��Ұ� ���� ���� ���ؼ� ���� �޼ҵ�
		
		if(isEmpty()) {
			return null;
		}
		return q[front+1];						//front�� -1�̱� ������ +1���������ָ� ù���Ұ� ����
	}
	
	public void delete() {						//���� �����ϱ� return �ʿ� ��� void����,remove�� �Ȱ���
		String item;
		if (isEmpty()) { 						
			System.out.println("Underflow");					
		}
		front = (front +1) % q.length;			//front�� �������� �迭�� ����
		item = q[front];						//item�� ������ ���� �ְ� -> item�� �׳� ������ �����س��� ������.
		q[front] = null;						//�����ߴ� �迭 �ȿ� null�� �־������ν� ���� ����
		size--;									//������������ size -1����
		if (size > 0 && size == q.length/4){	//size�� ����̰ų� �迭���̸�  4�� ������ ���ٸ� 
			resize(q.length/2);					//����� �� �迭�϶� -> ����� ���̴� �ڵ���
		}
	}
	
	// ť ũ�⸦ �����Ѵ�.
	private void resize(int newSize){			//ť ũ�⸦ �ø��� �޼ҵ�
		String[] t = new String[newSize];		//t��� �� �迭�� ���� ���� ť �迭�� ����ִ� ������ ����
		for (int i = 1, j = front + 1; i < size+1; i++, j++) {	//front+1������ �ű�� ��,size+1�� ���� �迭�� �������̱� ������ �� ������ִ°� �� ����
			t[i] = q[j%q.length];				//t�迭�� ������ ����
		}
		front =0;								//front���� �ٽ� 0 ���� �ʱ�ȭ�ؼ� �� �迭���� ���غ�
		rear = size;							//rear���ٰ� �����迭���� ���� ������ ������ŭ�� ũ�⸦ ����
		//q = (String[]) t;
		q=t;									//q�迭���ٰ� t�迭�� ����
	}
	
	public void printQueue(){					//ť �� ����ִ� ������ ���
		for (int i = front + 1; i <= rear; i++){//rear�� ����ִ� ���� ������ ��������
			System.out.print("-> " + q[i]);
		}
		System.out.println();
	}
}
