package j0518;

import java.util.Scanner;

public class Classj0518_08 {

	public static void main(String[] args) {
		// 로또 맞추기
		// 1-45까지 숫자입력
		Scanner scan = new Scanner(System.in);

		int random = 0;
		int temp = 0;
		int count = 0;

		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] myLotto = new int[6];

		// 1-45번까지 숫자를 lotto에 넣어 보세요
		// 번호넣기
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 번호뽑기
		for (int i = 0; i < 6; i++) {
			System.out.println("숫자를 입력하세요");
			myNum[i] = scan.nextInt();
		}
		
		// 번호섞기
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 맞춘번호세기
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == myNum[j]) {
					myLotto[count] = lotto[i];

					count++;
					break;
				}
			}
		}

		// 번호출력
		System.out.println("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		// 뽑은번호출력
		System.out.println("뽑은 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + " ");
		}
		System.out.println();

		// 당첨번호출력
		System.out.println("당첨 번호 : ");
		for (int i = 0; i < count; i++) {
			System.out.print(myLotto[i] + " ");
		}
		System.out.println();

		// 맞은개수출력
		System.out.println("맞춘 개수 : " + count);

	}

}
