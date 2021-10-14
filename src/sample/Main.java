package sample;

public class Main {

	public static void main(String[] args) {
		saveUser user1 = new saveUser();
		user1.age = 15;
		user1.name = "홍길동";
		user1.point = 30;

		saveUser user2 = new saveUser();
		user2.age = 21;
		user2.name = "김철수";
		user2.point = 30;

		saveUser user3 = new saveUser();
		user3.age = 29;
		user3.name = "이나라";
		user3.point = 30;

		saveUser[] userControl = new saveUser[5];
		userControl[0] = user1;
		userControl[1] = user2;
		userControl[2] = user3;

		for (int i = 0; i < userControl.length; i++) {
			userControl[i].print();
		}
	}
}
