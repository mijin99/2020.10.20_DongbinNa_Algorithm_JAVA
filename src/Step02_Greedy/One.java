package Step02_Greedy;

public class One {
	public static void main(String[] args) {
		int n =1260; //잔액
		int cnt= 0;//동전개수
		int [] coinType = {500,100,50,10};
		//화폐개수만큼
		for(int i=0;i<4;i++) {
			int coin = coinType[i];//동전하나 꺼내기
			cnt += n/coin; //몫넣고
			n %= coin; //n에는 나머지를 넣음
		}
		System.out.println(cnt);
		
	}
}
