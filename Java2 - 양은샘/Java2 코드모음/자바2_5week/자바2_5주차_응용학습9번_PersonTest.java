package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�9��_PersonTest {
	
	public static �ڹ�2_5����_�����н�9��_Person getMaximum(�ڹ�2_5����_�����н�9��_Person[] arr) {
		�ڹ�2_5����_�����н�9��_Person max = arr[0];
		//�񱳸� ���� max��� persom��ü�� �ϳ� ����� 0��° �迭�� �־��ش�.  
		//0��°�� �� ��������  compareTo �޼ҵ带 �̿��� ���ؼ� ū ��ü�� max���ٰ� �־��ش�. 
		for(int i=1;i<arr.length;i++) {
			if(max.compareTo(arr[i]) == -1) {
				max = arr[i];
			}
		}	
		return max;
	}

	public static void main(String[] args) {
		�ڹ�2_5����_�����н�9��_Person[] p = new �ڹ�2_5����_�����н�9��_Person[3];
		
		p[0] = new �ڹ�2_5����_�����н�9��_Person("Benny",180);
		p[1] = new �ڹ�2_5����_�����н�9��_Person("Daniel",178);
		p[2] = new �ڹ�2_5����_�����н�9��_Person("Joon",188);
		
		for(�ڹ�2_5����_�����н�9��_Person obj : p) {
			System.out.println(obj);//������ toString �޼ҵ尡 ȣ���
		}

		System.out.println("���� ū Ű : " + getMaximum(p));
		//getMaximum�� return ���� person ��ü���̶� 
		//toString �� �ڵ������� �ҷ�����. 

	}

}
