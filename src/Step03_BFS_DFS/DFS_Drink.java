package Step03_BFS_DFS;

import java.util.Scanner;

// 음료수 얼려 먹기 - DFS

// 입력 예시
// 4 5
// 00110
// 00011
// 11111
// 00000

// 구멍이 뚫려있는 부분 0, 그렇지 않은 부분 1 
// 만들 수 있는 아이스크림의 개수

public class DFS_Drink {
	
	public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {
    	
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >=n || y <= -1 || y >= m) { // 각각의 값은 x: 0 1 2 3, y: 0 1 2 3 4 에 포함되어 있어야 한다.
            return false;
        }
        
        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
        	
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            
            // 자기자신 방문 처리 했으니 true
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt(); // 4 - 행
        m = sc.nextInt(); // 5 - 열
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기 
        for (int i = 0; i < n; i++) { // 한 행씩 입력
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) { // 각각의 열에 값 삽입
                graph[i][j] = str.charAt(j) - '0'; // - '0': 문자를 숫자로 변경
            }
        }

        // 아이스크림 카운트
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               
                if (dfs(i, j)) { // true일 경우 카운트
                    result += 1;
                }
            }
        }
        System.out.println(result); // 정답 출력 
    }
	
}
