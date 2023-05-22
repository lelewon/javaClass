package j0522;

import java.util.Scanner;

public class Classj0522_02 {

	//배열을 사용
	public static void main(String[] args) {
		
		int[] num = new int[4];
		int[] data = new int[8];
		
		Scanner scan = new Scanner(System.in);
		// 두수를 입력받아, 더하기, 빼기, 곱하기, 나누기
		// 생성자를 활용
		
		//배열로 받으면 for문을 쓰기 쉬워짐
		
		for(int i=0;i<2;i++) {
			for(int j=(i*2)+0;j<(i*2)+2;j++) { //0,1  2,3
				System.out.println((j+1)+"번째 숫자를 입력하세요");
				num[j] = scan.nextInt();
			}
			
			data[i*4] = num[i*2]+num[(i*2)+1];  //0,4   0,1 2,3
			System.out.println(data[i*4]);
			
			data[(i*4)+1] = num[i*2]-num[(i*2)+1];
			System.out.println(data[(i*4)+1]);
			
			data[(i*4)+2] = num[i*2]*num[(i*2)+1];
			System.out.println(data[(i*4)+2]);
			
			data[(i*4)+3] = num[i*2]/num[(i*2)+1];
			System.out.println(data[(i*4)+3]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int j=0;j<2;j++) {
//			System.out.println((j+1)+"번째 숫자를 입력하세요");
//			num[j] = scan.nextInt();
//		}
//		
//		data[0] = num[0]+num[1];
//		System.out.println(data[0]);
//		data[1] = num[0]-num[1];
//		System.out.println(data[1]);
//		data[2] = num[0]*num[1];
//		System.out.println(data[2]);
//		data[3] = num[0]/num[1];
//		System.out.println(data[3]);
//		
//		//----------------------------------------------------
//		
//		for(int i=2;i<4;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요");
//			num[i] = scan.nextInt();
//		}
//		
//		data[4] = num[2]+num[3];
//		System.out.println(data[4]);
//		data[5] = num[2]-num[3];
//		System.out.println(data[5]);
//		data[6] = num[2]*num[3];
//		System.out.println(data[6]);
//		data[7] = num[2]/num[3];
//		System.out.println(data[7]);

	}

}
