package StuProject;

public class Student {

	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private String createDate;
	private String updateDate;
	
	Student(){}
	Student(int stuNo,String name,int kor,int eng,int math,String createDate){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total;
	}
}