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
		for (int i = 0; i < 2; i++) {
			for (int j = colMax - 1; j >= colMin; j--) {
				temp = a[rowMin][j + 1];
				a[rowMin][j + 1] = a[rowMin][j];
				a[rowMin][j] = temp;
			}
			for (int k = rowMin; k <= rowMax - 1; k++) {
				temp = a[k][colMin];
				a[k][colMin] = a[k + 1][colMin];
				a[k + 1][colMin] = temp;
			}
			for (int j = colMin; j <= colMax - 1; j++) {
				temp = a[rowMax][j];
				a[rowMax][j] = a[rowMax][j + 1];
				a[rowMax][j + 1] = temp;
			}
			for (int k = rowMax - 1; k >= rowMin + 1; k--) {
				temp = a[k + 1][colMax];
				a[k + 1][colMax] = a[k][colMax];
				a[k][colMax] = temp;
			}
			rowMin++;
			colMin++;
			rowMax--;
			colMax--;
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
