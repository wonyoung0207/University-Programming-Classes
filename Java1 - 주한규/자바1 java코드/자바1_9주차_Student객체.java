package �ڹ�1������Ʈ;
// ��ü�� �ּҸ� ����Ű�� ������ �����̴�.

public class �ڹ�1_9����_Student��ü {

	public static void main(String[] args) {//�޼ҵ��� ��������, �޼ҵ�� ��ȯ��(void)�� �� �־�� �Ѵ�. public�� static �� �����
		�ڹ�1_9����_StudentŬ���� s1,s2,s3,s4;
		
		s1 = new �ڹ�1_9����_StudentŬ����();//s1�� ��ü���� student Ŭ������ �ʵ���� ������ �ִ� �޸� ������ �Ҵ�Ǿ� �ִ�.
		// s1�� �޸� �ּҰ��� ������ �ִ�. = �������̴�
		s1.id = 111;
		s1.name = "ù°";
		s1.midscore = 1;
		s1.finalscore = 1;
		
		System.out.println("ù��° �л��� ���� : " + "id:" + s1.id + "  �̸�:" + s1.name +
				"  �߰�����:" + s1.midscore + "  �⸻����:"+s1.finalscore);		

		s3 = new �ڹ�1_9����_StudentŬ����();
		s3.id = 222;
		s3.name = "��°";
		s3.midscore = 2;
		s3.finalscore = 2;
		
		System.out.println("�ι�° �л��� ���� : " + "id:" + s3.id + "  �̸�:" + s3.name +
				"  �߰�����:" + s3.midscore + "  �⸻����:"+s3.finalscore);
		
		s3 = s1;
		s3.midscore = 123;//s1�� ���� ����ȴ�.
		
		System.out.println("����� ù��° �л��� ���� : " + "id:" + s1.id + "  �̸�:" + s1.name +
				"  �߰�����:" + s1.midscore + "  �⸻����:"+s1.finalscore);
		System.out.println("����� �ι�° �л��� ���� : " + "id:" + s3.id + "  �̸�:" + s3.name +
				"  �߰�����:" + s3.midscore + "  �⸻����:"+s3.finalscore);


	}

}
