package Polymorphismct;

public class Inkpens{
	 void inkPen()
     {
    	 System.out.println("It is Ink Pen");
     }
     void inkPen(int penCost)
     {
    	 System.out.println("It is "+penCost+" Ink Pen");
     }
     void inkPen(int penCost,String colour)
     {
    	 System.out.println("It is "+penCost+"rs Ink Pen with "+colour+" Colour");
     }
     public static void main(String[] args) {
    	 Inkpens pen=new Inkpens();
    	 pen.inkPen();
    	 pen.inkPen(100);
    	 pen.inkPen(50,"Red");
	}

}
