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
import java.io.Serializable;
import java.net.URI;

//FileOutputStream_FileInputStream�� ����Ʈ ������ ������̴�. 
//���嵵 byte�� ����ȴ�. 
//objectStream�� ��ü�� ������ �� ����Ѵ�. 
//�̷� ���·� ���� ���δ�. 
//Serializable : ����ȭ 

class p7_Serializable_ObjectStream_ClassA implements Serializable {
	int field1;
	p7_Serializable_ObjectStream_ClassB field2 = new p7_Serializable_ObjectStream_ClassB();
	static int field3;
	transient int field4;//transient ����ü�� ���Ἥ ����� �� ����.  
}

