package j0525;

import java.util.ArrayList;

public class Classj0525_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();
		
//		//퀴즈 1 - 1~13까지
//		for(int i=0;i<13;i++) {
//			list.add(new Card(Card.kinds[0],i+1));
//		}
//		//출력
//		for(int i=0;i<13;i++) {
//		System.out.println(list.get(i).kind+","+Card.numbers[list.get(i).number]);
//		}
		
//		//퀴즈 2 - 카드 4개를 만들어서, 4가지 종류를 넣으시오
//		for(int i=0;i<4;i++) {
//			list.add(new Card(Card.kinds[i],1));
//			System.out.println(list.get(i).kind+","+Card.numbers[list.get(i).number]);
//		}
		
		//퀴즈 3 - 카드 52장을 만들어서 SPACE-13장, HEART-13장, DIAMOND-13장, CLOVER-13장 숫자는 1로
		//1,2,3,4,5,6...52 0*13+1, 0*13+2.....0*13+12
		for(int i=0;i<52;i++) {
			list.add(new Card(Card.kinds[i/13],i%13+1));
			System.out.println(list.get(i).kind+","+list.get(i).number);
		}

	}

}

//		Card c1 = new Card(Card.kinds[0],1);
//		list.add(c1);