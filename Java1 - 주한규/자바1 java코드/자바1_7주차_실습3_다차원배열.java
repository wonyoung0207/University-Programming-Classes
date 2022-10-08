package 자바1프로젝트;
//2차원 배열 출력해보기


public class 자바1_7주차_실습3_다차원배열 {

	public static void main(String[] args) {
		int [][] s = {
				{10,20,30,40},
				{50,60,70,80},
				{80,100,110,120}
		};
		System.out.println("행 길이: 총 " + s.length + "행");
		System.out.println("1행의 열 길이: " + s[1].length);
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j <s[i].length; j++) {
				System.out.println(i + "행" + j + "열 : " + s[i][j]);
			}
		}
		
	}

}
