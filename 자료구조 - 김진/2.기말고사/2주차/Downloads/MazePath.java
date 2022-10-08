
import java.util.*;
import java.util.Stack;

public class MazePath {
	private int[][] maze = { 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
			{ 1, 0, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 1, 0, 1, 1, 1, 1 }, 
			{ 1, 1, 0, 0, 0, 1, 1, 1, 1 }, 
			{ 1, 1, 1, 0, 0, 0, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 1, 1, 1 }, 
			{ 1, 1, 0, 1, 0, 0, 0, 1, 1 }, 
			{ 1, 0, 0, 0, 0, 1, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	
	private int[][] move = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // 북동남서
	private int m = maze.length - 2;
	private int n = maze[0].length - 1;

	public MazePath() {

		int mark[][] = new int[maze.length][maze[0].length];
		Stack st = new Stack();
		Stack st1 = new Stack(); // 올바른 경로 삽입할 스택
		st.push(new Mazecell(1, 1, 1)); // 초기출발위치 및 방향 설정
		while (st.isEmpty() != true) {

			Mazecell mc = (Mazecell) st.pop(); // 지나온 경로를 pop함
			while (mc.dir <= 3) {
				int nextI = mc.i + move[mc.dir][0]; // 다음 시도할 헹(i)를 설정
				int nextJ = mc.j + move[mc.dir][1]; // 다음 시도할 열(j)를 설정

				if (nextI == m && nextJ == n) { // 미로 경로 발견
					System.out.println("The path is as follows");
					st.push(new Mazecell(mc.i, mc.j, mc.dir)); // 마지막 경로 지정
					st.push(new Mazecell(nextI, nextJ, 0)); // 마지막 지점 지정
					while (st.isEmpty() != true) {
						st1.push((Mazecell) st.pop());
						// mc =(Mazecell)st.pop(); // 올바른 경로 출력
						// maze[mc.i][mc.j] = 9;
						// System.out.println(mc);

					}
					while (st1.isEmpty() != true) {
						mc = (Mazecell) st1.pop();
						System.out.println(mc);
						maze[mc.i][mc.j] = 2;

					}
					displayMaze(); // 경로 확인 완료 후 출력
					return;

				}

				// 이동가능 & 시도해보지 않은 우치ㅣ
				if (maze[nextI][nextJ] == 0 && mark[nextI][nextJ] == 0) {

					mark[nextI][nextJ] = 1;
					st.push(new Mazecell(mc.i, mc.j, mc.dir)); // 지나온 경로를 스택에 push
					// mc = new Mazecell(nextI, nextJ, 0); // 새로운 위치와 방향 설정 방향은 초기화

					mc.i = nextI;
					mc.j = nextJ;
					mc.dir = 0;

				} else {

					mc.dir++;
				}

			}

		}

		System.out.println("There is no path");

	}

	public void displayMaze() {

		String[] str = { "☆", "★", "☞" };
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(str[(maze[i][j])]);

			}
			System.out.println("");

		}

	}

	public static void main(String args[]) {

		new MazePath();

	}

}
