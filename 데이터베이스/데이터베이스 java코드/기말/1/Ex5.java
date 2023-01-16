
import java.sql.*;

//�����ͺ��̽� �������̽� �ϱ� ���ؼ� ����
public class Ex5 {
	public static void main(String [] args) {
		String url = "jdbc:sqlserver://210.115.229.77:2433";
		//������ ���̽� ���� �ּ�(��Ʈ��ȣ),�����ͺ��̽� �̸�(��)->northwind ��� ������� �����Ϳ��� ������
		
		String query = "Select ProductName, Unitprice, UnitsinStock from Products where ProductName Like 'c%'";
		//orders��� ���̺�κ��� orderID,customerID,employeeID�� �����´�.
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//����̺�޴����� �����Ѵ�.
			con.setCatalog("Northwind");
			System.out.println("Connected to DB...");//�׳� db��ٸ��°�
			
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			//�����ؼ� statement�� �����Ѵ�.
			ResultSet rs = stmt.executeQuery(query);
			//rs���ٰ� statement�� �������� �־��ش�.
			rs.afterLast();//������ ����� ���� Ŀ���� �� �ڷ� ���ܳ��´�.
			
			if(rs.isAfterLast()) {//���� �� �ڶ�� �������� ����� �����϶�
				while(rs.previous()) {//�������� ���
					String col1 = rs.getString(1);
					int col2 = rs.getInt(2);
					int col3 = rs.getInt(3);
					int col4 = col3 * col2;
					
					System.out.println("   "+ col1 + " : " + col2 + " : " + col3 + " : " + col4);
					
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
