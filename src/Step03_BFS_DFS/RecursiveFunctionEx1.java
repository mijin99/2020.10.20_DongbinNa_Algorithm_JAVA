package Step03_BFS_DFS;

// 종료 조건이 없어서 무한으로 재귀함수가 실행됨
public class RecursiveFunctionEx1 {

    public static void recursiveFunction() {
        System.out.println("재귀 함수를 호출합니다.");
        recursiveFunction(); // 재귀함수 호출
    }

    public static void main(String[] args) {
        recursiveFunction(); // 함수 호출
    }

}
