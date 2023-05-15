package j0515_02;

import java.util.Scanner;

public class Classj0515_02 {

	public static void main(String[] args) {
		// 상자 10개
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int random = 0;
		int input = 0;
		String[] arr = new String[10];
		int[] box = new int[10];
		
		// ? 배열 생성
		for(int i=0;i<10;i++) {
			arr[i] = "?";
		}
		
		//번호 출력
		for(int i=0;i<10;i++) {
			if(i<7) {
				box[i] = 0; 
			}else {
				box[i] = 1;
			}
		}
		
		//섞기
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}
		
		while(true) {
			System.out.println("[보물찾기 프로그램");
			for(int i=0;i<10;i++) {
				System.out.println(i+"\t");
			}
			
			System.out.println();
			System.out.println("-----------------------------------");
			
			for(int i=0;i<10;i++) {
				System.out.println(arr[i]+"\t");
			}
			System.out.println();
			
			//번호입력
			System.out.println();
			System.out.println("번호를 입력해주세요>>");
			input = scan.nextInt();
			//보물인지 아닌지 비교
			if(box[input] == 1) {
				arr[input] = "보물";
			}else {
				arr[input] = "꽝";
			}
			
			
		}//while
		
	}//main

}
