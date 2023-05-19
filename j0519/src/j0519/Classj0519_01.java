package j0519;

import java.util.Scanner;

public class Classj0519_01 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//성적입력
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생성적검색");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------------------");
		System.out.println("원하는 번호를 입력하세요");
  		
		
		//변수선언
		int choice = 0;
		int count = 0;
		
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] total = new int[10]; // kor eng math total -10
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		Student s1 = new Student();
		s1.name="a";
		Student s2 = new Student();
		s2.name="b";
		
		
		
		
		
		score[0][0] = 100;//국어
		score[0][1] = 100;//영어
		score[0][2] = 100;//수학
		
		
		//배열생성
		Student[] s = new Student[10];
		
	    s[0] = new Student();
	    s[0].name = "a";
	    s[0].kor = 100;
	    s[0].eng = 100;
	    s[0].math = 100;
	    s[0].total = 100+100+100;
	    
		choice = scan.nextInt();
		
		//
		while(true) {
			
			switch(choice) {
			
			case 1: //성적입력
				for(int i=0;i<10;i++) {
					// 객체생성  s[10]
					s[i] = new Student();
					
					System.out.println((i+1)+"번째 학생 이름을 입력하세요");
					//생성한 객체의 이름
					// s.name = "a";
					s[i].name = scan.next();
				}
				
				break;
			
			
			}
		}

	}

}
