package array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//		String[] username = new String[5];
//		// String 배열의 각 index 값을 따로 선언하지 않으면 null
//		for (int i = 0; i < username.length; i++) {
//			System.out.println(username[i]);
//		}

		// # 1. 배열의 길이 만큼 키보드로 부터 이름을 입력하고 모두 출력하는 코드를 작성
		// 조건 : 입력부 / 출력부 분리
		String[] user1 = new String[5];
		Scanner sc = new Scanner(System.in);
		String name = null;
		for (int i = 0; i < user1.length; i++) { // 입력부
			System.out.println("# 1번 배열의 " + i + "번 째 이름 입력 : ");
			name = sc.nextLine();
			user1[i] = name;
		}
		for (int i = 0; i < user1.length; i++) { // 출력부
			System.out.print(user1[i] + "\t");
		}
		System.out.println("");
		System.out.println("===================================================");
		// # 2. 키보드로 이름을 입력 받아서 입력한 이름이 user2에 있으면 "중복", 없으면 "사용가능"이라고 출력하라
		String[] user2 = { "kimlee", "leejin", "이진호", "삼일동" };
		for (int i = 0; i < user2.length; i++) {
			System.out.println("# 2번 이름 입력 : ");
			name = sc.nextLine();
			if (name.equals(user2[i])) {
				System.out.println("중복");
				break;
			} else {
				System.out.println("사용 가능");
				break;
			}
		}
		System.out.println("");
		System.out.println("===================================================");
		// # 3. 2번 문제 배열에서 배열의 인덱스 번호는 회원번호이다.
		// 키보드로 회원의 이름을 입력받아서 회원의 번호를 출력하는 프로그램을 작성하시오. 조회가 되지 않으면 "없음" 출력
		System.out.println("# 3번 이름 입력");
		name = sc.nextLine();
		int userNum = 0;
		for (int i = 0; i < user2.length; i++) {
			if (user2[i].equals(name)) {
				userNum = i;
				System.out.println(user2[i] + "의 회원번호는 " + userNum + "번 입니다.");
			}
		}
		if (userNum == 0) {
			System.out.println("찾아봤으나 없습니다.");
		}

		// # 4. user3은 회원들의 정보이다. null은 회원이 탈퇴한 것이다. 탈퇴한 회원은 몇명인지를 출력하라
		String[] user3 = { "kimlee", "박군", null, "이진수" };
		int exitUserNum = 0;
		for (int i = 0; i < user3.length; i++) { // 배열을 돌면서 null 있을 경우 exitUserNum 증가
			if (user3[i] == null) {
				exitUserNum++;
			}
		}
		System.out.println("");
		System.out.println("===================================================");
		System.out.println("탈퇴한 회원은 총 : " + exitUserNum + "명 입니다.");
		System.out.println("");
		System.out.println("===================================================");
		String[] user4 = { "일일일", "둘둘둘", "셋셋셋", " 네네네" };
		String temp;
		// # 5. 다다다 라는 문자열을 셋셋셋자리에 입력하고 입력된 뒤 값은 하나씩 뒤로 밀리도록 하시오.
		// 맨 끝자리 문자열은 버린다.
		for (int i = 0; i < user4.length; i++) {
			for (int j = i + 1; j < user4.length; j++) {
				if (user4[i].equals("셋셋셋")) {
					temp = user4[i];
					user4[i] = "다다다";
					user4[j] = temp;
				}
			}
		}
		for (int i = 0; i < user4.length; i++) {
			System.out.println(user4[i]);
		}
	}
}
