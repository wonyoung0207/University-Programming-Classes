package �ڹ�2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream�� ����Ʈ ������ ������̴�. 
//���嵵 byte�� ����ȴ�. 
//objectStream�� ��ü�� ������ �� ����Ѵ�. 
//���� ���·� �� �Ⱦ��� -> ��ü�� ������ ���� �ѹ��� �����ϴ°� ���� 

public class p6_ObjectStream {
	public static void main(String[] args) throws Exception {// ����ó���� throws Exception���� ����
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//��ü �������� ���Ͽ� �����ϰ� ������� 
		//���Ͽ� ���� write�� �ƴ� writeObject �� �� 
		oos.writeObject(new Integer(10));//������ ��ü���·� ����ȴ�.  -> integer ������ 10���� ��ü�� ����
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("ȫ�浿"));
		//�� 4���� �ٸ� ���� ��ü ���� 
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//�����Ë� ��ü�����̶� �ݺ��� �ʿ���� �ѹ��� ������ �� �ִ�. 
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}
}
