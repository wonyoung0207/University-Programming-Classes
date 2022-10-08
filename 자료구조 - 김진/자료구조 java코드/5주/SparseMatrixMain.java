
//희소행렬 만드는 프로그램. -> 희소행렬이란 0으로 차있는 배열의 공간이 너무 넓으니 그걸 간소화 시켜서 표현하는 행렬을 뜻한다.
//첫행은 행렬의 행, 열 그리고 데이터의 갯수 ex) 3 3 4(3행 3열 데이터갯수 4개)
//두번째 행렬부터는 데이터의 위치. ex)1 2 5(1행 2열에 5라는 데이터가 들어있다.)

class Triple {
	int row;
	int col;
	int value;

	public Triple() { // 빈 공간이 있으면 0으로 채울수 있도록.default생성자
		row = 0;
		col = 0;
		value = 0;
	}

	public Triple(int r, int c, int v) { //row , col , value 에다가 a.storeTriple 로 받은 값 대입.
		//a는 행렬이니 row,col,value 값을 행렬의 값으로 가지고 있다. 다 입력받고 행렬 프린트 해주는 메소드 실행
		row = r;
		col = c;
		value = v;
	}
}

class SparseMatrix {
	int Nrows, Ncols, Nterms, idx;
	Triple[] a; // 희소행렬 구현 배열 선언

	public SparseMatrix(int rows, int cols, int terms) { // 희소행렬 크기 지정 메소드	6,7,8 값 받아옴
		Nrows = rows;
		Ncols = cols;
		Nterms = terms;
		idx = 0;	
		a = new Triple[Nterms];	//데이터 갯수 저장->8
	}

	public void displayMatrix() { // 희소행렬 화면 출력 메소드
		System.out.println("rows : " + Nrows);
		System.out.println("cols : " + Ncols);
		System.out.println("terms : " + Nterms);
		for (int i = 0; i < Nterms; i++) {	// 데이터의 갯수 만큼 반복. -> 8번 반복(Nterms = 8)
			System.out.println("[" + i + "]" + "    " + a[i].row + "    " + a[i].col + "    " + a[i].value);
			//i는 데이터의 갯수를 의미. 차례로 입력받아서 a행렬에 저장되있는 값을 차례로 가져와서 출력해준다.
		}
	}

	public void storeTriple(int r, int c, int v) {	// 희소행렬 저장메소드
		if (idx >= Nterms) { 						// 데이터 갯수 크기 초과 검사
			System.out.println("Error : too many terms.."); // 초과시 에러메세지 출력
			System.exit(-1);
		}
		a[idx++] = new Triple(r, c, v);	//idx의 갯수가 8개보다 많아지면 에러뜨고 아니면 idx 하나씩 증가
										//row,col,value 를 메인메소드에서 추가한 값들을 대입 -> Triple 메소드로 다시 이동
		}

	public SparseMatrix transpose() {	//행과 열의 값을 바꿔주는 프로그램-> 이건 나중 제일 나중에 쓰임

		int i, j;
		int[] RowTerms = new int[Ncols];
		int[] RowBegins = new int[Ncols];
		SparseMatrix b = new SparseMatrix(Ncols, Nrows, Nterms);	//SparseMatrix 클래스에 b라는 객체생성
		if (Nterms > 0) {	//만약 데이터값이 0보다 크다면
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
		SparseMatrix a = new SparseMatrix(7, 6, 8); // SparseMatrix클래스 안에 매소드 SparseMatrix를 호출해서 행,열,데이터값 에다가 7,6,8 대입
		SparseMatrix b;
		a.storeTriple(0, 0, 76);	// storeTriple 이라는 메소드 이용해서 크기 초과하는지 걸러낸다
		a.storeTriple(0, 4, 13);	// 원소값 저장 a라는 다차원 행렬에 데이터 집어넣는다.0행4열에 13 대입
		a.storeTriple(2, 5, 13);
		a.storeTriple(3, 1, 25);
		a.storeTriple(4, 0, -19);
		a.storeTriple(4, 3, 56);
		a.storeTriple(5, 5, 13);
		a.storeTriple(6, 2, 3);

		a.displayMatrix(); // 희소행렬a 출력
		b= a.transpose();
		b.displayMatrix();
	}
}