package �ڹ�1������Ʈ;

// ������(�⺻��) < - > ������
//������ = int, dubble , float, char, long, short, byte, boolean => �� 8�� 
//�������� �ڱ� �ڽ��� ���� ������. 

//������ = �迭
//�������� �ڽ��� ���� �����°� �ƴ϶� �迭�� �ּҸ� ������ �ִ�.


import java.util.*;
//import java.util.Arrays;

public class �ڹ�1_7����_�ǽ�1 {
	public static void main (String[] args){//��� ���ϴ� �޼ҵ� -> �� �����ϰ� �̿��� �� �־
		
		int[] x = {1,2,3,4};//x�� �ٲ��ָ� y�� �ٲ�� -> �迭�� �ϳ���������ְ�, �� �迭�� ����Ű�°� x,y�̱⶧��
		int[]y = x;
		x[1] = 20;
		
		int[] test = {1,2,3,4};
		//�迭�� ����
		int[] z = Arrays.copyOf(test,test.length);//�� �迭 ����
		test[2] = test[2] + 10;//x�� �ȹٲ�
		
		
		System.out.println(y[1]);//x�� �ٲٸ� y�� �ٲ��. -> �迭�� �ּҰ� ���� ����
		System.out.println(z[2]);//test���� �ٲ�� z���� �ٲ��� �ʾҴ�.

		
	}

}
