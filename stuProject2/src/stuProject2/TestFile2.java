package stuProject2;

public class TestFile2 {
	
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100;
		int eng = 99;
		int math = 90;
		
		System.out.printf("%s%d%d%d \r\n",name,kor,eng,math);
		
		String data = String.format("%s%d%d%d \r\n",name,kor,eng,math); //"%s%d%d%d \r\n" 을 찍어낸 후 스트링 형태로 저장시킬수 있는 형태
		System.out.println("문자열로 변수 저장 : "+data);
	}
}
