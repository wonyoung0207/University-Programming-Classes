package �ڹ�2_13week;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class p12_RandList<T>{//���׸� ���
	List<T> list = new LinkedList<T>();

	public void add(T data){
		list.add(data);
	}
	
	public <T>List getlist(){
		return list;
	}
	
	public <String>T select(){
		Random r = new Random();
		int index = r.nextInt(list.size());//next ����ϸ鼭 ����Ʈ�� ������ object�������� �ٲ� 
		//return (T) list.get(index); //����Ʈ�� T �����̱� ������ ����ȯ ������� 
		return list.get(index); //����Ʈ�� T �����̱� ������ ����ȯ ������� 
	}



}
