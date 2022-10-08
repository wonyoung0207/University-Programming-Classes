
// Test.java
import java.util.Comparator;
import java.util.PriorityQueue;

class MyClass {
	int id;
	int num;
	String name;

	public MyClass(int id, String name,int num) {
		this.id = id;
		this.name = name;
		this.num = num;
	}
}

public class PQCompObj {
	public static void main(String[] args) {
		Comparator<MyClass> comparator = new MyClassComparator();

		PriorityQueue<MyClass> queue = new PriorityQueue<MyClass>(10, comparator); //큐크기 10
		// PriorityQueue<MyClass> queue = new PriorityQueue<MyClass>( comparator);
		MyClass n1 = new MyClass(1, "Kim", 10);
		MyClass n2 = new MyClass(2, "Lee", 20);
		MyClass n3 = new MyClass(3, "Park",30);
		MyClass n4 = new MyClass(4, "Choi", 40);
		MyClass n5 = new MyClass(5, "a", 50);
		MyClass n6 = new MyClass(6, "b", 60);
		MyClass n7 = new MyClass(7, "c", 70);
		MyClass n8 = new MyClass(8, "d", 80);
		MyClass n9 = new MyClass(9, "e", 90);
		MyClass n10 = new MyClass(10, "f", 100);
		
		queue.add(n1);
		queue.add(n2);
		queue.add(n3);
		queue.add(n4);
		queue.add(n5);
		queue.add(n6);
		queue.add(n7);
		queue.add(n8);
		queue.add(n9);
		queue.add(n10);

		MyClass tmpNode;
		//우선순위큐 원소 삭제해서 보여주는 것
		while (queue.size() != 0) {
			tmpNode=queue.remove();
			System.out.println(tmpNode.id+" "+tmpNode.name + " " +tmpNode.num );
		}
		//점수먼저 출력되게 만드는것
		while (queue.size() != 0) {
			tmpNode=queue.remove();
			System.out.println(tmpNode.num +" " + tmpNode.id + " " + tmpNode.name + " " );
		}
	}
}

class MyClassComparator implements Comparator<MyClass> {
	@Override
	public int compare(MyClass x, MyClass y) {
	
		if (x.id < y.id) {
			return -1;
		}
		if (x.id > y.id) {
			return 1;
		}
		return 0;
	}
}