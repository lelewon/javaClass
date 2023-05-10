package j0510_01;

import java.util.Scanner;

public class Classj0510_05 {
	
	public static void main(String[] args) {
		
		//점수를 입력받아, 90점 이상이면 A, 80점 이상이면 B, 70점 이상 C, 60점이상 D, 나머지는 F
		//97점이상 A+, 93점 이하 A-, 86점 이상 B+, 83점 이하 B-
		
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		input = scan.nextInt();
		
		if(input>=90) {
			System.out.print("A");
			if(input>=97) {
				System.out.println("+");
			}else if(input<=93) {
				System.out.println("-");
			}
		}else if(input>=80){
			System.out.print("B");
			if(input>=87) {
				System.out.println("+");
			}else if(input<=83) {
				System.out.println("-");
			}
		}else if(input>=70) {
			System.out.print("C");
			if(input>=77) {
				System.out.println("+");
			}else if(input<=73) {
				System.out.println("-");
			}
		}else if(input>=60) {
			System.out.print("D");
			if(input>=67) {
				System.out.println("+");
			}else if(input<=63) {
				System.out.println("-");
			}
		}else {
			System.out.print("F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
//		str = scan.next();
//		if(str.equalsIgnoreCase("c")) {  //기본형 8개만 등가비교 가능, 이건 안되는 문구, equalsIgnoreCase는 대문자를 소문자로 바꿔서 비교한다.
//			System.out.println("C 입니다.");
//		}else {
//			System.out.println("C가 아닙니다.");
//		}
	
	

//	public static void main(String[] args) {
//		String input = "";
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
////		input = scan.next(); //문자열
//		ch = input.charAt(0); //문자열의 첫번째 문자를 가져옴
//		if(ch=='C') {
//			System.out.println("C 입니다.");
//		}else {
//			System.out.println("C가 아닙니다.");
//		}

	}

}
