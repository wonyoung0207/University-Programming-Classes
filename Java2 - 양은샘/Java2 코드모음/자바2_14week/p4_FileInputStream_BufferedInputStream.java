package �ڹ�2_14week;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream�� ����Ʈ ������ ������̴�. 
//���嵵 byte�� ����ȴ�. 
//BufferedInputStream�� �ӵ��� ����Ű�� ���� ����Ѵ�. 
//�׳� ��������°� buffer ����� ������� �ӵ��� ���Ѵ�. 

public class p4_FileInputStream_BufferedInputStream  {
	public static void main(String[] args) throws Exception {// ����ó���� throws Exception���� ����
		long start = 0, end = 0;

		FileInputStream fis1 = new FileInputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/image.gif");

		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
		}
		end = System.currentTimeMillis();
		fis1.close();
		System.out.println("������� �ʾ��� ��: " + (end - start) + "ms");
		
		
		//bufferedStream ����������� 10�� �� ������. 
		FileInputStream fis2 = new FileInputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/image.gif");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
		}
		end = System.currentTimeMillis();
		
		bis.close();
		fis2.close();
		System.out.println("������� ��: " + (end - start) + "ms");
	}
}

