package 자바2_14week;

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

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 
//objectStream은 객체로 저장할 떄 사용한다. 
//이런 형태로 많이 쓰인다. 
class p7_Serializable_ObjectStream_ClassB implements Serializable {//Serializable : 클래스를 객체로 출력하기 위해서 필요한 것 
	int field1;
}

