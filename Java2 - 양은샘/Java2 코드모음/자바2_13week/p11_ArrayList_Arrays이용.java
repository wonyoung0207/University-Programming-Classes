package 자바2_13week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p11_ArrayList_Arrays이용 {

	public static void main(String[] args) {
//		List<String> list1 = new ArrayList<String>();
//		list1.add("사과");
//		list1.add("배");
//		list1.add("바나나");
//		
//		for(String obj : list1) {
//			System.out.println("list1 : " + obj);
//		}
		
		String[] s = {"사과","배","바나나"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		
		for(int i=0; i<list.size();i++) {
			String str = (String) list.get(i);
			System.out.println("list : " + str);
		}
		
		list.add("포도");
		System.out.println(list);//객체를 부르는 것이기 때문에 toString 호출 
		
		list.add(2,"자몽");
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains("사과"));
		
		System.out.println(list.indexOf("사과"));
		

	}

}
