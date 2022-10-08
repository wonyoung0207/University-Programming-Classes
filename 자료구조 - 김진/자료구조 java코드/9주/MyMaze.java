public class MyMaze {
	static int reached=0;
	static int[][] check= new int[7][7]; 	//int형 check 배열을 생성
	static int maze[][]={					//int형 maze 배열을 생성
			{1,1,1,1,1,1,1},
			{1,0,1,0,0,0,1},
			{1,0,1,0,1,0,1},
			{1,0,0,0,1,0,1},
			{1,0,1,1,1,0,1},
			{1,0,0,0,1,0,1},
			{1,1,1,1,1,1,1}
			};
	static void back(int x, int y){
		if( reached == 1 ) return;      //목적지에 도착했으면 처리 없이 return
	     System.out.printf("(%d,%d)\n",x,y);     // stack의 이동상황을 출력해주는 출력문
	    if( x == 5 && y == 5 ){
	        reached = 1;
	        return;
	    }
	    check[x][y] = 1;        //현재 위치 방문 했기때문에, check
	    //자기 자신을 호출하면서 계속 반복하게만듬,배열 두개를 비교하면서 check는 1로 막혀있는지 확인하는 배열,
	    //maze는 저장된배열에서 0 찾아서 가는 배열, 두 배열을 비교함으로써 출구를 찾아감
	    if( maze[x+1][y] == 0 && check[x+1][y] == 0 ) back(x+1,y); // 아래로이동 
	    if( maze[x-1][y] == 0 && check[x-1][y] == 0 ) back(x-1,y); // 위로이동
	    if( maze[x][y+1] == 0 && check[x][y+1] == 0 ) back(x,y+1); // 오른쪽으로 이동
	    if( maze[x][y-1] == 0 && check[x][y-1] == 0 ) back(x,y-1); // 왼쪽으로 이동
	    check[x][y] = 0;

	}
	public static void main(String[] args){
		back(1,1);//1,1 부터 시작하게함.
	}
}
