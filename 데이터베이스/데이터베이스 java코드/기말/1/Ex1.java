import java.sql.*;
//�����ͺ��̽� �������̽� �ϱ� ���ؼ� ����
//Statement �̿�
public class Ex1 {
	public static void main(String [] args) {
		String url = "jdbc:sqlserver://210.115.229.77:2433;DatabaseName=Northwind";
		//������ ���̽� ���� �ּ�(��Ʈ��ȣ),�����ͺ��̽� �̸�(��)->northwind ��� ������� �����Ϳ��� ������
		
		String query = "Select course.course_id,section.course_id FROM course left join section on course.course_id=section.course_id";
		//orders��� ���̺�κ��� orderID,customerID,employeeID�� �����´�.
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//����̺�޴����� �����Ѵ�.
			stmt = con.createStatement();
			//�����ؼ� statement�� �����Ѵ�.
			ResultSet rs = stmt.executeQuery(query);
			//rs���ٰ� statement�� �������� �־��ش�.
			
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
