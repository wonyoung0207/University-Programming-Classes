package �ڹ�1������Ʈ;
// �迭�� �ε����� Ȯ���ϴ� Ŭ����
// �ε����� �Ѿ������ �߸��� �ε����� ��ġ�� �˷��ִ� get() �޼ҵ� ����
// �ε����� �Ѵ� �ڸ��� -1�� ä����


public class �ڹ�1_13����_SafeArray {
	private int[] a;//�ش� Ŭ���������� ��� ����
	public int length;
	
	public �ڹ�1_13����_SafeArray(int size) {//������
		//int[] score = new int[100];// �迭���� ���� 
		a = new int[size];//a = size��ŭ�� �迭�� ����
		length = size;
		
//		for(int i=0; i < a.length; i++) {
//			System.out.println("a�迭�� "+i + "��° ��: " + a[i]);
//		}
	}
	
	public void put(int index, int value) {//���� �־��ִ� �޼ҵ� 
		if (index >= length) {//���̺��� �� �ε����� ���´ٸ� ����Ʈ
			System.out.println("�߸��� �ε��� " + index);
		}
		else{//���̺��� ���� �ε������ �迭 a���ٰ� ���� �־��ش�. 
			a[index] = value;
		}
		
	}
	

	public int get(int index) {//���� ������ֱ� ���� �޼ҵ� 
		if (index >= length){//�迭�� ���̺��� �� ��� -1�� ����
			return -1;
		}
		else {//�迭�� ���̺��� ���� �ʴٸ� �迭a�� index��ġ ���� ����
			return a[index];
		}
		
	}

}
