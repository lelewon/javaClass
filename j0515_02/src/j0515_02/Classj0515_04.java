package j0515_02;

public class Classj0515_04 {

	public static void main(String[] args) {
		// 2차원 배열
		// [4][3]배열
		int[][] box = new int[4][3];
		//번호입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				box[i][j] = (3*i)+(j+1);
			}
		}
		
		//상단번호 출력
		for(int i=0;i<3;i++) {
			System.out.print(" \t"+i);
		}
		System.out.println();
		System.out.println("---------------------------");
		//번호출력
		for(int i=0;i<4;i++) {
			System.out.print(i+" |\t");
			for(int j=0;j<3;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------");

	}

}
