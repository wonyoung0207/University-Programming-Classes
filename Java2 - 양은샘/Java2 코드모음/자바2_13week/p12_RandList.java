package 자바2_13week;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class p12_RandList<T>{//제네릭 사용
	List<T> list = new LinkedList<T>();

	public void add(T data){
		list.add(data);
	}
	
	public <T>List getlist(){
		return list;
	}
	
	public <String>T select(){
		Random r = new Random();
		int index = r.nextInt(list.size());//next 사용하면서 리스트의 형식이 object형식으로 바뀜 
		//return (T) list.get(index); //리스트가 T 형식이기 때문에 형변환 해줘야함 
		return list.get(index); //리스트가 T 형식이기 때문에 형변환 해줘야함 
	}



}
