public class MyMaze {
	static int reached=0;
	static int[][] check= new int[7][7]; 	//int�� check �迭�� ����
	static int maze[][]={					//int�� maze �迭�� ����
			{1,1,1,1,1,1,1},
			{1,0,1,0,0,0,1},
			{1,0,1,0,1,0,1},
			{1,0,0,0,1,0,1},
			{1,0,1,1,1,0,1},
			{1,0,0,0,1,0,1},
			{1,1,1,1,1,1,1}
			};
	static void back(int x, int y){
		if( reached == 1 ) return;      //�������� ���������� ó�� ���� return
	     System.out.printf("(%d,%d)\n",x,y);     // stack�� �̵���Ȳ�� ������ִ� ��¹�
	    if( x == 5 && y == 5 ){
	        reached = 1;
	        return;
	    }
	    check[x][y] = 1;        //���� ��ġ �湮 �߱⶧����, check
	    //�ڱ� �ڽ��� ȣ���ϸ鼭 ��� �ݺ��ϰԸ���,�迭 �ΰ��� ���ϸ鼭 check�� 1�� �����ִ��� Ȯ���ϴ� �迭,
	    //maze�� ����ȹ迭���� 0 ã�Ƽ� ���� �迭, �� �迭�� �������ν� �ⱸ�� ã�ư�
	    if( maze[x+1][y] == 0 && check[x+1][y] == 0 ) back(x+1,y); // �Ʒ����̵� 
	    if( maze[x-1][y] == 0 && check[x-1][y] == 0 ) back(x-1,y); // �����̵�
	    if( maze[x][y+1] == 0 && check[x][y+1] == 0 ) back(x,y+1); // ���������� �̵�
	    if( maze[x][y-1] == 0 && check[x][y-1] == 0 ) back(x,y-1); // �������� �̵�
	    check[x][y] = 0;

	}
	public static void main(String[] args){
		back(1,1);//1,1 ���� �����ϰ���.
	}
}
