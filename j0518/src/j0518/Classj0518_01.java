package j0518;

import java.util.Scanner;

public class Classj0518_01 {

	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 * 2 * 1;
		// 10! = 10 * 9 * 8 * 7 * 6 * 5 ....* 1;
		// for 문으로 해보세요
		// 숫자를 입력받아 해당되는 팩토리얼을 구현하시오
		
		int num=1;
		
//		for(int i=5;i>0;i--) {
//			num = num * i;
//			System.out.println("num : "+num);
//		}
//		System.out.println("결과값 : "+num);
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		System.out.println("팩토리얼에 사용하는 숫자를 입력하세요");
		input = scan.nextInt();
		for(int i=input;i>0;i--) {
			num = num * i;
//			System.out.println("num : "+num);
		}
		System.out.printf("결과값 : %,d\n",num);
		
		
		
//		int result = 0;
//		for(int i=1;i<=10;i++) {
//			result = result + i;
//
//		}
//		
//		
//		// 1. 1-10까지의 합
//		int result1 = 0;
//		for(int i=1;i<=10;i++) {
//			result1 = result1 + i;
//		}
//		System.out.println("1부터 10까지의 합 : "+result1);
//		
//		// 2. 1-100까지의 합
//		int result3 = 0;
//		for(int i=1;i<=100;i++) {
//			result3 = result3 + i;
//		}
//		System.out.println("1부터 100까지의 합 : "+result3);
//		
//		// 3. 1-1000까지의 합
//		int result4 = 0;
//		for(int i=1;i<=1000;i++){
//			result4 = result4 + i;
//		}
//		System.out.println("1부터 1000까지의 합 : "+result4);

	}

}
