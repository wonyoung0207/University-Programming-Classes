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
//			OutputStream fos = new FileOutputStream("test2.txt");//outputStream�� ����, FileOutputStream�� ����
//			byte[] data = "ABC".getBytes();//���ڿ� ���� ����Ʈ ������ ����,�ս� �ȳ����� byte�� �����ؾ��Ѵ�. 
//
//			fos.write(data);//�迭�� �ѹ��� �����Ѵ�. 
//			fos.flush();//���ۿ� ������ ������ �� �����Ѵ�
//			fos.close();//������ ������. 
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("����� ������Ž����� Ȯ���� ������.");
//	}
//}

public class p2_FileOutputStream_mycord {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("test2.txt"); // args[0]�� test1.txt �Է�\
		int readByte;
		byte[] buf = new byte[100];
		
		while (true) {//�� 2���ݺ��ϴµ�, 2��°���� eof������ break �ϰԵ� 
			readByte = fis.read(buf);//
			
			if (readByte == -1)//EOF�� �������� readByte�� -1�� �ȴ�. (end of File) 
				break;
			for(int i=0; i<readByte; i++) {
				System.out.println((char)buf[i] + " : "+ buf[i]);//�׳� byte�������� ����ϸ� ���߿� byte�������� ��µ� . ó���� char�����̴ϱ� char������ ��ȯ�ؼ� ���������� 
				
			}

		}
		fis.close();
	}
}