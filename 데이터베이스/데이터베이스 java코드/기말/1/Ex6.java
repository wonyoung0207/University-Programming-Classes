
import java.sql.*;
import java.util.Scanner;

//�����ͺ��̽� �������̽� �ϱ� ���ؼ� ����
public class Ex6 {
	public static void main(String [] args) {

		String url = "jdbc:sqlserver://210.115.229.77:2433";
		
		Scanner scan = new Scanner (System.in);// ����ڷκ���  �Է¹޴°�
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		String value = scan.nextLine();
		
		String query = "Select CompanyName, ContactName, Phone from Customers where Country = '" + value + "'";
		

		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection(url,"20155137","dnsqlwhgdk2@");
			//����̺�޴����� �����Ѵ�.
			con.setCatalog("Northwind");
			System.out.println("Connected to DB...");//�׳� db��ٸ��°�
			
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(query);
			rs.afterLast();//������ ����� ���� Ŀ���� �� �ڷ� ���ܳ��´�.
			
			if(rs.isAfterLast()) {//���� �� �ڶ�� �������� ����� �����϶�
				while(rs.previous()) {//�������� ���
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
