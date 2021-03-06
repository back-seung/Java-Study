package sample;

import java.util.Scanner;

public class TodoList {
	static Scanner sc = new Scanner(System.in);
	static String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
	String date = null;
	String Todo = null;
	String Todo2 = null;

	// 생성자
	public TodoList(String myDate, String myTodo, String myTodo2) {
		this.date = myDate;
		this.Todo = myTodo;
		this.Todo2 = myTodo2;
	}

	// 객체 배열 초기화
	public static void createTodo(TodoList[] Weeks) {
		int cnt = 0; // 초기화된 배열의 갯수를 체크
		System.out.println("작성");
		for (int i = 0; i < Weeks.length; i++) {
			if (Weeks[i] == null) { // 값이 비었는가
				System.out.println("날짜를 입력해주세요");
				String date = sc.nextLine();
				if (!(date.matches(pattern))) { // 정규표현식에 맞지 않는가
					System.out.println("형식에 맞게 입력해주세요. 예) 1998-01-01");
					date = sc.nextLine();
				}
				System.out.println("할 일을 입력해주세요");
				String Todo = sc.nextLine();
				System.out.println("또 다른 할 일을 입력해주세요");
				String Todo2 = sc.nextLine();
				Weeks[i] = new TodoList(date, Todo, Todo2);
				cnt++;
				System.out.println(i + "번 째 생성 완료");
				break;
			} else { // 값이 비어있지 않은가
				if (cnt == (Weeks.length - 1)) { // 베열에 자리가 남아있는가
					System.out.println("빈 자리가 없습니다.");
				}
			}
		}
	}

	// 객체 배열 출력
	public static void print(TodoList[] Weeks) {
		for (int i = 0; i < Weeks.length; i++) {
			if (Weeks[i] != null) {
				System.out.println("번호 : " + i);
				System.out.println("날짜 : " + Weeks[i].date);
				System.out.println("할 일 : " + Weeks[i].Todo);
				System.out.println("할 일 : " + Weeks[i].Todo2);
				System.out.println("");
			}
		}
	}

	// 객체 배열 삭제
	public static void deleteTodo(TodoList[] Weeks) {
		System.out.println("삭제할 날짜를 입력해주세요 : ");
		String del = sc.nextLine();
		for (int i = 0; i < Weeks.length; i++) {
			if (Weeks[i] != null) {
				if (del.equals(Weeks[i].date)) {
					Weeks[i] = null;
					System.out.println(i + "번 째 삭제 완료");
					break;
				} else {
					System.out.println("찾는 값이 존재하지 않습니다.");
					break;
				}
			}
		}
	}

	// 객체 배열 검색
	public static void searchTodo(TodoList[] Weeks) {
		System.out.println("검색할 항목을 입력해주세요 : ");
		String search = sc.nextLine();
		for (int i = 0; i < Weeks.length; i++) {
			if (Weeks[i] != null) {
				if (search.equals(Weeks[i].Todo)) {
					System.out.println(search + "검색 완료");
					System.out.println("날짜 : " + Weeks[i].date);
					System.out.println("할 일 : " + Weeks[i].Todo);
					break;
				} else if (search.equals(Weeks[i].Todo2)) {
					System.out.println(search + "검색 완료");
					System.out.println("날짜 : " + Weeks[i].date);
					System.out.println("할 일 2 : " + Weeks[i].Todo2);
					break;
				}
			} else {
				System.out.println("값이 존재하지 않습니다.");
				break;
			}
		}
	}

	// 객체 배열 수정
	public static void updateTodo(TodoList[] Weeks) {
		System.out.println("수정할 항목을 입력해주세요 : ");
		String update = sc.nextLine();
		for (int i = 0; i < Weeks.length; i++) {
			if (Weeks[i] != null) {
				if (update.equals(Weeks[i].Todo)) {
					System.out.println("새로운 항목을 입력해주세요");
					Weeks[i].Todo = sc.nextLine();
					System.out.println("변경 완료");
					print(Weeks);
					break;
				} else if (update.equals(Weeks[i].Todo2)) {
					System.out.println("새로운 항목을 입력해주세요");
					Weeks[i].Todo2 = sc.nextLine();
					System.out.println("변경 완료");
					print(Weeks);
					break;
				}
			} else {
				System.out.println("값이 존재하지 않습니다.");
				break;
			}
		}
	}

	// 메뉴
	public static void menu() {
		System.out.println("1. 할 일 생성하기");
		System.out.println("2. 할 일 삭제하기");
		System.out.println("3. 할 일 수정하기");
		System.out.println("4. 할 일 검색하기");
		System.out.println("5. 할 일 전체보기");
	}
}
