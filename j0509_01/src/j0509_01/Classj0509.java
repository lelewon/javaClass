package j0509_01;

import java.util.Scanner;

public class Classj0509 {

	public static void main(String[] args) {
		//1개의 글자를 입력받아 숫자로 변환하시오
		//"15784" 1문자를 숫자로 변환
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		char input = scan.next().charAt(3); //charAt() 문자열에서 1개의 문자를 가져옴
//		int result = input - 0; //1을 넣으면 아스키 코드의 49가 되어 result에 49가 들어간다.
		int result = input - '0'; //char 타입의 숫자는 문자 '0'을 빼야 숫자값으로 변환됨
		String content = (result%2==0)?"짝수입니다.":"홀수입니다.";
		System.out.println("추출한 숫자 : "+result);
		System.out.println(content);
	}
}
