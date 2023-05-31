package j0530;

import java.util.ArrayList;
import java.util.Iterator;

public class Classj0530_06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); //0
		list.add(2); //1
		list.add(3); //2
		list.add(4); //3
		list.add(5); //4
		list.add(6); //5
		list.add(7); //6
		System.out.println("현재 : "+list.size());
		//list.remove(3);
		//list.remove(3);
		
		//Iterator 사용출력 - 예전버전 : Enumeration
		
		Iterator it = list.iterator(); //컬랙션을 읽어오는 객체, 한번 더 사용하려면 2번 작성해야함
		
		while(it.hasNext()) { //데이터가 있는지 확인
			System.out.println(it.next()); //1개의 데이터를 가져옴
		}
		
//		Iterator it2 = list.iterator(); //한번 더 사용할때
//		
//		while(it.hasNext()) { //데이터가 있는지 확인
//			System.out.println(it2.next()); //1개의 데이터를 가져옴
//		}
		
		
		
		
		//for문 사용출력
		//전체삭제
//		for(int i=list.size()-1;i>=0;i--) {
//			list.remove(i);
//		}
//		
//		System.out.println("출력 : "+list.size());
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

	}

}
