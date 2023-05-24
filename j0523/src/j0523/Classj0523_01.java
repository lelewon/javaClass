package j0523;

public class Classj0523_01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
//		System.out.printf("%s,%d \n",d.c[0].kind,d.c[0].number);
		
		
		
		for(int i=0;i<52;i++) {
		    if(i%13!=0) {
		    	System.out.printf("%s,%d \t",d.c[i].kind,d.c[i].number);
		    }else {
		    	System.out.println();
		    }
		    
		}
			
		//출력
		//c
//		int a=0;
//		System.out.println(a);
		
//		int[] arr= {1,2,3,4,5};
//		
//		int[] arr1 = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		for(int i=0;i<5;i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
		
		
//		//구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//			System.out.println();
		
		
		
	}

}
