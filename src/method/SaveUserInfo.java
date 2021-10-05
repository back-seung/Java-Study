package method;

import java.util.Scanner;

public class SaveUserInfo {

	// 고객의 아이디를 배열에 저장하는 프로그램을 작성
	// # 1. 기능 가. 저장, 나. 삭제, 다. 전체보기
	// # 2. 변수 < 지역변수 : 메서드안에서만 사용, 전역변수 : 클래스 전체에서 사용(영역 : scope)>
	// 변수 가. 배열

	// ✅정리✅

	// 1. 메서드의 정의부분과 호출부분을 구분할 수 있다.
	// ➡ 메서드의 정의는 클래스에서 시작된다.
	// ➡ 정의된 메서드의 호출은 main 메서드에서 실행된다.

	// 2. 각 메뉴 선택에 따른 호출부 불러오기 해석
	// ➡ menuSelect는 Scanner를 활용하여 사용자에게 입력값을 받는 변수이다. (초기값은 null)
	// ➡ menuSelect는 menu() 메서드의 각 메뉴를 확인하기 위한 기능을 가진다.
	// ➡ 사용자에게 입력값을 받은 menuSelect의 값이 각각 1,2,3일 때 번호에 맞는 메서드를 실행하게 된다.
	// ➡ 각 메서드는 1. addUser(추가) 2. delUser(삭제) 3. viewUser(보기) 기능을 가진다.
	// ➡ 1,2,3이 아닌 그 외의 값을 입력하면 아무런 동작도 실행되지 않는다.

	// 3. 매개변수가 있는 메서드와 없는 메서드를 구분할 수 있다.
	// ➡ 매개변수는 호출부에서 기능을 사용하고자 할 때 자료를 넘겨주는 값이다.
	// ➡ 매개변수가 있는 메서드는 메서드가 정의될 때 ()안에 변수의 이름을 갖게 된다.
	// 이 때 ()안에 있는 값을 parameter라고 하는 것이다.
	// ➡ 반대로 ()안에 아무것도 없다면 매개변수가 없는 메서드라고 볼 수 있다.

	// 4. 지역변수와 전역변수를 구분하고 변수명을 말할 수 있다.
	// 전역변수는 scope가 클래스 전체에 할당된 변수이다.
	// 지역변수는 scope가 main, method, if, for 등 다양한 선언부 및 정의부에서만 사용 가능한 변수이다.

	// 5. 자료형의 원시타입(Primitive type) 과 참조타입(Reference type)
	// 원시타입 : 일반적으로 소문자가 원시타입
	// ➡ 처음 할당된 위치에 내가 원하는 실제 값이 있다.
	// 참조타입 : 대문자가 참조타입
	// ➡ 처음 할당된 위치에 실제 값이 아닌 실제값이 있는 위치가 따로 있다.ㅇ
	static String[] user = new String[5]; // 선언문 : ✔자료형, ✔변수명, ✔초기값, ✔길이, ✔스코프
	static Scanner sc = new Scanner(System.in);

	public static void addUser() { // 저장 기능

		System.out.println("회원의 아이디를 입력해주세요 : ");
		String name = sc.nextLine();
		// name 문자열을 배열에 저장
		if (checkLengthID(name) == 2) { // ID의 길이가 8 이하인가?
			for (int i = 0; i < user.length; i++) { // 반복문을 통해 user의 각 인덱스에 값 추가
				if (user[i] == null) { // user[i]가 비어있는가?
					user[i] = name;
					if (checkSCharID(name) != 2) { // Scanner로 받아온 name에 특수문자가 포함되어 있는가?
						System.out.println("특수문자를 포함해서 다시 입력해주세요.");
						user[i] = null;
						break; // user[i] 는 다시 빈 값으로 돌리고, 현재 반복문을 빠져나온다
					}
					System.out.println(user[i] + " 가 user의 " + i + "번에 저장되었습니다.");
					break;
				} else { // user[i]가 빈 값(null)이 아닌가?
					if (name.equals(user[i])) { // 중복 체크
						System.out.println("중복된 값이 있습니다. 다시 입력해주세요");
						break;
					}
				}
			}
		} else { // ID 길이 8 초과
			if (checkLengthID(name) != 2) {
				System.out.println("아이디는 8글자를 넘을 수 없습니다.");
			}
		}
	}

	public static int checkLengthID(String name) { // ID의 길이 8이상 못하게 하는 기능
		if (name.length() >= 8) {
			return 1;
		} else {
			return 2;
		}
	}

	public static int checkSCharID(String name) { // ID에 특수문자를 포함했는지 확인하는 기능
		String SChar = "!@#$%^&*()?"; // 특수문자 모음 String
		int cnt = 0; // 특수문자 개수 COUNTING
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < SChar.length(); j++) {
				if (name.charAt(i) == SChar.charAt(j)) { // name에 SChar가 포함되어 있는가?
					cnt++; // counting
				}
			}
		}
		if (cnt == 0) { // 카운팅이 0일 경우(특수문자가 없는 경우)
			return 1;
		} else {
			return 2;
		}
	}

	public static void delUser() { // 삭제 기능
		System.out.println("삭제할 회원의 ID를 입력해주세요 : ");
		String deleteInputID = sc.nextLine();
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) { // . 은 참조연산자이다.
				// null일 경우는 참조할 대상이 없기 때문에 예외가 발생한다. 예외를 방지하기 위해 !=null로 최적화
				if (user[i].equals(deleteInputID)) { // 삭제할 값이 user[i]에 포함되어 있는가?
					user[i] = null; // 해당 user[i]를 null(빈 값)로 바꿈.
					System.out.println("삭제 완료");
					break;
				}
			}
		}
	}

	public static void viewUser() { // 전체보기 기능
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) {
				System.out.println("회원번호 : " + i + "의 ID는 : " + user[i]);
			}
		}
	}

	public static void reNameUser() { // ID 수정기능
		System.out.println("바꾸고자 하는 아이디를 입력해주세요 : ");
		String reName = sc.nextLine();
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) {
				if (user[i].equals(reName)) {
					user[i] = null;
					addUser();
					break;
				}
			}
		}
	}

	public static void searchUser() { // ID 검색 기능
		System.out.println("찾고자 하는 아이디를 입력하세요");
		String search = sc.nextLine();
		for (int i = 0; i < user.length; i++) {
			if (user[i].equals(search)) {
				System.out.println("찾는 값 : " + search);
				System.out.println("user의 " + i + "번 째에 동일한 값 " + user[i] + "이(가) 있습니다.");
				break;
			}
		}

	}

	public static void menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 회원 삭제");
		System.out.println("3. 회원 전체보기");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 조회");
		System.out.println("");
		System.out.println("메뉴를 다시 보려면 콘솛에 menu 입력");
	}

	public static void main(String[] args) { // 시작
		String menuSelect = null;
		// 각 메뉴 선택에 따른 호출부 불러오기
		menu();
		for (;;) {
			menuSelect = sc.nextLine();
			if (menuSelect.equals("1")) {
				addUser();
			} else if (menuSelect.equals("2")) {
				delUser();
			} else if (menuSelect.equals("3")) {
				viewUser();
			} else if (menuSelect.equals("4")) {
				reNameUser();
			} else if (menuSelect.equals("5")) {
				searchUser();
			} else if (menuSelect.equals("menu")) {
				menu();
			}
		}

	}
}
