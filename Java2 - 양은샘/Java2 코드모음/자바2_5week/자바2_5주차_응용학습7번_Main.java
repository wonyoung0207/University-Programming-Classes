package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�7��_Main {
	public static void main(String[] args) {
		�ڹ�2_5����_�����н�7��_IDrawable[] id = new �ڹ�2_5����_�����н�7��_IDrawable[4];
		//�迭�� IDrawable ���°� ���ü� �ִ� �����迭 4�ڸ��� ����
		
		// ������ ��ü�� ���� -> IDrawable ���·� �����س����� ,
		//Shape,Rectangle,Triangle,Circle ��� �� ���� ���� 
		id[0] = new �ڹ�2_5����_�����н�7��_Shape();
		id[1] = new �ڹ�2_5����_�����н�7��_Rectangle();
		id[2] = new �ڹ�2_5����_�����н�7��_Triangle();
		id[3] = new �ڹ�2_5����_�����н�7��_Circle();
		
		for(�ڹ�2_5����_�����н�7��_IDrawable obj : id) {
			obj.draw();
		}

	}

}
