package javabean;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BookData {
	private String book_code;
	private String book_num;
	private String now_date;
	
	

	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public void setBook_num(String book_num) {
		this.book_num = book_num;
	}
	
	
	public String getBook_code() {
		return this.book_code;
		
	}
	
	public String getBook_num() {
		return this.book_num;
		
	}
	
	public String getNow_date() {
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

		return sdf.format(time);
		
	}
	

}
