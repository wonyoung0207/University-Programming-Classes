//deque = stack + que ���ĳ�����

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

class MyNode1 {
	int id;
	String name;
	int score;
	public MyNode1(int id, String name,int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
}

public class AverageDeque {
	public static void main(String[] args) {
		Deque<MyNode1> que = new LinkedList<MyNode1>();//MyNode�� que�� ����
		MyNode1 node1 = new MyNode1(1, "Kim",10);
		MyNode1 node2 = new MyNode1(2, "Son",20);
		MyNode1 node3 = new MyNode1(3, "Lee",30);
		MyNode1 node4 = new MyNode1(4, "Park",40);
		MyNode1 node5 = new MyNode1(5, "Choi",50);
		MyNode1 node6 = new MyNode1(6, "Ra",60);
		MyNode1 node7 = new MyNode1(7, "LG",70);
		MyNode1 node8 = new MyNode1(8, "SAM",80);
		MyNode1 node9 = new MyNode1(9, "PYU",90);
		MyNode1 node10 = new MyNode1(10, "KIL",100);
		
		que.addLast(node1);
		que.addLast(node2);
		que.addLast(node3);
		que.addLast(node4);
		que.addLast(node5);
		que.addLast(node6);
		que.addLast(node7);
		que.addLast(node8);
		que.addLast(node9);
		que.addLast(node10);
		
		//Iterator ��� �������̽� �̿��ؼ� que���ִ� ���ҵ� ����ֱ�
		Iterator<MyNode1> iterator = que.iterator();
		while (iterator.hasNext()) {//�������Ұ� �ִ��� iterator�� Ȯ��
			MyNode1 tmpNode = iterator.next();//�������Ұ��� �����´�
			System.out.println("id :"+ tmpNode.id + " name :"+ tmpNode.name+" Score :"+tmpNode.score);
		}
		
		
		int sum=0;
		int count=0;
		
		//����� ���ϱ����� que�� �������� �ݺ����ִ°�
		while (!que.isEmpty()) {
			MyNode1 tmpNode = que.removeFirst();//que �� �������� remove�� ���� temNode�� ����
			sum+=tmpNode.score;		//sum�� tmpNode ���ڿ��� ��� ������.
			count+=1;				//count�� ��� �ݺ��ߴ����� �˷��� -> ����� �˼��ֵ���. ��� ���Ҷ� �ʿ�
		}
		System.out.println("�������:"+sum/count);
		
		System.out.println("\n���⼭���� ���ù�\n");
		//�ٽ� que�� stack���� ����ϱ����� ���ο� ��ü�� �������
		
		Deque<MyNode1> stack = new LinkedList<MyNode1>();
		
		que.addFirst(node1);
		que.addFirst(node2);
		que.addFirst(node3);
		que.addFirst(node4);
		que.addFirst(node5);
		que.addFirst(node6);
		que.addFirst(node7);
		que.addFirst(node8);
		que.addFirst(node9);
		que.addFirst(node10);
		
		while (!que.isEmpty()) {
			MyNode1 tmpNode= que.removeFirst();
			System.out.println("id :"+ tmpNode.id + "name :"+ tmpNode.name);
		}
	}
}

/*
 *  
//AverageDeque using iterater ->iterater �������̽� ����ؼ� deque����  
//�������̽� ���ִ°� ��ӹޱ�����,����� List �����Ҷ� �� ���� ������������,���� ���� ����� �Ҽ��ִ�
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
class MyNode {
 int id;
 int score;
 String name;
 public MyNode(int id, String name, int score) {
  this.id = id;
  this.name = name;
  this.score = score;
 }
}
public class AverageDeque<E> {
 public static void main(String args[]) {
 int sum = 0;
 int avg = 0;
 Deque<MyNode> dq = new LinkedList<MyNode>();
 MyNode n1 = new MyNode(1, "Kim", 88);
 MyNode n2 = new MyNode(2, "Lee", 90);
 MyNode n3 = new MyNode(3, "Yoo", 53);
 MyNode n4 = new MyNode(4, "Park", 64);
 MyNode n5 = new MyNode(5, "Choi", 100);
 MyNode n6 = new MyNode(6, "Koo", 65);
 MyNode n7 = new MyNode(7, "Kang", 72);
 MyNode n8 = new MyNode(8, "Yoon", 92);
 MyNode n9 = new MyNode(9, "Bae", 48);
 MyNode n10 = new MyNode(10, "Kwak", 83);
 
 dq.add(n1);
 dq.add(n2);
 dq.add(n3);
 dq.add(n4);
 dq.add(n5);
 dq.add(n6);
 dq.add(n7);
 dq.add(n8);
 dq.add(n9);
 dq.add(n10);
 
 Iterator<MyNode> iterator = dq.iterator();
 while (iterator.hasNext()) {//�������Ұ� �ִ��� iterator�� Ȯ��
  MyNode tmpNode = iterator.next();//�������Ұ��� �����´�
  System.out.println("id :"+ tmpNode.id + " name :"+ tmpNode.name+" Score :"+tmpNode.score);
  sum += tmpNode.score;
 }
 avg = sum/10;
 System.out.println("Sum : "+sum+" Avg :"+avg);
 
 Iterator<MyNode> reverse = dq.descendingIterator();
 System.out.println("Reverse Iterator : ");
 while (reverse.hasNext()) {
  MyNode tmpNode2 = reverse.next();
  System.out.println("id :"+ tmpNode2.id + " name :"+ tmpNode2.name+" Score :"+tmpNode2.score);
 }
}
}
   
 */