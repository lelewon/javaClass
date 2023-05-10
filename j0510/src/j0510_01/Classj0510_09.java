package j0510_01;

import java.util.Scanner;

public class Classj0510_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 10개의 숫자를 입력받아 합계를 출력하시오
		int num = 0;
		int sum = 0;
		
		int i = 0;
		while(i<10) {
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			sum = sum + num;
			
			i++;
		}
		System.out.println("합계 : "+sum);
		
		

	}

}
