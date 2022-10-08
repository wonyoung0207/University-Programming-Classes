
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Customer3 implements Comparable<Customer3>{
   int id;
   int arrivals;
   int service;
   int priority;

   public Customer3(int id, int arrivals, int service, int priority) {
      this.id = id;
      this.arrivals = arrivals; // 도착시간
      this.service = service; // 요구되는 서비스 시간
      this.priority = priority; // 우선순위
   }
   @Override
   public int compareTo(Customer3 target) {
      if(this.priority > target.priority) {
         return 1;
      } else if(this.priority < target.priority) {
         return -1;
      }
      return 0;
   }
}

public class BankSimulation1 {

   public static void main(String args[]) {
      // 손님 7명 랜덤으로 할 수 있으나 프로그램을 간단하게 하기 위해 초기값 부여
      int[] arrivals = { 0, 15, 20, 20, 30, 40, 45 };// 도착시간
      int[] service = { 20, 5, 10, 10, 15, 20, 5 }; // 요구되는 서비스 시간
      int[] priority = { 3, 1, 2, 2, 1, 0, 1 }; // 우선순위
      Customer3 newCustomer;

      int t;
      int numOfMinutes = 120;
//      Queue<Customer> simulQ = new LinkedList<Customer>();
      PriorityQueue<Customer3> simulPq= new PriorityQueue<Customer3>();

      int freeTime = 0;
       int waiting[] = new int[7];
      
      int queuedI = -1; // 현재 큐에 입장한 고객
      int serviceTime = 0;
      for (t = 0; t <= numOfMinutes; t = t + 5) { // numOfMinutes 분 동안의 시뮬레이션
         System.out.println(" t = " + t);
         // 현재 손님이 몇 명 대기하고 있는가? size를 출력해볼 수 있을까?
//         System.out.println("대기 손님 수 : "+simulQ.size());

         for (int j = queuedI + 1; j < arrivals.length; j++) {
            if (arrivals[j] == t) { // enqueue
               queuedI = j;
               Customer3 c1 = new Customer3(j, arrivals[j], service[j], priority[j]);
               System.out.println(j + " 번째 손님 입장 (Enqueued time : " + t + ")");
               //simulQ.add(c1);
               simulPq.offer(c1);
               System.out.println("대기 손님 수 : "+simulPq.size());
            }
         }
         // deque
         if (serviceTime <= 0) { // 직원이 서비스 가능
            if (!simulPq.isEmpty()) { // 손님이 대기하고 있다면
               newCustomer = simulPq.remove();
               serviceTime = newCustomer.service;
               System.out.println("==========");
               System.out.println(newCustomer.id + " 번째 손님 서비스 시작 (Dequeued time : " + t + ")");
               
               System.out.println("새로운 손님 기다린 시간 : " + (t - newCustomer.arrivals));
                  waiting[newCustomer.id] = (t - newCustomer.arrivals);
               System.out.println("대기 손님 수 : "+simulPq.size());
//               if(t == newCustomer.service + newCustomer.arrivals) {
//                  System.out.println(newCustomer.id + " 번째 손님 서비스 끝 (Enqueued time : " + t + ")");
//               }
               
            }
            else {
            	System.out.println("==========");
                System.out.println("모든 손님 응대 완료");
                System.out.println("직원 휴식시간 : "+ freeTime);
                System.out.println();
                if(t!= numOfMinutes) {
                   freeTime += 5;
                }
             }
            }
            	
               
//         else {
//            // 은행직원이 5분 서비스 함
////            serviceTime = serviceTime - 5;
//            workTime += 5;
//         }
         serviceTime = serviceTime - 5;

      }

      int maxwaiting = 0;
         int sumwaiting = 0;
         int avrwaiting = 0;
         for (int i = 0; i < 7; i++) {
            if (maxwaiting < waiting[i]) {
               maxwaiting = waiting[i];
            }
            sumwaiting += waiting[i];

         }
         avrwaiting = sumwaiting / 7;

         System.out.println("재일 많이 기다린 고객 시간 : " + maxwaiting);
         System.out.println("평균 기다린 시간 : " + avrwaiting);
         System.out.println("직원이 서비스하지 않고 기다린 시간 : " + (freeTime));


      
   }
}


//
//		//
//		//
//		//
//		//
//		// 일반큐-------------------------------------------------------------
//
//		// 변수들의 값을 처음처럼 만든다. 변수들의 사용은 우선순위큐에서 활용한 것과 같다.
//		freeTime = 0;
//		for (int i = 0; i < waiting.length; i++)
//			waiting[i] = 0;
//		queuedI = -1;
//		sumwaiting = 0;
//
//		// 일반큐 객체 생성
//		Queue<Customer3> simulQ1 = new LinkedList<Customer3>();
//		Customer3[] customerArr = new Customer3[7];
//		Customer3 customerTmp;
//		int size;
//
//		// 일반큐에서 몇번째 입장 손님인지 id를 저장하기 위한 변수.
//		// int id[] = { 0, 1, 2, 3, 4, 5, 6 };
//		// 배열 모두에서 우선순위의 값이 작을수록 왼쪽에 배치해 정렬한다.
//		// 도착시간을 제외한 손님 변수는 모두 바뀐다. 이것은 위의 우선순위큐와 비슷하게 만드는 과정이다.
//		// 우선순위 값이 같은 경우에는 정렬한 방법에 따라, 일반큐와 우선순위큐의 service시간 값이 다르기 때문에 출력도 다를 수 있다.
//		// 배열을 정렬하는 방법은 다양하다. 밑의 for문은 테스트한 예시다.
//		/*
//		 * for (int i = 0; i < service.length; i++) { for (int j = i; j <
//		 * service.length; j++) { if (priority[i] > priority[j]) { tmp = id[i]; id[i] =
//		 * id[j]; id[j] = tmp; tmp = service[i]; service[i] = service[j]; service[j] =
//		 * tmp; tmp = priority[i]; priority[i] = priority[j]; priority[j] = tmp;
//		 * 
//		 * } } } for (i = service.length - 1; i >= 0; i--) { for (int j = i; j >= 0;
//		 * j--) { if (service[i] < service[j]) { tmp = id[i]; id[i] = id[j]; id[j] =
//		 * tmp; tmp = service[i]; service[i] = service[j]; service[j] = tmp; tmp =
//		 * priority[i]; priority[i] = priority[j]; priority[j] = tmp;
//		 * 
//		 * } } }
//		 */
//
//		for (t = 0; t <= numOfMinutes; t = t + 5) { // numOfMinutes 분 동안의 시뮬레이션
//			System.out.println(" t = " + t);
//			// 현재 손님이 몇 명 대기하고 있는가? size를 출력해볼 수 있을까?
////            System.out.println("대기 손님 수 : "+simulQ.size());
//
//			for (int j = queuedI + 1; j < arrivals.length; j++) {
//				if (arrivals[j] <= t) { // enqueue
//					queuedI = j;
//					Customer3 c1 = new Customer3(j, arrivals[j], service[j], priority[j]);
//					simulQ1.offer(c1);
//					System.out.println(j + " 번째 손님 입장 (Enqueued time : " + t + ")" + " 대기 손님 수 : " + simulQ1.size());
//				}
//			}
//
//			// 밑은 일반큐를 배열을 이용해서 우선순위 값이 작은 순서로 정렬하는 과정이다.
//			// 배열에 큐의 원소를 모두 넣는다.
//			size = simulQ1.size();
//			for (int i = 0; i < size; i++) {
//				customerArr[i] = simulQ1.remove();
//			}
//			// 우선순위 값의 크기로 정렬한다.
//			for (int k = 0; k < size; k++) {
//				for (int l = 0; l < size; l++) {
//					if (customerArr[k].priority < customerArr[l].priority) {
//						customerTmp = customerArr[k];
//						customerArr[k] = customerArr[l];
//						customerArr[l] = customerTmp;
//					}
//				}
//			}
//			// 배열에서 큐에 원소를 모두 넣는다.
//			for (int k = 0; k < size; k++) {
//				simulQ1.offer(customerArr[k]);
//			}
//			
//			// -----------------------------------
//			//
//			// 여기서 부터는 원래 코드와 같다.
//			//
//			// -----------------------------------
//
//			// deque
//			if (serviceTime <= 0) { // 직원이 서비스 가능
//				if (!simulQ1.isEmpty()) { // 손님이 대기하고 있다면
//					newCustomer = simulQ1.remove();
//					serviceTime = newCustomer.service;
////                  System.out.println("==========");
//					System.out.println(newCustomer.id + " 번째 손님 서비스 시작 (Dequeued time : " + t + ")" + " 대기 손님 수 : "
//							+ simulQ1.size());
//
//					System.out.println("새로운 손님 기다린 시간 : " + (t - newCustomer.arrivals));
//					waiting[newCustomer.id] = (t - newCustomer.arrivals);
////                  System.out.println("대기 손님 수 : "+simulPq.size());
////                  if(t == newCustomer.service + newCustomer.arrivals) {
////                     System.out.println(newCustomer.id + " 번째 손님 서비스 끝 (Enqueued time : " + t + ")");
////                  }
//
//				} else {
//					System.out.println("모든 손님 응대 완료");
//					System.out.println("직원 휴식시간 : " + freeTime);
//					System.out.println();
//					if (t != numOfMinutes) {
//						freeTime += 5;
//					}
//				}
//			}
////            else {
////               // 은행직원이 5분 서비스 함
//////               serviceTime = serviceTime - 5;
////               workTime += 5;
////            }
//			serviceTime = serviceTime - 5;
//
//		}
//
//		for (int i = 0; i < 7; i++) {
//			if (maxwaiting < waiting[i]) {
//				maxwaiting = waiting[i];
//			}
//			sumwaiting += waiting[i];
//
//		}
//		avrwaiting = sumwaiting / 7;
//
//		System.out.println("재일 많이 기다린 고객 시간 : " + maxwaiting);
//		System.out.println("평균 기다린 시간 : " + avrwaiting);
//		System.out.println("직원이 서비스하지 않고 기다린 시간 : " + (freeTime));
//	}
//}
// */