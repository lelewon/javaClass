package j0525;

import java.util.ArrayList;

public class Classj0525_01 {

	public static void main(String[] args) {
		
		Card[] c = new Card[2];
		
		
		Card c1 = new Card(Card.kinds[0],1);
		Card c2 = new Card(Card.kinds[1],2);
		Card c3 = new Card(Card.kinds[2],3);
		Card c4 = new Card(Card.kinds[3],4);
		
		c[0] = c1;
		c[1] = c2;
		
		ArrayList<Card> list = new ArrayList();
		//ArrayList 추가
		list.add(c1); //0  //Object o = new Card(Card.kinds[1],1)
		list.add(c2); //1
		list.add(c3); //2
		list.add(c4); //3
		
		//ArrayList 읽기
//		Card card = (Card) list.get(0);
		for(int i=0;i<list.size();i++) {//4개 - HEART
			if(list.get(i).number == 4) {
				list.remove(i);
			}
		}
		
		System.out.println("----------------------------------------");
		for(int i=0;i<list.size();i++) {//c.length
			System.out.println(list.get(i).kind+","+list.get(i).number);
		}
        System.out.println("개수 : "+list.size());
        System.out.println("프로그램 종료");
        
        
	}
}
			
          //삭제 방법
          //list.remove(2);
        
//        //퀴즈. kind - HEART삭제하시오
//        for(int i=0;i<list.size();i++) {//4개 - HEART
//			if(list.get(i).kind.equals("HEART")) {
//				list.remove(i);
//			}
//			System.out.println(list.get(i).kind+","+list.get(i).number);
//        
//        }
//        System.out.println("프로그램 종료");
           

//        for(int i=0;i<list.size();i++) {//c.length
//			System.out.println(list.get(i).kind+","+list.get(i).number);
//		}


        //ArrayList 읽기
//		Card card = (Card) list.get(0);
//		list.get(0); //Object 라서 형변환이 필요함
//		System.out.println(card.kind+","+card.number);


        //ArrayList 읽기
//		list.get(0); //Object 라서 형변환이 필요함
//		System.out.println(c1);
//		System.out.println(list.get(0));