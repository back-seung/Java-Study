package test01;

public class Exam06 {

	public static void main(String[] args) {
		// 여러분은 회의 가입의 id 유효성을 판단하는 프로그램을 작성하고 있습니다. 반드시 특수 문자가 포함이 되어야 합니다. 다음 문제를
		// 해결하세요
		// 문제 1. 무조건 특수문자가 1개 이상 포함이 되어야 한다. 사용이 가능하면 사용이 가능합니다 라고 출력
		// 문제 2. 특수문자가 2개 이상 포함이 되어야 한다. 사용이 가능하면 사용이 가능합니다 라고 출력

		String sign = "!@#$%^&*";
		String id = "nakim2!mi!";

		int cnt = 0;
		for (int i = 0; i < id.length(); i++) {
			for (int j = 0; j < sign.length(); j++) {
				if (id.charAt(i) == sign.charAt(j)) {
					cnt++;
				}
			}
		}
		if (cnt > 1) {
			System.out.println("사용한 특수문자 : " + cnt + "개, 사용 가능합니다.");
		} else {
			System.out.println("사용한 특수문자 : " + cnt + "개, 사용 불가합니다.");
		}
		cnt = 0;

		String badA = "abc";
		String title = "hi! good day";

		for (int i = 0; i < title.length(); i++) {
			for (int j = 0; j < badA.length(); j++) {
				if (badA.charAt(j) == title.charAt(i)) {
					cnt++;
					break;
				}
			}
		}
		if (cnt >= 2) {
			System.out.println("bad A : " + cnt + " 사용 불가");
		} else {
			System.out.println("bad A : " + cnt + " 사용 가능");
		}
	}
}
