package j0518;

import java.util.Scanner;

public class Classj0518_06 {

	public static void main(String[] args) {
		// 국어,영어,수학 점수를 입력받아 평균점수 90점 이상 A, 80점 이상 B, C, D, 60점 이하 F
		Scanner scan = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextInt();
		
//		int[] num = new int[3];
//		String[] title = {"국어","영어","수학"};
//		for(int i=0;i<3;i++) {
//			System.out.println((title[i+1])+"점수를 입력하세요");
//			num[i]= scan.nextInt();
//		}
				
		int total = kor+eng+math;
		double avg = total/3.0;
		
//		if(avg>=90) {
//			System.out.println("A");
//		}else if(avg>=80){
//			System.out.println("B");
//		}else if(avg>=70){
//			System.out.println("C");
//		}else if(avg>=60) {
//			System.out.println("D");
//		}else{
//			System.out.println("F");
//		}
		
		//97점 이상 A+, 93점 이하 A-,................
		if(avg>=90) {
			System.out.print("A");
			if(avg>=97) {
				System.out.println("+");
			}else if(avg<=93) {
				System.out.println("-");
			}
		}else if(avg>=80) {
			System.out.print("B");
			if(avg>=87) {
				System.out.println("+");
			}else if(avg<=83) {
				System.out.println("-");
			}
		}else if(avg>=70) {
			System.out.print("C");
			if(avg>=77) {
				System.out.println("+");
			}else if(avg<=73) {
				System.out.println("-");
			}
		}else if(avg>=60) {
			System.out.print("D");
			if(avg>=67) {
				System.out.println("+");
			}else if(avg<=63) {
				System.out.println("-");
			}
		}else {
			System.out.println("F");
		}

	}

}
