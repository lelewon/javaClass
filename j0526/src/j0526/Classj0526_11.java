package j0526;

public class Classj0526_11 {

	public static void main(String[] args) {
		//
		String str1 = "https://semiconductor.samsung.com/kr";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		String test = "abcdefghijklmn";
		String lotto = "1조198756";
		
		String result1 = lotto.substring(2);
		System.out.println("lotto : "+result1);
		
		String result2 = test.substring(3,6);
		System.out.println("test  : "+result2);
		
		String result3 = str2.substring(36);
		System.out.println("str2  : "+result3);
//		System.out.println(str2.length()); //길이
		
		String result4 = str3.substring(36,45);
		System.out.println("str   : "+result4);
		
//		String result4 = str3.substring(36,(-2));
//		System.out.println("str3 : "+result4);
		
		String result5 = str2.substring(str1.length()-3,str1.length());
		System.out.println("str2  : "+result5);
	}

}
