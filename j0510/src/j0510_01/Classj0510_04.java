package j0510_01;

import java.util.Scanner;

public class Classj0510_04 {

	public static void main(String[] args) {
		
		//m.f 를 입력받아 m남자, f여자라고 출력하시오
		//switch문을 사용하시오
		char input = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요(m,f)");
		input = scan.next().charAt(0);
		
		switch(input) {
		case 'm': case 'M':
			System.out.println("남자입니다.");
			break;
		case 'f':
		case 'F':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("성별을 입력해주세요");
		}
		
		
		
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();
		
		//switch() //switch에서 비교 한번
//		switch(input) {
//		
//		case 1:
//			System.out.println("1입니다.");
//			break;
//		case 6:
//			System.out.println("6입니다.");
//			break;
//		case 9:
//			System.out.println("9입니다.");
//			break;
//		default:
//			System.out.println("원하는 숫자가 아닙니다.");
//		}//switch
		
		
		
//		if(input==1) { //각 구문마다 비교, 느리다.
//			System.out.println("1입니다.");
//		}else if(input==6){
//			System.out.println("6입니다.");
//		}else if(input==9){
//			System.out.println("9입니다.");
//		}else {
//			System.out.println("1,6,9를 입력하세요");
//		}

	}

}
