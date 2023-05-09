package j0508_01;

public class Classj0508_07 {

	public static void main(String[] args) {
		// printf, println, print
		System.out.println(10/4.0); //출력 후 enter키가 포함
		// \n 단락 나누기, \t tab키
		System.out.printf("%.2f \n",10/7.0); //출력 후 자동 enter 키가 없음
		System.out.printf("%9d \n",1000); //정수
		System.out.printf("%x \n",16); //16진수
		System.out.printf("%o \n",9); //8진수
		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년 \n",25, 1998);
		System.out.println("당신의 나이 : "+25+" 세, 생년 : "+1998+" 년");

	}

}
