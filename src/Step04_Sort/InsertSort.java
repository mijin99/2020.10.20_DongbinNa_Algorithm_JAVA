package Step04_Sort;

// 삽입 정렬
public class InsertSort {
	public static void main(String[] args) {

        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 0이 아닌 인덱스 1부터 시작
        for (int i = 1; i < n; i++) {
            // 인덱스 i부터 1까지 감소하며 반복하는 문법
            for (int j = i; j > 0; j--) {
                // 작은 값을 한 칸씩 왼쪽 값과 비교하면서  한칸씩 이동
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // 왼쪽에 있는 값이 자기자신보다 적으면 j-for문 탈출
                // i값 1증가하여 i-for문 계속 진행
                else break;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
