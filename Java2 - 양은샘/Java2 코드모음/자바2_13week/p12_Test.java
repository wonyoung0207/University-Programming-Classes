package �ڹ�2_13week;

import java.util.List;

public class p12_Test {

	public static void main(String[] args) {
		p12_RandList<String> rlist = new p12_RandList<String>();
		
		String[] sample = {"I","love","the","coffee."};
		for(int i=0; i<sample.length; i++) {
			rlist.add(sample[i]);
		}
		
		System.out.println("===== ��ü ������ =====");
		List<String> alldata = rlist.<String>getlist();
		for(String str : alldata) {
			System.out.println(str);
		}
		
		System.out.println("====== �����ϰ� ���õ� ������ =====");
		for(int i=0; i<5;i++) {
			System.out.println(i + ") " + rlist.<String>select());
		}
		
	}

}
