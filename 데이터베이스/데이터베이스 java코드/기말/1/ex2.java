import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//�����ͺ��̽� �������̽� �ϱ� ���ؼ� ����
//preparedStatement �̿�
public class ex2 {
	public static void main(String [] args) {
		String url = "jdbc:sqlserver://210.115.229.77:2433;DatabaseName=Northwind";
		//������ ���̽� ���� �ּ�(��Ʈ��ȣ),�����ͺ��̽� �̸�(��)->northwind ��� ������� �����Ϳ��� ������
		
		String query = "Select OrderID, CustomerID, EmployeeID from orders where EmployeeId = ? ";
		//orders��� ���̺�κ��� orderID,customerID,employeeID�� �����´�.
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//����̺�޴����� �����Ѵ�.
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 4);
			
			//�����ؼ� statement�� �����Ѵ�.
			ResultSet rs = pstmt.executeQuery();
			//rs���ٰ� statement�� �������� �־��ش�.
			
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
