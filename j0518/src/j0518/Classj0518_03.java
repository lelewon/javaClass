package j0518;

import java.util.Scanner;

public class Classj0518_03 {

	public static void main(String[] args) {
		// Scanner - 입력할때만 쓴다.
		Scanner scan = new Scanner(System.in);
		//숫자
//		int num = scan.nextInt();
//		//nextLine();
//		String str = scan.next();
//		double d = scan.nextDouble();
		
		//숫자 2개(1,10)를 입력받아 -> 1부터 10까지의 합을 구하시오
		int result = 0;
		int num = 0;
		int num2 = 0;
		
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
        System.out.println("숫자를 입력하세요");
		num2 = scan.nextInt();
		
		//if
		int temp = 0;
		if(num>num2) {
			temp = num;
			num = num2;
			num2 = temp;
		}
		
		for(int i=num;i<=num2;i++) {
			result = result + i;
		}
		System.out.println("합 : "+result);
		

	}

}

//for(int i=0;i<2;i++) {
//	System.out.println("숫자를 입력하세요");
//	num = scan.nextInt();
//	for(int j=num;j<=num2;j++) {
//		result = result + j;
//	}
//}
//System.out.println(result);