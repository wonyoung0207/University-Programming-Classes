package �ڹ�2_9week;

public class Baby extends Person implements IEat{
	public Baby() {
		this("�Ʊ�");
	}
	public Baby(String name) {
		super.setName(name);
	}
	
	public void eat() {
		System.out.println(super.getName() + "�������� ������ �Խ��ϴ�.");
	}
}
