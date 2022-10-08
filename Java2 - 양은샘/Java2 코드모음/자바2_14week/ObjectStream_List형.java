package 자바2_14week;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ObjectStream_List형 {
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
	
	public static void writeList() throws Exception{//throws Exception 꼭 해줘야함 
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board(1,"제목1","내용","글쓴이1",new Date()));
		list.add(new Board(2,"제목2","내용","글쓴이2",new Date()));
		list.add(new Board(3,"제목3","내용","글쓴이3",new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/object_list.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.flush();//쓰기에서만 사용됨 
		oos.close();
		
	}
	
	public static List<Board> readList() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/object_list.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		List<Board> list = (List<Board>) ois.readObject();// 강제타입 변환시 list타입으로 변환해 줘야함 
		
//		ois.flush();//write에서만 쓰기 
		ois.close();
		
		return list;
		
	}
	
	
	


}
