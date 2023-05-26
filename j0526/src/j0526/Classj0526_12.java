package j0526;

import java.util.Scanner;

public class Classj0526_12 {

	public static void main(String[] args) {
		String lotto1 = "1";
//		String lotto2 = "1조12587";
		//1-9조 00000-99999
		//0-9조 랜덤숫자를 맞추는 게임을 구현하시오
		//입력 : 1, 5 등
		
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*10);
		//
		System.out.println("조의 앞자리 숫자를 입력하세요");
		String strNum = scan.next(); //1조
		//String strNum2 = strNum.substring(0,1);
		int myNum = Integer.parseInt(strNum.substring(0,1)); //String -> int 로 형변환, 입력받은 1을 숫자1고 변경
		
		
		if(myNum==random) {
			System.out.println("당첨");
		}else{
			System.out.println("꽝");
		}

	}

}



//		//랜덤 숫자를 int random = 랜덤숫자 받기
//		//입력숫자 : String myNum = 입력숫자, 1조
//		//당첨, 꽝을 출력하시오
//		
//		Scanner scan = new Scanner(System.in);
//		int random = (int)(Math.random()*10);
//		//
//		System.out.println("앞의 조와 5자리의 숫자를 입력하세요");
//		String strNum = scan.next(); //1조
//		//String strNum2 = strNum.substring(0,1);
//		int myNum = Integer.parseInt(strNum.substring(0,1)); //String -> int 로 형변환, 입력받은 1을 숫자1고 변경
//		
//		
//		if(myNum==random) {
//			System.out.println("당첨");
//		}else{
//			System.out.println("꽝");
//		}


//		//랜덤 숫자를 int random = 랜덤숫자 받기
//		//입력숫자 : int myNum = 입력숫자
//		//당첨, 꽝을 출력하시오
//		
//		Scanner scan = new Scanner(System.in);
//		int random = (int)(Math.random()*10);
//		//
//		System.out.println("숫자를 입력하세요");
//		int myNum = scan.nextInt();
//		
//		if(myNum==random) {
//			System.out.println("당첨");
//		}else{
//			System.out.println("꽝");
//		}