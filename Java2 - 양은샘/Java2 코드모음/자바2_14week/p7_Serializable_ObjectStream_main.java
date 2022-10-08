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
import java.net.URI;

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 
//objectStream은 객체로 저장할 떄 사용한다. 
//이런 형태로 많이 쓰인다. 
//객체형으로 파일입출력 사용하려면 클래스 생성시 꼭 Serializable을 implement 해줘야 한다. 
//객체를 파일 입출력 할 경우, 다른입출력들과는 다르게 Objectread 와 Objectwrite 메소드를 사용해야 한다. 

public class p7_Serializable_ObjectStream_main {
	public static void main(String[] args) throws Exception {// 예외처리를 throws Exception으로 해줌
		FileOutputStream fos = new FileOutputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/objectAB.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//클래스로 객체 생성 -> classA에는 classB가 객체로 들어있다. 
		p7_Serializable_ObjectStream_ClassA classA = new p7_Serializable_ObjectStream_ClassA();
		
		//객체의 필드값을 변경한다. 
		classA.field1 = 1;
		classA.field2.field1 = 2;//클래스A 안에있는 클래스B 객체에 2를 저장 
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);//파일에는 classA 객체 하나만 쓰면됨 -> classA 만 텍스트로 저장됨
		oos.flush();//쓰기일때 flush 사용해준다. 
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/objectAB.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		p7_Serializable_ObjectStream_ClassA v = (p7_Serializable_ObjectStream_ClassA) ois.readObject();// 강제타입변환해서 객체를 읽어온다. 
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);//transient를 사용해서 값이 안나오는 것을 알 수 있다. 
	}
}

