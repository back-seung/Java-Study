package array2d;

public class Array2dExam {

	public static void main(String[] args) {
		int[][] b = new int[4][5];
		int nowInt = 10;
		int rowMin = 0; // 행의 최소값
		int rowMax = 4; // 행의 최대값
		int colMin = 0; // 열의 최소값
		int colMax = 5; // 열의 최대값

		for (int j = 0; j < 2; j++) { // 반복문 #1~4 를 총 2번 반복.
			for (int i = colMin; i < colMax; i++) { // #1 열의 변경

				b[rowMin][i] = nowInt;
				nowInt++;
			}
			rowMin++;
			// [0,0] ~ [0,5] 까지 수행
			// 현재 값 : 1 (rowMIn) / 4(rowMax) : 0(colMin) / 5(colMax)
			for (int i = rowMin; i < rowMax; i++) { // #2 행의 변경
				b[i][colMax - 1] = nowInt;
				nowInt++;
			}
			colMax--;
			// 현재 값 : 1 (rowMIn) / 4(rowMax) : 0(colMin) / 4(colMax)
			for (int i = colMax - 1; i >= colMin; i--) { // #3 열의 변경
				b[rowMax - 1][i] = nowInt;
				nowInt++;
			}
			rowMax--;
			// 현재 값 : 1 (rowMIn) / 3(rowMax) : 0(colMin) / 4(colMax)
			for (int i = rowMax - 1; i >= rowMin; i--) { // #4 행의 변경
				b[i][colMin] = nowInt;
				nowInt++;
			}
			colMin++;
			// 현재 값 : 1 (rowMIn) / 3(rowMax) : 1(colMin) / 4(colMax)
		}
		// 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
