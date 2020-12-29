package codeup;

import java.util.Scanner;

public class pr1014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String chars =scan.nextLine(); //라인으로 입력받음
		char [] chararr = chars.toCharArray(); //입력받은거 문자로 각각 나눠서 저장
		System.out.println(chararr[2]+" "+chararr[0]); //공백 띄고 출력

	}

}
