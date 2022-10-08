
class QlistNode {
	String name;
	int priority;
	QlistNode link;
}
class PQ {
	QlistNode front;
	int x;
	public PQ(){
	}
	void enqueue(String name, int priority){
		QlistNode p;
		QlistNode newNode=new QlistNode();
		newNode.name=name;
		newNode.priority=priority;
		newNode.link=null;
		if((front==null)||(newNode.priority<front.priority)){ 
			newNode.link=front; front=newNode;
		}
		else{
			p=front;
			while(p.link!=null&&p.link.priority<=newNode.priority){
				p=p.link;
			}	
			newNode.link=p.link;
			p.link=newNode;
		}
	}
	String dequeue(){
	    String name="";
		if(front==null){ System.out.println("Queue underflow");}
		else {name=front.name; front=front.link;}
		return name;
	}
	int numberofitem(){//¿ø¼Ò °¹¼ö ³ªÅ¸³¿
		x=0;
		QlistNode p= front;
		while(p!=null) {
			x++;
			p=p.link;
		}
		return x;
	}
	String peek(){
		String name="";

		if (front==null) { return null;}

		return front.name;
	}
	void clear() {
		front=null;
		x=0;
	}
	
}  

public class ListPQMain {
	public static void main(String[] args){
		PQ listQ= new PQ();
		listQ.enqueue("Kim",30);
		listQ.enqueue("Lee",20);
		listQ.enqueue("Pak",10);
		listQ.enqueue("Cho",70);
		System.out.println(listQ.numberofitem());
		System.out.println(listQ.peek());
		
		
		
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
	}
}

