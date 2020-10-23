package Step02_Greedy;

import java.util.Scanner;

// 그리디 알고리즘
// 곱셈 또는 덧셈
public class MultiplicationOrAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		// 첫 번째 문자를 숫자로 변경한 값을 대입
		long result = str.charAt(0) - '0';
		
		// 첫 번째 숫자와 연산할 방법 확인
		for (int i = 1; i < str.length(); i++) { // 인덱스는 0이 아닌 1부터
			// 두 수 중에서 하나라도 0 혹은 1인 경우, 덧셈
			int num = str.charAt(i) - '0';
			if (num<=1||result<=1) { // 첫번째 숫자인 result도 0 또는 1인 경우를 놓치면 안된다.
				result += num;
			}
			else {
				result *= num;
			}
		}
		System.out.println(result);
	}
}
