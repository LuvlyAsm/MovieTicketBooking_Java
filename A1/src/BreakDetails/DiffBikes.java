package BreakDetails;

public class DiffBikes {
	abstract class SportsBike extends MotorBike {
	    
		  // implementation of abstract method
		  public void brake() {
		    System.out.println("SportsBike Brake");
		  }
		}

		abstract class MountainBike extends MotorBike {
		    
		  // implementation of abstract method
		  public void brake() {
		    System.out.println("MountainBike Brake");
		  }
		}

}
