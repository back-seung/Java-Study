package sample;

import java.util.Scanner;

public class Main2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TodoList[] Oct = new TodoList[7];
		TodoList.menu();

		while (true) {
			String selectMenu = sc.nextLine();
			if (selectMenu.equals("1")) {
				TodoList.createTodo(Oct);
			} else if (selectMenu.equals("2")) {
				TodoList.deleteTodo(Oct);
			} else if (selectMenu.equals("3")) {
				TodoList.updateTodo(Oct);
			} else if (selectMenu.equals("4")) {
				TodoList.searchTodo(Oct);
			} else if (selectMenu.equals("5")) {
				TodoList.print(Oct);
			}
		}
	}

}
