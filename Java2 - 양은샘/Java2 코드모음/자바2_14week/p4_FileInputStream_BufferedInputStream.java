package 자바2_14week;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 
//BufferedInputStream은 속도를 향상시키기 위해 사용한다. 
//그냥 파일입출력과 buffer 사용한 입출력의 속도를 비교한다. 

public class p4_FileInputStream_BufferedInputStream  {
	public static void main(String[] args) throws Exception {// 예외처리를 throws Exception으로 해줌
		long start = 0, end = 0;

		FileInputStream fis1 = new FileInputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/image.gif");

		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
		}
		end = System.currentTimeMillis();
		fis1.close();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		
		
		//bufferedStream 사용했을때가 10배 더 빠르다. 
		FileInputStream fis2 = new FileInputStream("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/image.gif");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
		}
		end = System.currentTimeMillis();
		
		bis.close();
		fis2.close();
		System.out.println("사용했을 때: " + (end - start) + "ms");
	}
}

