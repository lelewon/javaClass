package j0530;

import java.util.Scanner;

public class Classj0530_03 {

	public static void main(String[] args) {
		// 소문자를 대문자로 출력하시오 a=97, A=65, 0=48
		Scanner scan = new Scanner(System.in);
		
		String str = "ABCDEF";
		System.out.println(str.toLowerCase());
		String str2 = "abcdef";
		System.out.println(str2.toUpperCase());
		
		
		
		
		
		//문자열을 대문자는 소문자, 소문자는 대문자로 치환
//		System.out.println("영문소문자를 입력하세요");
//		String input = scan.next(); //들어오는 모든 문자열을 변경하시오 aBcDF-> AbCdf
//		String output = "";
//		char temp =0;
//		
//		for(int i=0;i<input.length();i++) {
//			temp = input.charAt(i);
//			System.out.println(temp);
//			
//			if(((temp>='a') && ('z'>= temp))==true) {//소문자 입력
//				output = output + (char) (temp-32);
//			}else if(((temp>='A') && ('Z'>= temp))==true){
//				output = output + (char) (temp+32);
//			}
//			
//		}
//		System.out.println("입력한 문자 : "+input);
//		System.out.println("출력 문자 : "+output);
		
		
		
		//입력된 문자 1개를 치환
		//소문자->대문자, 대문자->소문자 출력하시오
		//if('a'<= input and 'z'>= input) if('A'<= input and 'Z'>= input)
		
//		System.out.println("영문소문자를 입력하세요");
//		char input = scan.next().charAt(0); //들어오는 모든 문자열을 변경하시오 aBcDF-> AbCdf
//		char output = ' ';
//		
//		if(((input>='a') && ('z'>= input))==true) {//소문자 입력
//			output = (char) (input-32);
//		}else if(((input>='A') && ('Z'>= input))==true){
//			output = (char) (input+32);
//		}
//		System.out.println("입력한 문자 : "+input);
//		System.out.println("출력 문자 : "+output);

		
		//소문자를 대문자로 치환
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자 : "+input);
//		char output = (char) (input-32); //char+int = int + int = int 형변환 필요
//		System.out.println("대문자 : "+output);
		
		
		
	}

}
