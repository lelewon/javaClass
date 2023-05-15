package j0515_02;

import java.util.Scanner;

public class Classj0515_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 변수선언
		int temp = 0;
		int random = 0;
		int count = 0;
		
		//1. 배열 설정
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];
		
		//2. 로또번호
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; 
		}
		
		//3. 번호섞기
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		//4. 번호입력
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 번호를 입력하세요");
			myNum[i] = scan.nextInt();
		}
		
		//5. 맞춘개수 확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNum[j]) {
					lottoNum[count] = lotto[i];
					count++;
					continue;
				}
			}
		}
		
		//6. 로또번호 출력
		System.out.println("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//7. 입력번호 출력
		System.out.println("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNum[i]+" ");
		}
		System.out.println();
		
		//8. 맞춘번호 출력
		System.out.println("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		
		//9. 맞춘개수 출력
		System.out.println("맞춘개수 : "+count);
		
		

	}

}
