package j0515;

import java.util.Scanner;

public class Classj0515_08 {

	public static void main(String[] args) {
		// [5][5]배열을 만들어서 해당번호를 X표시하는 프로그램을 구현하시오
		Scanner scan = new Scanner(System.in);
		//배열생성
		String[][] box = new String[5][5];
		
		//숫자 생성
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		//배열 섞기
		int random = 0;
		int temp = 0;
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		//숫자넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				box[i][j] = ""+num[5*i+j];
			}
		}
		
		while(true) {
			//상단번호출력
			for(int i=0;i<5;i++) {
				System.out.print("\t"+i);
			}
			System.out.println();
			System.out.println("-------------------------------------------");
			
			//화면출력
			for(int i=0;i<box.length;i++) {
				System.out.print(i+"\t");
				for(int j=0;j<box[i].length;j++) {
					System.out.print(box[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("1-25번호를 입력하세요>>");
			int input = scan.nextInt();
			loop:for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(box[i][j].equals(input+"")) {
						box[i][j] = "X";
						break loop;
//						continue;
					}
				}
			}
			
			
		}//while
		

	}

}
