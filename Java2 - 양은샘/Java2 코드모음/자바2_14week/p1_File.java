package �ڹ�2_14week;

import java.io.File;
import java.net.URI;

public class p1_File {
	public static void main(String[] args) {
		try {//try catch�� ����ó�� �ݵ�� ������� -> �̰� �Ⱦ����� throws Exception ����ϱ� -> throws �� �� ��� ���� 
			File dir = new File("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir");
			File file1 = new File("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/file1.txt");
			File file2 = new File("C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/file2.txt");
			File file3 = new File(new URI("file:///C:/Users/82102/eclipse-workspace/�ڹ�/src/�ڹ�2_14week/Dir/file3.txt"));

			if (dir.exists() == false) {//���丮�� �������� ������� ���� 
				dir.mkdirs();
			}
			if (file1.exists() == false) {//������ �������� �������
				file1.createNewFile();//������ ���� ���� -> �׳� write �ϸ� ���� ��� ������ 
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
		System.out.println("����� ������Ž����� Ȯ���� ������.");//���� �Ϸ�Ǹ� ��� 
	}
}

//����ó�� �ٸ��� �Ѱ� 
//public class p1_File {
//	public static void main(String[] args) throws Exception {//throws Exception ���� ����ó�� -> �׳� ����ó�� ���ϴ� �Ͱ� ���� 
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
//		System.out.println("����� ������Ž����� Ȯ���� ������.");
//	}
//}