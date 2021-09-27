package test01;

import java.util.Random;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("1번");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + "\t");
		}
		System.out.println("");

		System.out.println("2번");
		int[] array2 = new int[6];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = 5 - i;
			System.out.print(array2[i] + "\t");
		}
		System.out.println("");
		System.out.println("3번");
		System.out.println("4번");
		int[] a = { 32, 23, 12, 13, 44, 46, 48, 71, 4 };
		int max = 0;
		int startIDX = -1; // endIDX = startIDX + max - 1;
		int cnt = 0; // 임시변수로 연속적으로 이어지는 짝수를 저장할 변수
		for (int i = 0; i < a.length; i++) { // 현재 i값이 짝수일 때 뒤를 확인함
			cnt = 0;
			if (a[i] % 2 == 0) { // 짝수일 경우 카운팅
				cnt++;
				for (int j = i + 1; j < a.length; j++) { // 현재 위치(i) 뒤부터 더 확인함
					if (a[j] % 2 == 0) { // 연속적으로 더 짝수가 있다면 증가. 다시 반복문으로
						cnt++;
					} else { // 홀수가 나왔다면 반복문을 실행할 필요가 없다.
						break; // 다음 숫자가 홀수가 나온다면 더 이상 진행X
					}
				}
				// j반복으로 모두 뒤를 조사한 후 판별
				if (cnt > max) {
					max = cnt;
					startIDX = i;
				}
			}
		}
		for (int i = startIDX; i < startIDX + max; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("");
		System.out.println("5번");
		cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt + "번\t");
		System.out.println("6번");
		Random r = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			if (i > lotto.length - 2) {
				System.out.print("보너스 : " + lotto[i]);
			} else {
				System.out.print(lotto[i] + "\t");
			}
		}
		System.out.println("");
		System.out.println("7번");
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = r.nextInt(45) + 1;
				}
			}
			if (i > lotto.length - 2) {
				System.out.print("보너스 : " + lotto[i]);
			} else {
				System.out.print(lotto[i] + "\t");
			}
		}
		System.out.println("");
		System.out.println("8번");
		int[] a1 = { 31, 24, 12, 13, 44, 46, 48, 71, 4 };
		int nowCount = 0;
		int maxCount = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 0) {
				nowCount++;
				if (nowCount > maxCount) {
					maxCount = nowCount;
					end = i;
					start = i - maxCount + 1;
				}
			} else {
				nowCount = 0;
			}
		}
		for (int i = start; i <= end; i++) {
			System.out.print(i + "\t");
		}
	}
}
