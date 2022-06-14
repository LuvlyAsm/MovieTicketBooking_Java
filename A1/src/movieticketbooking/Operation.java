package movieticketbooking;

import java.util.Scanner;
//This class display the options like viewseats,book,cancel for the user to select
class Operation{

    Scanner userScanner=new Scanner(System.in);
    int Seats[]=new int[600];

    
 void Booking()
 {
        options();
 }
    
 void viewSeats(){
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
        options();
    }


 void bookSeats(){
            System.out.println("\nEnter a Seat Number ");
            int seatNumber = userScanner.nextInt();
            if(Seats[seatNumber-1]==0){
                Seats[seatNumber-1]=1;
                System.out.println("\nYour Seat Booked Successfully");
            }
            else{
                System.out.println("\nSeat Already Booked... Try Another");
            }
         viewSeats();
         options();
        }


void cancelSeats(){
    System.out.println("\nEnter your seat number to cancel");
    int seatNumber=userScanner.nextInt();
    if(Seats[seatNumber-1]==1){
        Seats[seatNumber-1]=0;
        System.out.println("\nYour Ticket Cancelled Successfully");
    }
    else{
        System.out.println("\nTicket is not Booked");
    }
    viewSeats();
    options();
 }

void logOut() {
	System.out.println("Successfully Logged Out");
	LoginPage logIn=new LoginPage();
	logIn.validate();
}


void options(){
     System.out.println("\n1.View Seats \n2.Book Ticket \n3.Cancel a Ticket \n4.LogOut\n");
     String userChoice= userScanner.next();
     switch(userChoice){
         case "1":
         viewSeats();
             break;
         case "2":
             bookSeats();
             break;
         case "3":
             cancelSeats();
             break;
         case "4":
        	  logOut();
        	  break;
         default:
        	 System.out.println("Input Invalid");
        	 options();
        	 
       }
    }
}


