package j0510_01;

import java.util.Scanner;

public class Classj0510_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 10개의 숫자를 입력받아 합계를 출력하시오
		// 1. 변수선언 2. scan입력 3. 합계 4. 출력
		// 1. 변수선언
		int num = 0;
		int sum = 0;
		// 반복문
		int i = 0;
		while(i<10) {
			// 2. 입력
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num = scan.nextInt();
			// 3. 합계
			sum = sum + num;
			
			i++;
		}
		// 4. 출력
		System.out.println("합계 : "+sum);
		
	}

}
