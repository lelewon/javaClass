package j0517;

import java.util.Scanner;

public class Classj0517_04 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 가장 큰수를 출력하시오
		// numMax 메소드를 만들어 사용하시오
		Scanner scan = new Scanner(System.in);
		//객체선언 - 참조변수명.변수명, 참조변수명.메소드명()
		Classj0517_04 c = new Classj0517_04();
		
		//10,5,25
		int max = 0;
//		int min = 0;
		int num1=10,num2=5,num3=25;
		
		while(true) {
			System.out.println("1번째 수를 입력하세요");
			num1 = scan.nextInt();
			System.out.println("2번째 수를 입력하세요");
			num2 = scan.nextInt();
			System.out.println("3번째 수를 입력하세요");
			num3 = scan.nextInt();
			
			//다른메소드 호출방법
			//참조변수명.메소드명 - 매개변수는 같아야 함
			int result = c.max(1, num1, num2, num3);
			int result2 = c.max(2, num1, num2, num3);
			
			System.out.println("3개의 수의 최대값 : "+result);
			System.out.println("3개의 수의 최소값 : "+result2);
			
//			System.out.println("두수에서 큰수 : "+Math.max(num1,num2));
		}
		
//		//if
//		if(num1<num2) {
//			if(num1<num3) {
//				min = num1;
//			}else {
//				min = num3;
//			}
//		}else {
//			if(num2<num3) {
//				min = num2;
//			}else {
//				min = num3;
//			}
//		}
//	}
		
		
		//5,10,25
		
//		//삼항식
//		max = (num1>num2)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);
		
		//Mas.Max()
//		max = Math.max(Math.max(num1,num2,num3),num3);
//		
//		//if - 10, 5, 25
//		if(num1>num2) {
//			if(num1>num3) {
//				max = num1;
//			}else {
//				max = num3;
//			}
//		}else {
//			if(num2>num3) {
//		        max = num2;
//	        }else {
//	        	max = num3;
//	        }
//		}
//		//
//		Scanner scan = new Scanner(System.in);
//		Classj0517_04 c = new Classj0517_04();
//		int[] num = new int[3];
//		
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)"번째 숫자를 입력하세요");
//			num[i] = scan.nextInt();
//		}
//		c.numMax();
//	}
//	
//	int num(int a,int b,int c) {
//		int result = a + b + c;
//		return result;
//	}
//	
//	int numMax(int a,int b,int c) {
//		if(a>b) {
//			if(a>c) {
//				result = a
//			}
//		}else if(b>a | b>c) {
//			result = b
//		}else {
//			result = c
//		}
//		return result;
//	}

    }
	//메소드 리턴타입과 return 변수는 타입이 같아야 함
    int max(int check,int a,int b,int c) {
    	int result = 0;
    	if(check==1) {
    		//최대값 구하기
    		result = Math.max(Math.max(a, b), c);    	
    	}else {
    		result = Math.min(Math.min(a, b), c);
    	}
    	return result;
    }
    
//    int max(int a,int b,int c) {
//    	int result = 0;
//    	result = Math.max(Math.max(a, b), c);
//    	
//    	return result;
//    }
//    //
//    int min(int a,int b,int c) {
//    	int result = 0;
//    	result = Math.min(Math.min(a, b), c);
//    	
//    	return result;
//    }
}
