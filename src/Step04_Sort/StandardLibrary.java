package Step04_Sort;

import java.util.Arrays;

// 표준 라이브러리
// 오름차순
public class StandardLibrary {
	public static void main(String[] args) {
    	
		// 원소의 개수
        int n = 10;
        
        // 배열 정의
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 정렬
        Arrays.sort(arr);

        // 정렬된 배열 출력
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
