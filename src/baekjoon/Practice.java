package baekjoon;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException { // readLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.println("문자 입력");
		String s = br.readLine(); // String

		System.out.println("숫자 입력");
		int i = Integer.parseInt(br.readLine()); // int

		System.out.println("출력결과 : ");
		bw.write(s);
		bw.newLine();

		bw.write(String.valueOf(i));

		bw.flush();
	}

}
