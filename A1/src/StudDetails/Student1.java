package StudDetails;

public class Student1 extends Teacher {

	public void study() {
	System.out.println("Studied");
	}
	public static void main(String[] args) {
	System.out.println("Teacher Name is : "+ teacherName);
	Student1 s=new Student1();
	System.out.print("Status : ");
	s.study();
	}
}