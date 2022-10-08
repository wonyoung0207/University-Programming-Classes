package 자바2_13week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p13_Test {

	public static void main(String[] args) {
		List<p13_Student> list = new ArrayList<p13_Student>();//넣을 객체의 형태를 가진 list 생성 
		
		for(int i = 0; i<5;i++) {
			p13_Student s = new p13_Student("name"+i,"phone"+i);
//			list.add(new p13_Student("name"+i,"phone"+i));
			list.add(s);
		}
		
		for(p13_Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("이름을 입력하시면 전화번호를 드립니다 : ");
		Scanner input = new Scanner(System.in);
		String sname = input.nextLine();
		
		for(p13_Student s : list) {//전화번호를 찾아서 삭제 
			if(s.getName().equals(sname)) {
				System.out.println(sname + "의 전화번호 = " + s.getPhone());	
			}			
		}
		
		System.out.println("이름을 입력하시면 정보를 삭제합니다. : ");
		String rname = input.nextLine();
		
		
		for(int i=0; i<list.size(); i++) {//name과 같은 객체를 list에서 찾아서 삭제 
			p13_Student rs = list.get(i);
			if(rs.getName().equals(rname)) {
				list.remove(i);//리스트의 i 번째 인덱스를 삭제 
			}
		}

		for(p13_Student s : list) {
			System.out.println(s);
		}
		
		
	}

}
