package �ڹ�2_9week;

public class Adult extends Person implements IEat{
	public Adult() {
		this("anonymous");
	}
	public Adult(String name) {
		super.setName(name);
	}
	
	public void eat() {
		System.out.println(super.getName() + "�Ļ縦 �մϴ�. ");
	}

}
