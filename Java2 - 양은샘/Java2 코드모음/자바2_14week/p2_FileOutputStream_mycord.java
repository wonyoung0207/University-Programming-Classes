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
//			OutputStream fos = new FileOutputStream("test2.txt");//outputStream이 상위, FileOutputStream이 하위
//			byte[] data = "ABC".getBytes();//문자열 형을 바이트 단위로 저장,손실 안나려면 byte로 저장해야한다. 
//
//			fos.write(data);//배열을 한번에 저장한다. 
//			fos.flush();//버퍼에 남은거 있으면 더 저장한다
//			fos.close();//파일을 끝낸다. 
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");
//	}
//}

public class p2_FileOutputStream_mycord {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("test2.txt"); // args[0]에 test1.txt 입력\
		int readByte;
		byte[] buf = new byte[100];
		
		while (true) {//총 2번반복하는데, 2번째에는 eof만나서 break 하게됨 
			readByte = fis.read(buf);//
			
			if (readByte == -1)//EOF을 만났을때 readByte가 -1이 된다. (end of File) 
				break;
			for(int i=0; i<readByte; i++) {
				System.out.println((char)buf[i] + " : "+ buf[i]);//그냥 byte형식으로 출력하면 나중에 byte형식으로 출력됨 . 처음에 char형식이니까 char형으로 변환해서 출력해줘야함 
				
			}

		}
		fis.close();
	}
}