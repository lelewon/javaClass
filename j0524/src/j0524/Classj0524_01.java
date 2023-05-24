package j0524;

public class Classj0524_01 {

	public static void main(String[] args) {
		
		//Singleton ss = new Singleton();
		Singleton ss = Singleton.getInstance();
		
		System.out.println(Singleton.getNum());

	}

}
