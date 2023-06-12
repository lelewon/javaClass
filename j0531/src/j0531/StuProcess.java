package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor,eng,math;
	
	//파일 저장하기
	void stuSave(List<Student> list) {
		//파일저장
		String data = "";
		for(int i=0;i<list.size();i++) {
			data += String.format("%d,%s,%d,%d,%d\r\n",list.get(i).getStuNo(),list.get(i).getName().trim(),
					list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath());
		}//for
		
		//data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,88,88,87\r\n";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	//파일 읽어오기
	List<Student> stuRead(){
		List<Student> list = new ArrayList<>();
		//파일 읽어오기
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data = "";
			while(true) {
				data = br.readLine();
				if(data==null) break;
				//data ="1,홍길동,100,100,99";
				String[] dataArr = data.split(","); //1,홍길동,100,100,99    타입을 안바꾸면 10010099 가 된다.
				//System.out.println(data);
				
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
		
		//파일 읽어오기
		
		return list;
	}
	
	
	
	
	
	
	
	//리턴타입 메소드명
	List<Student> stuOutput(List<Student> list) {
		
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"}; //Student 객체에 있었는데 여기서만 쓸거기때문에 불러오는게 귀찮아서 불러옴
		//출력
		System.out.println("[ 학생성적 출력화면 ]");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6],title[7]);
		
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
		
		return list;
		
	}//stuOutput
	
	
	
	//리턴타입 메소드명(1)
	Map<String, Object> stuInput(List<Student> list,int stuCount) { //List<Student> 리스트타입, 리스트도 같이 포함시켜서 넘어가 라는 뜻
		
		//반복
		while(true) {
			System.out.println("[ 학생성적 입력 ]");
			System.out.println(stuCount+"번째 이름을 입력하세요(0.이전페이지 이동)");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("[ 이전페이지로 이동합니다. ]");
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			
			list.add(new Student(stuCount,name,kor,eng,math));
			stuCount++; //1증가
			
		}//while
		System.out.println();
		//list, stuCount 2개
		Map<String, Object> map = new HashMap<>(); //map 선언
		map.put("list", list); //list = list
		map.put("stuCount", stuCount); //stuCount=4
		
		return map;
		
	}//StuProcess
	
	
}

			while(true) {
				System.out.println("[ 학생성적처리 프로그램 ]");
				System.out.println(stuCount+"번째 이름을 입력하세요(0.이전페이지로 이동)");
				if(stuNo.equals("0")) {
					System.out.println("[ 이전페이지로 이동합니다. ]");
					break;
				}
				System.out.println("국어점수를 입력하세요");
				kor.nextInt();
				System.out.println("영어점수를 입력하세요");
				eng.nextInt();
				System.out.println("수학점수를 입력하세요");
				math.nextInt();
				
			}
			System.out.println();
			Map<Student,Object> map = new HashMap<>();
			map.put("list",list);
			map.put("stuCount",stuCount);
			
			return map;



//			System.out.println("학번을 입력하세요(0.이전페이지로 이동)");
//			stuNo = scan.nextInt();
//			if(stuNo==0) {
//				System.out.println("[ 이전페이지로 이동합니다. ]");
//				System.out.println();
//				break;
//			}