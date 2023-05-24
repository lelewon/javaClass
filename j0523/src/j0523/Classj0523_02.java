package j0523;

public class Classj0523_02 {

	public static void main(String[] args) {
		
//		Card[] c = new Card[52]; //배열선언
		
		Deck d = new Deck();
//		c[0]=Space,1,c[1],....c[51]
		//카드섞기
		d.shuffle();
		
		//카드뽑기 메소드 = d.pick(번호);
//		System.out.printf("%s, %d \n",d.pick(0).kind,d.pick(0).number);
		
		
		
		//출력하시오
		for(int i=0;i<52;i++) {
			System.out.printf("%s\n",d.c[i]); //toSt 사용했을때
			//System.out.printf("%s,%s\n",d.c[i].kind,Card.numbers[d.c[i].number]);
		}//for
		
		
		//Space,Heart,Diamond,Clover
//		for(int i=0;i<13;i++) {
//			c[i] = new Card();
//			c[i].kind = "Space";
//			c[i].number = 1;
//			System.out.printf("%s,%d \n",c[i].kind,c[i].number);
//		}
//		System.out.println();
		
	}

}

