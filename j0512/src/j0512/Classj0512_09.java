package j0512;

import java.util.Scanner;

public class Classj0512_09 {

	public static void main(String[] args) {
		// 국어,영어,수학,합계
		Scanner scan = new Scanner(System.in);
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] name = new String[5]; //이름
		double[] avg = new double[5]; //평균
		int[][] score = new int[5][4]; //5명의 국어,영어,수학,합계
		//점수입력
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"번째 :");
			//입력
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			
			for(int j=0;j<score[i].length-1;j++) {
				System.out.println(title[j+1]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
				
			}
			//j값은 존재하지 않음
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			avg[i] = score[i][3]/3.0;
		}
		//점수 출력
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//출력
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.2f\t",avg[i]);
			System.out.println();
		}//for

	}

}
