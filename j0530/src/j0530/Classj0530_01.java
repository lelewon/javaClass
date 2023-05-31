package j0530;

import java.util.Scanner;

public class Classj0530_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("복권을 입력하세요(예:1조1234567)");
		String input = scan.next();
		String output1 = input.substring(0,2);
		String output2 = input.substring(2);
	    int output3 = Integer.parseInt(output2);
	    int random = (int)(Math.random()*1000000)+1000000; //1000000-9999999
	    System.out.println(random);
	    
		
		//1조 1234567
//		String output1 = "";
//		String output2 = "";
		
		System.out.println(output1);
		System.out.println("문자타입 : "+output2);
		System.out.println("숫자타입 : "+output3);
		
		//output2 숫자가 무엇인지 맞춰보세요
		//1234567 정수타입으로 변경후 for문을 써서 0-9999999까지 비교해보세요
		//랜덤으로 1000000-9999999
		
		for(int i=1000000;i<9999999;i++) {
			if(output3==i) {
				System.out.println("입력한 숫자 : "+i);
			}
		}
		
		for(int i=1000000;i<=9999999;i++) {
			if(random==i) {
				System.out.println("랜덤숫자 : "+i);
			}
		}
		
		
		
		
		
		
//		String str = new String("abc");
//		char ch = 'a';
//		char ch2 = 'b';
//		char ch3 = 'c';
//		
//		String str2 = "abc";
//		//charAt(0)
//		
//		System.out.println(str.charAt(0));
//		
//		String str3 = "abcdedfg";
//		
//		String str4 = str3.substring(3,5);
//		
//		System.out.println(str4);
//		
//		String str5 = "안녕하세요 반갑습니다.";
//		
//		System.out.println(str5.substring(2,5));
//	}

  }
}
