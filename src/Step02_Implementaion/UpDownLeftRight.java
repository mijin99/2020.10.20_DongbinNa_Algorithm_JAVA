package Step02_Implementaion;

import java.util.Scanner;

// 구현 알고리즘
// 상하좌우

// 입력 예시
// 5
// R R R U D D

// 출력 예시
// 3 4

public class UpDownLeftRight {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        
        // 공백을 기준으로 나누어서 String 배열에 삽입
        String[] plans = sc.nextLine().split(" ");
        
        // 시작 좌표
        int x = 1, y = 1;

        // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 입력받은 plans에 따라 이동
        // i는 plans의 인덱스, j는 moveTypes의 인덱스
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            
            // 이동 후 좌표 구하기 
            int nx = 0, ny = 0;
            
            // // plans와 동일한 문자 찾기
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            
            // 공간을 벗어나는 경우 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            
            // 이동 수행 
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }

}