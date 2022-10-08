package �ڹ�2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream�� ����Ʈ ������ ������̴�. 
//���嵵 byte�� ����ȴ�. 
//DataStream�� ������ Ÿ������ �����ϱ� ���ؼ� ���ȴ�. -> byte�� ������� �ʰ� �ش� Ÿ���� ũ��� ����ȴ�. 
//�ش� ��� �� �Ⱦ� 

public class p5_DataOutputStream_DataInputStream {
	public static void main(String[] args) throws Exception {// ����ó���� throws Exception���� ����
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/dos.dat");
		DataOutputStream dos = new DataOutputStream(fos);//DataStream �������� ������ �ٲ��ش�. 
		
		//���Ͽ� ������ ���� 
		dos.writeUTF("ȫ�浿");//������ Ÿ�Ժ��� ����. char�� �ڹٿ����� 2byte�̱� ������ 6byte�� ����ȴ�.
		dos.writeDouble(95.5);//double�̴ϱ� 8byte�� ����ȴ�. 
		dos.writeInt(1);//int�ϱ� 4byte�� ����ȴ�. 
		
		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		//���ϵ����� �������� 
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/dos.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();//�����ö��� Ÿ�Ժ��� �����;� �Ѵ�. 
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();

	}
}
