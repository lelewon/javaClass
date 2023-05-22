package j0522;

public class Classj0522_08 {
	
	static int cv = 1; //클래스 변수 - 객체선언없이 클래스명.변수명, 명시적 초기화
	int iv = 1; //인스턴스 변수 - 객체선언 후 참조변수명.변수명, 명시적 초기화
	
	static {
		cv=2; //클래스 초기화블럭
	}
	{
		iv=2; //인스턴스 초기화블럭
	}
	
	Classj0522_08(){ //생성자
		iv=3;
	}

	public static void main(String[] args) {
		Classj0522_08 c = new Classj0522_08();
		
		c.iv = 4;
		
		//초기화
		
		System.out.println(c.iv);
		

	}

}
