package �ڹ�1������Ʈ;

//main�� �Ű����� �̿� :  run -> ���౸�� -> ���α׷��μ�
//main ���� �����Ǵ� string���� �迭 args�� ���� ���� ����. 
//String args[] => Ŀ��� �Է½� �迭�� �Ѱܹޱ� ���ؼ� ����
public class �ڹ�1_7����_�ǽ�2 {

	public static void main(String[] args) {
		int sum = 0;

		if ( args.length > 0) {
			for(int i =0; i <args.length; i++) {
				System.out.println(" " + args[i]);
			}
			for(int i =0; i <args.length; i++) {//string ���̱� ������ int������ �ٲ���� �Ѵ�. 
				sum = sum + Integer.parseInt(args[i]);
				
			}
			
			if(args[0].equals("-h"))
				System.out.println("Help ");
		}

	}

}
