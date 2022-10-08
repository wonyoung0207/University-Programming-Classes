package 자바2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 
//objectStream은 객체로 저장할 떄 사용한다. 
//밑의 형태로 잘 안쓰임 -> 객체로 저장할 떄는 한번에 저장하는게 좋음 

public class p6_ObjectStream {
	public static void main(String[] args) throws Exception {// 예외처리를 throws Exception으로 해줌
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//객체 형식으로 파일에 저장하고 싶을경우 
		//파일에 쓰기 write가 아닌 writeObject 로 씀 
		oos.writeObject(new Integer(10));//각각의 객체형태로 저장된다.  -> integer 형태의 10으로 객체가 저장
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("홍길동"));
		//총 4개의 다른 형태 객체 저장 
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//가져올떄 객체형식이라 반복문 필요없이 한번에 가져올 수 있다. 
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}
}
