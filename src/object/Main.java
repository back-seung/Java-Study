package object;

public class Main {

	public static void main(String[] args) {
		MyWord myW = new MyWord();

		myW.eword = "banana";
		myW.kword = "바나나";
		myW.viewCnt = 1;
		System.out.println(myW.eword);
		System.out.println(myW.kword);
		System.out.println(myW.viewCnt);
	}
}
