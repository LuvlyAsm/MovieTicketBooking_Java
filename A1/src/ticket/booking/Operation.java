package ticket.booking;

import java.util.Scanner;

class Operation{

    Scanner userScanner=new Scanner(System.in);
    int Seats[]=new int[600];

    
 void Booking(String name)
 {
        SwitchStatement(name);
 }
    
 void viewSeats(String name){
        for(int j=0;j<Seats.length;j++){
            if(j%30==0){
                System.out.println("");
                System.out.print(Seats[j]+" ");
            }
            else if(j%10==0){
                System.out.print("     ");
                System.out.print(Seats[j]+" ");
            }

            else{ System.out.print(Seats[j]+" ");}
        }
        SwitchStatement(name);
    }


 void Book(String name){
	 int id=1;
	 Operation1 op=new Operation1(name,id);
         viewSeats(name);
         SwitchStatement(name);
        }


void Cancel(String name){
	int id=2;
	 Operation1 op=new Operation1(name,id);
    System.out.println("\nEnter your seat number to cancel");
    int sNum=userScanner.nextInt();
    if(Seats[sNum-1]==1){
        Seats[sNum-1]=0;
        System.out.println("\nYour Ticket Cancelled Successfully");
    }
    else{
        System.out.println("\nTicket is not Booked");
    }
    viewSeats(name);
    SwitchStatement(name);
 }

 void SwitchStatement(String name){
	 
     System.out.println("\n1.View Seats \n2.Book Ticket \n3.Cancel a Ticket \n");
     String S= userScanner.next();
     switch(S){
         case "1":
         viewSeats(name);
             break;
         case "2":
             Book(name);
             break;
         case "3":
             Cancel(name);
             break;
         default:
        	 System.out.println("Input Invalid");
        	 SwitchStatement(name);
        	 
       }
    }
}


