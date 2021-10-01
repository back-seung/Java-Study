package array2d;

public class test01 {
	public static void main(String[] args) {
		int[][] a = { { 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19 }, { 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29 } };
		int rowMin = 0;
		int rowMax = 3;
		int colMin = 0;
		int colMax = 4;
		int temp = 0;
		int temp2 = 0;
//		for (int i = 0; i < 4; i++) { // 입력부
//			for (int j = 1; j < 5; j++) {
//				if (i >= rowMin && j <= colMax) {
//					temp = a[rowMin][j];
//					a[rowMin][j] = a[rowMin][j - 1];
//					a[rowMin][j - 1] = temp;
//				}
//			}
//		}
//		temp = 0;
//		for (int i = 0; i < 4; i++) { // 입력부
//			for (int j = 1; j < 5; j++) {
//				if (i >= rowMax && j == colMax) {
//					temp = a[i][colMax];
//					a[i][colMax] = a[i - 1][colMax];
//					a[i - 1][colMax] = temp;
//				}
//			}
//		}
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j || j > i) {
					temp = a[i][j - 1];
					a[i][j - 1] = a[i][j];
					a[i][j] = temp;
				}
				if (i > j) {
					temp2 = a[i][j];
					a[i][j] = a[i - 1][j];
					a[i - 1][j] = temp2;
				}
			}
		}
// 출력부
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
