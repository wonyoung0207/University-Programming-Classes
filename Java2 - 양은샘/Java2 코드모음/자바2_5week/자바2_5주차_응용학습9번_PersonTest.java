package 자바2_5week;

public class 자바2_5주차_응용학습9번_PersonTest {
	
	public static 자바2_5주차_응용학습9번_Person getMaximum(자바2_5주차_응용학습9번_Person[] arr) {
		자바2_5주차_응용학습9번_Person max = arr[0];
		//비교를 위해 max라는 persom객체를 하나 만들고 0번째 배열을 넣어준다.  
		//0번째와 그 다음번을  compareTo 메소드를 이용해 비교해서 큰 객체를 max에다가 넣어준다. 
		for(int i=1;i<arr.length;i++) {
			if(max.compareTo(arr[i]) == -1) {
				max = arr[i];
			}
		}	
		return max;
	}

	public static void main(String[] args) {
		자바2_5주차_응용학습9번_Person[] p = new 자바2_5주차_응용학습9번_Person[3];
		
		p[0] = new 자바2_5주차_응용학습9번_Person("Benny",180);
		p[1] = new 자바2_5주차_응용학습9번_Person("Daniel",178);
		p[2] = new 자바2_5주차_응용학습9번_Person("Joon",188);
		
		for(자바2_5주차_응용학습9번_Person obj : p) {
			System.out.println(obj);//각각의 toString 메소드가 호출됨
		}

		System.out.println("가장 큰 키 : " + getMaximum(p));
		//getMaximum의 return 값이 person 객체형이라 
		//toString 이 자동적으로 불려진다. 

	}

}
