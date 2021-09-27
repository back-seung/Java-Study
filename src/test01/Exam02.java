package test01;

import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 1. 10개의 정수를 저장하는 배열이 있다. 랜덤수 0-30까지 추출이 가능하다. 랜덤수 중 짝수만 저장하는 배열을 코딩하세요.
		 */
		System.out.println("1번");
		int[] arr = new int[10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(31);
			if (arr[i] % 2 == 1) {
				arr[i] += 1;
			}
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
		/*
		 * 2. 1000개의 랜덤 수를 뽑는다. (랜덤수 범위는 1-45)
		 * 
		 * 각 랜덤수가 뽑힌 총 회수를 저장한다.
		 * 
		 * 가장 많이 뽑힌 랜덤수 부터 출력한다. (단, 회수가 같은 경우는 작은 번호가 우선한다.) ( 총, 6개)
		 */

		System.out.println("2번--------");
//		int temp;
//		int temp2;
//		int[] arr2 = new int[45]; // 정수 n개를 담는 배열
//		int[] lottoCount = new int[45]; // 정수 n의 반복된 값을 추가할 배열
//		for (int i = 0; i < lottoCount.length; i++) { // 배열 초기화
//			arr2[i] = i + 1;// arr2[i]에 1~45 정수 초기화
//			lottoCount[i] = 0; // count[i]에 0 초기화
//		}
//		for (int i = 0; i < 1000; i++) { // 랜덤값 1000개 뽑고 count[]에 추가
//			int arrCnt = r.nextInt(45) + 1;
//			lottoCount[arrCnt - 1]++;
//		}
//
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = i + 1; j < arr2.length; j++) { // 정렬
//				if (lottoCount[i] < lottoCount[j]) {
//					temp = arr2[i];
//					arr2[i] = arr2[j];
//					arr2[j] = temp;
//					temp2 = lottoCount[i];
//					lottoCount[i] = lottoCount[j];
//					lottoCount[j] = temp2;
//				}
//			}
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println((i + 1) + "번째 : " + arr2[i] + " ");
//		}
		int[] lottoCount = new int[46];
		int maxNumberIndex = 0;
		// 랜덤 수에 해당하는 인덱스의 값을 하나씩 증가시킴
		for (int i = 0; i < 1000; i++) {
			lottoCount[r.nextInt(45) + 1]++;
		}
		// 위에서 누적된 카운팅 확인
//		for (int i = 0; i < 46; i++) {
//			System.out.println("index : " + i + " value : " + lottoCount[i]);
//		}
		// 배열에서 가장 큰 값 찾아내기
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 46; j++) {
				if (lottoCount[j] > lottoCount[maxNumberIndex]) {
					maxNumberIndex = j;
				}
			}
			System.out.println("로또 번호는 : " + maxNumberIndex);
			lottoCount[maxNumberIndex] = -1;
		}
		/*
		 * 3. int[] lotto = new int[46]; 위 배열을 활용하여 중복되지 않은 로또 번호를 출력하시오. (총, 6개) ​
		 */
		System.out.println("3번--------");
//		int[] lotto = new int[46]; // 를 사용하여 로또 번호 중복없이 6개 출력
//		for (int i = 0; i < lotto.length; i++) { // 0 ~ 45숫자 만들기
//			lotto[i] = i;
//		}
//
//		int[] lottoNumber = new int[6];
//		for (int i = 0; i < lottoNumber.length; i++) {
//			lottoNumber[i] = lotto[r.nextInt(46)];
//			for (int j = 0; j < i; j++) {
//				if (lottoNumber[i] == lottoNumber[j] || lottoNumber[i] == 0) {
//					i--;
//				}
//			}
//			System.out.print(lottoNumber[i] + "\t");
//		}
//		System.out.println("");
		int[] lotto = new int[46];
		for (int i = 0; i < 6; i++) {
			int k = r.nextInt(45) + 1;
			if (lotto[k] == 1) {
				i--;
			} else {
				lotto[k] = 1;
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == 1) {
				System.out.print(i + "\t");
			}
		}
		System.out.println("");
		/*
		 * 4. 동물구하기
		 * 
		 * int[] animal = {0,0,2,0,0,1,0,0,0,0,0,0}
		 * 
		 * 0은 빈공간, 2는 장애물, 1은 구하려는 동물
		 * 
		 * 동물이 어디에 있는지 출력 : 위치는 인덱스 번호
		 * 
		 * 동물이 왼쪽으로 탈출해야 하는지? 오른쪽으로 탈출해야 하는지? 판단 하여 출력하시오.
		 * 
		 * (단, 배열의 value값이 변경이 되어도 정상 동작해야 한다)
		 */
		System.out.println("4번--------");

		int[] animal = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0 };
		int animalIndex = 0;
		int exitIndex = 0;
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] == 1) {
				animalIndex = i;
				System.out.println("동물의 위치는 : " + animalIndex);
			} else if (animal[i] == 2) {
				exitIndex = i;
			}
		}
		if (animalIndex < exitIndex) {
			System.out.println("왼쪽으로 탈출");
		} else {
			System.out.println("오른쪽으로 탈출");
		}

		/*
		 * 5. 주차하기 배열의 인덱스 번호는 주차장 번호이다. 주차를 희망하는 자동차의 번호판으로 주차장 번호가 지정된다. 자동차 번호가 1234인
		 * 경우는 4번 자리가 주차장 번호가 된다. carNum은 주차장을 이용한 자동차 번호이다. 자동차의 주자장 번호에 이미 주차가 되어 있다면
		 * 주차장번호에서 +1씩 증가 하여 빈 자리를 찾고, 없으면 주차를 할 수 없다.
		 */
		System.out.println("5번--------");
		int[] carNum = { 1234, 1212, 1241, 1245, 1264, 4363, 2367, 3558, 2329 };
		int[] parking = new int[10];
		int parkingIndex = 0;
		// 주차장 번호 생성
		for (int i = 0; i < carNum.length; i++) {
			parkingIndex = carNum[i] % 10;
			for (int j = parkingIndex; j < parking.length; j++) {
				if (parking[j] == 0) {
					parking[j] = carNum[i];
					j = parking.length;
				}
			}
		}
		for (int i = 0; i < parking.length; i++) {
			if (parking[i] == 0) {
				parking[i] = -1;
			}
			System.out.println(i + "번의 주차장에는 " + parking[i] + "(이)가 현재 주차중");
		}

//		for (int i = 0; i < carNum.length; i++) {
//			for (int j = 0; j < parking.length; j++) {
//				if (carNum[i] % 10 == parking[j]) {
//					parking[j] = carNum[i] % 10;
//					System.out.println(carNum[i] + "의 주차 번호는 " + parking[j] + "번 입니다");
//				}
//			}
//		}
	}
}
