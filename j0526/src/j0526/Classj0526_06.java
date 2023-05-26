package j0526;

public class Classj0526_06 {

	public static void main(String[] args) {
		int sum = 0;
		String str = "";
		for(int i=1;i<=10;i++) {
			sum = sum + i; //공간이 하나! 같은 공간안에 값을 넣는다.
			str = str + i; //새로운 공간(주소값)을 만들어서 값을 넣는다. But 스트링 버퍼는 같은 공간에 넣는다.
		}
	}

}
