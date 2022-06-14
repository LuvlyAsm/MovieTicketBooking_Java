package Polymorphismrt;

public class Employee extends Ex_Employee{
	void testing() {
	   	 int testID=123;
	   	 String name="Mike";
	   	 System.out.println("doing testing");
	    }	
		public static void main(String[] args) {
	    	Employee e=new Employee();
	    	e.testing();
	    	
		}

}
