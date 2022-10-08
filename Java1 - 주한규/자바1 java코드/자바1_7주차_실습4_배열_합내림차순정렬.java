package 자바1프로젝트;
import java.util.*;

public class 자바1_7주차_실습4_배열_합내림차순정렬 {

	public static void main(String[] args) {
		int [][] stu = {//학번,중간,기말,합
				{2015,90,80,160},
				{2016,75,60,135},
				{2017,85,100,185}
		};
		
		int size=0;
		int[][] temp = new int[100][4];
		int max;
		
		Scanner input = new Scanner(System.in);
		System.out.println("몇명을 입력하시겠습니까? -> 지금은 3 ");
		size = input.nextInt();
		
/////////////////////정렬해주는 곳//////////////////////////////
///////////////////////////////////////////////////////////
		for(int i=0; i <size; i++) {
			max = i;
			for(int j=i+1; j < size-1; j++) {
				if(stu[j][3] > stu[max][3]) {
					max = j;
				}
			}
			for(int k =0; k< size; k++) {
				for(int q=0; q<stu[k].length; q++) {
					temp[k][q] = stu[k][q];
					stu[k][q] = stu[max][q];
					stu[max][q] = temp[k][q];
				}
			}
//			temp = stu[i];
//			stu[i] = stu[max];
//			stu[max] = temp;
//			System.out.println( i +"번째 큰 배열 : " + stu[i]);
		}
		
////////////////평균 구하는 곳//////////////////////////////////
/////////////////////////////////////////////////////////
		int mid = 0;//중간점수 다 더한거
		int fin = 0;//기말점수 다 더한거
		double midavg,finavg;
		
		for(int i = 0; i < size; i++) {

			mid = mid + stu[i][1];
			fin = fin + stu[i][2];
		}
		midavg = (double)mid / size;
		finavg = (double)fin / size;
		
		
////////////////////등수 구하는곳////////////////////////////
/////////////////////////////////////////////////
		int num = 0;
		System.out.print("등수를 찾고싶은 학번을 입력하세요 : -1입력시 종료");
		num = input.nextInt();
		
		while(num > 0) {
			int rank = 0;
			for(int i = 0; i<size;i++) {
				if(stu[i][0] == num) {
					rank = i;
				}
			}
			if(stu[rank][0] == num) {
				System.out.println(num + "의 등수는 " + (rank+1) + "등 입니다.");
			}
			else {
				System.out.println("학번이 잘못 입력됐습니다. ");
			}
			System.out.print("등수를 찾고싶은 학번을 입력하세요 : -1입력시 종료");
			num = input.nextInt();
			
		}
		
		
///////////////////////전체 배열 출력///////////
////////////////////////////////////////////////
		for(int i = 0; i < size; i++) {
			System.out.print(i+"번재행 : ");
			for(int j = 0; j < stu[i].length; j++) {
				System.out.print(" "+stu[i][j]);
			}
			System.out.println("");
		}

	}

}
