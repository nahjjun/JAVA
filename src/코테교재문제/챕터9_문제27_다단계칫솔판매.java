package 코테교재문제;
import java.util.*;
public class 챕터9_문제27_다단계칫솔판매 {
	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		HashMap<String, Integer> sellerMoney = new HashMap<>(); // 각 판매원마다 번 돈을 기록할 해시맵
		List<Integer> result = new ArrayList<>();
		
		int i=0;
		for(String s:seller) { // 각 판매원마다 HashMap에 각자 순수 비용을 얼마 벌었는지 저장한다
			sellerMoney.put(s, amount[i++]*100); // 한개의 판매 이익금은 100원이므로 가격을 value로 설정해준다
		}
		for(i=0; i<enroll.length; ++i) {
			if(!sellerMoney.containsKey(enroll[i])) sellerMoney.put(enroll[i], 0);	// sellerMoney에 해당 판매원이 없다면 0개의 가격을 설정한다
		}
		
		// enroll 배열을 거꾸로 순회하면서 자신의 부모에게 10%의 금액을 떼준다.
		i=0;
		for(i=enroll.length-1; i>=0; --i) {
			int currentMoney = sellerMoney.get(enroll[i]);
			int giveMoney = currentMoney/10;
			if(giveMoney < 1) continue; // 만약 10퍼센트를 계산한 금액이 1원 미만이면 이득을 분배하지 않고 자신이 모두 가진다.
			
			// 만약 부모가 있다면
			if(!referral[i].equals("-")) 
				sellerMoney.put(referral[i], sellerMoney.get(referral[i])+(int)giveMoney); // 부모 노드에게 자신의 10%를 더해준다
			sellerMoney.put(enroll[i], sellerMoney.get(enroll[i])-(int)giveMoney); // 자신의 값에서 10%를 뗀다
		}
		for(String s:enroll) result.add(sellerMoney.get(s));
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	public static void main(String[] args) {
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12,4,2,5,10};
		
		System.out.println(Arrays.toString(solution(enroll,referral,seller,amount)));
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> refs/remotes/origin/master
