package 자바2_3week;

public class 자바2_3주차_19번_AnimalMain {

	public static void main(String[] args) {
		자바2_3주차_19번_Animal[] pets = {
				new 자바2_3주차_19번_Cat("Nabee"),
				new 자바2_3주차_19번_Dog(),
				new 자바2_3주차_19번_Cat(),
				new 자바2_3주차_19번_Dog(),
				new 자바2_3주차_19번_Dog("Rock")
		};
		for(자바2_3주차_19번_Animal ani : pets) {//개선된 for문으로, 배열일 경우만 사용 가능 
			//sysout에서 객체를 부르면 toString 을 호출하도록 되어 있음 
			System.out.print("\n" + ani + "_" + ani.reaction(ani));
			ani.sound();
			
		}
		System.out.println("\n\npet들 중 Dog는 " + 자바2_3주차_19번_Dog.getCountDog() + "마리\n");
	}

}
