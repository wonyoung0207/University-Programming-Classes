import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
// 자바를 이용해서 데이터베이스와 웹을연동하는 프로그램
//applet이 웹과 연동할때 사용하는 것임

public class AppletTest extends Applet implements ActionListener {
	//웹에서 사용하는 장치들 메소드를 가져와 새로운 변수 생성
	Choice search;
	Choice mathod;
	Label label;
	TextField textField;
	TextArea Area;
	Button button;
	Button mbutton;
	
	private String url = "jdbc:inetdae7://210.115.229.77:2433";
	private String user = "20155137";
	private String pass = "dnsqlwhgdk2@";
	
	public void init() {
		try {
			Class.forName("com.inet.tds.TdsDriver");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Class Loading Failed");
		}
	}
	
	public void start() {
		setLayout(new FlowLayout());
		//label 생성
		label = new Label("검색조건");
		add(label);
		
		search = new Choice();
		mathod = new Choice();
		
		//search기능에 원하는 값들을 추가 
		search.add("전체");
		search.add("이름");
		search.add("나이");
		search.add("성별");
		mathod.add("삽입");
		mathod.add("삭제");
		mathod.add("갱신");
		
		add(mathod);
		add(search);
		
		//입력할 텍스트 박스 생성
		textField = new TextField(10);
		add(textField);
		
		//search라는 버튼을 생성
		button = new Button("search");
		add(button);
		
		mbutton = new Button("running");
		add(mbutton);
		
		//결과나올 창 생성
		Area = new TextArea(10,50);
		add(Area);
		button.addActionListener(this);
		mbutton.addActionListener(this);
		}
	
	//액션이벤트-> 버튼이 눌리는것 ->이 발생하는것이 ae임 예) search버튼이 눌렸을때
	public void actionPerformed(ActionEvent ae) {
		Connection con = null;
		Statement stmt = null;
		
		String st = ae.getActionCommand();
		String item = search.getSelectedItem();
		String mitem = mathod.getSelectedItem();
		
		if(st.contentEquals("search")) {//액션 -> 버튼을 누른것 -> 이 search일경우 실행
			String n = textField.getText();
			
			if(item.equals("전체")) {
				TotalgetDBSearch();//TotalgetDBSearch라는 메소드를 호출
			}
			else{
				NamegetDBSearch(n);
			}
		}
		
		if(st.contentEquals("running")) {
			String n = textField.getText();
			String[] a = n.split(",");
			
			if(mitem.equals("삭제")) {
				customer_Delete(n);
				System.out.println();
			}
			else if(mitem.equals("삽입")) {
				
				Insert(a[0],a[1],a[2]);
			}
			else if(mitem.equals("갱신")) {//갱신
				gangsin();
			}
		}
	}
	

	// 모든 자료들이 출력되겠금 하는 메소드
	public void TotalgetDBSearch() {
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DriverManager.getConnection(url,user,pass);//db주소와 내 db아이디와 비밀번호
			con.setCatalog("20155137");			//db 권한권이있는 사용자 테이블을 호출
			stmt = con.createStatement();		
			
			ResultSet result = stmt.executeQuery("Select course.course_id,section.course_id FROM course left join section on course.course_id=section.course_id");//query문을 실행
			
			String count = Area.getText();
			int c = count.length();
			Area.replaceText("",0,c);
			
			while(result.next()) {//다음 정보가있을때까지 반복
				String Name = result.getString(1);
				String age = Integer.toString(result.getInt(2));
				String sex = result.getString(3);
				
				String value = "이름 " + Name + "나이 " + age + "성별 " + sex + "\n";
				int index = Area.getText().length();
				Area.insertText(value,index);//결과창에 결과값 추가
				
			}
			con.close();
			stmt.close();
			
		}catch(Exception ee) {
			System.out.println(ee);
			
		}
	}
	
	//사용자가 입력한 이름값을 받는 메소드,n이 입력된 이름
	private void NamegetDBSearch(String n) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(url,user,pass);
			con.setCatalog("20155137");
			stmt = con.createStatement();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM customer WHERE name like '"+n+"'");
			
			String count = Area.getText();
			int c = count.length();
			Area.replaceText("",0,c);
			
			while(result.next()) {//다음 정보가있을때까지 반복
				String Name = result.getString(1);
				String age = Integer.toString(result.getInt(2));
				String sex = result.getString(3);
				
				String value = "이름 " + Name + "나이 " + age + "성별 " + sex + "\n";
				int index = Area.getText().length();
				Area.insertText(value,index);//결과창에 결과값 추가
				
			}
			con.close();
			stmt.close();
			
		}catch(Exception ee) {
			System.out.println(ee);
		}
	}
	
	private void Insert(String name,String age,String sex) {
		try {
			Connection con;
			Statement stmt;
			
			con = DriverManager.getConnection(url,user,pass);
			con.setCatalog("20155137");
			
			stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO customer VALUES('"+name+"','"+age+"','"+sex+"')");
			stmt.close();
			con.close();
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
			
		}
	}
	
	void customer_Delete(String r) {
		try {
			Connection con;
			Statement stmt;
			con = DriverManager.getConnection(url,user,pass);
			con.setCatalog("20155137");
			
			stmt = con.createStatement();
			stmt.executeUpdate("delete from customer where name='"+r+"'");
			
			stmt.close();
			con.close();
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}
	
	private void gangsin() {//갱신= 나이를 1년식 증가
		try {
			Connection con;
			Statement stmt;
			con = DriverManager.getConnection(url,user,pass);
			con.setCatalog("20155137");
			
			stmt = con.createStatement();
			
			stmt.executeUpdate("update customer set age=age+1");
			
			stmt.close();
			con.close();
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
