import java.sql.*;
//데이터베이스 인터페이스 하기 위해서 써줌
//Statement 이용
public class Ex1 {
	public static void main(String [] args) {
		String url = "jdbc:sqlserver://210.115.229.77:2433;DatabaseName=Northwind";
		//데이터 베이스 서버 주소(포트번호),데이터베이스 이름(명)->northwind 라는 만들어진 데이터에서 가져옴
		
		String query = "Select course.course_id,section.course_id FROM course left join section on course.course_id=section.course_id";
		//orders라는 테이블로부터 orderID,customerID,employeeID를 가져온다.
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//드라이브메니저에 접속한다.
			stmt = con.createStatement();
			//접속해서 statement를 생성한다.
			ResultSet rs = stmt.executeQuery(query);
			//rs에다가 statement의 쿼리문을 넣어준다.
			
			while(rs.next()) {
				int col1 = rs.getInt(1);
				String col2 = rs.getString(2);
				int col3 = rs.getInt(3);
				System.out.println("   "+ col1 + " : " + col2 + " : " + col3);
				
			}
			rs.close();
			stmt.close();
			con.close();
			
			
		}catch(Exception e) {
			
		}
		
	}

}
