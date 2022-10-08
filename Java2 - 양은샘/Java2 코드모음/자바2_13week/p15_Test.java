package �ڹ�2_13week;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class p15_Test {
//HashMap �� HashSet ��
// HashMap�� ���� ���� ������ ���߰����� ��ü�ǰ�, HashSet�� �������� �����ȴ�. 
	public static void main(String[] args) {
		Map<Integer, p13_Student> map = new HashMap<Integer,p13_Student>();
		
		for(int i = 0; i<5;i++) {//map �÷��ǿ� key�� ���������� �ְ�, value�� student ��ü�� ��
			p13_Student s = new p13_Student("name"+i,"phone"+i);
			
			map.put(i, s);
		}
		
		Set<Integer> keyset = map.keySet();//key ���� ��� �������� ���ؼ� keySet �޼ҵ� �̿��ؼ� Set�÷��ǿ� ����
		Iterator<Integer> iterator = keyset.iterator();//�ݺ��� iterator �� ���ؼ� ���� ��´�. 
		
		while(iterator.hasNext()) {//�������Ұ� �����ϸ� ����			
			int key = iterator.next();
			p13_Student s = map.get(key);
			System.out.println("Key = " + key + ", value = " + s);
		}
	}
}
