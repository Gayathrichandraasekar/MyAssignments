package week1.day1Assignments;

public class Student {
	String studentname="PRANAV";
	long rollnumber=9032020l;
	String collegename="Cambridge University";
	int marksscored=450;
	float cgpa=9.5f;
	
	
		public static void main(String[] args) {
		Student details=new Student();
		System.out.println(details.studentname);
		System.out.println(details.rollnumber);
		System.out.println(details.collegename);
		System.out.println(details.marksscored);
		System.out.println(details.cgpa);
	}

}

