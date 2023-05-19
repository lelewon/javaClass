package j0519;

import java.util.Scanner;

public class Classj0519_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		int count = 0;
		String searchName = 0;
		
		Student[] s = new Student[10];
		
		
		while(true) {
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
				for(int i=count;i<s.length;i++) {
					s[i] = new Student();
					
					System.out.println((i+1)+"번째 학생을 입력하세요(0.이전페이지로 이동합니다.)");
					s[i].name = scan.next();
					
					if(s[i].name.equals("0")) {
						System.out.println("[ 이전페이지로 이동합니다. ]");
						break;						
					}
					
					System.out.println("국어점수를 입력하세요");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					s[i].math = scan.nextInt();
					
					s[i].sum();
					s[i].average();
					
					count++;
				}
				break;
				
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정할 학생의 이름을 입력하세요(0.이전페이지로 이동)");
				searchName = scan.next();
				
				if(searchName.equals("0")) {
					System.out.println("0.이전페이지로 이동합니다.");
					System.out.println();
					break;
					
				}
				
				for(int i=0;i<count;i++) {
					System.out.println("수정할 성적을 입력하세요");
					if(s[i].name.equals(searchName)) {
						System.out.println("수정할 학생이 검색되었습니다.");
					}
				}
				System.out.println("1. 국어성적");
				System.out.println("2. 영어성적");
				System.out.println("3. 수학성적");
				switch(choice) {
				
				
				}
				
				
				
				
				
				
				
				break;
				
			}
		}
		



	}

}
