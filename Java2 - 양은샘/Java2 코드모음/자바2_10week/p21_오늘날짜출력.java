package 자바2_10week;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p21_오늘날짜출력 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 ");

		System.out.println("====================================");
		
		Date now1 = new Date();
		
//		String date = now.toString();//now클래스의 toString 메소드를 호출 
//		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		String f = sdf.format(now1);
		//String f = sdf.format(new Date());// 위와 같은 결과가 나온다. 
		System.out.println(f);
		
	}

}
