package j0518;

import java.util.Scanner;

public class Classj0518_04 {

	public static void main(String[] args) {
		// 문자를 입력받아 해당 소문자로 변환하시오
		Scanner scan = new Scanner(System.in);
		
		//A-65,66,z-96,a-97,.....
		System.out.println("문자를 입력하세요");
		char ch = scan.next().charAt(0);
		
		//if
		if(ch<=96) {
	        ch = (char)(ch+32);
		}else {
			ch = (char)(ch-32);
		}
		
//		ch = (char)(ch+32);
		System.out.println(ch);
		
		

	}

}
