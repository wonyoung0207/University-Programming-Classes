package �ڹ�1������Ʈ;
//continue�� �̿��� ���� n�� ���� ���ϱ�

public class �ڹ�1_5����_continue {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
		int no_n = 0;
		
		
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) != 'n') {//charAt(0) = n , charAt(1) = o...
				no_n++;
				continue;//�ٷ� �����κ����� ����. -> i++�� ����ǰ� �ٽ� ���������� ����
			}
			n++;
		}
		System.out.println("�� ���� ������ : " + s.length());
		System.out.println("���忡 �ִ� n �� ������ : "+ n);
		System.out.println("n�� �ƴ� ������ ������ : "+ no_n);

	}

}
