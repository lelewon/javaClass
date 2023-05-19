package j0518;

import java.util.Scanner;

public class Classj0518_test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int choice = 0;
		int count = 0;
		String searchName = "";
		int chk = 0;
		
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		
		while(true) {
			
			
			switch(choice) {
			case 1: //성적입력
				
				for(int i=count;i<10;i++) {
					System.out.println((count+1)+"이름을 입력하세요(0.이전페이지로 이동합니다.)");
					name[i] = scan.next();
					
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						break;
					}
				}
				break;
			}
		}

	}

}
