package �ڹ�2_13week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p13_Test {

	public static void main(String[] args) {
		List<p13_Student> list = new ArrayList<p13_Student>();//���� ��ü�� ���¸� ���� list ���� 
		
		for(int i = 0; i<5;i++) {
			p13_Student s = new p13_Student("name"+i,"phone"+i);
//			list.add(new p13_Student("name"+i,"phone"+i));
			list.add(s);
		}
		
		for(p13_Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("�̸��� �Է��Ͻø� ��ȭ��ȣ�� �帳�ϴ� : ");
		Scanner input = new Scanner(System.in);
		String sname = input.nextLine();
		
		for(p13_Student s : list) {//��ȭ��ȣ�� ã�Ƽ� ���� 
			if(s.getName().equals(sname)) {
				System.out.println(sname + "�� ��ȭ��ȣ = " + s.getPhone());	
			}			
		}
		
		System.out.println("�̸��� �Է��Ͻø� ������ �����մϴ�. : ");
		String rname = input.nextLine();
		
		
		for(int i=0; i<list.size(); i++) {//name�� ���� ��ü�� list���� ã�Ƽ� ���� 
			p13_Student rs = list.get(i);
			if(rs.getName().equals(rname)) {
				list.remove(i);//����Ʈ�� i ��° �ε����� ���� 
			}
		}

		for(p13_Student s : list) {
			System.out.println(s);
		}
		
		
	}

}
