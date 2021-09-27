package test01;

public class Test03 {

	public static void main(String[] args) {
		int[] point = { 10, 20, 30, 40, 50 };
		// 선언 : 자료형 : int, 변수명 : point, 사이즈: 5, 인덱스: 0~4, 초기값 : 10,20,30,40,50
		int[] point1 = new int[5];
		// 선언 : 자료형 : int, 변수명 : point1, 사이즈: 5, 인덱스: 0~4, 초기값 : 없는 경우 0
		for (int i = 0; i < point.length; i++) {
			System.out.print(point[i] + "\t");
		}
	}
}
