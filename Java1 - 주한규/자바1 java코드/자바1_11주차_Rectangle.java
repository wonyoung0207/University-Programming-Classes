package �ڹ�1������Ʈ;

public class �ڹ�1_11����_Rectangle {
	double width=0;
	double height=0;
	
	public String toString() {//��ü�� �ҷ��ָ� �ڵ����� �޼ҵ尡 ����ȴ�. 
		
		return "����: " + area(width, height) + "  �ѷ�: " + 
				perimeter(width, height);

	}
	static double area(double width, double height) {//�簢���� ���� ��ȯ
		return width*height;
	}
	static double perimeter(double width, double height) {//�簢���� �ѷ����� ��ȯ
		return (2*width)+(2*height);
	}
	void modify(double w, double h) {//�Ű������� ���̿� ���� ����
		width = w;
		height = h;
	}
	void modifyRatio(double r) {//�Ű����� ������ŭ ���̿� ���� ����
		width = width*r;
		height = height*r;
	}

}
