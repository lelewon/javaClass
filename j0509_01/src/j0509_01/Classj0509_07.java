package j0509_01;

import java.util.Scanner;

public class Classj0509_07 {

	public static void main(String[] args) {
		// 숫자를 입력받아 짝수인지 홀수인지 출력하시요
		// 짝수입니다. 홀수입니다.
		// 1. 변수선언, 2. 입력, 3. 출력
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		input = scan.nextInt();
		
		String answer = (input%2==0)?"짝수입니다.":"홀수입니다.";
		System.out.println(answer);

	}

}
