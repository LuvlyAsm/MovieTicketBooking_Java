package ticket.booking;

import java.util.*;

public class LoginPage extends Operation{
	static void Validation(){
      
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to our ABC Theater...\nEnter to continue....\n1.LogIn\n2.Signup");
        String input = scanner.next();
        if(input.equals("1")){
            System.out.println("Enter Username");
            String name=scanner.next();
            System.out.println("Enter Password");
            String password=scanner.next();
            DataCheck datas=new DataCheck(name,password);
            
        }
        else if(input.equals("2")){
            System.out.println("Enter Username");
            String name=scanner.next();
            System.out.println("Enter Password");
            String password=scanner.next();
            DataInsertion datas=new DataInsertion(name,password);
            
            //t.SwitchStatement();
       }
        else{
            System.out.println("Input Invalid");
            Validation();
            }
    }
}

