package 자바2_3week;

public class 자바2_3주차_18번_FamilyExample {

	public static void main(String[] args) {
		
		자바2_3주차_18번_Family family = new 자바2_3주차_18번_Family();
		
		family.operation();
		System.out.println();
		
		System.out.println(family.change("boy", "applephone") + "\n");
		System.out.println(family.change("girl", "andphone") + "\n");
		
		family.operation();
		System.out.println();

	}

}
