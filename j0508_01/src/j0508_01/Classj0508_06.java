package j0508_01;

public class Classj0508_06 {

	public static void main(String[] args) {
		//형 변환
		//기본형 - 8가지
		//논리형 1바이트 - boolean
		//문자형 2바이트 - char
		//정수형 1바이트 - byte, 2바이트 - short, 4바이트 - int, 8바이트 - long
		//실수형 4바이트 - float, 8바이트 - double
		//문자열 - String
		
		float f = 1.6f; //소수점이 있음.
		int i = (int)f; //강제형변환 1, 앞에 타입을 적어준다. 큰 쪽 -> 작은 쪽은 타입 붙여야 된다.
		System.out.println(i);
		
		int num  = 10;
		double d = num; //작은 쪽 -> 큰 쪽은 타입 안붙여도 된다.
		System.out.println(d);
		
		// String > double > float > long > int > char,byte,short
		
		char ch = 'A';
		int n = ch;
		System.out.println(n); //65
		
		int n2 = 97;
		char ch2 = (char)n2;
		System.out.println(ch2); //a
		

	}

}
