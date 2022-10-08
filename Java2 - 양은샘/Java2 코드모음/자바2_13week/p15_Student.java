package ÀÚ¹Ù2_13week;

public class p15_Student {
	private String name;
	private String phone;
	
	public p15_Student() {
		this("None","None");
		
	}
	
	public p15_Student(String name,String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		return "Student[ name=" + name + ", phone=" + phone + "]";
	}

}
