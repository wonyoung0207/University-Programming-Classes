//deque = stack + que 합쳐놓은것

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
		Deque<MyNode1> que = new LinkedList<MyNode1>();//MyNode형 que를 생성
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
		
		//Iterator 라는 인터페이스 이용해서 que에있는 원소들 찍어주기
		Iterator<MyNode1> iterator = que.iterator();
		while (iterator.hasNext()) {//다음원소가 있는지 iterator로 확인
			MyNode1 tmpNode = iterator.next();//다음원소값을 가져온다
			System.out.println("id :"+ tmpNode.id + " name :"+ tmpNode.name+" Score :"+tmpNode.score);
		}
		
		
		int sum=0;
		int count=0;
		
		//평균을 구하기위해 que가 빌때까지 반복해주는것
		while (!que.isEmpty()) {
			MyNode1 tmpNode = que.removeFirst();//que 가 빌때까지 remove한 값을 temNode에 저장
			sum+=tmpNode.score;		//sum에 tmpNode 스코에를 계속 더해줌.
			count+=1;				//count는 몇번 반복했는지를 알려줌 -> 몇개들어간지 알수있도록. 평균 구할때 필요
		}
		System.out.println("성적평균:"+sum/count);
		
		System.out.println("\n여기서부터 스택문\n");
		//다시 que를 stack같이 사용하기위해 새로운 객체를 만들어줌
		
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
//AverageDeque using iterater ->iterater 인터페이스 사용해서 deque구성  
//인터페이스 해주는것 상속받기위해,기능은 List 구현할때 더 쉽게 다음원소유무,제거 등의 기능을 할수있다
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
 while (iterator.hasNext()) {//다음원소가 있는지 iterator로 확인
  MyNode tmpNode = iterator.next();//다음원소값을 가져온다
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