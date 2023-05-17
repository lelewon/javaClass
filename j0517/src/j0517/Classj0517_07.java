package j0517;

public class Classj0517_07 {

	public static void main(String[] args) {
		
		//static 객체선언없이 사용
		
		int[] num = new int[2];
		
		int a = 10;
		int b = 5;
		
		calculate(num,a,b);
		
		System.out.println("합계 : "+num[0]);//15
		System.out.println("평균 : "+num[1]); //7
		
		
		

	}
	
	static void calculate(int[] num,int a,int b) { //기본형 변수는 주소값이 아니기 때문에 위에 int a랑 전혀 다르다, 값을 변경해도 영향을 안준다.
		//두수의 합, 평균
		
		num[0] = a+b;
		num[1] = (a+b)/2;
		
	}

}

//		// Tv
//		//객체선언
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		
//		t1.channel=7;
//		System.out.println("Tv t1 channel : "+ t1.channel);
//		
//		t2.channel=8;
//		System.out.println("Tv t2 channel : "+ t2.channel);
//		
//		t2 = t1;
//		System.out.println("t2 channel : "+ t2.channel);