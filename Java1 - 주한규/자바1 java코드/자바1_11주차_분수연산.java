package �ڹ�1������Ʈ;
//�м� ���� �ϱ�


public class �ڹ�1_11����_�м����� {
	int bunja;//����
	int bunmo;//�и�
	

	public �ڹ�1_11����_�м����� add(�ڹ�1_11����_�м����� f) {//�м� �������ִ� �޼ҵ�
		�ڹ�1_11����_�м����� r = new �ڹ�1_11����_�м�����();
		r.bunja = (bunja * f.bunmo) + (bunmo*f.bunja);
		r.bunmo = bunmo * f.bunmo;
		
		return r;
	}
	
	public �ڹ�1_11����_�м����� reduce() {//�м� ����� �Ϸ����, ������ִ� ��
		int div = gcd(bunja,bunmo);
		�ڹ�1_11����_�м����� r = new �ڹ�1_11����_�м�����();
		r.bunja = bunja/div;
		r.bunmo = bunmo/div;
		
		return r;
	}
	
	�ڹ�1_11����_�м����� simplify(�ڹ�1_11����_�м����� f) {//reduce�� �ٸ���� 
		�ڹ�1_11����_�м����� result = new �ڹ�1_11����_�м�����();
		
		int g = gcd(f.bunja,f.bunmo);
		result.bunja = f.bunja/g;
		result.bunmo = f.bunmo/g;
		
		return result;
	}
	
	
	public int gcd(int x, int y) {//����ϱ� ���� �� ���� �ִ����� ���ϴ� �޼ҵ�
		int bigger=0, smaller=0,r=0;
		System.out.println(x+"  " +y);
		if (x >= y) {
			bigger = x;
			smaller =y;
		}
		else {
			bigger = y;
			smaller = x;
		}
		
		while(smaller != 0) {//�ִ����� ���ϴ� ���
			r = bigger % smaller;
			bigger = smaller;
			smaller = r;
			
		}
		//�ּҰ���� = (x*y) / �ִ�����;
		
		return bigger;//�ִ������� ����
	}
	
	public boolean equals(�ڹ�1_11����_�м����� f_b) {
		
//		�ڹ�1_11����_�м����� f_a = new �ڹ�1_11����_�м�����();//���� ��ü ����� 0���� �ʱ�ȭ�Ǽ� �ϸ� �ȵ�
		int g_a = gcd(bunja, bunmo);//���� ��ü�� ���ڿ� �и� �Ѱ���
		int g_b = gcd(f_b.bunja, f_b.bunmo);//���� ��ü�� ���ڿ� �и� �Ѱ���
		System.out.println(bunja + "  " + bunmo + "�ִ�����"+g_a);
		System.out.println(f_b.bunja +"  " + f_b.bunmo + "�ִ�����"+g_b);
		
		bunja = bunja / g_a;//���
		bunmo = bunmo / g_a;
		f_b.bunja = f_b.bunja / g_b;//���
		f_b.bunmo = f_b.bunmo / g_b;
		
		if(bunja == f_b.bunja) {
			if(bunmo == f_b.bunmo) {
				return true;//������� true ���� 
			}
		}
		return false;// �ٸ���� false ����
		
	}
	
	int test() {
		return 1;
	}
	
	

}
