package test01;

public class Exam04 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 3, 4, 5, 6, 2, 2, 4, 4, 3, 2, 1 };
//		int[] a = { -1, -1, -1, 3, -1, -1, -1, -1, 2, 2, 4, 4, 3, 2, 1};
		// 오전꺼 복습하고 참고하면서 위 문제 풀어보기.
		// 오름차순으로 연속된 숫자가 3개 이상일 경우 -1로 값을 바꾸시오.
		int sIndex = 0; // 조건에 해당하는 값을 -1로 만들어 줄 반복문의 시작위치를 임시로 저장할 변수
		int eIndex = 0; // 조건에 해당하는 값을 -1로 만들어 줄 반복문의 마지막위치를 임시로 저장할 변수
		int cnt = 1; // a와 j의 차(-)를 통해 오름차순 여부를 확인하기 위한 변수
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] - cnt) { // a[i]와 (a[j] - cnt)의 값이 같은가?
					cnt++; // cnt를 1증가 시킴(* a[i] a[j]를 계속 비교시 오름차순인지 확인하기 위해선 [j]-2, [j]-3 또한 계산해야하기 때문)
					sIndex = i; // start 인덱스 변수에 i값 저장
					eIndex = j; // end 인덱스 변수에 j값 저장
				} else { // a[i]와 (a[j] - cnt)의 값이 같지 않은가?
					break; // 현재 반복문을 탈출함.
				}
			} // j 반복문
			if (eIndex - sIndex >= 2) { // j - i의 값이 >=2 인가?
				for (int j = sIndex; j <= eIndex; j++) { // 반복문 실행
					a[j] = -1; // 각 조건에 맞았던 인덱스의 값을 -1로 변경
				}
				i = eIndex; // i의 값을 end 인덱스의 값으로 대입하여 불필요한 반복을 제거
				sIndex = 0; // sIndex, eIndex, cnt 초기화
				eIndex = 0;
				cnt = 1;
			}
		}
		for (int i = 0; i < a.length; i++) { // a 배열 출력문
			System.out.print(a[i] + "\t");
		}
	}

}
