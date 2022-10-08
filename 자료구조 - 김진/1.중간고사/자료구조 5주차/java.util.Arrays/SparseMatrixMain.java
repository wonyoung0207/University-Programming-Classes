/**
 * 
 * @author KimJin
 *
 */
class Triple {
	int row;
	int col;
	int value;

	public Triple() { // default������
		row = 0;
		col = 0;
		value = 0;
	}

	public Triple(int r, int c, int v) { // ���ڰ�3���� ������ r c v �� �ʱ�ȭ
		row = r;
		col = c;
		value = v;
	}
}

class SparseMatrix {
	int Nrows, Ncols, Nterms, idx;
	Triple[] a; // ������ ���� �迭 ����

	public SparseMatrix(int rows, int cols, int terms) { // ������ ũ�� ���� �޼ҵ�
		Nrows = rows;
		Ncols = cols;
		Nterms = terms;
		idx = 0;
		a = new Triple[Nterms];
	}

	public void displayMatrix() { // ������ ȭ�� ��� �޼ҵ�
		System.out.println("rows : " + Nrows);
		System.out.println("cols : " + Ncols);
		System.out.println("terms : " + Nterms);
		for (int i = 0; i < Nterms; i++) {
			System.out.println("[" + i + "]" + "    " + a[i].row + "    " + a[i].col + "    " + a[i].value);
		}
	}

	public void storeTriple(int r, int c, int v) { // ������ ����޼ҵ�
		if (idx >= Nterms) { // ũ�� �ʰ� �˻�
			System.out.println("Error : too many terms.."); // �ʰ��� �����޼��� ���
			System.exit(-1);
		}
		a[idx++] = new Triple(r, c, v);
	}

	public SparseMatrix transpose() {

		int i, j;
		int[] RowTerms = new int[Ncols];
		int[] RowBegins = new int[Ncols];
		SparseMatrix b = new SparseMatrix(Ncols, Nrows, Nterms);
		if (Nterms > 0) {
			for (i = 0; i < Ncols; i++)
				RowTerms[i] = 0;
			for (i = 0; i < Nterms; i++)
				RowTerms[a[i].col]++;
			RowBegins[0] = 0;
			for (i = 1; i < Ncols; i++)
				RowBegins[i] = RowBegins[i - 1] + RowTerms[i - 1];
			for (i = 0; i < Nterms; i++) {
				j = RowBegins[a[i].col]++;
				b.a[j] = new Triple(a[i].col, a[i].row, a[i].value);
			}
		}
		return b;

	}
}

public class SparseMatrixMain {
	public static void main(String[] args) {
		SparseMatrix a = new SparseMatrix(7, 6, 8); // ������a ����
		SparseMatrix b;
		a.storeTriple(0, 0, 76); // ���Ұ� ����
		a.storeTriple(0, 4, 13);
		a.storeTriple(2, 5, 13);
		a.storeTriple(3, 1, 25);
		a.storeTriple(4, 0, -19);
		a.storeTriple(4, 3, 56);
		a.storeTriple(5, 5, 13);
		a.storeTriple(6, 2, 3);

		a.displayMatrix(); // ������a ���
		b= a.transpose();
		b.displayMatrix();
	}
}