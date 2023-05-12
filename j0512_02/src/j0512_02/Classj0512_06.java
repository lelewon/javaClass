package j0512_02;

import java.util.Scanner;

public class Classj0512_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0;i<num.length;i++) {
			System.out.println("점수를 입력하세요");
			num[i] = scan.nextInt();
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		// 

	}

}
