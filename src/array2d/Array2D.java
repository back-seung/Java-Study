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

//		nowInt = 10;
//		int cnt = 0;
//		System.out.println("==================4번==================");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i + j == cnt) {
//					b[i][j] = nowInt;
//					nowInt++;
//					cnt++;
//				}
//			}
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(b[i][j] + "\t");
//			}
//			System.out.println("");

		nowInt = 10;
		System.out.println("==================4번==================");

		for (int j = 0; j < 5; j++) {
			b[0][j] = nowInt;
			nowInt++;
		}
		for (int i = 1; i < 4; i++) {
			b[i][4] = nowInt;
			nowInt++;
		}
		for (int j = 3; j >= 0; j--) {
			b[3][j] = nowInt;
			nowInt++;
		}
		for (int i = 2; i > 0; i--) {
			b[i][0] = nowInt;
			nowInt++;
		}
		for (int j = 1; j < 3; j++) {
			b[1][j] = nowInt;
			nowInt++;
		}
		for (int i = 1; i < 3; i++) {
			b[i][3] = nowInt;
			nowInt++;
		}
		for (int j = 2; j > 0; j--) {
			b[2][j] = nowInt;
			nowInt++;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
