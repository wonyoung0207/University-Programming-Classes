package ÀÚ¹Ù2_14week;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public Board(int bno,String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		
	}
	
	public int getBno() {return bno;}
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public String getWriter() {return writer;}
	public Date getDate() {return date;}
	
	public void setBno(int bno) { this.bno = bno;}
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setWriter(String writer) {this.writer = writer;}
	public void setDate(Date date) {this.date = date;}
}
