package �ڹ�2_10week;
//���� ��µ� �ɸ��� �ð� 
public class p07_currentTimeMillis�̿� {

	public static void main(String[] args) {
		System.out.println("args[0] = " + args[0]);
		
		long start = System.currentTimeMillis();
		System.out.println("start = " + start);
		
		for(int i=0; i<Integer.parseInt(args[0]); i++) {
			System.out.print(".");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("\nend = "+end);
		
		System.out.println(args[0] + "�� ���� ����ϴ� �ð� = " + (end-start) + " milli sec");
	}

}
