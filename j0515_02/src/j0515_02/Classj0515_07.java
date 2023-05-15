package j0515_02;

import java.util.Scanner;

public class Classj0515_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// [5][5]배열
		String[][] box = new String[5][5];
		
		//1개 배열에 숫자넣기
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		//배열섞기
		int random = 0;
		int temp = 0;
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		//2차원 배열에 숫자넣기
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
				box[i][j] = ""+num[5*i+j];
			}
		}
		
		while(true) {
			for(int i=0;i<5;i++) {
				System.out.print(" \t"+i);
			}
			System.out.println();
			System.out.println("------------------------------------------");
			
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
			
			
		}

	}

}
