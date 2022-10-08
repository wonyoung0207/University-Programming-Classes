package �ڹ�2_14week;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ObjectStream_List�� {
	public static void main(String[] args) throws Exception{
		writeList();
		List<Board> list = readList();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for(Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" + 
					board.getContent() + "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
		}

	}
	
	public static void writeList() throws Exception{//throws Exception �� ������� 
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board(1,"����1","����","�۾���1",new Date()));
		list.add(new Board(2,"����2","����","�۾���2",new Date()));
		list.add(new Board(3,"����3","����","�۾���3",new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/object_list.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.flush();//���⿡���� ���� 
		oos.close();
		
	}
	
	public static List<Board> readList() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/object_list.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		List<Board> list = (List<Board>) ois.readObject();// ����Ÿ�� ��ȯ�� listŸ������ ��ȯ�� ����� 
		
//		ois.flush();//write������ ���� 
		ois.close();
		
		return list;
		
	}
	
	
	


}
