package j0510_01;

import java.util.Scanner;

public class Classj0510_02 {

	public static void main(String[] args) {
		
		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하세요.
		// 1. 변수선언 2. scan 한후 변수 입력 받음 3. 비교 4. 출력 
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		num = scan.nextInt();
		if(num>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
		//입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다. 출력
		// 1. 변수선언 2. scan 한후 변수 입력 받음 3. 비교 4. 출력 
		// 1. 변수선언
//		int input = 0;
//		
//		// 2. scan 선언 후 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();
//		
//		// 3. 비교
//		if(input%2==0) {
//			System.out.println("2의 배수입니다.");
//		}else {
//			System.out.println("2의 배수가 아닙니다.");
//		}
		
		
		//if 문만 존재
//		int num = 0;
//		if(num==0) {
//			System.out.println("0입니다.");
//		}

		
		//if,else문
//		int num = 8;
//		(num>=1)?"":""; //삼항식
//		if(num == 8) {
//			System.out.println("8입니다.");
//		}else {
//			System.out.println("8이 아닙니다.");
//		}

		
		
//		int num = 0;
//		if(num>0) {
//			System.out.println("양수입니다.");
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
	}

}
