package �ڹ�2_10week;

public class p14_Wrapper�̿��ؼ����� {

	public static void main(String[] args) {
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[2]);
			int sum =0;
			
		
			switch(args[1]) {
			case "+":
				sum = value1 + value2;
				System.out.println(value1 + " + " + value2  + " = " + sum);
				break;
			case "-":
				sum = value1 - value2;
				System.out.println(value1 + " - " + value2  + " = " + sum);
				break;
			default:
				System.out.println("������ ������ �����մϴ�.");
			}
		}catch(NumberFormatException e) {
			System.out.println(args[1] + " == * �� Run Confi ���� ��� �Ұ��մϴ�. ");
			System.exit(0);
		}catch(Exception e) {
			System.out.println("�ٸ� ���� �߻� ");
			System.exit(0);
		}

		
	}

}
