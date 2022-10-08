
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

	
	private int[][] move = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // �ϵ�����
	private int m = maze.length - 2;
	private int n = maze[0].length - 1;

	public MazePath() {

		int mark[][] = new int[maze.length][maze[0].length];
		Stack st = new Stack();
		Stack st1 = new Stack(); // �ùٸ� ��� ������ ����
		st.push(new Mazecell(1, 1, 1)); // �ʱ������ġ �� ���� ����
		while (st.isEmpty() != true) {

			Mazecell mc = (Mazecell) st.pop(); // ������ ��θ� pop��
			while (mc.dir <= 3) {
				int nextI = mc.i + move[mc.dir][0]; // ���� �õ��� ��(i)�� ����
				int nextJ = mc.j + move[mc.dir][1]; // ���� �õ��� ��(j)�� ����

				if (nextI == m && nextJ == n) { // �̷� ��� �߰�
					System.out.println("The path is as follows");
					st.push(new Mazecell(mc.i, mc.j, mc.dir)); // ������ ��� ����
					st.push(new Mazecell(nextI, nextJ, 0)); // ������ ���� ����
					while (st.isEmpty() != true) {
						st1.push((Mazecell) st.pop());
						// mc =(Mazecell)st.pop(); // �ùٸ� ��� ���
						// maze[mc.i][mc.j] = 9;
						// System.out.println(mc);

					}
					while (st1.isEmpty() != true) {
						mc = (Mazecell) st1.pop();
						System.out.println(mc);
						maze[mc.i][mc.j] = 2;

					}
					displayMaze(); // ��� Ȯ�� �Ϸ� �� ���
					return;

				}

				// �̵����� & �õ��غ��� ���� ��ġ��
				if (maze[nextI][nextJ] == 0 && mark[nextI][nextJ] == 0) {

					mark[nextI][nextJ] = 1;
					st.push(new Mazecell(mc.i, mc.j, mc.dir)); // ������ ��θ� ���ÿ� push
					// mc = new Mazecell(nextI, nextJ, 0); // ���ο� ��ġ�� ���� ���� ������ �ʱ�ȭ

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

		String[] str = { "��", "��", "��" };
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
