package j0517;

import java.util.Scanner;

public class Classj0517_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 3개의 숫자를 입력받아 합계를 구하시오
		// add 메소드를 사용하시오
		
		int num1 = 0;
		int num2 = 0;
		//객체선언
		//클래스명 참조변수명 = new 클래스명();
		Classj0517_03 c = new Classj0517_03();
		int[] num = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}
		//메소드 호출
		int result1 = c.add(num[0],num[1],num[2]);
		System.out.println("더하기 값 : "+result1);

	}
	
	//add
	int add(int num1,int num2,int num3) {
		int result = num1 + num2 + num3;
		return result;
	};
	

}
