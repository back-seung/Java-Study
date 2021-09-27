package test01;

public class Test02 {

	public static void main(String[] args) {
		int[] saveInt = new int[10];
		// 배열 범위 : 0~9, 배열 길이 : 10 배열 자료형 : int
		// 배열의 길이가 고정인 것의 장/단점 ?
		// 장점 : access 속도가 좋다.
		// 단점 : 미리 크기를 할당하기 때문에 사용하지 않는 인덱스가 많다면 메모리 공간이 낭비될 수 있다.

		// saveInt 에 0~9의 숫자를 차례대로 대입하자.
		for (int i = 0; i < saveInt.length; i++) {
			saveInt[i] = 9 - i;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(saveInt[i] + "\t");
		}
	}
}
