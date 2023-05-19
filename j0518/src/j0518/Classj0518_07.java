package j0518;

import java.util.Scanner;

public class Classj0518_07 {

	public static void main(String[] args) {
		// 1-100까지의 랜덤숫자를 생성해서 숫자를 맞추는 프로그램을 구현하시오
		// 횟수 10번만 가능
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int[] num = new int[10];
		
		//for문
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
			
			if(num[i]==random) {
				System.out.print("정답입니다. ");
				break;							
			}else {
				System.out.println("틀렸습니다.");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		System.out.println("정답 : "+random);
		
		System.out.println("내가 입력한 번호 : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
			
		}
	}

}
