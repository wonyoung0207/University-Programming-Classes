import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
// �ڹٸ� �̿��ؼ� �����ͺ��̽��� ���������ϴ� ���α׷�
//applet�� ���� �����Ҷ� ����ϴ� ����

public class AppletTest extends Applet implements ActionListener {
	//������ ����ϴ� ��ġ�� �޼ҵ带 ������ ���ο� ���� ����
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
		//label ����
		label = new Label("�˻�����");
		add(label);
		
		search = new Choice();
		mathod = new Choice();
		
		//search��ɿ� ���ϴ� ������ �߰� 
		search.add("��ü");
		search.add("�̸�");
		search.add("����");
		search.add("����");
		mathod.add("����");
		mathod.add("����");
		mathod.add("����");
		
		add(mathod);
		add(search);
		
		//�Է��� �ؽ�Ʈ �ڽ� ����
		textField = new TextField(10);
		add(textField);
		
		//search��� ��ư�� ����
		button = new Button("search");
		add(button);
		
		mbutton = new Button("running");
		add(mbutton);
		
		//������� â ����
		Area = new TextArea(10,50);
		add(Area);
		button.addActionListener(this);
		mbutton.addActionListener(this);
		}
	
	//�׼��̺�Ʈ-> ��ư�� �����°� ->�� �߻��ϴ°��� ae�� ��) search��ư�� ��������
	public void actionPerformed(ActionEvent ae) {
		Connection con = null;
		Statement stmt = null;
		
		String st = ae.getActionCommand();
		String item = search.getSelectedItem();
		String mitem = mathod.getSelectedItem();
		
		if(st.contentEquals("search")) {//�׼� -> ��ư�� ������ -> �� search�ϰ�� ����
			String n = textField.getText();
			
			if(item.equals("��ü")) {
				TotalgetDBSearch();//TotalgetDBSearch��� �޼ҵ带 ȣ��
			}
			else{
				NamegetDBSearch(n);
			}
		}
		
		if(st.contentEquals("running")) {
			String n = textField.getText();
			String[] a = n.split(",");
			
			if(mitem.equals("����")) {
				customer_Delete(n);
				System.out.println();
			}
			else if(mitem.equals("����")) {
				
				Insert(a[0],a[1],a[2]);
			}
			else if(mitem.equals("����")) {//����
				gangsin();
			}
		}
	}
	

	// ��� �ڷ���� ��µǰڱ� �ϴ� �޼ҵ�
	public void TotalgetDBSearch() {
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DriverManager.getConnection(url,user,pass);//db�ּҿ� �� db���̵�� ��й�ȣ
			con.setCatalog("20155137");			//db ���ѱ����ִ� ����� ���̺��� ȣ��
			stmt = con.createStatement();		
			
			ResultSet result = stmt.executeQuery("Select course.course_id,section.course_id FROM course left join section on course.course_id=section.course_id");//query���� ����
			
			String count = Area.getText();
			int c = count.length();
			Area.replaceText("",0,c);
			
			while(result.next()) {//���� ���������������� �ݺ�
				String Name = result.getString(1);
				String age = Integer.toString(result.getInt(2));
				String sex = result.getString(3);
				
				String value = "�̸� " + Name + "���� " + age + "���� " + sex + "\n";
				int index = Area.getText().length();
				Area.insertText(value,index);//���â�� ����� �߰�
				
			}
			con.close();
			stmt.close();
			
		}catch(Exception ee) {
			System.out.println(ee);
			
		}
	}
	
	//����ڰ� �Է��� �̸����� �޴� �޼ҵ�,n�� �Էµ� �̸�
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
			
			while(result.next()) {//���� ���������������� �ݺ�
				String Name = result.getString(1);
				String age = Integer.toString(result.getInt(2));
				String sex = result.getString(3);
				
				String value = "�̸� " + Name + "���� " + age + "���� " + sex + "\n";
				int index = Area.getText().length();
				Area.insertText(value,index);//���â�� ����� �߰�
				
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
	
	private void gangsin() {//����= ���̸� 1��� ����
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
