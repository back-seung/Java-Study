package test01;

public class Test02 {

	public static void main(String[] args) {
		int[] saveInt = new int[10];
		for (int i = 0; i < saveInt.length; i++) {
			saveInt[i] = 9 - i;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(saveInt[i] + "\t");
		}
	}
}
