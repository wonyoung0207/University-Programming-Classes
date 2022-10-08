package 자바2_14week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 

//public class p2_FileOutputStream_FileInputStream {
//	public static void main(String[] args) {
//		try {
//			//C:\Users\82102\eclipse-workspace\자바 경로에 test1.txt가 저장됨 
//			OutputStream fos = new FileOutputStream("test1.txt");//outputStream이 상위, FileOutputStream이 하위
//			byte[] data = "ABC".getBytes();//바이트 단위로 저장되서 손실 안나려면 byte로 저장해야한다. 
//			for (int i = 0; i < data.length; i++) {
//				fos.write(data[i]);//test1.txt에 A -> B -> c 를 저장한다. 
//			}
//			fos.flush();//버퍼에 남은거 있으면 더 저장한다
//			fos.close();//파일을 끝낸다. 
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");
//	}
//}

public class p2_FileOutputStream_FileInputStream {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("test1.txt"); // args[0]에 test1.txt 입력
		int readByte;
		while (true) {
			readByte = fis.read();//한 바이트씩 읽어온다. -> 바이트를 리턴하는 것이 아니라 바이트 수를 리턴한다. 
			System.out.println("readByte : " + readByte);
			if (readByte == -1)//EOF을 만났을때 readByte가 -1이 된다. (end of File) 
				break;
			System.out.println((char) readByte);
		}
		fis.close();
	}
}