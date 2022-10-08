package 자바2_13week;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class p15_Test {
//HashMap 과 HashSet 비교
// HashMap은 동일 값이 들어오면 나중값으로 대체되고, HashSet은 기존값이 유지된다. 
	public static void main(String[] args) {
		Map<Integer, p13_Student> map = new HashMap<Integer,p13_Student>();
		
		for(int i = 0; i<5;i++) {//map 컬렉션에 key로 생성순서를 주고, value로 student 객체를 줌
			p13_Student s = new p13_Student("name"+i,"phone"+i);
			
			map.put(i, s);
		}
		
		Set<Integer> keyset = map.keySet();//key 값을 모두 가져오기 위해서 keySet 메소드 이용해서 Set컬렉션에 저장
		Iterator<Integer> iterator = keyset.iterator();//반복자 iterator 를 통해서 값을 얻는다. 
		
		while(iterator.hasNext()) {//다음원소가 존재하면 실행			
			int key = iterator.next();
			p13_Student s = map.get(key);
			System.out.println("Key = " + key + ", value = " + s);
		}
	}
}
