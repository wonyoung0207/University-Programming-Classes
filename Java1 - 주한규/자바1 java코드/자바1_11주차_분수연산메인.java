package 자바1프로젝트;
//분수연산 진행

public class 자바1_11주차_분수연산메인 {

	public static void main(String[] args) {
		자바1_11주차_분수연산 bun1 = new 자바1_11주차_분수연산();
		자바1_11주차_분수연산 bun2= new 자바1_11주차_분수연산();
		자바1_11주차_분수연산 bun3 = new 자바1_11주차_분수연산();
		자바1_11주차_분수연산 bun4 = new 자바1_11주차_분수연산();
		자바1_11주차_분수연산 bun5 = new 자바1_11주차_분수연산();
		자바1_11주차_분수연산 bun6 = new 자바1_11주차_분수연산();
		자바1_11주차_분수연산 bun7 = new 자바1_11주차_분수연산();
		
		bun1.bunja = 1;
		bun1.bunmo = 2;
		
		bun2.bunja = 2;
		bun2.bunmo = 3;
		
		bun3 = bun1.add(bun2);
		System.out.println("분자 = "+bun3.bunja + " 분모 = " + bun3.bunmo);

		bun3.bunja = 4;
		bun3.bunmo = 8;
		bun3 = bun3.reduce();
		
		System.out.println("분자 = "+bun3.bunja + " 분모 = " + bun3.bunmo);
		
		
		bun4.bunja = 6;
		bun4.bunmo = 8;
		bun5 = bun4.simplify(bun4);//reduce의 다른방법 ,최대공약수 구해서 바로 나눠줌 -> 결과를 객체로 돌려줌
		System.out.println("분자 = "+bun5.bunja + " 분모 = " + bun5.bunmo);
		
		//두개의 분수가 같은지 판별
		bun6.bunja = 6;
		bun6.bunmo = 8;
		bun7.bunja = 3;
		bun7.bunmo = 4;
		String equal = "";

		if(bun6.equals(bun7) == true) {
			equal = "같다";
		}
		else {
			equal = "다르다";
		}
		System.out.println("두 분수는 '" + equal + "' 입니다. ");
		
		System.out.println(bun1.test());
		
	}

}
