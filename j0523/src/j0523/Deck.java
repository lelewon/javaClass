package j0523;

public class Deck {
	
	//52개 카드 생성
	Card[] c = new Card[52]; // 배열선언, 4종류 * 13 = 52장
	
	Deck() { //기본생성자, 값에다가 넣어주기만 하지 실제적으로 값이 존재하지 않음, 실행만되면 끝! 사라짐
		//kind=null, number=0; //space,1 space,2 space,3...clover 13;
		//Space : 1-13장, Heart-13장, Diamond-13장, Clover-13장
		for(int i=0;i<52;i++) {
			c[i] = new Card(); //객체선언
			c[i].kind = c[i].shape[i/13]; //0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,........3,3,3,3
			c[i].number = (i%13)+1; //1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,..... X4
//			System.out.printf("%s,%d\n",c[i].kind,c[i].number);
		}//for
		
	}//Deck
	
	//카드뽑기 c[0]-Space,1 ,c[1],c[2],c[3]....c[51]
	Card pick(int index) { //0-51
		return c[index];
	}
	
	//0-51
	void shuffle() {
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*51);
			Card temp=null; //변수 유형이 int였던 것처럼 Card 를 써주고 두가지 타입의 형태를 담고싶기 때문
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
			
		}
	}
	
}
		
		
		
		
		
		
//		int k=0;
//		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				c[k] = new Card(Card.shape[i],j+1);
//			    k++;
//			}
//		}
		
		
		
//		for(int i=0;i<52;i++) { //13,26,39,52
//			
//			c[i] = new Card(); //객체선언
//			
//		}

