package �ڹ�1������Ʈ;
//���Ҽ� �����ϰ� ���ִ� Ŭ����


public class �ڹ�1_13����_���Ҽ� {
	private double real; //�Ǽ�
	private double imagine;//���
	
	public �ڹ�1_13����_���Ҽ�() {//������1
		setReal(0.0);
		setImaginary(0.0);
	}
	
	public �ڹ�1_13����_���Ҽ�(double r) {//������2
		setReal(r);
		setImaginary(0.0);
	}
	
	public �ڹ�1_13����_���Ҽ�(double r, double i) {//������3
		setReal(r);
		setImaginary(i);
	}
	
	public String toString () {
		return getReal() + " + " + getImaginary() + "i";
	}

	public void setReal(double r) {
		real = r;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setImaginary(double i) {
		imagine = i;
	}
	
	public double getImaginary() {
		return imagine;
	}
	
	public �ڹ�1_13����_���Ҽ� add(�ڹ�1_13����_���Ҽ� o) {//���� ���ִ� �Լ�
		�ڹ�1_13����_���Ҽ� a = new �ڹ�1_13����_���Ҽ�(0,0);
		
		a.real = real + o.real;//�Ǽ����
		a.imagine = imagine + o.imagine;//������
		return a;
		
	}
	
	public �ڹ�1_13����_���Ҽ� mul(�ڹ�1_13����_���Ҽ� o) {//���Ҽ� ���� ���ִ� �Լ�
		�ڹ�1_13����_���Ҽ� a = new �ڹ�1_13����_���Ҽ�(0,0);
		
		a.real = (real * o.real) - (imagine * o.imagine);//�Ǽ����
		a.imagine = (real * o.imagine) + (imagine * o.real);//������
		return a;
		
	}
	
	public boolean equals(�ڹ�1_13����_���Ҽ� o) {//�ΰ��� ���Ҽ��� ���ٸ� true����
		if (real == o.real && imagine == o.imagine) {
			return true;
		}else {
			return false;
		}

	}

}
