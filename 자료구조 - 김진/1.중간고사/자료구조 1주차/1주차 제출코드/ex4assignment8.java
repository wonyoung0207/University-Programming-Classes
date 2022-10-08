public class ex4assignment8 {

	public static void main(String[] args) {

		assignment8 a; // 인터페이스형 참조변수
		a = new ex1assignment8();
		a.display("안녕하세요?");
		a = new ex2assignment8();
		a.display("알기 쉽게 설명한 자바");
		a = new ex3assignment8();
		a.display("자바를 자바봅시다");
	}

}
