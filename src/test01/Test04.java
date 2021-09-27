package test01;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {

		Random r = new Random(); // Ctrl + Shift + o => 클래스 import
		// 랜덤한 수를 뽑기 위햇 자바에서 제공되는 기능을 사용할 것이다.
		// 선언부
		int lotto[] = new int[6];

		// 입력부
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		// 출력부
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

}
