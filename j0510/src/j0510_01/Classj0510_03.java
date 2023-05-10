package j0510_01;

import java.util.Scanner;

public class Classj0510_03 {

	public static void main(String[] args) {
		
		// m,f 문자로 입력받아 m이면 남자입니다. f이면 여자입니다. 출력하시오
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요");
//		ch = scan.next().charAt(0);
//		if(ch==109||ch==77) {
//			System.out.print("남자입니다.");
//		}else if(ch==102||ch==70){
//			System.out.println("여자입니다.");
//		}else {
//			System.out.println("m or f를 입력하세요");
//		}
		
		// m,f 문자열로 입력받아 m이면 남자입니다. f이면 여자입니다. 출력하시오
				String ch = ""; //객체는 ==으로 비교 불가, 기본형 타입만 ==으로 비교 가능
				Scanner scan = new Scanner(System.in);
				System.out.println("영문자를 입력하세요");
				ch = scan.next(); //문자열을 입력받음
				
				if(ch.equals("m") || ch.equals("M")) {
					System.out.print("남자입니다.");
				}else if(ch.equals("f") || ch.equals("F")){
					System.out.println("여자입니다.");
				}else {
					System.out.println("m 또는 f를 입력하세요");
				}
		
		
		
		
		
		
		// 입력한 숫자가 1,6,9만 입력받아 1,6,9를 출력하시오
		// if else if() else
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();
//		if(input==1) {
//			System.out.println("1입니다.");
//		}else if(input==6){
//			System.out.println("6입니다.");
//		}else if(input==9){
//			System.out.println("9입니다.");
//		}else {
//			System.out.println("1,6,9를 입력하세요");
//		}
		
		
		
		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하세요.
		// 1. 변수선언 2. scan 한후 변수 입력 받음 3. 비교 4. 출력 
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요");
//		num = scan.nextInt();
//		if(num>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}//if

	}//main

}//class
