package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�12��_Person {
	private String name;
	private int age;
	protected String num;
	
	�ڹ�2_5����_�����н�12��_Person() {
		this("anonymous",0);
	}

	�ڹ�2_5����_�����н�12��_Person(String n,int a) {
		this.name = n;
		this.age = a;
	}
	public String toString() {
		return "Person [name : " + this.name + ", age : " + this.age + "]";
	}

}
