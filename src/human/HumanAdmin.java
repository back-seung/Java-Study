package human;

import java.util.ArrayList;
import java.util.Scanner;

// 수강생 관리, 등록, 수정, 삭제, 검색
public class HumanAdmin {
	// 생성자 : 클래스 구조를 가진 객체가 생성될 때 호출되는 메서드.
	Scanner sc = new Scanner(System.in);

	ArrayList<HumanUser> Users = new ArrayList<HumanUser>(); // ArrayList 객체 생성
	ArrayList<Student> Std = new ArrayList<Student>();
	String basket = null;
	SubjectList sub = new SubjectList();

	HumanAdmin() {

		System.out.println("객체가 만들어졌습니다.");
		while (true) {
			menu();
			String selMenu = sc.nextLine();
			if (selMenu.equals("1")) {
				addUser();
			} else if (selMenu.equals("2")) {
				delUser();
			} else if (selMenu.equals("3")) {
				searchUser();
			} else if (selMenu.equals("4")) {
				print();
			} else if (selMenu.equals("5")) {
				login();
			}
		}
	}

	private void login() {
		System.out.println("ID 입력");
		String loginID = sc.nextLine();
		for (int i = 0; i < Users.size(); i++) {
			if (Users.get(i).id.equals(loginID)) {
				System.out.println("PASS WORD 입력");
				String loginPw = sc.nextLine();
				if (Users.get(i).pw.equals(loginPw)) {
					loginMenu(loginID);
					break;
				}
			}
		}
	}

	private void loginMenu(String name) {
		System.out.println("1. 수강신청");
		System.out.println("2. 장바구니 조회");
		System.out.println("3. 로그아웃");
		while (true) {
			String selectMenu = sc.nextLine();
			if (selectMenu.equals("1")) {
				initClass();
			} else if (selectMenu.equals("2")) {
				printSub();
			} else if (selectMenu.equals("3")) {
				System.out.println("로그아웃");
				Student human = new Student(name, basket);
				Std.add(human);
				break;
			}
		}
	}

	private String initClass() { // 수강 신청
		for (int i = 0; i < sub.subject.length; i++) {
			System.out.println(i + 1 + " : " + sub.subject[i]);
		}
		System.out.println("장바구니에 추가할 과목을 선택 해주세요 : ");
		String choose = sc.nextLine();
		if (basket == null) {
			if (choose.equals("1")) {
				basket = sub.subject[0];
				System.out.println(basket + "담기 완료");
			} else if (choose.equals("2")) {
				basket = sub.subject[1];
				System.out.println(basket + "담기 완료");
			} else if (choose.equals("3")) {
				basket = sub.subject[2];
				System.out.println(basket + "담기 완료");
			}
		}
		return basket;
	}

	private void printSub() {
		for (int i = 0; i < Std.size(); i++) {
			if (Std.get(i) != null) {
				System.out.println("학생 : " + Std.get(i).name);
				System.out.println("수강신청내용 : " + Std.get(i).sub);
			} else {
				break;
			}
		}
	}
// ***************************************************** Level 1
	private void searchUser() {
		System.out.println("검색할 ID를 입력해주세요");
		String searchID = sc.nextLine();

		for (int i = 0; i < Users.size(); i++) {
			if (Users.get(i).id.equals(searchID)) {
				System.out.println("찾는 값 : " + searchID + "\n" + i + "번째의 값(" + Users.get(i).id + ")을 검색합니다.");
				System.out.println("ID : " + Users.get(i).id);
				System.out.println("PW : " + Users.get(i).pw);
				break;
			}
		}
	}

	private void delUser() {
		System.out.println("삭제할 ID를 입력해주세요");
		String delID = sc.nextLine();

		for (int i = 0; i < Users.size(); i++) {
			if (Users.get(i).id.equals(delID)) {
				System.out.println("찾는 값 : " + delID + "\n" + i + "번째의 값(" + Users.get(i).id + ")을 삭제합니다.");
				Users.remove(i);
				break;
			}
		}
	}

	private void addUser() {
		System.out.println("ID 입력");
		String myId = sc.nextLine();
		System.out.println("PW 입력");
		String myName = sc.nextLine();
		HumanUser User = new HumanUser(myId, myName);
		Users.add(User);
		System.out.println(User.id + "\t" + User.pw);
	}

	public static void menu() {
		System.out.println("1 : ADD USER");
		System.out.println("2 : DELETE USER");
		System.out.println("3 : SEARCH USER");
		System.out.println("4 : PRINT USER");
		System.out.println("5 : LOGIN USER");
	}

	private void print() {
		for (int i = 0; i < Users.size(); i++) {
			System.out.println("ID : " + Users.get(i).id);
			System.out.println("PW : " + Users.get(i).pw);
		}
	}
}
