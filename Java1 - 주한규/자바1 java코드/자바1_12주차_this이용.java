package �ڹ�1������Ʈ;
// this = ���� ��ü�� ��Ÿ����. 

public class �ڹ�1_12����_this�̿� {
	private int x,y;
	private int width,height;
	
	�ڹ�1_12����_this�̿�(){//������ = Ŭ���� �̸��� ���� �޼ҵ�
		this(0,0,1,1);//���� Ŭ������ �Ű������� 4���� ������ ȣ��
	}

	�ڹ�1_12����_this�̿�(int width, int height){//������ = Ŭ���� �̸��� ���� �޼ҵ�
		this(0,0,width,height);//this�� �̿��� ���� Ŭ������ �ٸ� ������ ȣ��
	}//���� Ŭ������ �Ű������� 4���� ������ ȣ��

	�ڹ�1_12����_this�̿�(int x, int y, int width, int height){//������ = Ŭ���� �̸��� ���� �޼ҵ�
		this.x = x;//���� x���� �Ű����� x�� �־��ش� 
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
}
