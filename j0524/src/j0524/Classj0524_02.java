package j0524;

public class Classj0524_02 {

	public static void main(String[] args) {

		//객체선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		c.caption();
		
		//다형성
		Tv t = new CaptionTv();
		t.channelUp();
		System.out.println(t.channel);
		//t.caption(); //공간은 있지만 t의 변수가 없어서 사용할 수 없음
		
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel); //1
		
	}

}

//		CaptionTv c2 = null;
//
//		t2 = c;
//		c = (CaptionTv)t2; //가능, 강제 형변환
//		//c = t2; //안됨
//		//c2 = t2; //안됨