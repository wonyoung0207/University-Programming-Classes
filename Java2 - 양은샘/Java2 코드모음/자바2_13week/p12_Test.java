package 자바2_13week;

import java.util.List;

public class p12_Test {

	public static void main(String[] args) {
		p12_RandList<String> rlist = new p12_RandList<String>();
		
		String[] sample = {"I","love","the","coffee."};
		for(int i=0; i<sample.length; i++) {
			rlist.add(sample[i]);
		}
		
		System.out.println("===== 전체 데이터 =====");
		List<String> alldata = rlist.<String>getlist();
		for(String str : alldata) {
			System.out.println(str);
		}
		
		System.out.println("====== 랜덤하게 선택된 데이터 =====");
		for(int i=0; i<5;i++) {
			System.out.println(i + ") " + rlist.<String>select());
		}
		
	}

}
