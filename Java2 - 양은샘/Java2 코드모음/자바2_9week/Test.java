package ÀÚ¹Ù2_9week;

public class Test {
	public static void main(String[] args){
		IEat objs [] = new IEat[6];
		objs[0] = new Adult("benny");
		objs[1] = new Adult();
		objs[2] = new Adult("daniel");
		objs[3] = new Baby();
		objs[4] = new Car("Sonata", 3000);
		objs[5] = new Car("Genesis", 0);

		try {
			for(IEat one : objs) {
				one.eat();
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}