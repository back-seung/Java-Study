package test01;

public class ExamForIf {

	public static void main(String[] args) {
		// 1. 길이 5의 배열을 선언하고, 첫번째 인덱스 부터 0으로 채우시오

		System.out.println("===================1번===================");
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("arr[" + i + "] 의 값 : " + arr[i]);
		}
		System.out.println("");
// 발표해야 될 거 : 2번
		System.out.println("===================2번===================");
		// 2. a 배열의 값 중에서 짝수의 갯수는 모두 몇개인가요?
		int[] a = { 3, 4, 5, 6, 8, 9, 10 };
		int cnt = 0; // 짝수 카운팅 변수
		for (int i = 0; i < a.length; i++) { // 입력부
			if (a[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("a 배열의 짝수의 갯수는 총 : " + cnt + "개 입니다");
		System.out.println("");

		System.out.println("===================3번===================");
		// 3. a 배열의 값에서 6과 8 사이에 7이라는 숫자가 들어가야 합니다.
		// 그리고 7이 들어갈 자리부터는 뒤로 한 칸씩 밀리게 됩니다. 마지막 숫자는 배열에서 사라집니다.
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)
				if (a[i] + 1 != a[j]) { // a[i]에 1을 더한 값이 a[i+1]의 값과 같지 않을때
					a[j] = a[i] + 1; // a[i+1]에 a[i]에 1을 더한 값을 대입.
				}
		}
		for (int i = 0; i < a.length; i++) { // 출력부
			System.out.print(a[i] + "\t");
		}
		System.out.println("");
		System.out.println("");

		System.out.println("===================4번===================");
		// 4. arr2 배열에서 짝수는 모두 몇개인가?
		// 5. 4번 배열에서 짝수열의 값의 합을 모두 구하시오.
		int[][] arr2 = { { 2, 3, 54, 45, 3 }, { 2, 3, 54, 45, 3 }, { 2, 3, 54, 45, 3 } }; // 총 3행 5열의 2차원 배열.
		int evenTotal = 0; // arr2의 합을 담을 변수
		int evenCnt = 0; // 배열의 짝수를 담을 변수
		for (int i = 0; i < 3; i++) { // 3은 3행을 의미함.
			for (int j = 0; j < 5; j++) { // 5는 5열을 의미함
				if (arr2[i][j] % 2 == 0) {
					evenCnt++;
					evenTotal += arr2[i][j];
				}
			}
		}
		System.out.println("arr2 배열의 짝수의 갯수는 총 : " + evenCnt + "개 입니다");
		System.out.println("");

		System.out.println("===================5번===================");
		System.out.println("arr2 배열의 짝수의 합은 : " + evenTotal + "입니다");
		System.out.println("");

		System.out.println("===================6번===================");
		// secret 문자열은 비밀문자 이다. (z또는 y)
		// human은 일반문자이다.. 일반문자는 비밀문자가 포함되면 안된다.
		// human 문자가 조건에 맞으면 사용가능, 가능하지 않다면 불가능이라고 출력하시오.
		String secret = "zy"; // 비밀문자
		String human = "human progamer"; // 일반문자
		int checkSecret = 0; // human에 secret이 포함될 때 카운팅할 변수
		for (int i = 0; i < human.length(); i++) {
			for (int j = 0; j < secret.length(); j++) {
				if (human.charAt(i) == secret.charAt(j)) { // human에 secret이 포함되는가?
					checkSecret++; // 카운팅
				}
			}
		}
		if (checkSecret == 0) { // checkSecret이 0인가?
			System.out.println("비밀 문자 개수 : " + checkSecret + "개, 사용가능");
		} else { // checkSecret이 0이 아닌가?
			System.out.println("비밀 문자 개수 : " + checkSecret + "개, 사용 불가능");
		}
		System.out.println("");

		System.out.println("===================7번===================");
		// 7. words는 단어의 배열이다..
		// searchWord의 단어가 포한된 단어를 words에서 출력하시오.
		String searchWord = "a";
		String[] words = { "apple", "banana", "mouse" };

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == searchWord.charAt(0)) {
					// searchWord.charAt인 이유는 searchWord가 char가 아닌 String이기 때문
					System.out.print(words[i] + "\t");
					break;
				}
			}
		}
	}
}
