package test01;

public class Test03 {

	public static void main(String[] args) {
		int[] point = { 10, 20, 30, 40, 50 };
		// ���� : �ڷ��� : int, ������ : point, ������: 5, �ε���: 0~4, �ʱⰪ : 10,20,30,40,50
		int[] point1 = new int[5];
		// ���� : �ڷ��� : int, ������ : point1, ������: 5, �ε���: 0~4, �ʱⰪ : ���� ��� 0
		for (int i = 0; i < point.length; i++) {
			System.out.print(point[i] + "\t");
		}
	}
}
