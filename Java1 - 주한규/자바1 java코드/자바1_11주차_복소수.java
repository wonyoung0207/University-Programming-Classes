package �ڹ�1������Ʈ;
// ���Ҽ� = �Ǽ�ǥ������� �ϳ���, 3+4i ������� ��Ÿ����.
// 3 = �Ǽ�, 4i = ���


public class �ڹ�1_11����_���Ҽ� {
	double real; //�Ǽ�
	double imagine;//���

	public �ڹ�1_11����_���Ҽ� add(�ڹ�1_11����_���Ҽ� c) {//���� ���ִ� �Լ�
		�ڹ�1_11����_���Ҽ� r = new �ڹ�1_11����_���Ҽ�();
		r.real = real + c.real;//�Ǽ����
		r.imagine = imagine + c.imagine;//������
		return r;
		
	}
	public �ڹ�1_11����_���Ҽ� sub(�ڹ�1_11����_���Ҽ� c) {//���� ���ִ� �Լ�
		�ڹ�1_11����_���Ҽ� r = new �ڹ�1_11����_���Ҽ�();
		r.real = real - c.real;
		r.imagine = imagine - c.imagine;
		return r;
	}

}
