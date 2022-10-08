package �ڹ�2_14week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream�� ����Ʈ ������ ������̴�. 
//���嵵 byte�� ����ȴ�. 
//image �� byte�θ� ����
public class p3_FileOutputStream_FileInputStream  { //�а� ���⸦ ���ÿ� ������ 
	public static void main(String[] args) throws Exception {//����ó���� throws Exception���� ���� 
		String originalFileName = "C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/image.gif";
		String targetFileName = "C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/copyimage.gif";
		
		FileInputStream fis = new FileInputStream(originalFileName);//�̹����� ������ִ°��� ������ ��ü ���� 
		FileOutputStream fos = new FileOutputStream(targetFileName);//target���Ϸ� ����ϴ� ��ü ����
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes)) != -1 ) {//read(readBytes) = 100byte�� �о�ͼ� readByte�� ����, readByteNo�� ����Ʈ ���� �ǹ�  
			System.out.println("readBtye : "+readByteNo);//100byte�� 20������ �о�� 
			//������ ���� ���ö����� �ݺ��ؼ� byte�� �о target ���Ͽ� ����. -> �̹��������� 100byte�� ����ͼ� ������ �ٽ� ��� 
			fos.write(readBytes, 0, readByteNo);//fos�� ����Ű�� ���Ͽ� readByte�迭�� ������ 0���ε������� readByteNo��(100byte) ��ŭ ��� 
		}
		
		fos.flush(); fos.close(); fis.close();
		
		System.out.println("���簡 �� �Ǿ����ϴ�.");
		System.out.println("����� ������Ž����� Ȯ���� ������.");
	}
}

