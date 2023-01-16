import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex4 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public static void main(String [] args) {
		Ex4 ex4 = new Ex4();
		ex4.Execute();
		
	}
	
	public Ex4() {
		try {
			con =  DriverManager.getConnection("jdbc:inetdae://210.115.229.77:2433","20155137","dnsqlwhgdk2@");
			con.setCatalog("20155137");
			System.out.println("Connected... ");
		}
		catch(SQLException se) {
			System.err.println(se.getMessage());
		}
	}
	public void Execute() {
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select * from score");
			
			rs.absolute(4);
			rs.deleteRow();
			rs.moveToInsertRow();
			rs.updateString("s_id", "954522");
			rs.updateInt("korean",75);
			rs.updateInt("english",95);
			rs.updateInt("math",100);
			rs.insertRow();
			rs.absolute(2);
			rs.updateInt("korean",95);
			rs.updateRow();
			rs.refreshRow();
			
			System.out.println("s_id   korean   English   Math");
			
			if(rs.first()) {
				do {
					String s_id = rs.getString(1);
					int korean = rs.getInt(2);
					int english = rs.getInt(3);
					int math = rs.getInt(4);
					System.out.println(s_id + "     " + korean + "     " + english + "     " + math);
					
				}while(rs.next());
			}	
		}catch(SQLException se) {
			System.err.println(se.getMessage());
		}
	}
	
	public void Close() {
		try {
			con.close();
			stmt.close();
			rs.close();
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
			
		}System.out.println("Disconnection...");
	}

}
