package 자바1프로젝트;
// 객체는 주소를 가리키는 참조형 변수이다.

public class 자바1_9주차_Student객체 {

	public static void main(String[] args) {//메소드의 일종으로, 메소드는 반환형(void)는 꼭 있어야 한다. public과 static 은 없어도됨
		자바1_9주차_Student클래스 s1,s2,s3,s4;
		
		s1 = new 자바1_9주차_Student클래스();//s1의 객체에는 student 클래스의 필드들을 가질수 있는 메모리 공간이 할당되어 있다.
		// s1이 메모리 주소값을 가지고 있다. = 참조형이다
		s1.id = 111;
		s1.name = "첫째";
		s1.midscore = 1;
		s1.finalscore = 1;
		
		System.out.println("첫번째 학생의 정보 : " + "id:" + s1.id + "  이름:" + s1.name +
				"  중간점수:" + s1.midscore + "  기말점수:"+s1.finalscore);		

		s3 = new 자바1_9주차_Student클래스();
		s3.id = 222;
		s3.name = "둘째";
		s3.midscore = 2;
		s3.finalscore = 2;
		
		System.out.println("두번째 학생의 정보 : " + "id:" + s3.id + "  이름:" + s3.name +
				"  중간점수:" + s3.midscore + "  기말점수:"+s3.finalscore);
		
		s3 = s1;
		s3.midscore = 123;//s1의 값도 변경된다.
		
		System.out.println("변경된 첫번째 학생의 정보 : " + "id:" + s1.id + "  이름:" + s1.name +
				"  중간점수:" + s1.midscore + "  기말점수:"+s1.finalscore);
		System.out.println("변경된 두번째 학생의 정보 : " + "id:" + s3.id + "  이름:" + s3.name +
				"  중간점수:" + s3.midscore + "  기말점수:"+s3.finalscore);


	}

}
