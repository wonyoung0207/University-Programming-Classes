
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Customer4 implements Comparable<Customer4> {
   int id;
   int arrivals;
   int service;
   int priority;

   public Customer4(int id, int arrivals, int service, int priority) {
      this.id = id;
      this.arrivals = arrivals; // �����ð�
      this.service = service; // �䱸�Ǵ� ���� �ð�
      this.priority = priority; // �켱����
   }

   @Override
   public int compareTo(Customer4 target) {
      if (this.priority > target.priority) {
         return 1;
      } else if (this.priority < target.priority) {
         return -1;
      }
      return 0;
   }
}

public class BankSimulationdouble{

   public static void main(String args[]) {
      // �մ� 7�� �������� �� �� ������ ���α׷��� �����ϰ� �ϱ� ���� �ʱⰪ �ο�
      int[] arrivals = { 0, 15, 20, 20, 30, 40, 45 };// �����ð�
      int[] service = { 20, 5, 10, 10, 15, 20, 5 }; // �䱸�Ǵ� ���� �ð�
      int[] priority = { 3, 1, 2, 2, 1, 0, 1 }; // �켱����
      Customer4 newCustomer;

      int t;
      int numOfMinutes = 120;
//      Queue<Customer> simulQ = new LinkedList<Customer>();
      PriorityQueue<Customer4> simulPq = new PriorityQueue<Customer4>();

      int freeTime = 0;
      int waiting[] = new int[7];

      int queuedI = -1; // ���� ť�� ������ ��
      int serviceTime = 0;
      for (t = 0; t <= numOfMinutes; t = t + 5) { // numOfMinutes �� ������ �ùķ��̼�
         System.out.println(" t = " + t);
         // ���� �մ��� �� �� ����ϰ� �ִ°�? size�� ����غ� �� ������?
//         System.out.println("��� �մ� �� : "+simulQ.size());

         for (int j = queuedI + 1; j < arrivals.length; j++) {
            if (arrivals[j] <= t) { // enqueue
               queuedI = j;
               Customer4 c1 = new Customer4(j, arrivals[j], service[j], priority[j]);
               simulPq.offer(c1);
               System.out.println(j + " ��° �մ� ���� (Enqueued time : " + t + ")" + " ��� �մ� �� : " + simulPq.size());
               // simulQ.add(c1);
//               System.out.println("��� �մ� �� : "+simulPq.size());
            }
         }
         // deque
         if (serviceTime <= 0) { // ������ ���� ����
            if (!simulPq.isEmpty()) { // �մ��� ����ϰ� �ִٸ�
               newCustomer = simulPq.remove();
               serviceTime = newCustomer.service;
//               System.out.println("==========");
               System.out.println(newCustomer.id + " ��° �մ� ���� ���� (Dequeued time : " + t + ")" + " ��� �մ� �� : "
                     + simulPq.size());

               System.out.println("���ο� �մ� ��ٸ� �ð� : " + (t - newCustomer.arrivals));
               waiting[newCustomer.id] = (t - newCustomer.arrivals);
//               System.out.println("��� �մ� �� : "+simulPq.size());
//               if(t == newCustomer.service + newCustomer.arrivals) {
//                  System.out.println(newCustomer.id + " ��° �մ� ���� �� (Enqueued time : " + t + ")");
//               }

            } else {
               System.out.println("��� �մ� ���� �Ϸ�");
               System.out.println("���� �޽Ľð� : " + freeTime);
               System.out.println();
               if (t != numOfMinutes) {
                  freeTime += 5;
               }
            }
         }
//         else {
//            // ���������� 5�� ���� ��
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

      System.out.println("���� ���� ��ٸ� �� �ð� : " + maxwaiting);
      System.out.println("��� ��ٸ� �ð� : " + avrwaiting);
      System.out.println("������ �������� �ʰ� ��ٸ� �ð� : " + (freeTime));

   }
}
//		//
//		//
//		//
//		//
//		//
//		// �Ϲ�ť-------------------------------------------------------------
//
//		// �������� ���� ó��ó�� �����. �������� ����� �켱����ť���� Ȱ���� �Ͱ� ����.
//		for (i = 0; i < clerkSize; i++) {
//			clerks[i] = 0;
//			freeTime[i] = 0;
//		}
//		for (i = 0; i < waiting.length; i++)
//			waiting[i] = 0;
//		queuedI = -1;
//		sumwaiting = 0;
//
//		// �Ϲ�ť ��ü ����
//		Queue<Customer4> simulQ1 = new LinkedList<Customer4>();
//		Customer4[] customerArr = new Customer4[7];
//		Customer4 customerTmp;
//		int size;
//
//		// �Ϲ�ť���� ���° ���� �մ����� id�� �����ϱ� ���� ����.
//		// int id[] = { 0, 1, 2, 3, 4, 5, 6 };
//		// �迭 ��ο��� �켱������ ���� �������� ���ʿ� ��ġ�� �����Ѵ�.
//		// �����ð��� ������ �մ� ������ ��� �ٲ��. �̰��� ���� �켱����ť�� ����ϰ� ����� �����̴�.
//		// ���� �ð� ���� ���� ��쿡�� ������ ����� ����, �Ϲ�ť�� �켱����ť�� service�ð� ���� �ٸ��� ������ ��µ� �ٸ� �� �ִ�.
//		// �迭�� �����ϴ� ����� �پ��ϴ�. ���� for���� �׽�Ʈ�� ���ô�.
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
//		for (t = 0; t <= numOfMinutes; t = t + 5) { // numOfMinutes �� ������ �ùķ��̼�
//			System.out.println(" t = " + t);
//
//			// ���� �մ��� �� �� ����ϰ� �ִ°�? size�� ����غ� �� ������? �մ��� ť�� �����Ų��.
//			for (int j = queuedI + 1; j < arrivals.length; j++) {
//				if (arrivals[j] <= t) { // enqueue
//					queuedI = j;
//					Customer4 c1 = new Customer4(j, arrivals[j], service[j], priority[j]);
//
//					System.out.println(j + " ��° �մ� ���� (Enqueued time : " + t + ")");
//					simulQ1.add(c1); // ť�� �մ��߰�
//
//					start[c1.id] = t; // j��° �մ��� ť����ð��� t
//				}
//			}
//
//			// ���� �Ϲ�ť�� �迭�� �̿��ؼ� ���� �ð����� ���� ������ �����ϴ� �����̴�.
//			// �迭�� ť�� ���Ҹ� ��� �ִ´�.
//			size = simulQ1.size();
//			for (i = 0; i < size; i++) {
//				customerArr[i] = simulQ1.remove();
//			}
//			// ���� �ð� �� ũ��� �����Ѵ�.
//			for (int k = 0; k < size; k++) {
//				for (int l = 0; l < size; l++) {
//					if (customerArr[k].service < customerArr[l].service) {
//						customerTmp = customerArr[k];
//						customerArr[k] = customerArr[l];
//						customerArr[l] = customerTmp;
//					}
//				}
//			}
//			// �迭���� ť�� ���Ҹ� ��� �ִ´�.
//			for (int k = 0; k < size; k++) {
//				simulQ1.offer(customerArr[k]);
//			}
//
//			// -----------------------------------
//			//
//			// ���⼭ ���ʹ� ���� �ڵ�� ����.
//			//
//			// -----------------------------------
//
//			if (clerks[0] < 0) {
//				freeTime[0] += 5;
//			}
//			if (clerks[1] < 0) {
//				freeTime[1] += 5;
//			}
//			// �Ѵ� ���������� ���� �� ����� ���ϵ���
//			if (clerks[0] <= 0 && clerks[1] <= 0) {
//				if (freeTime[0] > freeTime[1]) {
//					if (!simulQ1.isEmpty()) {
//						newCustomer = simulQ1.remove();
//						clerks[0] = newCustomer.service;
//						System.out.println("���� 0 " + newCustomer.id + " ��° �մ� ���� ���� (Dequeued time : " + t + ")"
//								+ "������� ��:" + simulQ1.size());
//						System.out.println("���ο� �մ� ��ٸ� �ð� : " + (t - newCustomer.arrivals));
//						waiting[newCustomer.id] = (t - newCustomer.arrivals);
//					}
//				} else {
//					if (!simulQ1.isEmpty()) {
//						newCustomer = simulQ1.remove();
//						clerks[1] = newCustomer.service;
//						System.out.println("���� 1 " + newCustomer.id + " ��° �մ� ���� ���� (Dequeued time : " + t + ")"
//								+ "������� ��:" + simulQ1.size());
//						System.out.println("���ο� �մ� ��ٸ� �ð� : " + (t - newCustomer.arrivals));
//						waiting[newCustomer.id] = (t - newCustomer.arrivals);
//					}
//				}
//			}
//
//			if (clerks[0] <= 0) {
//				if (!simulQ1.isEmpty()) {
//					newCustomer = simulQ1.remove();
//					clerks[0] = newCustomer.service;
//					System.out.println("���� 0 " + newCustomer.id + " ��° �մ� ���� ���� (Dequeued time : " + t + ")"
//							+ "������� ��:" + simulQ1.size());
//					System.out.println("���ο� �մ� ��ٸ� �ð� : " + (t - newCustomer.arrivals));
//					waiting[newCustomer.id] = (t - newCustomer.arrivals);
//				}
//			}
//			if (clerks[1] <= 0) {
//				if (!simulQ1.isEmpty()) {
//					newCustomer = simulQ1.remove();
//					clerks[1] = newCustomer.service;
//					System.out.println("���� 1 " + newCustomer.id + " ��° �մ� ���� ���� (Dequeued time : " + t + ")"
//							+ "������� ��:" + simulQ1.size());
//					System.out.println("���ο� �մ� ��ٸ� �ð� : " + (t - newCustomer.arrivals));
//					waiting[newCustomer.id] = (t - newCustomer.arrivals);
//				}
//			}
//
//			if (clerks[0] >= 0) {
//				clerks[0] = clerks[0] - 5;
//			}
//			if (clerks[1] >= 0) {
//				clerks[1] = clerks[1] - 5;
//			}
//			System.out.println("���� 0 �޽Ľð� : " + freeTime[0] + " ���� 1 �޽Ľð� : " + freeTime[1]);
//			System.out.println();
//
//		}
//
//		for (i = 0; i < 7; i++) {
//			if (maxwaiting < waiting[i]) {
//				maxwaiting = waiting[i];
//			}
//			sumwaiting += waiting[i];
//
//		}
//		avrwaiting = sumwaiting / 7;
//
//		System.out.println("���� ���� ��ٸ� �� �ð� : " + maxwaiting);
//		System.out.println("��� ��ٸ� �ð� : " + avrwaiting);
//		System.out.println("������ �������� �ʰ� ��ٸ� �ð� : " + "���� 0 �޽Ľð� : " + freeTime[0] + " ���� 1 �޽Ľð� : " + freeTime[1]);
//		System.out.println();
//	}
//}

