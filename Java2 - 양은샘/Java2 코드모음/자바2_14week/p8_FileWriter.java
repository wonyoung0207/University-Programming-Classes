package �ڹ�2_14week;

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

//FileWriter �� FileReader�� ���� ��������, 2byte�� �о�´�. 

public class p8_FileWriter {
	public static void main(String[] args) throws Exception {// ����ó���� throws Exception���� ����
		Writer fw = new FileWriter("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/test2.txt");//���� �������� ������ �����̴�. 
		
		char[] data = "ȫ�浿".toCharArray();//ȫ�浿�� ���� �迭 �������� data�� ���� -> ���� �ϳ��� ȫ -> �� -> �� ���� ���� 
		
		for (int i = 0; i < data.length; i++) {
			fw.write(data[i]);//���ڷ� ������־ �� ���� �� ����ȴ�. 
		}
		fw.flush();
		fw.close();
		System.out.println("����� ������Ž����� Ȯ���� ������.");
	}
}

//public class p8_FileWriter {
//	public static void main(String[] args) throws Exception {
//		Reader fr = new FileReader("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/test2.txt");
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

