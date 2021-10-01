package array2d;

public class Array2D {
	public static void main(String[] args) {
		// int[] a = { 10, 11, 12, 13, 14 };
		// int[][] b = { { 10, 11, 12, 13, 14 }, { 20, 21, 22, 23, 24 }, { 30, 31, 32,
		// 33, 34 } };

		// 2차원 배열 b의 [][] >> [행][열]을 의미함

		// a[0] >> 10
		// b[0] >> {10,11,12,13,14}
		// a[1] >> 11
		// b[1] >> {20,21,22,23,24}
		// a[5] >> ArrayIndexOutOfBounds
		// b[2] >> {30,31,32,33,34}
		// b[3] >> ArrayIndexOutOfBounds

		int[][] b = new int[4][5];
		int nowInt = 10;

		// 실습 1
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j >= 0; j--) {
				b[i][j] = nowInt;
				nowInt++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
		nowInt = 10;
		System.out.println("==================================================");
		// 실습 2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				b[j][i] = nowInt;
				nowInt++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
		nowInt = 10;

		System.out.println("==================2번==================");
		for (int i = 3; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				b[i][j] = nowInt;
				nowInt++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
		nowInt = 10;
		System.out.println("==================3번==================");
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					b[i][j] = nowInt;
					nowInt++;
				}
			} else {
				for (int k = 4; k >= 0; k--) {
					b[i][k] = nowInt;
					nowInt++;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
		nowInt = 10;
		System.out.println("==================4번==================");
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
		nowInt = 10;
		int range = 0;
		System.out.println("==================5번==================");
		for (int i = 0; i < 8; i++) {
			for (int j = i; j >= 0; j--) {
				range = i - j;
				if (range > 3 || j > 4) {

				} else {
					b[range][j] = nowInt;
					nowInt++;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
