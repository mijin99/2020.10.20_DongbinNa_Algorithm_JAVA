package Step04_Sort;

// 계수 정렬
// 동일한 값을 가지는 데이터가 여러개 존재할 때, 효과적으로 사용
public class CountingSort {
	public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
    	
    	// arr 배열의 원소 개수
        int n = 15;
        
        // 모든 원소의 값이 0보다 크거나 같다고 가정
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        
        // 모든 범위를 포함하는 배열 선언(모든 값은 0으로 초기화)
        int[] cnt = new int[MAX_VALUE + 1]; // index: 0 ~ 9

        for (int i = 0; i < n; i++) {
            cnt[arr[i]] += 1; // 각 arr 배열 값에 해당하는 인덱스의 값 증가
        }
        
        for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 정렬 정보 확인
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " "); // 띄어쓰기를 기준으로 등장한 횟수만큼 인덱스 출력
            }
        }
    }
}
