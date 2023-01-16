import java.sql.*;
//데이터베이스 인터페이스 하기 위해서 써줌
public class ex3 {
	public static void main(String [] args) {
		String url = "jdbc:inetdae://210.115.229.77:2433";
		//데이터 베이스 서버 주소(포트번호),데이터베이스 이름(명)->northwind 라는 만들어진 데이터에서 가져옴
		
		String query = "Select OrderID, CustomerID, EmployeeID from orders";
		//orders라는 테이블로부터 orderID,customerID,employeeID를 가져온다.
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//드라이브메니저에 접속한다.
			con.setCatalog("Northwind");//커서의 속성값이 들어감
			System.out.println("Connected to DB...");//그냥 db기다리는것
			
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			//접속해서 statement를 생성한다.
			ResultSet rs = stmt.executeQuery(query);
			//rs에다가 statement의 쿼리문을 넣어준다.
			rs.afterLast();//역방향 출력을 위해 커서를 맨 뒤로 옯겨놓는다.
			
			if(rs.isAfterLast()) {//만약 맨 뒤라면 역순으로 출력을 진행하라
				while(rs.previous()) {//역순으로 출력
					int col1 = rs.getInt(1);
					String col2 = rs.getString(2);
					int col3 = rs.getInt(3);
					System.out.println("   "+ col1 + " : " + col2 + " : " + col3);
					
				}
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(SQLException se) {
			System.err.println(se.getMessage());
			
		}
		
	}

}
