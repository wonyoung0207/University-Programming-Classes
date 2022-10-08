package 자바1프로젝트;

// 기초형(기본형) < - > 참조형
//기초형 = int, dubble , float, char, long, short, byte, boolean => 총 8개 
//기초형은 자기 자신이 값을 가진다. 

//참조형 = 배열
//참조형은 자신이 값을 가지는게 아니라 배열의 주소를 가지고 있다.


import java.util.*;
//import java.util.Arrays;

public class 자바1_7주차_실습1 {
	public static void main (String[] args){//평균 구하는 메소드 -> 더 유용하게 이용할 수 있어서
		
		int[] x = {1,2,3,4};//x를 바꿔주면 y도 바뀐다 -> 배열은 하나만들어져있고, 그 배열을 가리키는게 x,y이기때문
		int[]y = x;
		x[1] = 20;
		
		int[] test = {1,2,3,4};
		//배열의 복사
		int[] z = Arrays.copyOf(test,test.length);//새 배열 생성
		test[2] = test[2] + 10;//x가 안바뀜
		
		
		System.out.println(y[1]);//x를 바꾸면 y도 바뀐다. -> 배열의 주소가 같기 때문
		System.out.println(z[2]);//test값만 바뀌고 z값은 바뀌지 않았다.

		
	}

}
