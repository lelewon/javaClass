package j0519;

public class Classj0519_06 {

	public static void main(String[] args) {
		
		
		String no = "1";
		String title = "홈페이지 오픈";
		String date = "2023-05-19";
		String name = "홍길동";
		
		
		//객체선언
		Board b = new Board(); //생성자 호출
		//메소드의 매개변수는 데이터를 넘겨줄때 사용
		//넘겨준 데이터를 다시 받으려면 return 타입으로 받으면됨
		String[] saveBoard = b.save(no,title,date,name);
		
		for(int i=0;i<saveBoard.length;i++) {
			System.out.print(saveBoard[i]+" ");
		}
		System.out.println();

	}
	

}
//인스턴스는 메소드