package 자바2_2week;

//******************************교수님 풀이*************************************
//***************************************************************************

public class 자바2_2주차_CellPhone{
	private String telNum;//멤버 변수(이 클래스 안에서만 사용할 수 있는 변수)
	private boolean power;
	static private int count;
	//static = 정적으로 만들어줌(저장 영역이 달라서 객체 공통으로 사용가능, 초기화하지 않아도 자동으로 초기화 됨)
	
	자바2_2주차_CellPhone(){//디폴트 생성자
		this("000-000-0000");//매개변수가 1개인 생성자를 호출
	}
	// "this." = 멤버변수나 메소드를 호출 , 	"this" = 생성자를 호출
	자바2_2주차_CellPhone(String tn){//생성자
		this.telNum = tn;
		this.power = true;
		count++;//정적변수로 초기화 하지 않아도 됨
	}
	
	void powerToggle() {
		this.power = !this.power;//if,else 문을 쓰지 않고도 쉽고 빠른방법으로 토글을 만들 수 있다. 
	}
	
	public String toString() {//public 을 사용해야한다. 
		//자바에 있는 약속같은것, sysout 에다가 객체를 출력하게 되면 자바랭의 toString을 호출해준다. 
		//객체를 호출하면 자바랭에서 toString 메소드 자동으로 가져와서 호출, 내가 만든 toString 있을경우는 내toStirng 호출
		return "\n toString() -> 폰번호 : " + this.telNum + " , 전원상태 : " + this.power;
	}
	
	static int getCount() {//정적변수로 접근하는 메소드도 static형식을 사용해야 한다. 
		return count;//어느 객체에서든지 호출 가능, 다른 영역에 따로 저장
	}
	
	public String getTelNum() {//접근자로, 멤버(private)로 선언된 변수들을 보기위해 사용하는 메소드
		return this.telNum;
	}
	
	public boolean getPower() {
		return this.power;
	}
	
}





//********************************** 나의 풀이 ******************************************

//
//public class 자바2_2주차_CellPhone {
//	
//	int telNum;//입력받을 전화번호
//	boolean power;//전원상태
//	private static int count = 0;//입력될 휴대폰 수 -> 접근제한자로, 이 클래스 안에서만 사용 가능 
//	
//	public String toString() {
//		return "폰 번호 : " + telNum + "    전원 상태 : " + power;
//	}
//	
//
//	자바2_2주차_CellPhone(int num){//생성자 -> 전원상태와 전화번호를 설정 
//		this.power = true;
//		this.telNum = num;
//		count++;//정적 변수로 모든 객체가 접근 가능. 
//		System.out.println(getCount());
//	}
//	
//	public static String getCount() {//접근자 -> 입력된 핸드폰 수 리턴 
//		return "현재 총 " + count + " 개의 핸드폰이 등록되었습니다. ";
//	}
//	
//	public boolean powerToggle() {//접근자 -> 전원상태 리턴
//		return this.power;
//	}
//
//}
