package �ڹ�2_13week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p11_ArrayList_Arrays�̿� {

	public static void main(String[] args) {
//		List<String> list1 = new ArrayList<String>();
//		list1.add("���");
//		list1.add("��");
//		list1.add("�ٳ���");
//		
//		for(String obj : list1) {
//			System.out.println("list1 : " + obj);
//		}
		
		String[] s = {"���","��","�ٳ���"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		
		for(int i=0; i<list.size();i++) {
			String str = (String) list.get(i);
			System.out.println("list : " + str);
		}
		
		list.add("����");
		System.out.println(list);//��ü�� �θ��� ���̱� ������ toString ȣ�� 
		
		list.add(2,"�ڸ�");
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains("���"));
		
		System.out.println(list.indexOf("���"));
		

	}

}
