package stuProject2;

import java.io.FileWriter;

public class TestFile {

	public static void main(String[] args) {

		String[] name = {"홍길동","유관순","이순신","강감찬","김구"};
		
		FileWriter fw = null;
		String data = "";
		try {
			fw = new FileWriter("c:/data/student.txt");
			for(int i=0;i<5;i++) {
				//1001,"홍길동",100,100,99;
				//1002,"유관순",100,100,90;
				
//				//            [   0-9               ]+91  0-9 숫자에 각각 91을 더한 10개의 숫자라는 의미!
//				int random1 = (int)(Math.random()*10)+91; //91-100까지의 숫자
				int random1 = (int)(Math.random()*20)+81;
				int random2 = (int)(Math.random()*20)+81;
				int random3 = (int)(Math.random()*20)+81;
//				data = ""+(Student.count+1)+","+name[i];
				data = data + String.format("%d,%s,%d,%d,%d \r\n",(Student.count+1),name[i],random1,random2,random3);
//				data = data + "";
				
				Student.count++;
			}
			fw.write(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("파일이 저장되었습니다.");
		
	}
}
