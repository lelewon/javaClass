package j0515;

import java.util.Scanner;

public class Classj0515_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// [5][5]배열
		String[][] box = new String[5][5];
		
		//1개 배열에 숫자넣기
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
//		int[] num = {};
		
		//1개 배열에 숫자넣기
//		int[] num = new int[25];
//		for(int i=0;i<num.length;i++) {
//			num[i] = i+1;
//		}
		
		//배열섞기
		int temp=0, random=0;
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		//2차원 배열에 숫자넣기
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
				box[i][j] = ""+num[5*i+j]; //String 타입 = ""+int;
			}
		}
		
		while(true) {
			//싱단번호 출력
			for(int i=0;i<5;i++) {
				System.out.print(" \t"+i);
			}
			System.out.println();
			System.out.println("--------------------------------------------");
			
//			//2차원 배열에 숫자넣기
//			for(int i=0;i<box.length;i++) {
//				for(int j=0;j<box[i].length;j++) {
//					box[i][j] = ""+num[5*i+j]; //String 타입 = ""+int;
//					// box[0][0] = num[0];
//					// box[0][1] = num[1];
//					// box[0][2] = num[2];
//					// box[0][3] = num[3];
//					// box[0][4] = num[4];
//					// box[1][0] = num[5];
//					// box[1][1] = num[6];
//					// box[1][2] = num[7];
//					// box[1][3] = num[8];
//					//...
//					// box[4][4] = num[24];
//				}
//			}
			
			//화면출력
			for(int i=0;i<box.length;i++) {
				System.out.print(i+" |\t");
				for(int j=0;j<box[i].length;j++) {
					System.out.print(box[i][j]+"\t");
				}
				System.out.println();
			}
			
			//1-25까지 번호입력
			System.out.println("1-25까지 번호를 입력하세요>>");
			int input = scan.nextInt();
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(box[i][j].equals(input+"")) {
						box[i][j] = "X";
						continue;
					}
				}
			}
			
			//좌표입력 - 1
//			System.out.println("좌표를 입력하세요>>");
//			String input = scan.next(); //12
//			int no1 = '4'-'0'; //4 char - '0' = int
//			int no2 = '1'-'0'; //1
			
			//좌표입력 - 2
//			System.out.println("X좌표를 입력하세요>>(0-4까지 번호)");
//			int no1 = scan.nextInt();
//			System.out.println("Y좌표를 입력하세요>>(0-4까지 번호)");
//			int no2 = scan.nextInt();
//			box[no1][no2] = "X";
			
		}
		
		
		
	}

}
