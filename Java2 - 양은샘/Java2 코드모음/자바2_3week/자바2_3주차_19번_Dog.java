package �ڹ�2_3week;

public class �ڹ�2_3����_19��_Dog extends �ڹ�2_3����_19��_Animal{
	private static int count;
	
	public String toString() {
		return getName() + "������";
	}
	public �ڹ�2_3����_19��_Dog()	{
		this("Anonymous");
	}
	public �ڹ�2_3����_19��_Dog(String dog_name)	{
		setName(dog_name);
		count++;
	}
	public void sound() {
		System.out.print(" �۸�");		
	}
	public static int getCountDog() {
		return count;
	}
	


}
