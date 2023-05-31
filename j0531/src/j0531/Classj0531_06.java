package j0531;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Classj0531_06 {

	public static void main(String[] args) {
		// 파일읽어오기 BufferedReader - student.txt;
		// println 출력
		int stuNo= 0;
		String name = "";
		int kor=0,eng=0,math=0;
		List<Student> list = new ArrayList<>();
		
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data = "";
			while(true) {
				data = br.readLine();
				if(data==null) break;
				//data ="1,홍길동,100,100,99";
				String[] dataArr = data.split(","); //1,홍길동,100,100,99    타입을 안바꾸면 10010099 가 된다.
				System.out.println(data);
				
				stuNo = Integer.parseInt(dataArr[0]);
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				
				list.add(new Student(stuNo,name,kor,eng,math)); //객체선언
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//파일읽어오기
		System.out.println();

	}

}

//				System.out.println(Integer.parseInt(dataArr[0])); //정수형으로 형변환, 데이터 타입은 String 타입, 인티져로 형변환
//				System.out.println(dataArr[1]);
//				System.out.println(Integer.parseInt(dataArr[2]));
//				System.out.println(Integer.parseInt(dataArr[3]));
//				System.out.println(Integer.parseInt(dataArr[4]));