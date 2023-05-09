package j0509_01;

import java.util.Scanner;

public class Classj0509_03 {

	public static void main(String[] args) {
		double kor = 100;
		int eng = 90;
		int math = 89;
		String name = "홍길동";
		
		//데이터 입력 Scanner - 화면에서 입력을 받음. 객체 = 클래스
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scan.next(); //홍 길동 치면 홍만 입력받을 수 있다.(사이 띄우기 불가능)
		//name = scan.nextLine(); //홍 길동 쳐도 다 입력받을 수 있다.(사이 띄우기 가능)
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextDouble();
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		
		
		double total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("-------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t%.2f\t%d\t%d\t%f\t%.2f\n",name,kor,eng,math,total,avg);

	}

}
