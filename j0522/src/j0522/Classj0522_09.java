package j0522;

public class Classj0522_09 {

	public static void main(String[] args) {
		
		//객체선언후
		// serialNo=1
		Product p1 = new Product();
		System.out.println("p1 count : "+Product.count); //클래스 변수를 사용할때는 p1.p2.p3로 사용할 경우 주소값이 다른줄 알기 때문에 같이 Product(클래스명)으로 써준다.
		System.out.println("p1 serialNo : "+p1.serialNo);
		
		//serialNo=2
		Product p2 = new Product();
		System.out.println("p2 count : "+Product.count);
		System.out.println("p2 serialNo : "+p2.serialNo);
		
		Product p3 = new Product();
		System.out.println("p3 count : "+Product.count);
		System.out.println("p3 serialNo : "+p3.serialNo);
		
		//p1.count 얼마일까요?
		System.out.println("p1 count : "+p1.count); //주소값이 같기 때문에 p3의 값과 같다.
		
		
		//int count = 0;
		//int serialNo = 0;
		//초기화블럭 : count=1; serialNo = 1;
		//생성자 호출 : 

	}

}
