package j0522;

public class Classj0522_07 {
	
	//Classj0522_07(){} //기본생성자 자동생성
	int x; //인스턴스 변수, 초기화
	int y=x; //인스턴스 변수, 초기화
	char ch; // ='\u0000', 초기화
	String str;
	

	public static void main(String[] args) {
		int a=0; //초기화
		int b=a; //초기화
		
		//a,b,x,y를 출력하시오
		//출력
		
		System.out.println(a);
		System.out.println(b);

		//객체선언후 참조변수명.변수명
		Classj0522_07 c = new Classj0522_07(); //기본생성자 호출해서 초기화
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println("ch : "+c.ch);
	    //u를 사용해야함
		//null은 무한대를 말하기때문에 널에 계산을 하면 다 널이 나온다.
		System.out.println("str : "+c.str);

	}

}
