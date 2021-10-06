package method;

import java.util.Random;
import java.util.Scanner;

public class WordGame {

	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();

	static String[] randomWord = { "apple", "banana", "cherry", "orange", "peach", "watermelon", "strawberry", "pear" };
	static String inputWord = ""; // 입력할 단어
	static String outputWord = ""; // 맞춰야 할 단어
	static int standardLength = 5; // 단어 기준 길이
	static int defaultPoint = 5; // 기본 + 포인트
	static int score = 0; // 총 점수
	static int playTime = 999; // 게임을 진행할 횟수

	public static void input() { // 단어 입력 기능
		System.out.println("PRESS ENTER : START \nPRESS \" X \" : END");
		sc.nextLine();
		for (;;) {
			for (int i = 0; i < playTime; i++) {
				outputWord = randomWord[r.nextInt(randomWord.length)]; // randomWord 배열에서 랜덤으로 값을 뽑아옴
				if (outputWord != "") {
					System.out.println("랜덤 단어 출력 : " + outputWord);
					inputWord = sc.nextLine(); // 입력값
					if (inputWord.equals(outputWord)) { // 입력값과 같은가
						System.out.println("추가 점수 : " + (inputWord.length() - standardLength));
						checkLength(inputWord);
						delWord(outputWord);
						System.out.println("현재 스코어 : " + score);
						break;
					} else if (outputWord.length() < inputWord.length()) {
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
		}
	}

	public static int checkLength(String inputWord) { // 추가된 길이만큼 추가 점수 적용
		if (inputWord.length() > standardLength) {
			score += inputWord.length();
		} else {
			score += defaultPoint;
		}
		return score;
	}

	public static int correctCharCount(String inputWord) { // 입력값과 같지 않을 때 부분 점수 적용
		int cnt = 0;
		for (int i = 0; i < inputWord.length(); i++) {
			if (inputWord.charAt(i) == outputWord.charAt(i)) { // input과 output의 index가 서로 같을 때 값 또한 같은가?
				cnt++; // 카운팅
			}
		}
		if (cnt > 0) { // 카운팅이 0 이상일 때
			System.out.println("부분점수 : " + cnt);
		}
		score += cnt;
		cnt = 0;
		return score;
	}

	public static void delWord(String inputWord) {
		for (int i = 0; i < randomWord.length; i++) {
			if (randomWord[i].equals(inputWord)) {
				randomWord[i] = "";
			}
		}
	}

	public static void main(String[] args) {
		input();
	}

}
// 단어게임 정리 =>
// 