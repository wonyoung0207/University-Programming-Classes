package �ڹ�1������Ʈ;
//�޼ҵ� �̿��ؼ� �迭�� �� ���ϱ�
//void�� return ���ص� �ǰ�, �������� ���شٸ� return �ؾ���

public class �ڹ�1_6����_�迭���̿��Ѹ޼ҵ� {
	
	public static int sum(int[] a) {//�迭�̱� ������ �� "int[] �Ű�����" �� �ۼ��ؾ��Ѵ�.int�� ���� ��������
		int total = 0;
		for(int i=0; i < a.length; i++) {
			total = total + a[i];
			System.out.println(i + "��° �� : " + total);
		}

//		for(int value : a) { //for-each������, �� for���� �Ȱ���. for(����Һ��� : �迭)
//			total = total + value;
//			System.out.println("");
//		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};//�迭�� ����
		System.out.println("�迭 ���� :"+num.length);
		System.out.println("���ڵ��� �� : " + sum(num));
	}
}
