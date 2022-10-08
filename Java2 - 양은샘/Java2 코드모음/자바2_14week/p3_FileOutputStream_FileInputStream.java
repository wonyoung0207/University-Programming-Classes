package 자바2_14week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

//FileOutputStream_FileInputStream은 바이트 단위의 입출력이다. 
//저장도 byte로 저장된다. 
//image 는 byte로만 가능
public class p3_FileOutputStream_FileInputStream  { //읽고 쓰기를 동시에 진행함 
	public static void main(String[] args) throws Exception {//예외처리를 throws Exception으로 해줌 
		String originalFileName = "C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/image.gif";
		String targetFileName = "C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/copyimage.gif";
		
		FileInputStream fis = new FileInputStream(originalFileName);//이미지로 저장되있는것을 가져올 객체 생성 
		FileOutputStream fos = new FileOutputStream(targetFileName);//target파일로 출력하는 객체 생성
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes)) != -1 ) {//read(readBytes) = 100byte씩 읽어와서 readByte에 저장, readByteNo는 바이트 수를 의미  
			System.out.println("readBtye : "+readByteNo);//100byte씩 20번정도 읽어옴 
			//파일의 끝이 나올때까지 반복해서 byte를 읽어서 target 파일에 쓴다. -> 이미지파일을 100byte씩 끊어와서 저장후 다시 출력 
			fos.write(readBytes, 0, readByteNo);//fos가 가리키는 파일에 readByte배열의 내용을 0번인덱스부터 readByteNo개(100byte) 만큼 출력 
		}
		
		fos.flush(); fos.close(); fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");
	}
}

