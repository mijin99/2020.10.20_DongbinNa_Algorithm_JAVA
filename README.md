# 1. 코딩테스트 첫걸음

# 2. 구현 & 그리디 유형
## (1) 구현 - 시뮬레이션, 완전 탐색과 유사
  ### 1) 상하좌우 ([코드](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step02_Implementaion/UpDownLeftRight.java))
  **문제**  
  여행가 A는 N x N 크기의 정사각형 공간 위에 서 있습니다.  
  가장 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당합니다.  
  여행가는 상(U), 하(D), 좌(L), 우(R) 방향으로 이동할 수 있으며, 시작 좌표는 항상 (1,1)입니다. 
  
  **이때, N x N 크기의 정사각형 공간을 벗어나는 움직임은 무시됩니다.**
  ```java
  // 이동 후 좌표 
  int nx = 0, ny = 0;
  if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
  ```
  **Point. 2차원 공간, 방향 백터 활용**
  ```java
  // L, R, U, D에 따른 이동 방향 
  int[] dx = {0, 0, -1, 1};
  int[] dy = {-1, 1, 0, 0};
  char[] moveTypes = {'L', 'R', 'U', 'D'};
  ```

  ### 2) 시각 ([코드](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step02_Implementaion/Time.java)) - 완전 탐색 유형
  **문제**  
  정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지 3이 포함되는 모든 경우의 수(Cnt)를 출력합니다.  
  
  **Point. 3이 포함되는지 확인**
  ```java
  // % 10 : 1의 자리에 3이 포함되어 있는지
  // / 10 : 10의 자리에 3이 포함되어 있는지
    if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
        return true; // 포함될 경우 true 리턴
    return false; // 포함되지 않았을 경우 false 리턴
  ```
  
  ### 3) 왕실의 나이트([코드](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step02_Implementaion/RoyalHousehold.java))
  **문제**    
  첫째 줄에 8 x 8 좌표 평면상에서 현재 나이트가 위치한 곳의 좌표를 나타내는 두 문자로 구성된 문자열이 입력된다.  
  입력 문자는 a1처럼 열과 행으로 이뤄진다.  
  첫째 줄에 나이트가 이동할 수 있는 경우의 수를 출력하시오.   
  
  **나이트는 특정 위치에서 다음과 같은 2가지 경우로 이동할 수 있습니다.**
  * 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
  * 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
  
  **Point. 나이트가 이동할 수 있는 8가지 방향 정의**
  ```java
  int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
  int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
  ```
  
  ### 4) [게임 개발](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step02_Implementaion/Game.java)
## (2) 그리디
# 3. DFS & BFS
## (1) [스택](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/StackEx.java)
## (2) [큐](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/QueueEx.java)
## (3)[인접행렬](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/AdjacencyMatrixEx.java)
## (4) 재귀함수
  ### 1) [Ex1 - 종료 조건 X (무한)](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/RecursiveFunctionEx1.java)
  ### 2) [Ex2 - 종료 조건 O](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/RecursiveFunctionEx2.java)
## (5)[팩토리얼](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/FactorialEx.java)
## (6) DFS(깊이 우선 탐색) / 스택 또는 재귀함수 사용
  ### 1) [Ex](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/DFS_Ex.java)
  ### 2) [음료수](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/DFS_Drink.java)
## (7) BFS(너비 우선 탐색) / 큐 사용
  ### 1) [Ex](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/BFS_Ex.java)
  ### 2) [미로탈출](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step03/BFS_EscapeTheMaze.java)
# 4. 정렬 알고리즘
## (1) [선택 정렬](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step04/SelectionSort.java)
## (2) [삽입 정렬](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step04/InsertSort.java)
## (3) [퀵 정렬](https://github.com/BYUNSUJUNG/2020.10.20_DongbinNa_Algorithm_JAVA/blob/master/src/Step04/QuickSort.java)
#
