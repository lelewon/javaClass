package j0512;

import java.util.Scanner;

public class Classj0512_05 {

	public static void main(String[] args) {
		// 10진수를 2진수로 변경하는 프로그램
		Scanner scan = new Scanner(System.in);
		//			      0       1      2       3      4     5    6    7    8    9
		String[] data = {"0000","0001","0010","0011","0100","0101","60","70","80","90"};
		int[] num = new int[5];
		
		//1. 숫자입력
		for(int i=0;i<5;i++) {
			System.out.println("10진수를 입력하세요"); //5
			num[i] = scan.nextInt();
			
			//int num = scan.nextInt();
			//System.out.println(data[num]);
			
		}
		//2. 2진코드 출력
		for(int i=0;i<5;i++) {
			System.out.print(data[num[i]]+" "); //출력
			
		}
		System.out.println();
		
		
		
		
		
//		String[] binary = {"0000","0001","0010","0011","0100",
//				           "0101","0110","0111","1000","1001"};
//		String[] binary = new String[10];
//		binary[0] = "0000";
//		String[] binary = {"0","1","2","3","4",
//		                   "5","6","7","8","9"};
//		//5
//		//binary[5];
//		//4
//		
//		//binary[0];
//		//binary[1],binary[2],binary[3],binary[4],binary[5];
//		//binary[6],binary[7],binary[8],binary[9];
//				
//		
//		int[] num = new int[4];
//		
//		// 1개씩 받기
//		// 1025 - 0001 0000 0010 0101
//		for(int i=0;i<num.length;i++) {
//			System.out.println("번호를 입력하세요");
//			num[i] = scan.nextInt();
//
//			
//		}
//		// 10진코드 출력
//		System.out.print("10진코드 : ");
//		for(int i=0;i<num.length;i++) {
//			System.out.print(num[i]+" ");
//		}
//		System.out.println();
//		
//		
//		// 2진코드로 번호출력
//		System.out.print("2진코드 : ");
//		for(int i=0;i<num.length;i++) {
//			System.out.print(binary[num[i]]+" ");
//		}
//		System.out.println();
//		//1
//		//0
//		//2
//		//5

	}

}