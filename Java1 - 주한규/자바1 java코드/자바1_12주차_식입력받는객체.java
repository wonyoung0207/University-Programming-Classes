package 자바1프로젝트;

public class 자바1_12주차_식입력받는객체 {
	double x,y;
	int cnt;//연산자 위치
	String oper;//연산자 종류
	String formula;
	double a;
	static int count;
	
	자바1_12주차_식입력받는객체(){//생성자 -> 반환형(int, void 등)이 없어야 한다.
		this.x = 0.0;//각 객체의 필드가 변경되는 것임. 
		this.y = 0.0;
		this.oper = "";
		this.formula = "";
		this.a = 0.0;
	}
	
	public void setOper(int cnt,String op) {//연산자 위치와 어떤 언산자인지 
		this.cnt = cnt;
		this.oper = op;
		count++;

		setSubstr();
	}
	
	public void setSubstr() {//연산자를 슬라이스 함 -> 슬라이스 한 값을 double형으로 변환 
		// 바꾸고싶은데이터형.valueOf(데이터) -> ex) String.valueOf(x) : x를 문자형으로 변환 
		this.x = Double.valueOf(formula.substring(0,cnt));//연산자 위치전까지 슬라이스 
		this.y = Double.valueOf(formula.substring(cnt+1,formula.length()));// 연산자 위치 +1 부터 끝가지 

		setEval();
	}
	
	public void setEval() {//계산해주는 메소드
		if (oper == "+") {
			this.a = this.x + this.y;
		}
		else if (oper == "-") {
			this.a = this.x - this.y;
		}
		else if (oper == "*") {
			this.a = this.x * this.y;
		}
		else if (oper == "/") {
			this.a = this.x / this.y;
		}

	}
	
	public String getCalc() {//결과 반환해주는 메소드
		return this.x + this.oper + this.y + "=" + this.a;
	}
	
	public static String counting() {// 연산이 총 몇번 수행 됐는지 출력
		return "총 연산은 " + count + " 번 수행됐습니다. ";
	}
}
