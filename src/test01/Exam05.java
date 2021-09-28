package test01;

public class Exam05 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 3, 4, 5, 6, 2, 2, 4, 4, 3, 2, 1 };
		int nowInt = -1;
		int cnt = 0;
		/*
		 * 1. 기준숫자를 순서대로 출력, 이 숫자는 현재 숫자로부터 증가 되는지 판단하는 기준이 된다. 
		 * 2. 기준숫자로부터 다음 숫자와 비교하는반복문, 이때 cnt 숫자는 증가된다. 
		 * 3. cnt가 3이상인지 판단하는 부문
		 */
		for (int i = 0; i < a.length; i++) {
			cnt = 1;
			nowInt = a[i];
			for (int j = i + 1; j < a.length; j++) {
				nowInt++;
				if (nowInt == a[j]) {
					cnt++;
				} else {
					break;
				}
			}
			if (cnt >= 3) {
				for (int j = i; j < i + cnt; j++) {
					System.out.print(j + "\t");
					a[j] = -1;
				}
				System.out.println("");
				i = i + cnt - 1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

	}
}
