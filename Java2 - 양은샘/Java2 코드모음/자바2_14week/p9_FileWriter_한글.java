package �ڹ�2_14week;

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

//FileWriter �� FileReader�� ���� ��������, 2byte�� �о�´�. 

public class p9_FileWriter_�ѱ� {
	public static void main(String[] args) throws Exception {// ����ó���� throws Exception���� ����
		//File file = new File("E:/lecture_src/java_src/inout/koreanfile.txt");
		//FileWriter fw = new FileWriter(file, true);
		
		//FileWriter�� FileInputStream �� 2���� �Ű������� ���� �� �ִ�. 
		//1. ���ϸ� 2. �ɼ� : ������ �����ϸ� �� ���뿡 �߰��ؼ� ����, �������� ������ ������ ���� 
		
		FileWriter fw = new FileWriter("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/koreanfile.txt", true);
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ֽ��ϴ�." + "\r\n");
		fw.flush(); fw.close();
		System.out.println("����� ������Ž����� Ȯ���� ������.");
	}
}

//public class p9_FileWriter_�ѱ� {
//	public static void main(String[] args) throws Exception {
//		FileReader fr = new FileReader("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/koreanfile.txt");
//		int readCharNo;
//		char[] cbuf = new char[100];
//		while ((readCharNo = fr.read(cbuf)) != -1) {
//			String data = new String(cbuf, 0, readCharNo);
//			System.out.print(data);
//		}
//		fr.close();
//	}
//}

