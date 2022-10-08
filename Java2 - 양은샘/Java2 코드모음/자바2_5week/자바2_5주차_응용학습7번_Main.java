package 자바2_5week;

public class 자바2_5주차_응용학습7번_Main {
	public static void main(String[] args) {
		자바2_5주차_응용학습7번_IDrawable[] id = new 자바2_5주차_응용학습7번_IDrawable[4];
		//배열에 IDrawable 형태가 들어올수 있는 공간배열 4자리를 생성
		
		// 공간에 객체를 생성 -> IDrawable 형태로 선언해놓으면 ,
		//Shape,Rectangle,Triangle,Circle 모두 다 멥핑 가능 
		id[0] = new 자바2_5주차_응용학습7번_Shape();
		id[1] = new 자바2_5주차_응용학습7번_Rectangle();
		id[2] = new 자바2_5주차_응용학습7번_Triangle();
		id[3] = new 자바2_5주차_응용학습7번_Circle();
		
		for(자바2_5주차_응용학습7번_IDrawable obj : id) {
			obj.draw();
		}

	}

}
