package j0522;

public class Classj0522_11 {

	public static void main(String[] args) {
		//Circle객체선언
		Circle c1 = new Circle();
		
		Point center = new Point(150,150);
		Circle c2 = new Circle(center,50);
		//c2 변수? x=150, y=150, r=50
		
//		int[] x = {1,2,3};
//		int y = 10;
		
		Point[] p = {new Point(100,100), new Point(140,50), new Point()}; //Point는 객체이기 때문
		
		Triangle t1 = new Triangle(p);
		
		Triangle te = new Triangle(p[0],p[1],p[2]);
		
		
		
//		Point center = new Point(150,150);
//		Circle c2 = new Circle(center,50);
		
		// Point center = new Point(0,0);
		// x=0, y=0;
		// int r = 100;

	}

}

//		int a = 10;
//		int b = 5;
//		int sum = a+b;
//		Point p = new Point(sum);  // == Point p = new Point(a+b);