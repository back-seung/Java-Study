package array2d;

public class test01 {
	public static void main(String[] args) {
		int[][] a = { { 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19 }, { 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29 } };

		int rowMin = 0; // 행의 최소값
		int rowMax = 3; // 행의 최대값
		int colMin = 0; // 열의 최소값
		int colMax = 4; // 열의 최대값
		int temp = 0; // 임시변수 temp
		for (int i = 0; i < 2; i++) { // 총 2번의 반복을 위한 반복문
			for (int j = colMax - 1; j >= colMin; j--) { // 행 변경 [0][4] ~ [0][0]까지의 값 중 마지막 값은 처음 인덱스에 저장, 나머지 오른쪽으로 1칸
															// shift
				temp = a[rowMin][j + 1];
				a[rowMin][j + 1] = a[rowMin][j];
				a[rowMin][j] = temp;
			}
			for (int k = rowMin; k <= rowMax - 1; k++) { // 열 변경 [0],[0] ~ [3][0]까지의 값 중 첫번째 값 마지막 인덱스에 저장, 나머지 위로 1칸
															// shift
				temp = a[k][colMin];
				a[k][colMin] = a[k + 1][colMin];
				a[k + 1][colMin] = temp;
			}
			for (int j = colMin; j <= colMax - 1; j++) { // 행 변경 [3][0] ~ [3][4] 까지의 값 중 첫번째 값 마지막 인덱스에 저장, 나머지 값 왼쪽으로
															// 1칸 shift
				temp = a[rowMax][j];
				a[rowMax][j] = a[rowMax][j + 1];
				a[rowMax][j + 1] = temp;
			}
			for (int k = rowMax - 1; k >= rowMin + 1; k--) { // 열 변경 [3][4] ~ [0][1] 까지의 값 중 마지막 값 첫번째 인덱스에 저장, 나머지 값
																// 아래로 1칸 shift
				temp = a[k + 1][colMax];
				a[k + 1][colMax] = a[k][colMax];
				a[k][colMax] = temp;
			}
			// 다시 반복될 배열의 범위를 좁히기 위해 row,column의 최소값은 ++ , 최대값은 --;
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
