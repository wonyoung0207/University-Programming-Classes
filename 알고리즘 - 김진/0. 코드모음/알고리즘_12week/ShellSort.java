package 알고리즘_12week;


public class ShellSort {
	
	public void shellSort(int []array)
	{
		int interval = array.length; //배열의 길이를 분기로 나누기위한 interval 변수 선언 및 초기화
		while(interval>1)//배열의 길이가 2이상일때
		{
			interval = 1+interval/3;//배열을 세개로 나눔
			for(int i=0; i<interval; i++)
			{
				intervalSort(array,i,interval);//각 분기별로 삽입정렬 시작
			}
		}
	}
	
	public void intervalSort(int []a,int i,int interval)
	{
		//서브리스트를 삽입 정렬로 정렬하는 shellSort()의 보조함수 
		int j = i+interval; //
		while(j< a.length)
		{
			int n = a[j]; //서브리스트의 새로운 원소
			int k = j; //n보다 큰 원소는 interval만큼 오른편으로 이동
			boolean move = true; 
			while(move)
			{
				if(a[k-interval]<=n)
					move = false;
				else
				{
					a[k]=a[k-interval];
					k=k-interval;
					if(k==i) 
						move = false; 
				}
			}
			a[k]=n;//이동해서 생긴 자리에 삽입
			j=j+interval;//다음 서브리스트 원소의 인덱스
		}
	}
}
