package j0517;

public class Classj0517_01 {

	public static void main(String[] args) {
		//객체선언
		Card c1= new Card();
		//사용방법 참조변수명.변수명
		c1.kind = "Heart";
		c1.number = 7;
		c1.width=500;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		Card c3 = new Card();
		
		System.out.println("c1 카드종류 : "+c1.kind);
		System.out.println("c1 카드숫자 : "+c1.number);
		System.out.println("c1 가로길이 : "+c1.width);
		System.out.println("c1 세로길이 : "+c1.height);
		System.out.println("-------------------------");
		System.out.println("c2 카드종류 : "+c2.kind);
		System.out.println("c2 카드숫자 : "+c2.number); //c1,c2,c3로 사용해도 되지만 스테틱변수의 경우는 클래스명으로 꼭 써준다. Card.number 처럼!!!
		System.out.println("c2 가로길이 : "+c2.width);
		System.out.println("c2 세로길이 : "+c2.height);
		System.out.println("------------------------");
		System.out.println("c3 가로길이 : "+c3.width);
	}

}
