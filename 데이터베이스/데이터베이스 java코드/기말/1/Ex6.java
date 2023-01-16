
import java.sql.*;
import java.util.Scanner;

//데이터베이스 인터페이스 하기 위해서 써줌
public class Ex6 {
	public static void main(String [] args) {

		String url = "jdbc:sqlserver://210.115.229.77:2433";
		
		Scanner scan = new Scanner (System.in);// 사용자로부터  입력받는것
		System.out.print("나라 이름을 입력하세요 : ");
		String value = scan.nextLine();
		
		String query = "Select CompanyName, ContactName, Phone from Customers where Country = '" + value + "'";
		

		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//드라이브메니저에 접속한다.
			con.setCatalog("Northwind");
			System.out.println("Connected to DB...");//그냥 db기다리는것
			
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(query);
			rs.afterLast();//역방향 출력을 위해 커서를 맨 뒤로 옯겨놓는다.
			
			if(rs.isAfterLast()) {//만약 맨 뒤라면 역순으로 출력을 진행하라
				while(rs.previous()) {//역순으로 출력
					String col1 = rs.getString(1);
					String col2 = rs.getString(2);
					String col3 = rs.getString(3);
					
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
