package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Classj0530_08 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("list : "+list.get(0));
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		HashMap map = new HashMap<>(); //key 값을 넣으면 데이터가 나옴
		map.put("id", "aaa"); //key값("id")은 중복 안됨
		map.put("list", "data");
		map.put("no", "1");
		map.put("lastNo", "100");
		map.put("id", "bbb");
		//1개 출력은 get!!
		System.out.println("map : "+map.get("id"));
		
		//전체 출력
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
