package �ڹ�2_14week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream�� ����Ʈ ������ ������̴�. 
//���嵵 byte�� ����ȴ�. 

//public class p2_FileOutputStream_FileInputStream {
//	public static void main(String[] args) {
//		try {
//			//C:\Users\82102\eclipse-workspace\�ڹ� ��ο� test1.txt�� ����� 
//			OutputStream fos = new FileOutputStream("test1.txt");//outputStream�� ����, FileOutputStream�� ����
//			byte[] data = "ABC".getBytes();//����Ʈ ������ ����Ǽ� �ս� �ȳ����� byte�� �����ؾ��Ѵ�. 
//			for (int i = 0; i < data.length; i++) {
//				fos.write(data[i]);//test1.txt�� A -> B -> c �� �����Ѵ�. 
//			}
//			fos.flush();//���ۿ� ������ ������ �� �����Ѵ�
//			fos.close();//������ ������. 
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("����� ������Ž����� Ȯ���� ������.");
//	}
//}

public class p2_FileOutputStream_FileInputStream {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("test1.txt"); // args[0]�� test1.txt �Է�
		int readByte;
		while (true) {
			readByte = fis.read();//�� ����Ʈ�� �о�´�. -> ����Ʈ�� �����ϴ� ���� �ƴ϶� ����Ʈ ���� �����Ѵ�. 
			System.out.println("readByte : " + readByte);
			if (readByte == -1)//EOF�� �������� readByte�� -1�� �ȴ�. (end of File) 
				break;
			System.out.println((char) readByte);
		}
		fis.close();
	}
}