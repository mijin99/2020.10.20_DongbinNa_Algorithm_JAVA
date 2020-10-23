package Step02_Greedy;

// 그리디 알고리즘
// 거스름 돈

// 가장 큰 화폐 단위부터 돈을 거슬러 준다.

public class Change {

    public static void main(String[] args) {
        int n = 1260; // 거슬러 줘야하는 금액
        int cnt = 0; // 동전 개수
        int[] coinTypes = {500, 100, 50, 10};
		
        // 큰 화폐부터 차근 차근
        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin; // 몫을 다시 n값으로
        }

        System.out.println(cnt);
    }
}
