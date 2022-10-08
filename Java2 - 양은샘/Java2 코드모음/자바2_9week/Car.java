package 자바2_9week;

public class Car implements IEat{
	private String model;
	private int money;
	
	public Car() {
		this("아무차",0);
	}
	
	public Car(String model, int money) {
		this.model = model;
		this.money = money;
	}
	
	public void eat() throws MyException {
		if(money <= 1500) {
			System.out.print(this.model);
			throw new MyException(" 주유할 수 없습니다. ");
		}
		else {
			System.out.println(this.model + "주유할 수 있습니다.");
		}
	}

}
