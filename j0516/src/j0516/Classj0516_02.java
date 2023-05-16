package j0516;

import java.util.Scanner;

public class Classj0516_02 {

	public static void main(String[] args) {
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램 종료
		
		// 이름, 국어, 영어, 수학, 합계, 평균 - 10명
		//a.변수선언
		Scanner scan = new Scanner(System.in);
		int choice = 0; //입력번호
		int count = 0; //성적입력 학생수
		String searchName = "";
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				for(int i=0;i<name.length;i++) {
					//이름입력
					System.out.println(count+1+"번째 학생 이름을 입력하세요(0.이전페이지로 이동");
					name[i] = scan.next();
					
					//이전페이지 이동확인
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						System.out.println();
						break;
					}
					
					for(int j=0;j<3;j++) {
						System.out.println(title[i+1]+"점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
					
					//합계부분
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3]/3.0;
					
					System.out.println(count+1+"번째 학생성적이 등록되었습니다.");
					System.out.println();
					
					//학생수 1증가
					count++;
				}
				
			case 2: //성적출력
				System.out.println("[ 학생성적 ]");
				for(int i=0;i<title.length;i++) {
					System.out.println(title[i]+"\t");
				}
				System.out.println("");
				System.out.println("-------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.print(name[i]+"\t");
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.println(avg[i]+"\t");
					System.out.println();
				}
				
				break;
				
			case 3: //성적수정
				//학생이름으로 검색
				System.out.println("수정할 학생의 이름을 입력하세요");
				searchName = scan.next();
				
				//수정할 학생 검색
				int chk = 0;
				for(int i=0;i<count;i++) {
					if(name[i].equals(searchName)) {
						//수정할 과목 선택
						System.out.println("[ 수정할 학생을 찾았습니다. ]");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("------------------------------");
						System.out.println("수정할 과목 번호를 입력하세요");
						choice = scan.nextInt();
						
						//수정할 과목 이전점수 표시
						//국어 : score[i][0], 영어 : score[i][1], 수학 : score[i][2]
						System.out.printf("[ 현재 %s 점수 ] : %d \n",title[choice],score[i][choice-1]);
						
					}
				}
				
				break;
				
			case 0:
				System.out.println("[프로그램 종료]");
				System.out.println();
				break loop;
			}
			
		}
		
		

	}
	

}

