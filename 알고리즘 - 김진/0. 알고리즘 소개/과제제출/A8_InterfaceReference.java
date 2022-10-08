package 알고리즘_1week;

public class A8_InterfaceReference {
	public static void main(String args[]) {
		A8_A memo = new A8_C1();
		memo.display("안녕하세요");
		
		memo = new A8_C2();
		memo.display("안녕하세요");
		
		memo = new A8_C3();
		memo.display("안녕하세요");
		
	}

}
