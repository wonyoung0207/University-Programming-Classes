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
//�̷� ���·� ���� ���δ�. 
//��ü������ ��������� ����Ϸ��� Ŭ���� ������ �� Serializable�� implement ����� �Ѵ�. 
//��ü�� ���� ����� �� ���, �ٸ�����µ���� �ٸ��� Objectread �� Objectwrite �޼ҵ带 ����ؾ� �Ѵ�. 

public class p7_Serializable_ObjectStream_main {
	public static void main(String[] args) throws Exception {// ����ó���� throws Exception���� ����
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/objectAB.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//Ŭ������ ��ü ���� -> classA���� classB�� ��ü�� ����ִ�. 
		p7_Serializable_ObjectStream_ClassA classA = new p7_Serializable_ObjectStream_ClassA();
		
		//��ü�� �ʵ尪�� �����Ѵ�. 
		classA.field1 = 1;
		classA.field2.field1 = 2;//Ŭ����A �ȿ��ִ� Ŭ����B ��ü�� 2�� ���� 
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);//���Ͽ��� classA ��ü �ϳ��� ����� -> classA �� �ؽ�Ʈ�� �����
		oos.flush();//�����϶� flush ������ش�. 
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/objectAB.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		p7_Serializable_ObjectStream_ClassA v = (p7_Serializable_ObjectStream_ClassA) ois.readObject();// ����Ÿ�Ժ�ȯ�ؼ� ��ü�� �о�´�. 
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);//transient�� ����ؼ� ���� �ȳ����� ���� �� �� �ִ�. 
	}
}

