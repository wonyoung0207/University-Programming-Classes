package �ڹ�2_3week;

public class �ڹ�2_3����_19��_AnimalMain {

	public static void main(String[] args) {
		�ڹ�2_3����_19��_Animal[] pets = {
				new �ڹ�2_3����_19��_Cat("Nabee"),
				new �ڹ�2_3����_19��_Dog(),
				new �ڹ�2_3����_19��_Cat(),
				new �ڹ�2_3����_19��_Dog(),
				new �ڹ�2_3����_19��_Dog("Rock")
		};
		for(�ڹ�2_3����_19��_Animal ani : pets) {//������ for������, �迭�� ��츸 ��� ���� 
			//sysout���� ��ü�� �θ��� toString �� ȣ���ϵ��� �Ǿ� ���� 
			System.out.print("\n" + ani + "_" + ani.reaction(ani));
			ani.sound();
			
		}
		System.out.println("\n\npet�� �� Dog�� " + �ڹ�2_3����_19��_Dog.getCountDog() + "����\n");
	}

}
