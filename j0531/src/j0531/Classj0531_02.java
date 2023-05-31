package j0531;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Classj0531_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체선언
		StuProcess sp = new StuProcess();
		List<Student> list = new ArrayList<>(); //List<Student>는 인터페이스! 인터페이스만은 쓸수 없음, 인터페이스는 부모, 밑에있는 객체로 활동을 함

		int choice = 0;
		int stuCount = list.size()+1; //학번
		
		//list.add(new Student(1,"홍길동",100,100,99));
		//list.add(new Student(2,"유관순",99,99,98));
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 학생입력");
			System.out.println("2. 학생출력");
			System.out.println("8. 파일에서 가져오기");
			System.out.println("9. 파일저장하기");
			
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				//메소드 호출후 데이터 전달 받음
				//Object로 받았을 경우에는 형변환을 꼭 해야한다.
				stuCount = list.size()+1;
				Map<String, Object> map = sp.stuInput(list,stuCount); //가장 핵심!
				list = (List<Student>) map.get("list");
				stuCount = (int) map.get("stuCount");
				
				break;
				
			case 2:
				//메소드 호출(매개변수 전달)-list
				list = sp.stuOutput(list); //두가지가 아니기때문에 바로 list에 넣어준다.
				
				break;
				
			case 8: //파일에서 가져오기
				list = sp.stuRead();
				System.out.println("[ 파일읽어오기가 완료되었습니다. ]");
				System.out.println();
				
				break;
				
			case 9:
				sp.stuSave(list);
				System.out.println("[ 학생성적이 저장되었습니다. ]");
				System.out.println();
				
				break;
			
			}//switch
		}//while
	}//main

}//class
