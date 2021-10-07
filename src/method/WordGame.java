package method;

import java.util.Random;
import java.util.Scanner;

public class WordGame {

	// ## 단어게임 정리
	// # 1. 하
	// 1-1. 랜덤하게 단어가 출력되게 한다 ✅
	// 1-2. 랜덤한 단어를 키보드로 입력하고 채점을 한다. ✅
	// # 2. 중
	// 2-1. 부분 점수를 채점한다.(ex : 제시어가 apple인 경우 app으로 input 했다면 부분점수 적용) ✅
	// # 3. 상
	// 3-1. 단어관리 ( 단어 입력 가능) ✅
	// 3-2. 단어별 점수 따로 관리( apple은 10점, banana는 15점 등 단어별로 점수를 다르게 게산) ✅
	// 3-3. 중복된 단어는 입력이 안되게 한다. ✅
	// # 4. 최상
	// 4-1. 게임 시작시 사용자명을 입력하고 랭킹을 관리한다. ❌
	
	// for(;;){} ==> while(true) 로 변경 
	// 
	//
	

	// static String[] randomWord = { "apple", "banana", "cherry", "orange",
	// "peach", "watermelon", "strawberry", "pear" }; 3-1 구현 후 사용 안함.

	/*
	 * 현재 까지의 bug ?
	 *
	 * 
	 * 1.
	 * 
	 * 2.
	 * 
	 * 3.
	 * 
	 * 4.
	 * 
	 * 5.
	 * 
	 */
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();

	static String[] randomMode = new String[10];
	static String[] user = new String[5]; // 사용자 저장
	static String inputWord = ""; // 입력할 단어
	static String outputWord = ""; // 맞춰야 할 단어
	static int[] userScore = new int[5]; // 사용자 score 저장
	static int[] Ranking = { 1, 2, 3, 4, 5 };
	static int playTime = randomMode.length; // 게임을 진행할 횟수
	static int defaultPoint = 5; // 기본 + 포인트
	static int standardLength = 5; // 단어 기준 길이
	static int score = 0; // 총 점수
	static int over = 0; // randomMode의 길이와 같아졌을 때는 게임 over

	// #1. 단어 입력 기능
	public static void input() {
		System.out.println("PRESS ENTER : START \nPRESS \" X \" : END");
		sc.nextLine();

		// createUser(); // 아직 구현 못함

		createWord(); // 사용자 지정 단어 설정 기능
		start: for (;;) { // 사용자가 모든 값을 맞췄을 때 (over가 10점일 때) 게임을 종료하기 위해 start 선언
			for (int i = 0; i < playTime; i++) {
				// 1-1. 랜덤하게 단어가 출력되게 한다.
				outputWord = randomMode[r.nextInt(randomMode.length)];
				if (outputWord != "") {
					System.out.println("랜덤 단어 출력 : " + outputWord);
					inputWord = sc.nextLine(); // 입력값
					// 1-2. 랜덤한 단어를 키보드로 입력하고 채점을 한다.
					if (inputWord.equals(outputWord)) {
						checkLength(inputWord);
						delWord(outputWord);
						System.out.println("현재 스코어 : " + score);
						break;
					} else if (outputWord.length() < inputWord.length()) { // 입력된 값이 제시어보다 길 때 0점 처리
						score += 0;
						System.out.println("현재 스코어 : " + score);
					} else {
						correctCharCount(inputWord);
						System.out.println("현재 스코어 : " + score);
					}
				} else {
					continue;
				}
			}
			if (over > 9) {
				for (int i = 0; i < userScore.length; i++) {
					userScore[i] += score; // createUser의 기능의 일부분
					System.out.println("게임이 끝났습니다. 감사합니다.\n최종 스코어 : " + userScore[i]);
					break;
				}
				break start;
			}
		}
	}

	// 2-1. 부분 점수를 채점한다.(ex : 제시어가 apple인 경우 app으로 input 했다면 부분점수 적용)
	public static int correctCharCount(String inputWord) {
		int cnt = 0;
		for (int i = 0; i < inputWord.length(); i++) {
			if (inputWord.charAt(i) == outputWord.charAt(i)) { // input과 output의 index가 서로 같을 때 값 또한 같은가?
				cnt++; // 카운팅
			}
		}
		if (cnt > 0) { // 카운팅이 0 이상일 때
			System.out.println("부분점수 : " + cnt);
		}
		over++;
		score += cnt;
		cnt = 0;
		return score;
	}

	// #3- 1. 사용자가 지정하여 단어를 선언
	public static void createWord() {
		System.out.println("사용자 지정 단어를 입력해주세요");
		for (int i = 0; i < randomMode.length; i++) { // 입력부
			System.out.println("# 1번 배열의 " + i + "번 째 이름 입력 : ");
			String word = sc.nextLine();
			randomMode[i] = word;
		}
	}

	// 3-2. 단어별 점수 따로 관리( apple은 10점, banana는 15점 등 단어별로 점수를 다르게 게산)
	public static int checkLength(String inputWord) {
		if (inputWord.length() > standardLength) {
			over++;
			score += inputWord.length();
		} else {
			over++;
			score += defaultPoint;
		}
		return score;
	}

	// 3-3. 중복된 단어는 입력이 안되게 한다.
	public static void delWord(String inputWord) {
		for (int i = 0; i < randomMode.length; i++) {
			if (randomMode[i].equals(inputWord)) {
				randomMode[i] = "";
			}
		}
	}
	// 4-1. 게임 시작시 사용자명을 입력하고 랭킹을 관리한다.
//	public static void createUser() { 
//		System.out.println("사용자 ID를 입력해주세요");
//		String userID = sc.nextLine();
//		for (int i = 0; i < user.length; i++) {
//			user[i] = userID;
//			break;
//		}
//	}

	public static void main(String[] args) {
		input();
	}
}