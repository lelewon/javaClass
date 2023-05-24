package j0523;

import java.util.*; //* 뜻은 java.util의 모든 클래스를 다 가져온다는 것,
//클래스부분만 *로 표시 가능, 패키지는 첫글자가 소문자, 클래스는 첫글자가 대문자

public class Classj0523_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Date today = new Date();

		Card c = new Card("Space",1); //카드 한장 생성할때
		
		Card c2 = null;
		Deck d1 = new Deck();
		
		//c2 = d1; //타입이 다르기에 넣을 수 없음
		
		c2 = c; //같은 타입이면 넣을 수 있음, 조상과 자손의 관계가 있으면 가능
		
		Object o = null;
		o = d1; //조상과 자손이라는 관계가 맺어져서 가능함
		
		
		int a = 5;
		String str = null;
		//str = a; //X 타입이 다르기에 넣을 수 없음
		
		System.out.println(c);
		
		
		int num = 5;
		num = 10;
		final int NUMBER = 1; //상수
//		number=5; X안됨
		
		
//		for(int i=0;i<52;i++) {
//			System.out.println(i/13);
//			
//		}

	}//main
	
	static void add() {
		
	}
	
	static void add(int x) { //오버로딩 : 다른메소드가 됨
		
	}

}
