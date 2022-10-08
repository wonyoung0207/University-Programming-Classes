package 자바2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 
//DataStream은 각각의 타입으로 저장하기 위해서 사용된다. -> byte로 저장되지 않고 해당 타입의 크기로 저장된다. 
//해당 방법 잘 안씀 

public class p5_DataOutputStream_DataInputStream {
	public static void main(String[] args) throws Exception {// 예외처리를 throws Exception으로 해줌
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/dos.dat");
		DataOutputStream dos = new DataOutputStream(fos);//DataStream 형식으로 파일을 바꿔준다. 
		
		//파일에 데이터 쓰기 
		dos.writeUTF("홍길동");//각각의 타입별로 쓴다. char가 자바에서는 2byte이기 때문에 6byte가 저장된다.
		dos.writeDouble(95.5);//double이니까 8byte로 저장된다. 
		dos.writeInt(1);//int니까 4byte로 저장된다. 
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		//파일데이터 가져오기 
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/dos.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();//가져올때도 타입별로 가져와야 한다. 
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();

	}
}
