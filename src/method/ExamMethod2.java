package method;

import java.util.Scanner;

public class ExamMethod2 {

	static Scanner sc = new Scanner(System.in);

	// 가. 단어장 만들기
	static String[] engWord = new String[5];
	static String[] korWord = new String[5];
	static String inputEngWord = null;
	static String inputKorWord = null;
	static String pattern = "^\\w{2,}$";
	static String[] badWord = { "fuck", "shit", "bitch", "motherfucker", "sex" };
	static int cnt = 0;

	// 나. 단어 입력기능
	public static void submitWord() {
		System.out.println("저장할 영단어를 입력해주세요 : ");
		inputEngWord = sc.nextLine();
		inputEngWord = checkBadWord(inputEngWord);
		System.out.println("저장할 영단어를 한글뜻으로 입력해주세요 : ");
		inputKorWord = sc.nextLine();
		for (int i = 0; i < engWord.length; i++) {
			// 마. 중복된 단어 방지
			if (!(inputEngWord.equals(engWord[i]))) {
				if (engWord[i] == null && inputEngWord.matches(pattern)) {
					engWord[i] = inputEngWord;
					korWord[i] = inputKorWord;
					System.out.println(i + " 자리에 [" + engWord[i] + " : " + korWord[i] + "] 가 저장되었습니다.");
					cnt++;
					break;
				}
			} else {
				System.out.println("중복");
				break;
			}
		}
		if (cnt > 4) {
			System.out.println("자리가 없습니다");
			System.out.println("");
			menu();
		}
	}

	// 다. 단어 삭제 기능
	public static void delWord() {
		System.out.println("삭제할 단어를 입력해주세요 : ");
		inputEngWord = sc.nextLine();
		for (int i = 0; i < engWord.length; i++) {
			if (engWord[i] != null && korWord[i] != null) {
				if (inputEngWord.equals(engWord[i])) {
					System.out.println(i + " 자리에 [" + engWord[i] + " : " + korWord[i] + "] 가 삭제되었습니다.");
					engWord[i] = null;
					korWord[i] = null;
					break;
				}
			}
		}
	}

	// 라. 영단어를 입력 받아서 검색
	public static void searchWord() {
		System.out.println("찾고 있는 단어를 입력해주세요 : ");
		inputEngWord = sc.nextLine();
		for (int i = 0; i < engWord.length; i++) {
			if (engWord[i].contains(inputEngWord)) {
				System.out.println("[" + engWord[i] + " : " + korWord[i] + "]");
			}
		}
	}

	// 욕 금지
	public static String checkBadWord(String inputEngWord) {
		for (int i = 0; i < badWord.length; i++) {
			if (inputEngWord.contains(badWord[i])) {
				System.out.println("욕설 금지, 다시 입력해주세요");
				inputEngWord = sc.nextLine();
				break;
			}
		}
		return inputEngWord;
	}

	public static void viewWords() {
		for (int i = 0; i < engWord.length; i++) {
			System.out.print(engWord[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < engWord.length; i++) {
			System.out.print(korWord[i] + "\t");
		}
		System.out.println("");
	}

	public static void menu() {
		System.out.println("1. 단어 생성");
		System.out.println("2. 단어 삭제");
		System.out.println("3. 단어 조회");
		System.out.println("4. 현재 단어장 조회");

	}

	public static void main(String[] args) {
		while (true) {
			menu();
			String answer = sc.nextLine();
			if (answer.equals("1")) {
				submitWord();
			} else if (answer.equals("2")) {
				delWord();
			} else if (answer.equals("3")) {
				searchWord();
			} else if (answer.equals("4")) {
				viewWords();
			}
		}
	}
}
