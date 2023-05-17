package j0517;

public class Classj0517_06 {

	public static void main(String[] args) {
		// 
		Data d = new Data(); //d 는 참조변수명, 데이터가 아닌 주소값이 있음
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		System.out.println("---------------------");
		change(d.x); //(d.x = ) 처럼 받는게 없으면 그냥 사라짐
		System.out.println("change d.x : "+d.x);

	}
	
//	static void change(int x) {
//		x=1000;
//		System.out.println("x : "+x);
//	}
	
	static int change(int x) {
		x=1000;
		System.out.println("x : "+x);
		return x;
	}

}
