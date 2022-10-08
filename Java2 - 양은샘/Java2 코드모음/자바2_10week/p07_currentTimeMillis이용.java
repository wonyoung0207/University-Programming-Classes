package 자바2_10week;
//점을 찍는데 걸리는 시간 
public class p07_currentTimeMillis이용 {

	public static void main(String[] args) {
		System.out.println("args[0] = " + args[0]);
		
		long start = System.currentTimeMillis();
		System.out.println("start = " + start);
		
		for(int i=0; i<Integer.parseInt(args[0]); i++) {
			System.out.print(".");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("\nend = "+end);
		
		System.out.println(args[0] + "번 점을 출력하는 시간 = " + (end-start) + " milli sec");
	}

}
