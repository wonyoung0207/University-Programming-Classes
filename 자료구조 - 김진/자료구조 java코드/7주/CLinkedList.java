public class CLinkedList {

	private CListNode head, tail;
	private CListNode temp;

	public void addFirst(int x){	//처음원소에 값 저장

		CListNode cnewNode=new CListNode();	//데이타 x를가진 노드생성
		cnewNode.data=x;
		
		if(head==null){// 공백리스트라면
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head;
		}
		else{ //원소가 여러개 존재
			temp=head;
			cnewNode.clink=temp;//새로운 객체의 주소에 첫원소 주소 대입.
			CListNode p = head;	//temp에 첫원소주소 넣고 그걸 새로찍은객체 뒤 링크주소에 대입
			do {
				p = p.clink;	//p에다가 다음주소 대입.
			} while (p.clink != head);	//마지막원소가 head의 주소를 가르킬때까지 반복.
			//마지막 원소의 링크가 새로이 찍은 빵을 가르키도록 함.
			p.clink = cnewNode;	//반복문 빠져나온후 마지막원소의 주소에 새로이 찍은 원소 주소 연결
			// tail.clink = cnewNode; tail을 사용하지 않는다고 할 때
			head=cnewNode; // 새빵의 주소를 head에 저장
			//만일 tail을 사용하지 않는다면 
		}
	}

	public void deleteLast(){

		if(head==null){
			System.out.println("Nothing to delete");
		}
//		else if(head==tail){//원소가 1개이면
//			head=null; tail=null;
//		}
		else if (head.clink == head) { //원소가 1개이면
			head = null;
			//tail = null;
		}
		else{ //원소가 2개 혹은 그 이상 
			CListNode p, q;
			p=null; q=head;
			//tail을 사용한다면 아래 코드
//			while(q!=tail){
//				p=q; q=q.clink;
//			}
//			tail=p;
			// tail을 사용하지 않는다면 아래코드
			while(q.clink != head) {
				p = q; q = q.clink;
			}
			p.clink=head;		//마지막 주소에다가 첫번째 주소를 연결.	
		}
	}

	public void print(){
		CListNode p=head;
		if(p!=null){
//			System.out.print(p.data + "->");// 첫번째 원소
//			p= p.clink;
//			while(p!=head){
//				System.out.print(p.data+"->");
//				p=p.clink;
//			}
//			System.out.print(p.data+"->"); //여기까지가 끝
//			p=p.clink;  //마지막->선두원소이동
//			System.out.println("다시 첫번째 원소" + p.data);
			//혹은 아래처럼  출력해도 된다.
			do {
				System.out.print(p.data+ "->");
				p = p.clink;	//다음링크 대입
			} while ( p != head);
			// 원형 연결 리스트임을 확인
			System.out.println(" 다시 첫번째 원소"+ p.data);
			//반복문 빠져나왔을때 찍힘. -> p의 주소가 첫번쨰 원소의 주소랑 같을경우빠져나옴
			
		}
		else { System.out.println("empty list");}
	}
	
	// 무한 반복인지 점검 노드를 100회 출력해 본다
	public void printManyTimes(int count){
		
		int cnt =0;
		CListNode p=head;
		System.out.println("printManyTimes");
		
		if(p!=null){
			System.out.print(p.data + "->");// 첫번째 원소
			p= p.clink;
			while(cnt < count){	//count는 내가 원하는 반복횟수.
//				if (p == head){
//					System.out.println();
//				}
				System.out.print(p.data+"->");
				cnt++;
				p=p.clink;
			}
			System.out.println();//20번반복하고 줄바꿈
		}
		else { System.out.println("empty list");}
	}
	
	
	// 원소 x 를 제거
	public void deleteNode(int x) {
		
		CListNode current = head;//current라는 객체를만들어 첫원소 주소넣음
		CListNode prev = current;	//첫원소의 주소를 prev에다가 대입.
		current = current.clink;	//다음링크로 넘어가도록 설정.
		//따라서 current에는 현제 2번째 원소주소있는거임

		while (current != head) {
			//System.out.println(current.data);
			if (current.data == x) {	//내가 찾을 데이터랑 같다면
				if (current==tail) { tail = prev;} 
				//만약에 내가 찾은원소의주소가 마지막원소의 주소라면 tail에 첫번째 주소 대입
				prev.clink = current.clink;
				return;
		    }
			prev = current; // 뒤따라오는  포인터 전진
			current = current.clink; // 첫번째 포인터 전진
		}
		// 위의 코드는 첫번째 원소가 x일때 삭제할 수 없다. 따라서 다음과 같은 코드 추가
		if (current.data == x) {
			head = head.clink;
			if (current==tail) { head = null; tail = null;} // 원소가 하나일때 원소를 제거하므로 공백리스트가 됨
			prev.clink = current.clink;
			return;
	    }
	}

	
	// 노드의 개수를 계산
	public int getNoofNode(){
		int cnt=1;
		CListNode current = head;
		while(current != null) {
			if(current == tail) {
				cnt+=1;
				break;
			}else {
				cnt+=1;
				current=current.clink;
			}
		}
		return cnt;
	}

	public void addLast(int x){ //원형연결리스트 마지막에 원소추가

		CListNode cnewNode=new CListNode();
		cnewNode.data=x;
		
		if(head==null){// empty list
			head=cnewNode; 
			//tail=cnewNode;
			cnewNode.clink=head;
		}
		else{ //원소가 여러개 존재
			cnewNode.clink=head;//새로이 찍은 빵의 링크에 기존의 첫번째원소 참조하도록 함
			CListNode p = head;
			do {
				p = p.clink;
			} while (p.clink != head);
			p.clink = cnewNode;
			// tail.clink = cnewNode; tail을 사용하지 않는다고 할 때					
		}
	}

	//  원형 연결 리스트에 원소가 존재하는 지 계산

	public int isEmpty() {
		
		CListNode current=head;
		if (head != null) {
			return 1; // 원소가 존재하면
		}
		return 0; // 원소가 존재하지 않으면
	}
	
	
	// 원소 x 가 몇 번째 원소인지를 리턴하라
	public int searchNode(int x) {
		
		int b=1;
		CListNode cu=head;
		while(cu != null) {
			if(cu.data==x) {
				return b;
			}else {
				b=b+1;
				cu=cu.clink;
			}if(cu==tail) {
				break;
			}
		}
		return 0; //원소가 없다면 0 리턴
	}

	public CLinkedList(){	//생성자
	}

}