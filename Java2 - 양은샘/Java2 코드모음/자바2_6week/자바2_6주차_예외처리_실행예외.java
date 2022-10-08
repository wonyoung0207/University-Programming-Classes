package �ڹ�2_6week;
//args�� �� �־��ִ� ���
// 1.����â - 2.���౸��(Run Configuration) - 3.args �μ� -> ����� �迭 ���� �� ���� 
//catch�� ������ �߿��ϴ�. ���� Ŭ����(Exception)�� ���� ���߿� ��ƾ� �Ѵ�. 
//������ ���� �������� �ֱ� ������ 

public class �ڹ�2_6����_����ó��_���࿹�� {

	public static void main(String[] args) {

//		System.out.println(args[0]);//args�� �ƹ��͵� ���ٰ�� ArrayIndexOutOfBoundsException �߻� 

		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
			
		}catch(ArrayIndexOutOfBoundsException e) {//�迭�� �ε����� �����Ұ�� �߻� 
			System.out.println("���� �Ű����� ���� �����մϴ�. ");
		}
//		catch(NumberFormatException e) {//���޹��� �迭�� ���°� ���ڰ� �ƴҰ�� �߻� 
//			
//		}
		catch(Exception e) {//NumberFormatException ���� �߻��� ���� 
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�. ");//args[1]�� ���� aaa�̱� ������ ����
			System.out.println("���� �ֻ��� Ŭ���� ���ܴ� ���߿� ó���մϴ�. ");
		}finally {//������ ����Ǵ� ���๮ 
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}
