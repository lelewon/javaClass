package j0526;

import java.io.File;
import java.io.FileWriter;

public class Classj0526_02 {

	public static void main(String[] args) {
//		File dir = new File("c:/bbb");
//		dir.mkdirs(); //폴더생성 메소드
//		System.out.println("폴더를 생성합니다.");
//		
//		File f = new File("c:/bbb/test.txt");
//		try {
//			f.createNewFile(); //파일생성 메소드
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일을 생성합니다.");
		
		
		FileWriter fw = null;
		String str = "";
		try {
			fw = new FileWriter("c:/bbb/test.txt");
			for(int i=0;i<10;i++) {
				str = str + "글자를 저장합니다. \r\n";
				fw.write(str); //글자를 저장하는 메소드
				fw.flush(); //버퍼에 있는 모든 것을 저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("글자가 저장되었습니다.");
		
	}

}

////		File file = new File("C:/data/test.txt"); //파일 생성
//		//file.createNewFile(); //파일을 생성해주세요
//        FileWriter writer = null;
//        writer = new FileWriter("C:/data/test.txt"); //파일을 생성해서 글자를 저장
//        String str = "(로스앤젤레스=연합뉴스) 임미나 특파원 = 태평양의 섬 괌을 '슈퍼 태풍' 마와르가 강타하면서 현지 공항이 폐쇄되고 단전·단수 사태가 잇달아 한국인 관광객 3천명 이상이 큰 피해를 겪고 있다.\r\n"
//        		+ "\r\n"
//        		+ "26일(현지시간) 태풍이 지나간 뒤 현지 당국이 시설 복구에 나섰지만, 공항 복구와 운항 재개가 6월 1일 전까지는 어려울 것으로 예상돼 여행객들의 피해가 길어질 것으로 보인다.\r\n"
//        		+ "\r\n"
//        		+ "외교부 괌 주재 공관인 주하갓냐 출장소(이하 괌 출장소) 관계자는 이날 연합뉴스와 통화에서 \"괌에 왔다가 비행기가 뜨지 않아 귀국하지 못한 한국인 여행객이 3천200여명 정도 된다\"며 \"대부분 호텔에 체류하고 있다\"고 밝혔다.";
//        writer.write(str);
//        writer.close();
//		
//		System.out.println("글자가 저장되었습니다.");