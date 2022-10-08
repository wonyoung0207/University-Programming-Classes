package 자바2_9week;

public class Baby extends Person implements IEat{
	public Baby() {
		this("아기");
	}
	public Baby(String name) {
		super.setName(name);
	}
	
	public void eat() {
		System.out.println(super.getName() + "젖병으로 우유를 먹습니다.");
	}
}
