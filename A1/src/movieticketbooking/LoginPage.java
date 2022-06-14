package movieticketbooking;

import java.util.*;



public class LoginPage{

private String name,password;

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}void validate(){


Scanner scanner= new Scanner(System.in);
System.out.println("Welcome to our ABC Theater...\nEnter to continue....\n1.LogIn\n2.Signup");
String input = scanner.next();



//Login
if(input.equals("1")){
System.out.println("Enter Username");
this.name=scanner.next();
System.out.println("Enter Password");
this.password=scanner.next();
DataCheck datas=new DataCheck(getName(),getPassword());



}



//Signup
else if(input.equals("2"))
{
System.out.println("Enter Username");
this.name=scanner.next();
System.out.println("Enter Password");
this.password=scanner.next();
DataInsertion datas=new DataInsertion(getName(),getPassword());
}



else{
System.out.println("Input Invalid");
validate();
}
}
}