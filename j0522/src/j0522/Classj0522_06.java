package j0522;

public class Classj0522_06 {

	public static void main(String[] args) {
		// Car - 기본생성자 사용 : color,gearType,door 출력
		Car c = new Car();
		//사용
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);
		
		//매개변수가 있는 생성자사용 red auto 5 출력하시오
		//객체선언
		Car c2 = new Car("red","auto",5);
		//사용, red,auto,3
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
			
		//객체선언
		//객체(인스턴스)를 복사할때 사용, 다른 객체를 복사할때 사용
		//참조변수로 객체를 받을 수 있다.
		Car c3 = new Car(c2); //주소가 아예 다른 공간이 생기기 때문에 c3를 수정해도 c2가 안바뀜
		//blue,stick,3
		c3.color="blue";
		c.gearType="stick";
		c3.door=3;
		
		Car c4 = new Car(c3);
		//yellow,stick,4
		c4.color="yellow";
		c4.gearType="auto";
		c4.door=4;

		
		c4 = new Car(c2);
		
		
//		//참조변수 선언
//		Car c3 = null;
//		
//		//복사가능? 가능
//		c3 = c2; 내용이 복사되지만 한 장소를 바라보기 때문에 c3를 수정하면 c2도 수정된다. 주의!!!
//		c3.color = "blue";
//		
//		System.out.println("c2 : "+c2.color);
//		System.out.println("c3 : "+c3.color);
		
		
		

	}

}
