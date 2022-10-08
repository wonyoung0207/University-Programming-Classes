package 자바2_14week;

import java.io.File;
import java.net.URI;

public class p1_File {
	public static void main(String[] args) {
		try {//try catch로 오류처리 반드시 해줘야함 -> 이거 안쓸꺼면 throws Exception 사용하기 -> throws 는 잘 사용 안함 
			File dir = new File("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir");
			File file1 = new File("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/file1.txt");
			File file2 = new File("C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/file2.txt");
			File file3 = new File(new URI("file:///C:/Users/82102/eclipse-workspace/자바/src/자바2_14week/Dir/file3.txt"));

			if (dir.exists() == false) {//디렉토리가 존재하지 않을경우 생성 
				dir.mkdirs();
			}
			if (file1.exists() == false) {//파일이 존재하지 않을경우
				file1.createNewFile();//파일을 새로 생성 -> 그냥 write 하면 파일 없어도 생성됨 
			}
			if (file2.exists() == false) {
				file2.createNewFile();
			}
			if (file3.exists() == false) {
				file3.createNewFile();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");//재대로 완료되면 출력 
	}
}

//예외처리 다르게 한것 
//public class p1_File {
//	public static void main(String[] args) throws Exception {//throws Exception 으로 오류처리 -> 그냥 예외처리 안하는 것과 같음 
//		File dir = new File("E:/lecture_src/java_src/inout/Dir");
//		File file1 = new File("E:/lecture_src/java_src/inout/file1.txt");
//		File file2 = new File("E:/lecture_src/java_src/inout/file2.txt");
//		File file3 = new File(new URI("file:///E:/lecture_src/java_src/inout/file3.txt"));
//		if (dir.exists() == false) {
//			dir.mkdirs();
//		}
//		if (file1.exists() == false) {
//			file1.createNewFile();
//		}
//		if (file2.exists() == false) {
//			file2.createNewFile();
//		}
//		if (file3.exists() == false) {
//			file3.createNewFile();
//		}
//		System.out.println("결과를 윈도우탐색기로 확인해 보세요.");
//	}
//}