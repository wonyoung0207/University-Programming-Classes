package �ڹ�1������Ʈ;

public class �ڹ�1_11����_stringŬ�����̿� {

	public static void main(String[] args) {
		
		String pro = "A barking dog";
		String pro_x1 = "A bark";
		String pro_x2 = "a bark";
		String pro_equal = "A barking dog";

		String s1,s2,s3,s4;
		char s6;
		int s5,s8,s9;
		boolean s7;
		
		System.out.println("���ڿ��� ���� = " + pro.length());//���ڿ� ���� ���, ���� ����
		
		s1 = pro.concat("never Bit");//���ڿ� �߰�
		s2 = pro.replace("B", "b");//B�� b�� �ٲ���
		s3 = pro.substring(2,5);//�κ� ���ڿ� ��� -> �ε���2���� 5������.->�ε��� 2,3,4 ���
		s4 = pro.toUpperCase();//�빮�ڷ� �ٲ��� -> toLowerCase()�� �ҹ��ڵ� ����
		s5 = pro.compareTo(pro_x1); //������ ������ ���ڿ��� ��, ���簴ü�� �� ������ ����, ũ�� ��� ��ȯ 
		//���޹����ͺ��� ���������� �������̱� ������ ���� ���� ���� 
		s9 = pro.compareTo(pro_x2);// ���� ��ü������ ���� "-" ���� ���ڿ��� �� ������ ��
		s8 = pro.compareTo(pro_equal);//�ѱ��ھ� ����, ������ ����ؼ� 0�� ���
		s6 = pro.charAt(0);//������ �ε����� �ִ� ���ڸ� ��ȯ -> ���⵵ ����
		s7 = pro.equals(pro_x1);//������ ������		
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		System.out.println("s4 = "+s4);
		System.out.println("s5 = "+s5);
		System.out.println("s9 = "+s9);
		System.out.println("s8 = "+s8);
		System.out.println("s6 = "+s6);
		System.out.println("s7 = "+s7);
		
		// comparTo�� �̿��� ���ڿ� ũ�� ���� �� -> ��ü������ ��� ����� ���� ������ ���簴ü(pro)�� ��������
		String p1 = "The student";
		System.out.println("pro �� p1 ��: " +pro.compareTo(p1));
		// - ���´ٸ� ���� ��ü�� �� �������� 
		if(pro.compareTo(p1) < 0) {//ũ�� ���� ��  -> �տ������� ���������� ��, pro �� �� ������ -1 ����
			System.out.println(pro + " is less then " + p1);
		}else if(pro.compareTo(p1) > 0) {
			System.out.println(pro + " is greater then " + p1);
		}else {
			System.out.println(pro + " is equal to " + p1);
		}
		
		//pro�� �Ųٷ� ���
		String pro_reverse = "";
		for(int i=pro.length()-1; i >= 0; i--) {
			pro_reverse += (pro.charAt(i));
		}

		System.out.println("pro�� �Ųٷ� ���: "+pro_reverse);
		
		//���� Ŭ���� = �����ڷ����� ��üó�� �ٷ������ Ŭ������ ����� ������� ���
		System.out.println("<<<<���� Ŭ���� ����>>>");
		int a = Integer.parseInt("123");
		System.out.println("���ڿ��� int������ �ٲ�: "+a);
		double b = Double.parseDouble("3.1456");
		System.out.println("���ڿ��� double������ �ٲ�:"+b);
		
		String a1 = "abcd";
		String b1 = "c";
		System.out.println(a1.compareTo(b1));
	
	}
}
