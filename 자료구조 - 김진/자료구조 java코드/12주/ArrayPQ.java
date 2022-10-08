
public class ArrayPQ {
	public static void main(String[] args) {
		PriorityQ arrayPQ = new PriorityQ(5);
		PriorityQ arrint = new PriorityQ(5);
		
		// what do you know about the priority queue at this point?
		arrayPQ.insert(30);
		arrayPQ.insert(50);
		arrayPQ.insert(10);
		arrayPQ.insert(40);
		arrayPQ.insert(20);

		while (!arrayPQ.isEmpty()) {
			long item = arrayPQ.remove();
			System.out.print(item + " "); // 10, 20, 30, 40, 50 Note: ORDERED!
		} // end while
		System.out.println("");
		
		arrayPQ.insert(30);
		arrayPQ.insert(50);
		arrayPQ.insert(10);
		arrayPQ.insert(40);
		arrayPQ.insert(20);
		
		//���� �� ����� �޼ҵ�
		System.out.println("arrayPQ�� ������� -> " + arrayPQ.clear());

		//���� ���� ����ϴ� �żҵ�
		arrint.insert(30);
		arrint.insert(50);
		arrint.insert(10);
		arrint.insert(40);
		arrint.insert(20);

		System.out.println("arrint�迭�� ���� ť ���� ���� ����  : " + arrint.size());
		
	} // end main()
}

//priorityQ.java
// �迭���� ū������ ���� ���� ���ĵǾ� ����.
class PriorityQ { // array in sorted order, from max at 0 to min at nitems-1
	private int maxSize;
	private long[] queArray;
	private int nItems;

	public PriorityQ(int s) { 
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}

	public void insert(long item) {
		int j;
		if (nItems == 0)
			queArray[nItems++] = item;
		else {
			for (j = nItems - 1; j >= 0; j--)
				if (item > queArray[j]) { // item���� ���� ���Ҵ� ��ĭ�� �ڷ� �̵�
					queArray[j + 1] = queArray[j];
					if(isFull())
						System.out.println("quefull�߻�");
						resize();
				}
				else
					break;
			
			queArray[j + 1] = item;
			nItems++;//�迭 ������ ����
			// increment number of items in the pqueue.
		} // end else (nItems > 0) // Note value of j when we leave the for loop!
			// queArray[j+ 1 is correct. ===============================================
	} // end insert()
	
	//������ �ø��� �޼ҵ�
	public void resize() {
		if(isFull()) {
			maxSize = maxSize + 5;
			
		}
	}
	//�迭 ����
	public String clear() {
		String k = null;
		
		
		if(isEmpty()) {
			System.out.println("ť�� ������ϴ�");
			
		}
		else {
			nItems = 0;
			queArray = new long[nItems];//���ο� �迭 �־ ����
			k = "���Ұ� ��� ��ŵǾ����ϴ�.";
		}
		return k;
	}
	
	public int size() {
		int a;
		int count = 0;
		
		for(a = 0;a < queArray.length;a++){
			if(isEmpty()) {
				System.out.println("�ƹ� ���� �����ϴ�.");
			}
			else {
				peekMin();
				count++;
			}
		}
		return count;
		
	}

	public long remove() {
		return queArray[--nItems];
	}

	public long peekMin() // peek at minimum item
	{
		return queArray[nItems - 1];
	}

	public boolean isEmpty() // true if queue is empty Very straightforward.
	{
		return (nItems == 0);
	}

	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}
} // end class PriorityQ`
