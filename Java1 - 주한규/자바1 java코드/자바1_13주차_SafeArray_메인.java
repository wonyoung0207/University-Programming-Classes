package �ڹ�1������Ʈ;

public class �ڹ�1_13����_SafeArray_���� {

	public static void main(String[] args) {
		�ڹ�1_13����_SafeArray array = new �ڹ�1_13����_SafeArray(3);//ũ�Ⱑ 3�� �迭 a ���� 
		
		//���⼭ ���� length�� safeArray Ŭ������ length�ʵ��̴�. 
		for(int i=0; i<(array.length+2); i++) {//�Ϻη� �������� �ϱ� ���� array.length+2 ����
			array.put(i,i*10);
		}
		
		for(int i=0; i < (array.length+2); i++) {//�ش� �ε��� ���� ������ش�. �ε��� �Ѿ�� -1�� ���
			System.out.print(array.get(i) + " ");
		}

	}

}
