package �ڹ�1������Ʈ;

public class �ڹ�1_12����_���Է¹޴°�ü {
	double x,y;
	int cnt;//������ ��ġ
	String oper;//������ ����
	String formula;
	double a;
	static int count;
	
	�ڹ�1_12����_���Է¹޴°�ü(){//������ -> ��ȯ��(int, void ��)�� ����� �Ѵ�.
		this.x = 0.0;//�� ��ü�� �ʵ尡 ����Ǵ� ����. 
		this.y = 0.0;
		this.oper = "";
		this.formula = "";
		this.a = 0.0;
	}
	
	public void setOper(int cnt,String op) {//������ ��ġ�� � ��������� 
		this.cnt = cnt;
		this.oper = op;
		count++;

		setSubstr();
	}
	
	public void setSubstr() {//�����ڸ� �����̽� �� -> �����̽� �� ���� double������ ��ȯ 
		// �ٲٰ������������.valueOf(������) -> ex) String.valueOf(x) : x�� ���������� ��ȯ 
		this.x = Double.valueOf(formula.substring(0,cnt));//������ ��ġ������ �����̽� 
		this.y = Double.valueOf(formula.substring(cnt+1,formula.length()));// ������ ��ġ +1 ���� ������ 

		setEval();
	}
	
	public void setEval() {//������ִ� �޼ҵ�
		if (oper == "+") {
			this.a = this.x + this.y;
		}
		else if (oper == "-") {
			this.a = this.x - this.y;
		}
		else if (oper == "*") {
			this.a = this.x * this.y;
		}
		else if (oper == "/") {
			this.a = this.x / this.y;
		}

	}
	
	public String getCalc() {//��� ��ȯ���ִ� �޼ҵ�
		return this.x + this.oper + this.y + "=" + this.a;
	}
	
	public static String counting() {// ������ �� ��� ���� �ƴ��� ���
		return "�� ������ " + count + " �� ����ƽ��ϴ�. ";
	}
}
