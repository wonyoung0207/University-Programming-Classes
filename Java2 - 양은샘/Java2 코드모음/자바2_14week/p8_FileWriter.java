package 자바2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

//FileWriter 와 FileReader는 문자 형식으로, 2byte씩 읽어온다. 

public class p8_FileWriter {
	public static void main(String[] args) throws Exception {// 예외처리를 throws Exception으로 해줌
		Writer fw = new FileWriter("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/test2.txt");//문자 형식으로 파일을 쓸것이다. 
		
		char[] data = "홍길동".toCharArray();//홍길동을 문자 배열 형식으로 data에 저장 -> 문자 하나씩 홍 -> 길 -> 동 으로 저장 
		
		for (int i = 0; i < data.length; i++) {
			fw.write(data[i]);//문자로 저장되있어서 한 글자 씩 저장된다. 
		}
		fw.flush();
		fw.close();
		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");
	}
}

//public class p8_FileWriter {
//	public static void main(String[] args) throws Exception {
//		Reader fr = new FileReader("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/test2.txt");
//		int readData;
//		while (true) {
//			readData = fr.read();
//			if (readData == -1)
//				break;
//			System.out.print((char) readData);
//		}
//		fr.close();
//	}
//}

