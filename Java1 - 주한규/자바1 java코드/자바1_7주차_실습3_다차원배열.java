package �ڹ�1������Ʈ;
//2���� �迭 ����غ���


public class �ڹ�1_7����_�ǽ�3_�������迭 {

	public static void main(String[] args) {
		int [][] s = {
				{10,20,30,40},
				{50,60,70,80},
				{80,100,110,120}
		};
		System.out.println("�� ����: �� " + s.length + "��");
		System.out.println("1���� �� ����: " + s[1].length);
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j <s[i].length; j++) {
				System.out.println(i + "��" + j + "�� : " + s[i][j]);
			}
		}
		
	}

}
