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
class p7_Serializable_ObjectStream_ClassB implements Serializable {//Serializable : Ŭ������ ��ü�� ����ϱ� ���ؼ� �ʿ��� �� 
	int field1;
}

