package �ڹ�1������Ʈ;
//�м����� ����

public class �ڹ�1_11����_�м�������� {

	public static void main(String[] args) {
		�ڹ�1_11����_�м����� bun1 = new �ڹ�1_11����_�м�����();
		�ڹ�1_11����_�м����� bun2= new �ڹ�1_11����_�м�����();
		�ڹ�1_11����_�м����� bun3 = new �ڹ�1_11����_�м�����();
		�ڹ�1_11����_�м����� bun4 = new �ڹ�1_11����_�м�����();
		�ڹ�1_11����_�м����� bun5 = new �ڹ�1_11����_�м�����();
		�ڹ�1_11����_�м����� bun6 = new �ڹ�1_11����_�м�����();
		�ڹ�1_11����_�м����� bun7 = new �ڹ�1_11����_�м�����();
		
		bun1.bunja = 1;
		bun1.bunmo = 2;
		
		bun2.bunja = 2;
		bun2.bunmo = 3;
		
		bun3 = bun1.add(bun2);
		System.out.println("���� = "+bun3.bunja + " �и� = " + bun3.bunmo);

		bun3.bunja = 4;
		bun3.bunmo = 8;
		bun3 = bun3.reduce();
		
		System.out.println("���� = "+bun3.bunja + " �и� = " + bun3.bunmo);
		
		
		bun4.bunja = 6;
		bun4.bunmo = 8;
		bun5 = bun4.simplify(bun4);//reduce�� �ٸ���� ,�ִ����� ���ؼ� �ٷ� ������ -> ����� ��ü�� ������
		System.out.println("���� = "+bun5.bunja + " �и� = " + bun5.bunmo);
		
		//�ΰ��� �м��� ������ �Ǻ�
		bun6.bunja = 6;
		bun6.bunmo = 8;
		bun7.bunja = 3;
		bun7.bunmo = 4;
		String equal = "";

		if(bun6.equals(bun7) == true) {
			equal = "����";
		}
		else {
			equal = "�ٸ���";
		}
		System.out.println("�� �м��� '" + equal + "' �Դϴ�. ");
		
		System.out.println(bun1.test());
		
	}

}
