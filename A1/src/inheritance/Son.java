package inheritance;

public class Son extends Father{
	private int ATM_PIN=1234;
    protected int bankBalance=500;
    public static void main(String[] args){
    	Son s=new Son();
    	s.car();
    	s.Garden();
    	s.love();
	}
    
    public void car() {
    	System.out.println("BMW Car");
    	System.out.print("Dad's Car is :");
    	super.car();
    }

}
