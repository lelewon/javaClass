package j0526;

import java.util.Scanner;

public class Classj0526_13 {

	public static void main(String[] args) {
		String lotto1 = "1";
//		String lotto2 = "1조12587";
		//1-9조 00000-99999
		//0-9조 랜덤숫자를 맞추는 게임을 구현하시오
		//입력 : 1, 5 등
		
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*10); //0-9
		int random2 = (int)(Math.random()*100000); //0-99999
		String strRandom = String.format("%05d", random2); //00000, 09999, 99999
		System.out.println(random);
		System.out.println(strRandom);
		//
		System.out.println("조앞의 숫자와 5자리 숫자를 입력하세요(예:1조12587)");
		String strNum = scan.next(); //1조12587
		
		
//		String strNum2 = strNum.substring(0);
//		String Str = strRandom.substring(0);
		
		
		//String strNum2 = strNum.substring(0,1);
		int myNum = Integer.parseInt(strNum.substring(0,1)); //String -> int 로 형변환, 입력받은 1을 숫자1로 변경
		
		System.out.println("[ 조단위 ]");
		if(random==myNum) {
			System.out.println("당첨");
		}else{
			System.out.println("꽝");
		}
		
		//5자리 확인
		String myNum2 = strNum.substring(2,3);
		String strRandom2 = strRandom.substring(0,1);
		System.out.println("[ 5자리 숫자 비교 ] ");
		
		if(myNum2.equals(strRandom2)) {
			System.out.println("당첨");
		}else{
			System.out.println("꽝");
		}
		
//		for(int i=0;i<5;i++) {
//			int StrNum = Integer.parseInt(Str.substring(StrRandom.substring(i)));
//			if(myNum==random) {
//				System.out.println("당첨");
//			}else{
//				System.out.println("꽝");
//			}
//		}

		
	}

}
