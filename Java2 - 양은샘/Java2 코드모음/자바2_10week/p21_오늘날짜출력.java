package �ڹ�2_10week;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p21_���ó�¥��� {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "�� " + day + "�� ");

		System.out.println("====================================");
		
		Date now1 = new Date();
		
//		String date = now.toString();//nowŬ������ toString �޼ҵ带 ȣ�� 
//		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yy�� MM�� dd�� a hh�� mm�� ss�� E����");
		String f = sdf.format(now1);
		//String f = sdf.format(new Date());// ���� ���� ����� ���´�. 
		System.out.println(f);
		
	}

}
