package Step02_Implementaion;

import java.util.Scanner;

// 구현 알고리즘
// 왕실의 나이트

// 입력 예시
// a1

// 출력 예시
// 2

public class RoyalHousehold {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    // 현재 나이트의 위치 입력받기
	    String inputData = sc.nextLine();
	    int row = inputData.charAt(1) - '0'; // - '0': 문자를 숫자로 바꾸어준다. // '1' -> 1
	    int column = inputData.charAt(0) - 'a' + 1; // 0 + 1 -> 1
	
	    // 나이트가 이동할 수 있는 8가지 방향 정의
	    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
	
	    // 가능 위치 카운트
	    int cnt = 0;
	    
	    // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
	    for (int i = 0; i < 8; i++) {
	        // 이동하고자 하는 위치 확인
	        int nextRow = row + dx[i];
	        int nextColumn = column + dy[i];
	        
	        // 이동 위치로 이동할 수 있으면 카운트 증가
	        if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
	            cnt += 1;
	        }
	        
	        /*	범위 밖으로 나가는 경우을 cnt안하는 방법도 있음 - UpDownLeftRight에서 쓴 방식
	         *  if (nextRow < 1 || nextRow > 8 || nextColumn < 1 || nextColumn > 8) continue;
	        
	       		cnt += 1;
	       		
	         * */
	    }
	    System.out.println(cnt);
	}

}
