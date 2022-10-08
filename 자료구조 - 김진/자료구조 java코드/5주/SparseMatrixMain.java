
//������ ����� ���α׷�. -> �������̶� 0���� ���ִ� �迭�� ������ �ʹ� ������ �װ� ����ȭ ���Ѽ� ǥ���ϴ� ����� ���Ѵ�.
//ù���� ����� ��, �� �׸��� �������� ���� ex) 3 3 4(3�� 3�� �����Ͱ��� 4��)
//�ι�° ��ĺ��ʹ� �������� ��ġ. ex)1 2 5(1�� 2���� 5��� �����Ͱ� ����ִ�.)

class Triple {
	int row;
	int col;
	int value;

	public Triple() { // �� ������ ������ 0���� ä��� �ֵ���.default������
		row = 0;
		col = 0;
		value = 0;
	}

	public Triple(int r, int c, int v) { //row , col , value ���ٰ� a.storeTriple �� ���� �� ����.
		//a�� ����̴� row,col,value ���� ����� ������ ������ �ִ�. �� �Է¹ް� ��� ����Ʈ ���ִ� �޼ҵ� ����
		row = r;
		col = c;
		value = v;
	}
}

class SparseMatrix {
	int Nrows, Ncols, Nterms, idx;
	Triple[] a; // ������ ���� �迭 ����

	public SparseMatrix(int rows, int cols, int terms) { // ������ ũ�� ���� �޼ҵ�	6,7,8 �� �޾ƿ�
		Nrows = rows;
		Ncols = cols;
		Nterms = terms;
		idx = 0;	
		a = new Triple[Nterms];	//������ ���� ����->8
	}

	public void displayMatrix() { // ������ ȭ�� ��� �޼ҵ�
		System.out.println("rows : " + Nrows);
		System.out.println("cols : " + Ncols);
		System.out.println("terms : " + Nterms);
		for (int i = 0; i < Nterms; i++) {	// �������� ���� ��ŭ �ݺ�. -> 8�� �ݺ�(Nterms = 8)
			System.out.println("[" + i + "]" + "    " + a[i].row + "    " + a[i].col + "    " + a[i].value);
			//i�� �������� ������ �ǹ�. ���ʷ� �Է¹޾Ƽ� a��Ŀ� ������ִ� ���� ���ʷ� �����ͼ� ������ش�.
		}
	}

	public void storeTriple(int r, int c, int v) {	// ������ ����޼ҵ�
		if (idx >= Nterms) { 						// ������ ���� ũ�� �ʰ� �˻�
			System.out.println("Error : too many terms.."); // �ʰ��� �����޼��� ���
			System.exit(-1);
		}
		a[idx++] = new Triple(r, c, v);	//idx�� ������ 8������ �������� �����߰� �ƴϸ� idx �ϳ��� ����
										//row,col,value �� ���θ޼ҵ忡�� �߰��� ������ ���� -> Triple �޼ҵ�� �ٽ� �̵�
		}

	public SparseMatrix transpose() {	//��� ���� ���� �ٲ��ִ� ���α׷�-> �̰� ���� ���� ���߿� ����

		int i, j;
		int[] RowTerms = new int[Ncols];
		int[] RowBegins = new int[Ncols];
		SparseMatrix b = new SparseMatrix(Ncols, Nrows, Nterms);	//SparseMatrix Ŭ������ b��� ��ü����
		if (Nterms > 0) {	//���� �����Ͱ��� 0���� ũ�ٸ�
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
		SparseMatrix a = new SparseMatrix(7, 6, 8); // SparseMatrixŬ���� �ȿ� �żҵ� SparseMatrix�� ȣ���ؼ� ��,��,�����Ͱ� ���ٰ� 7,6,8 ����
		SparseMatrix b;
		a.storeTriple(0, 0, 76);	// storeTriple �̶�� �޼ҵ� �̿��ؼ� ũ�� �ʰ��ϴ��� �ɷ�����
		a.storeTriple(0, 4, 13);	// ���Ұ� ���� a��� ������ ��Ŀ� ������ ����ִ´�.0��4���� 13 ����
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