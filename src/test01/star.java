package test01;

public class star {

	public static void main(String[] args) {
		System.out.println("1번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("2번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (8 - i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("3번");
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("4번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("5번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (j > i) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("6번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 4 && j < 4 - i || i > 4 && j <= i - 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("7번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= 4 && j <= 4 - i || i > 4 && j < i - 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("8번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 5 && j < i || i > 4 && j < 8 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("9번");
//			for (int i = 0; i < 9; i++) {
//				for (int j = 0; j < 11; j++) {
//					if (5 - i > j || j > 5 + i || j + 4 < i) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println("");
//			}
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print(" ");
			}
			for (int l = 5; l > i; l--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print("*");
			}
			for (int k = 6; k >= i * 2; k--) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i + 1; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("10번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10 + i; j++) {
				if (j >= 9 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("11번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 18; k > i * 2 + 1; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("12번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 10; k > i * 2 + 1; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("13번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("14번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 + i; j++) {
				if (i == 9 || j == 9 - i || j == 9 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("15번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= 10; j++) {
				if (j == i || j == 8 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
