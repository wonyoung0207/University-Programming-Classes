package �ڹ�2_9week;
//args �Ű����� �̿��� : ���� -> ���౸�� -> �μ� �Է�
//args�� ������ �������� �ϳ��� ���ڿ��� �迭�� ����� -> String �迭�� ����ϱ� ������ 
//��ü ���ڿ��� �ϳ��� ��� �迭�� �����ϰ� ������ "" �� ������ �� 

public class API�ǽ�1_main���� {
	//public : ������ 
	//static : ��ü���� ���̵� ����� �� �ִ� �޼ҵ� �̴�. 
	//void : ���ϰ��� ����
	//main : �޼ҵ� �̸�
	//String[] args : �����Լ��� �Ű�����
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i + ", " + args[i]);
	
		}
		//���ϱ� �ϰ���� ��� 
		//System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		
		//args�� ���� 2���� ������ �Է¹޾Ƽ� ����� ��� 
		int a = Integer.parseInt(args[0]);//����1
		int b = Integer.parseInt(args[2]);//����2
		if(args[1].equals("+")) {//������ �Է� 
			System.out.println(args[0] + args[1] + args[2] + " = " + (a+b));
		}else if(args[1].equals("-")) {
			System.out.println(args[0] + args[1] + args[2] + " = " + (a-b));
		}else {
			System.out.println("�����ڸ� +��- �� �Է��ϼ��� ");
		}
			
	}

}
