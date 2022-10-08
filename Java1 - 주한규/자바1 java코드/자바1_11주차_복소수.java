package 자바1프로젝트;
// 복소수 = 실수표현방식중 하나로, 3+4i 방식으로 나타낸다.
// 3 = 실수, 4i = 허수


public class 자바1_11주차_복소수 {
	double real; //실수
	double imagine;//허수

	public 자바1_11주차_복소수 add(자바1_11주차_복소수 c) {//덧셈 해주는 함수
		자바1_11주차_복소수 r = new 자바1_11주차_복소수();
		r.real = real + c.real;//실수계산
		r.imagine = imagine + c.imagine;//허수계산
		return r;
		
	}
	public 자바1_11주차_복소수 sub(자바1_11주차_복소수 c) {//뺄셈 해주는 함수
		자바1_11주차_복소수 r = new 자바1_11주차_복소수();
		r.real = real - c.real;
		r.imagine = imagine - c.imagine;
		return r;
	}

}
