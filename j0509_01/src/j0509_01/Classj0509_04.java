package j0509_01;

import java.util.Scanner;

public class Classj0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하시오
		// 문자열, 정수형, 문자열
		// ---------------------
		// 아이디		패스워드	이름
		// ---------------------
		// abcd		1111	홍길동
		
		
		
		//1. 변수선언
		String id = "";
		int pw = 0;
		String name = "";
		
		//2. Scanner - 입력클래스
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		id = scan.nextLine(); //next() - 문자만 입력받은, nextLine()은 위에서 뱉어낸 값을 값으로 바로 받아버린다. 그래서 끝나버린다.
		//이런 것을 방지하기 위해 nextLine() 바로 위에 nextLine()을 한번 더 쓴다.
		System.out.println("패스워드를 입력하세요");
		pw = scan.nextInt(); //맨 앞에 0을 넣고 싶으면 String으로 받는다.
		scan.nextLine(); //nextInt() enter키를 입력으로 사용
		System.out.println("이름을 입력하세요");
		name = scan.nextLine();
		
		//3. 출력
		System.out.println("--------------------");
		System.out.println("아이디\t패스워드\t이름");
		System.out.println("--------------------");
		System.out.printf("%s\t%d\t%s\n",id,pw,name);
		

	}

}
