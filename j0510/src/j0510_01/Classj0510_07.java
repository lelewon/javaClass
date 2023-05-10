package j0510_01;

import java.util.Scanner;

public class Classj0510_07 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*10)+1; //1,2,3
		//숫자를 입력받아 같은 값일 경우 당첨 그렇지 않으면 꽝 출력하시오
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
		
		if(num==random) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		System.out.println("랜덤숫자 : "+random);
		System.out.println("입력숫자 : "+num);
		
		
		
		// 랜덤숫자
//		 System.out.println((int)(Math.random()*10)+1);
		
		
		// 랜덤숫자
//		int random = 0;
//		random = (int)(Math.random()*10); //0~9
//		System.out.println(random);
		
		// 랜덤숫자
//		int random = 0;
//		random = (int)(Math.random()*3)+1; //1~3
//		System.out.println(random);
		
		// 랜덤숫자
//		int random = 0;
//		random = (int)(Math.random()*5); //0~9
//		System.out.println(random);

	}

}
