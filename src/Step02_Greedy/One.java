package Step02_Greedy;

public class One {
	public static void main(String[] args) {
		int n =1260; //�ܾ�
		int cnt= 0;//��������
		int [] coinType = {500,100,50,10};
		//ȭ�󰳼���ŭ
		for(int i=0;i<4;i++) {
			int coin = coinType[i];//�����ϳ� ������
			cnt += n/coin; //��ְ�
			n %= coin; //n���� �������� ����
		}
		System.out.println(cnt);
		
	}
}
