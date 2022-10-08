package 자바2_3week;

public class 자바2_3주차_19번_Dog extends 자바2_3주차_19번_Animal{
	private static int count;
	
	public String toString() {
		return getName() + "강아지";
	}
	public 자바2_3주차_19번_Dog()	{
		this("Anonymous");
	}
	public 자바2_3주차_19번_Dog(String dog_name)	{
		setName(dog_name);
		count++;
	}
	public void sound() {
		System.out.print(" 멍멍");		
	}
	public static int getCountDog() {
		return count;
	}
	


}
