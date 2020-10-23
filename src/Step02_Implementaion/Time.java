package Step02_Implementaion;

import java.util.Scanner;

// 구현 알고리즘
// 완전 탐색
// 시각

// 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지
// 3이 포함되는 모든 경우의 수를 구해야한다.

// 입력 예시
// 5

// 출력 예시
// 11475

public class Time {

	// 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean check(int h, int m, int s) {
    	// % 10 : 1의 자리에 3이 포함되어 있는지
    	// / 10 : 10의 자리에 3이 포함되어 있는지
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true; // 포함될 경우 true 리턴
        return false; // 포함되지 않았을 경우 false 리턴
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // h를 입력받기 
        int h = sc.nextInt();
        // 3이 포함된 개수
        int cnt = 0;

        // 00시 00분 00초부터 N시 59분 59초까지
        for (int i = 0; i <= h; i++) { // 0 ~ h
            for (int j = 0; j < 60; j++) { // 0 ~ 59
                for (int k = 0; k < 60; k++) { // 0 ~ 59
                    // 매 시각 안에 '3'이 포함되어 있다면(true), 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

}
