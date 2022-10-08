package 자바2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

//FileWriter 와 FileReader는 문자 형식으로, 2byte씩 읽어온다. 

public class p9_FileWriter_한글 {
	public static void main(String[] args) throws Exception {// 예외처리를 throws Exception으로 해줌
		//File file = new File("E:/lecture_src/java_src/inout/koreanfile.txt");
		//FileWriter fw = new FileWriter(file, true);
		
		//FileWriter와 FileInputStream 은 2개의 매개변수를 가질 수 있다. 
		//1. 파일명 2. 옵션 : 파일이 존재하면 그 내용에 추가해서 저장, 존재하지 않으면 생성후 저장 
		
		FileWriter fw = new FileWriter("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/koreanfile.txt", true);
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열도 바로 출력할 수 있습니다." + "\r\n");
		fw.flush(); fw.close();
		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");
	}
}

//public class p9_FileWriter_한글 {
//	public static void main(String[] args) throws Exception {
//		FileReader fr = new FileReader("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/koreanfile.txt");
//		int readCharNo;
//		char[] cbuf = new char[100];
//		while ((readCharNo = fr.read(cbuf)) != -1) {
//			String data = new String(cbuf, 0, readCharNo);
//			System.out.print(data);
//		}
//		fr.close();
//	}
//}

