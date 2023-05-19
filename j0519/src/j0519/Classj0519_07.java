package j0519;

public class Classj0519_07 {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); //생성자 호출
		d1.value = 10;
		System.out.println(d1.value);
		
		Data2 d2 = new Data2(10); //값을 넣으면 Data2를 호출하는 것
		System.out.println(d2.value);

	}

}
