package j0509_01;

public class Classj0509_01 {

	public static void main(String[] args) {
		//변수 - 8가지
		//논리형 - boolean
		//문자형 - char ' '
		//정수형 - byte, short, int, long
		//실수형 - float, double
		//문자형 - String (객체, 길이와 상관없이 넣을 수 있음)
		//객체 - 다른 타입의 것들을 다 넣을 수 있는 개념, 문자, 숫자 등
		char ch = 'a'; //' ' 가능, A-65, a-97, 0-48
		int num = 1;
	    int num2 = 2;
	    int num3 = 3;
	    int num4 = 4;
	    int num5 = 5;
	    int num6 = 6;
	    int num7 = 7;
	    int num8 = 8;
	    int num9 = 9;
	    int num10 = 10;
	    
	    System.out.printf("더하기 결과값 : %d \n",num+num2);
	    System.out.printf("나누기 결과값 : %f \n",num/(double)num2);
	    
	    System.out.print("더하기 결과값 : "+(num+num2)+"\n");

	    System.out.println();
	    
		System.out.println(num+num2); //소수점 변경 어려움
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/num2);
		System.out.println(7+5);
		System.out.println(7-5);
		System.out.println(7*5);
		System.out.println(7/5);

	}

}
