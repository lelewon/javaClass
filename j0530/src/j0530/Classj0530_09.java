package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Classj0530_09 {

	public static void main(String[] args) {
		
		//ColClass 사용하려면? 객체선언
		ColClass c = new ColClass();
		Map<String, Object> map = new HashMap<>();
		map = c.execute();
		
		//ColClass2 사용하려면? 객체선언
		ColClass2 c2 = new ColClass2();
		int nowPage=0;
		nowPage = c2.execute2();
		
		//ColClass3 사용하려면? 객체선언
		ColClass3 c3 = new ColClass3();
		ArrayList<Student> list = new ArrayList<>();
		list = c3.execute3();
		
		//ColClass4 사용하려면?
		ColClass4 c4 = new ColClass4();
		Map<String, Object> map2 = new HashMap<>();
		map2 = c4.execute4();
		
		
		
		
	}//main
	
}

//		
//		Map<String, Object> map = new HashMap<>();
//		
//		//list,nowPage,startRow,endRow
//		map = subMethod();
//		System.out.println("현재페이지 : "+map.get("nowPage"));
//		System.out.println(map.get("startRow"));
//		
//		//메소드에서 1개만 리턴이 가능