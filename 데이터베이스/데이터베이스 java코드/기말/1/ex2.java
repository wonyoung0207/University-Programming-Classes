import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//데이터베이스 인터페이스 하기 위해서 써줌
//preparedStatement 이용
public class ex2 {
	public static void main(String [] args) {
		String url = "jdbc:sqlserver://210.115.229.77:2433;DatabaseName=Northwind";
		//데이터 베이스 서버 주소(포트번호),데이터베이스 이름(명)->northwind 라는 만들어진 데이터에서 가져옴
		
		String query = "Select OrderID, CustomerID, EmployeeID from orders where EmployeeId = ? ";
		//orders라는 테이블로부터 orderID,customerID,employeeID를 가져온다.
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//드라이브메니저에 접속한다.
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 4);
			
			//접속해서 statement를 생성한다.
			ResultSet rs = pstmt.executeQuery();
			//rs에다가 statement의 쿼리문을 넣어준다.
			
			while(rs.next()) {
				int col1 = rs.getInt(1);
				String col2 = rs.getString(2);
				int col3 = rs.getInt(3);
				System.out.println("   "+ col1 + " : " + col2 + " : " + col3);
				
			}
			rs.close();
			pstmt.close();
			con.close();
			
		}catch(Exception se) {
			System.err.println(se.getMessage());
			
		}
		
	}

}
