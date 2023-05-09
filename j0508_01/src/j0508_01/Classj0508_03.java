package j0508_01;

public class Classj0508_03 {
	
	static int num; //전역 변수(2군데 사용가능) - class 영역에서도 변수 선언 가능, 값을 지정하지 않아도 된다. 디폴트 = 0
	

	public static void main(String[] args) {
		int num; //지역 변수(1군데만 사용가능)
		System.out.println("main메소드 num 호출 : "+num); //메소드 내에서는 값을 무조건 넣어줘야 한다.
		sub();

	}
	static void sub() {
		//System.out.println(num);
		System.out.println("sub메소드 num 호출 : "+num);
	}

}
