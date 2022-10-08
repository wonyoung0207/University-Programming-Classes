package �ڹ�2_9week;

public class Car implements IEat{
	private String model;
	private int money;
	
	public Car() {
		this("�ƹ���",0);
	}
	
	public Car(String model, int money) {
		this.model = model;
		this.money = money;
	}
	
	public void eat() throws MyException {
		if(money <= 1500) {
			System.out.print(this.model);
			throw new MyException(" ������ �� �����ϴ�. ");
		}
		else {
			System.out.println(this.model + "������ �� �ֽ��ϴ�.");
		}
	}

}
