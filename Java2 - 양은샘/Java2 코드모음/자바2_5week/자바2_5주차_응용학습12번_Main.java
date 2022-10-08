package 자바2_5week;

public class 자바2_5주차_응용학습12번_Main {

	public static void main(String[] args) {
		자바2_5주차_응용학습12번_Person[] p = new 자바2_5주차_응용학습12번_Person[6];
		p[0] = new 자바2_5주차_응용학습12번_Person();
		p[1] = new 자바2_5주차_응용학습12번_Person("Benny",20);
		p[2] = new 자바2_5주차_응용학습12번_Student();
		p[3] = new 자바2_5주차_응용학습12번_Student(2015,3);
		p[4] = new 자바2_5주차_응용학습12번_Stafe();
		p[5] = new 자바2_5주차_응용학습12번_Stafe(8);
		
		for(자바2_5주차_응용학습12번_Person obj : p) {
			System.out.println(obj);
		} 
	}

}
