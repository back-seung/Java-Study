package test01;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {

		Random r = new Random(); // Ctrl + Shift + o => Ŭ���� import
		// ������ ���� �̱� ���� �ڹٿ��� �����Ǵ� ����� ����� ���̴�.
		// �����
		int lotto[] = new int[6];

		// �Էº�
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		// ��º�
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

}
