package 자바1프로젝트;
// this = 현재 객체를 나타낸다. 

public class 자바1_12주차_this이용 {
	private int x,y;
	private int width,height;
	
	자바1_12주차_this이용(){//생성자 = 클래스 이름과 같은 메소드
		this(0,0,1,1);//현재 클래스의 매개변수가 4개인 생성자 호출
	}

	자바1_12주차_this이용(int width, int height){//생성자 = 클래스 이름과 같은 메소드
		this(0,0,width,height);//this를 이용한 현재 클래스의 다른 생성자 호출
	}//현재 클래스의 매개변수가 4개인 생성자 호출

	자바1_12주차_this이용(int x, int y, int width, int height){//생성자 = 클래스 이름과 같은 메소드
		this.x = x;//현재 x값에 매개변수 x를 넣어준다 
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
}
