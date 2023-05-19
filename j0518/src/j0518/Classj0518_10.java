package j0518;

public class Classj0518_10 {

	int iv;
	static int cv;
	
	void i_Method() {
		
	}
	
	static void c_Mathod() {
//		System.out.println(iv); // X
		System.out.println(cv);
	}
	
	public static void main(String[] args) {
	
		Classj0518_10.cv = 50; //클래스명.변수명
		System.out.println(cv);
		
		Classj0518_10 c = new Classj0518_10();
		c.iv = 100;
		System.out.println(c.iv);
		

	}

}
