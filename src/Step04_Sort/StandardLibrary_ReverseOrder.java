package Step04_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 표준 라이브러리
// 내림차순
public class StandardLibrary_ReverseOrder {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력할 정수의 개수
        int n = sc.nextInt();

        // N개의 정수를 입력받아 배열에 저장
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 기본 정렬 라이브러리를 이용하여 내림차순 정렬 수행
        Arrays.sort(arr, Collections.reverseOrder());

        // 정렬된 배열 출력
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
