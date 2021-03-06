package method;

import java.util.Random;
import java.util.Scanner;

public class newWordGame {
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();

	static String[] userWords = new String[5];
	static String[] words = { "apple", "banana", "cherry", "orange", "peach", "watermelon", "strawberry", "pear" };
	static String[] userName = new String[5];

	static int[] userScore = new int[5];
	static int[] userRank = new int[5];
	static int[] wordsFlag = new int[words.length];

	static int printWCnt = 0;
	static int score = 0;
	static int saveI = 0;
	static int temp1;

	static String temp2;
	static String outputW = null;

	// user 생성
	public static void createUserID() {
		System.out.println("");
		System.out.println("ID 입력 : ");
		for (int i = 0; i < userName.length; i++) {
			if (userName[i] == null) {
				userName[i] = sc.nextLine();
				saveI = i;
				System.out.println(userName[i] + "ID 생성완료");
				break;
			}
		}
	}

	// user 랭킹 생성(1 ~ 5)
	public static void createRank() {
		for (int i = 0; i < userRank.length; i++) {
			userRank[i] = i + 1;
		}
	}

	// user 점수 저장
	public static void saveUserScore(int score) {
		userScore[saveI] = score;
	}

	// user 랭킹에 따른 위치 변환
	public static void saveUserRank() {
		for (int i = saveI - 1; i >= 0; i--) {
			if (userScore[saveI] > userScore[i]) {
				temp1 = userScore[i];
				userScore[i] = userScore[saveI];
				userScore[saveI] = temp1;
				temp2 = userName[i];
				userName[i] = userName[saveI];
				userName[saveI] = temp2;
				saveI = i;
			}
		}
	}

	// user 지정 단어 생성
	public static void createUserW() {
		for (int i = 0; i < userWords.length; i++) {
			System.out.println("원하는 단어를 입력해주세요 : " + (i + 1) + "번째");
			String word = sc.nextLine();
			userWords[i] = word;
		}
	}

	// user 지정 단어 조회
	public static void showUserW() {
		for (int i = 0; i < userWords.length; i++) {
			System.out.print(userWords[i] + "\t");
		}
		System.out.println("");
	}

	// 결과 조회
	public static void showResult() {
		System.out.println("사용자");
		for (int i = 0; i < userName.length; i++) {
			System.out.print(userName[i] + "\t");
		}
		System.out.println("");
		System.out.println("점수");
		for (int i = 0; i < userScore.length; i++) {
			System.out.print(userScore[i] + "\t");
		}
		System.out.println("");
		System.out.println("랭킹");
		for (int i = 0; i < userRank.length; i++) {
			System.out.print(userRank[i] + "\t");
		}
		System.out.println("");
	}

	// 랜덤 단어 제시
	public static void printW() {
		while (true) {
			int randomIndex = r.nextInt(userWords.length);
			if (wordsFlag[randomIndex] == 0) {
				outputW = userWords[randomIndex];
				wordsFlag[randomIndex] = 1;
				printWCnt++;
				System.out.println("랜덤 단어 출력 : " + outputW);
				break;
			}
		}
	}

	// 게임 start
	public static void game() {
		printWCnt = 0;
		wordsFlag = new int[userWords.length];
		score = 0;
		// 초기화
		for (int i = 0; i < userWords.length; i++) {
			if (userWords[i] == null) {
				createUserW();
			}
		}
		System.out.println("Enter키를 눌러 게임을 시작합니다. X를 누르면 종료합니다.");
		sc.nextLine();

		while (printWCnt != userWords.length) {
			printW();
			String submitW = sc.nextLine();
			if (submitW.equals("x")) {
				System.out.println("게임을 종료합니다." + score);
				break;
			}
			checkPoint(submitW);

		}
		saveUserScore(score);
		saveUserRank();
		showResult();
	}

	// 점수 채점
	public static void checkPoint(String submitW) {
		if (submitW.equals(outputW)) {
			score += 10;
			System.out.println("현재 스코어 : " + score);
		} else {
			// 부분점수
			for (int i = 0; i < outputW.length(); i++) {
				if (i < submitW.length()) {
					if (submitW.charAt(i) == outputW.charAt(i)) {
						score += 2;
						System.out.println("부분점수 + 2");
					}
				}
			}

		}
	}

	// menu
	public static void menu() {

		System.out.println("1 : 게임 시작");
		System.out.println("2 : 게임 종료");
		System.out.println("3 : 사용자 입력 단어 생성");
		System.out.println("4 : 사용자 입력 단어 조회");
		System.out.println("5 : 새로운 생성자 생성");

		System.out.println("현재 사용자 ");
		for (int i = 0; i < userName.length; i++) {
			System.out.print(userName[i] + "\t");
		}
		System.out.println("");
		System.out.println("==================================================================================");
		for (int i = 0; i < userScore.length; i++) {
			System.out.print(userScore[i] + "\t");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		createRank();
		createUserID();

		while (true) {
			menu();
			String answer = sc.nextLine();
			if (answer.equals("1")) {
				game();
			} else if (answer.equals("2")) {
				System.out.println("종료합니다");
				break;
			} else if (answer.equals("3")) {
				createUserW();
			} else if (answer.equals("4")) {
				showUserW();
			} else if (answer.equals("5")) {
				createUserID();
			}
		}
	}
}