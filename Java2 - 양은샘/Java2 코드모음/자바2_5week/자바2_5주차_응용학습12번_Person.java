package 자바2_5week;

public class 자바2_5주차_응용학습12번_Person {
	private String name;
	private int age;
	protected String num;
	
	자바2_5주차_응용학습12번_Person() {
		this("anonymous",0);
	}

	자바2_5주차_응용학습12번_Person(String n,int a) {
		this.name = n;
		this.age = a;
	}
	public String toString() {
		return "Person [name : " + this.name + ", age : " + this.age + "]";
	}

}
