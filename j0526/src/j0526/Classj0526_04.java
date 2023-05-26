package j0526;

public class Classj0526_04 {

	public static void main(String[] args) {
		Person p1 = new Person(8801011111111L);
		Person p2 = new Person(8801021111111L);
		Person p3 = new Person(8801011111111L);
		
		Person p4 = new Person(p1); //객체 자체 복사(깊은 복사), 공간분리, p4를 변경해도 p1의 값 변경안됨
		Person p5 = p3; //주소복사(얕은 복사) p5의 값을 변경하면 p3의 값 변경됨
		System.out.println(p4.id);
		
		System.out.println(p1);
		System.out.println(p3);
		
		if(p1.equals(p3)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}
