package j0518;

import java.util.Scanner;

public class Classj0518_05 {

	public static void main(String[] args) {
		// 숫자를 입력받아, 양수인지 음수인지 출력하세요 0은 양수로 인정
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
//		System.out.println("숫자를 입력하세요");
//		num = scan.nextInt();
//		if(num>=0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
		
		//국어,영어,수학 입력받아 평균 60을 넘으면 합격, 불합격 출력하세요
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		//if 안에 넣으면 sum의 값이 없는것이 되어 다 불합격으로 처리된다.(조심!!)
		int total = kor+eng+math;
		double avg = total/3.0;
		
		if(avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
