package 자바2_2week;

//******************************교수님 풀이*************************************
//***************************************************************************

import java.util.*;
public class 자바2_2주차_CellPhoneTest {
	public static void main(String[] args) {
		자바2_2주차_CellPhone cp_array[] = new 자바2_2주차_CellPhone[5];//5개의 객체공간만 확보함, 객체는 생성되지 않았다.
		
		System.out.println("\n객체를 담을 cp_array 로, 배열만 생성된 상태입니다. ");
		for(int i = 0; i < cp_array.length; i++) {//객체공간만 할당된것을 보기 위한 for문
			System.out.println(cp_array[i]);//객체를 호출하게 되면 toString을 호출하게 된다. 
		}
		
		//getCount가 static(정적) 으로 선언되어 있기 때문에 객체 생성하지 않고도 호출 가능
		System.out.println("전체 폰의 개수 = " + 자바2_2주차_CellPhone.getCount());
		
		System.out.println("\n 객체를 담을 cp_array 로, 실제 객체를 저장합니다.");
		for(int i=0; i< cp_array.length; i++) {//이 for문부터 객체를 생성해준다. 
			// 객체생성할때 "" 를 뒤에 더해주는 이유는 문자로 인식하게 하기 위함이다. 
			cp_array[i] = new 자바2_2주차_CellPhone("111-111-111" + i + "");
		}//new 라는 생성자를 사용해 객체를 생성한다. 
		
		//생성된 객체들의 내용을 출력 
		for(int i = 0; i < cp_array.length; i++) {
			System.out.println(cp_array[i]);
			
		}
		
		System.out.println("전체 폰의 개수 = " + 자바2_2주차_CellPhone.getCount());
		
		cp_array[2].powerToggle();//3번째로 저장된 객체의 power를 토글시켜준다. -> power : false 로 변경
		
		System.out.println("\n cp_array[2].powerToggle 후의 전원 상태 확인하기");
		//개선된 for문 -> 무조건 배열일 경우에만 사용되며, obj라는 "자바2_2주차_CellPhone" 타입의 객체들을 처음부터 하나씩 꺼낸다.
		for(자바2_2주차_CellPhone obj : cp_array) {//바뀐 power를 확인하기 위한 개선된 for문
			System.out.println(obj);//obj가 객체형태이기 떄문에 toString 호출
			
		}
		
		Scanner input = new Scanner(System.in);
		
		do {//반복문
			System.out.println("\n전화번호를 입력하시면 전원상태를 알려드립니다. ");
			System.out.println("전화번호 입력을 종료하시려면 q를 눌러주세요");
			String pn = input.next();
			
			if (pn.charAt(0) == 'q') break;//반복문을 탈출
			
			// 조건 탈출문 3가지
			//1. continue : 조건문으로 돌아감
			//2. break : 반복문을 빠저나감
			//3. return : 호출된 함수로 돌아감
			
			boolean hasflag = false;
			for(자바2_2주차_CellPhone cp : cp_array) {
				if(cp.getTelNum().equals(pn)) {//입력값과 설정된 telNum이 같을경우 실행
					System.out.println("전원상태 = " + cp.getPower());//전원 상태를 return 해줌
					hasflag = true;
				}
			}
			
			if(!hasflag) {//hasflag가 false 즉, 앞의 for문(입력값과 설정값이 같을경우)이 실행되지 않았으면 실행 
				System.out.println("그 전화번호는 가지고 있지 않습니다.");
			}
			
		}while(true);//조건문
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}



//********************************** 나의 풀이 ******************************************


//public class 자바2_2주차_CellPhoneTest {
//
//	public static void main(String[] args) {
//		int person_tel;
//		int find_person;
//		
//		//peple이라는 "자바2_2주차_CellPhone" 클래스 형태의 배열 생성
//		자바2_2주차_CellPhone[] peple = new 자바2_2주차_CellPhone[5];
//		Scanner input = new Scanner(System.in);
//		
//		for(int i = 0; i < peple.length; i++) {//배열에 전화번호가 다른 각각의 객체 생성 
//			System.out.print("전화번호를 입력하세요. ");
//			person_tel = input.nextInt();
//			peple[i] = new 자바2_2주차_CellPhone(person_tel);
//		}
//		
//		for(int i = 0; i < peple.length; i++) {//해당 객체 불러주면 toString() 메소드 자동으로 호출 
//			System.out.println(i + "번째 사람 : " + peple[i]);
//		}
//		
//		System.out.print("찾고자 하는 전화번호를 입력해 주세요.");//찾고자 하는 번호 입력 
//		find_person = input.nextInt();
//		
//		for(int i = 0; i < peple.length; i++) {//찾고자 하는 번호 찾는 반복문 
//			if(peple[i].telNum == find_person) {
//				System.out.println(find_person + "번호의 전원 상태는 " + peple[i].powerToggle() + " 입니다. ");
//				break;//번호 찾으면 반복문 탈출 
//			}
//			System.out.println(i + "번 점프");//몇번째에 있는지 확인하기 위해 
//		
//		}
//
//	}
//
//}
